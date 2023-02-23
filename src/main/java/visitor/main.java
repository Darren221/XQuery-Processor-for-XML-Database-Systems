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

public class main {
	public static void main(String[] args) {
        String XpathQuery = args[0];
        String resFilename = args[1];
        
        LinkedList<Node> result;
        Document output;
        try {
        	CharStream cs = CharStreams.fromFileName(XpathQuery);
        	ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExpressionGrammarParser parser = new ExpressionGrammarParser(tokens);
            ParserRuleContext tree = parser.prog();
            
            ExpressionBuilder expressionBuilder = new ExpressionBuilder();
            result = expressionBuilder.visit(tree);
            
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            output = db.newDocument();
            writeFile(output, result, resFilename);
        } catch(ParserConfigurationException | IOException e){
        	e.printStackTrace();
        }  
	}
	public static void writeFile(Document doc, LinkedList<Node> result, String outputFilename) {
		
        Node root = doc.createElement("result");
        for (Node node: result) {
            Node cNode = doc.importNode(node, true);
            root.appendChild(cNode);
        }
        Node cRoot = doc.importNode(root, true);
        doc.appendChild(cRoot);

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
