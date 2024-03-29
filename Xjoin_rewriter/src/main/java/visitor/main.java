package visitor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import Utils.Expression;
import parsers.ExpressionGrammarLexer;
import parsers.ExpressionGrammarParser;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.Arrays;

import java.time.Instant;
import java.time.Duration;

public class main {
	public static void main(String[] args) {
//        String XpathQuery = args[0];
//        String resFilename = args[1];
        String XjoinQuery = args[0];
        String XjoinOutput = args[1];
        Path inputPath = Paths.get(XjoinQuery);
        Path outputPath = Paths.get(XjoinOutput);
        String output;
        
//        LinkedList<Node> result;
//        Document output;
        try {
        	CharStream cs = CharStreams.fromFileName(XjoinQuery);
        	ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExpressionGrammarParser parser = new ExpressionGrammarParser(tokens);
            ParserRuleContext tree = parser.xq();
            
            Instant start = Instant.now();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder();
            output = expressionBuilder.visit(tree);
            Instant finish = Instant.now();
            long timeElapsed = Duration.between(start, finish).toMillis();
            System.out.println(timeElapsed);
            
            if (output.equals("original")) {
            	 try {
                     output = Files.lines(inputPath, StandardCharsets.UTF_8).collect(Collectors.joining("\n"));
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
                //output = Files.readString(inputPath, StandardCharsets.UTF_8);
            }
            
            try {
                byte[] bytes = output.getBytes(StandardCharsets.UTF_8);
                Files.write(outputPath, bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
            
//            try {
//                Files.writeString(outputPath, output, StandardCharsets.UTF_8);
//            } catch (IOException ex) {
//                System.out.println("error");
//            }
            
//          DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//          DocumentBuilder db = dbf.newDocumentBuilder();
//          output = db.newDocument();
//            output = expressionBuilder.doc;
//            writeFile(output, result, resFilename);
        } catch(IOException e){
        	e.printStackTrace();
        }  
	}
	public static void writeFile(Document doc, LinkedList<Node> result, String outputFilename) {
		
        //Node root = doc.createElement();
		
        for (Node node: result) {
            Node cNode = doc.importNode(node, true);
            doc.appendChild(cNode);
        }
        //Node cRoot = doc.importNode(root, true);
        //doc.appendChild(cRoot);
        //doc.appendChild(cNode);

        try {
        	System.out.println("writing");
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            t.setParameter(OutputKeys.INDENT, "yes");
            t.setParameter("{http://xml.apache.org/xslt}indent-amount", "4");
            t.transform(new DOMSource(doc), new StreamResult(new File(outputFilename)));
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
