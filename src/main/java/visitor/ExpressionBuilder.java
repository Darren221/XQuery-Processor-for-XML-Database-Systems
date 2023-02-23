package visitor;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.LinkedList;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import Utils.Expression;
import parsers.ExpressionGrammarBaseVisitor;
import parsers.ExpressionGrammarParser;
import parsers.ExpressionGrammarParser.Ap_ChildrenContext;
import parsers.ExpressionGrammarParser.Ap_DescendantsContext;
import parsers.ExpressionGrammarParser.Ap_docContext;
import parsers.ExpressionGrammarParser.DocumentContext;
import parsers.ExpressionGrammarParser.Fltr_AndContext;
import parsers.ExpressionGrammarParser.Fltr_OrContext;
import parsers.ExpressionGrammarParser.Fltr_ParenthesisContext;
import parsers.ExpressionGrammarParser.Fltr_RpContext;
import parsers.ExpressionGrammarParser.Fltr_RpEqualContext;
import parsers.ExpressionGrammarParser.Fltr_RpIsContext;
import parsers.ExpressionGrammarParser.Fltr_RpIsStringConstantContext;
import parsers.ExpressionGrammarParser.Fltr_notContext;
import parsers.ExpressionGrammarParser.ProgContext;
import parsers.ExpressionGrammarParser.Rp_AttributeContext;
import parsers.ExpressionGrammarParser.Rp_ChildrenContext;
import parsers.ExpressionGrammarParser.Rp_ConcatContext;
import parsers.ExpressionGrammarParser.Rp_FilterContext;
import parsers.ExpressionGrammarParser.Rp_ParentContext;
import parsers.ExpressionGrammarParser.Rp_RpChildrenContext;
import parsers.ExpressionGrammarParser.Rp_RpContext;
import parsers.ExpressionGrammarParser.Rp_RpDescendantContext;
import parsers.ExpressionGrammarParser.Rp_SelfContext;
import parsers.ExpressionGrammarParser.Rp_TagnameContext;
import parsers.ExpressionGrammarParser.Rp_textContext;
import parsers.ExpressionGrammarParser.RpContext;

public class ExpressionBuilder extends ExpressionGrammarBaseVisitor<LinkedList>{
	LinkedList<Node> curNodes = new LinkedList<>();
	 public Document doc = null;
	 private HashMap<String, LinkedList<Node>> contextMap = new HashMap<>();


	public LinkedList<Node> getAllChildren(Node node) {
        LinkedList<Node> result = new LinkedList<>(); 
        NodeList childrenNodes = node.getChildNodes();
        Node curChild; 
        for (int i = 0; i < childrenNodes.getLength(); i++) {
            curChild = childrenNodes.item(i);
            result.add(curChild);
            result.addAll(getAllChildren(curChild)); 
        }
        return result;
    }
	
	public LinkedList<Node> visitDescendants(RpContext ctx) {
        LinkedList<Node> tmp = new LinkedList<>();
        for (Node node : this.curNodes) {
            tmp.addAll(getAllChildren(node)); 
        }
        for (Node node : tmp) {
            if (!this.curNodes.contains(node)) {
                this.curNodes.add(node);
            }
        }
        return visit(ctx);
    }
	
	public LinkedList<Node> getParents(LinkedList<Node> node) {
        LinkedList<Node> result = new LinkedList<Node>();
        for(int i = 0; i < node.size(); i++) {
            Node parentNode = node.get(i).getParentNode();
            if(!result.contains(parentNode)) {
                result.add(parentNode);
            }
        }
        return result;
    }
	
	public static LinkedList<Node> getChildren(LinkedList<Node> n){
        LinkedList<Node> childrenList = new LinkedList<Node>();
        for(int j = 0; j < n.size(); j++) {
            Node curNode = n.get(j);
            for (int i = 0; i < curNode.getChildNodes().getLength(); i++) {
                childrenList.add(curNode.getChildNodes().item(i));
            }
        }
        return childrenList;
    }
	
	private static LinkedList<Node> children(Node n){
        LinkedList<Node> childrenList = new LinkedList<Node>();
        for(int i = 0; i < n.getChildNodes().getLength(); i++){
            childrenList.add(n.getChildNodes().item(i));
        }
        return childrenList;
    }
	
	@Override
	public LinkedList<Node> visitProg(ProgContext ctx) {
		System.out.println("visitProg");
		//final Expression prog = visit(ctx.ap());
		return visit(ctx.xq());
	}
	////////////////////
	@Override public LinkedList<Node> visitXq_Parentheses(ExpressionGrammarParser.Xq_ParenthesesContext ctx) { 
		System.out.println("visitDocument");
		return visit(ctx.xq());
	}
	
	@Override public LinkedList<Node> visitXq_String(ExpressionGrammarParser.Xq_StringContext ctx) { 
		System.out.println("visitXq_String");
		String str = ctx.STRINGCONSTANT().getText();
        str = str.substring(1, str.length() - 1); // remove the left parenthesis and the right parenthesis

        LinkedList<Node> res = new LinkedList<Node>();
        res.add(this.doc.createTextNode(str));

        return res;
	}
	
	@Override public LinkedList<Node> visitXq_FLWR(ExpressionGrammarParser.Xq_FLWRContext ctx) { 
		System.out.println("visitXq_FLWR");
		LinkedList<Node> res = new LinkedList<>();

        HashMap<String, LinkedList<Node>> currContext = new HashMap<>(contextMap);
        Stack<HashMap<String, LinkedList<Node>>> ctxStack = new Stack<>();

        ctxStack.push(currContext);
        traverse(ctx, ctxStack, 0, ctx.forClause().var().size(), res);
        contextMap = ctxStack.pop();

        return res;
	}

	private void traverse(ExpressionGrammarParser.Xq_FLWRContext ctx, Stack<HashMap<String, LinkedList<Node>>> ctxStack,
                                      int layer, int maxLayer, LinkedList<Node> res) {
        if (layer == maxLayer) {
            if (ctx.letClause() != null) visit(ctx.letClause());
            if (ctx.whereClause() != null)
                if (visit(ctx.whereClause()).size() == 0) {
                    return;
                }
            res.addAll(visit(ctx.returnClause()));
            return;
        }

        String key = ctx.forClause().var(layer).getText();
        //System.out.println("before " + key + " is made with " + ctx.forClause().xq(layer).getText() + ": " + contextMap);
        LinkedList<Node> nodeList = visit(ctx.forClause().xq(layer));
        //System.out.println("end of evaluation: " + nodeList + ". At this moment, contextMap=" + contextMap);

        for (Node node: nodeList) {
            HashMap<String, LinkedList<Node>> next = new HashMap<>(contextMap);
            LinkedList<Node> val = new LinkedList<>();
            val.add(node);
            next.put(key, val);

            ctxStack.push(next);
            contextMap = ctxStack.peek();
            traverse(ctx, ctxStack, layer + 1, maxLayer, res);
            ctxStack.pop();
            contextMap = ctxStack.peek();
        }
    }
	
	@Override public LinkedList<Node> visitXq_Concat(ExpressionGrammarParser.Xq_ConcatContext ctx) { 
		System.out.println("visitXq_Concat");
		LinkedList<Node> res = visit(ctx.xq(0));
        res.addAll(visit(ctx.xq(1)));

        return res;
	}
	
	@Override public LinkedList<Node> visitXq_tags(ExpressionGrammarParser.Xq_tagsContext ctx) { 
		System.out.println("visitXq_tags");
		String tag = ctx.getText();
        LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> nodeList = visit(ctx.xq());

		Node newNode = doc.createElement(tag);
        for (Node node: nodeList) {
            if (node != null) newNode.appendChild(doc.importNode(node, true));
        }

        Node node = newNode;
        res.add(node);

        return res;
	}
	//??
	
	@Override public LinkedList<Node> visitXq_LetClause(ExpressionGrammarParser.Xq_LetClauseContext ctx) { 
		return visitChildren(ctx);
	}
	
	@Override public LinkedList<Node> visitXq_Children(ExpressionGrammarParser.Xq_ChildrenContext ctx) { 
		System.out.println("visitXq_Children");
		LinkedList<Node> res = new LinkedList<>();

		LinkedList<Node> temp = new LinkedList<>();
		LinkedList<Node> source = visit(ctx.xq())
        for (Node node: source) temp.add(node);
        this.curNodes = temp;
        res.addAll(visit(ctx.rp()));

        return res;
	}
	
	@Override public LinkedList<Node> visitXq_Ap(ExpressionGrammarParser.Xq_ApContext ctx) { 
		System.out.println("visitXq_Ap");
		return visit(ctx.ap());
	}
	
	@Override public LinkedList<Node> visitXq_Descendent(ExpressionGrammarParser.Xq_DescendentContext ctx) { 
		System.out.println("visitXq_Descendent");
		LinkedList<Node> temp = new LinkedList<>();
		LinkedList<Node> source = visit(ctx.xq());
        for (Node node: source) temp.add(node);
		this.curNodes = temp;
        return visitDescendants(ctx.rp());
	}
	
	@Override public LinkedList<Node> visitXq_Var(ExpressionGrammarParser.Xq_VarContext ctx) { 
		System.out.println("visitXq_Var");
		LinkedList<Node> temp = new LinkedList<>();
		LinkedList<Node> source = this.contextMap.get(ctx.var().getText());
        for (Node node: source) temp.add(node);
		return temp;
	}
	//??
	
	@Override public LinkedList<Node> visitLetClause(ExpressionGrammarParser.LetClauseContext ctx) { 
		System.out.println("visitLetClause");
		LinkedList<Node> empty = new LinkedList<>();
        int varNum = ctx.var().size();
        for (int i = 0; i < varNum; i++) {
            this.contextMap.put(ctx.var(i).getText(), visit(ctx.xq(i)));
        }
        return empty;
	}
	//??
	
	@Override public LinkedList<Node> visitForClause(ExpressionGrammarParser.ForClauseContext ctx) { 
		System.out.println("visitForClause");
		return visitChildren(ctx);
	}
	
	@Override public LinkedList<Node> visitWhereClause(ExpressionGrammarParser.WhereClauseContext ctx) { 
		System.out.println("visitWhereClause");
		return visit(ctx.cond());
		
	}
	
	@Override public LinkedList<Node> visitReturnClause(ExpressionGrammarParser.ReturnClauseContext ctx) { 
		System.out.println("visitReturnClause");
		return visit(ctx.xq());
	}
	
	@Override public LinkedList<Node> visitCond_Empty(ExpressionGrammarParser.Cond_EmptyContext ctx) { 
		LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> empty = new LinkedList<>();
        Node oneNode = doc.createTextNode("random");
        LinkedList<Node> oneNodeList = new LinkedList<>();
        oneNodeList.add(oneNode);

        res = visit(ctx.xq());
        if (res.size() == 0) return oneNodeList;
        return  empty;
	}
	
	@Override public LinkedList<Node> visitCond_Parentheses(ExpressionGrammarParser.Cond_ParenthesesContext ctx) { 
		return visit(ctx.cond());
		
	}
	
	@Override public LinkedList<Node> visitCond_XqIs(ExpressionGrammarParser.Cond_XqIsContext ctx) { 
		System.out.println("");
		LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> l = visit(ctx.xq(0));
        LinkedList<Node> r = visit(ctx.xq(1));

        for (Node ln: l) {
            for (Node rn: r) {
                if (ln.isSameNode(rn)) {
                    res.add(ln);
                    return res;
                }
            }
        }
        return res; 
	}
	
	@Override public LinkedList<Node> visitCond_Not(ExpressionGrammarParser.Cond_NotContext ctx) { 
		System.out.println("visitCond_Not");
		LinkedList<Node> res;
        LinkedList<Node> empty = new LinkedList<>();
        Node oneNode = doc.createTextNode("random");
        LinkedList<Node> oneNodeList = new LinkedList<>();
        oneNodeList.add(oneNode);

        res = visit(ctx.cond());
        if (res.size() > 0) return empty;
        return oneNodeList;
	}
	
	@Override public LinkedList<Node> visitCond_XqEqual(ExpressionGrammarParser.Cond_XqEqualContext ctx) { 
		System.out.println("visitCond_XqEqual");
		LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> l = visit(ctx.xq(0));
        LinkedList<Node> r = visit(ctx.xq(1));

        for (Node ln: l) {
            for (Node rn: r) {
                if (ln.isEqualNode(rn)) {
                    res.add(ln);
                    return res;
                }
            }
        }
        return res; 
	}
	
	@Override public LinkedList<Node> visitCond_SomeSatisfies(ExpressionGrammarParser.Cond_SomeSatisfiesContext ctx) { 
		System.out.println("visitCond_SomeSatisfies");
		return visitSomeVarXq(ctx, 0, contextMap);
	}

	public LinkedList<Node> visitSomeVarXq(ExpressionGrammarParser.Cond_SomeSatisfiesContext ctx, int curIndex, HashMap<String, LinkedList<Node>> curMap) {
        LinkedList<Node> res;
        LinkedList<Node> finalRes;
        LinkedList<Node> empty = new LinkedList<>();

        if (ctx.var().size() == curIndex) { // no more variables
            return visit(ctx.cond());
        }
        String var = ctx.var(curIndex).getText() ;
        ExpressionGrammarParser.XqContext xq = ctx.xq(curIndex);
        res = visit(xq);
        for (Node node : res) {
            HashMap<String, LinkedList<Node>> next = new HashMap<>(curMap);
            LinkedList<Node> curNodeList = new LinkedList<>();
            curNodeList.add(node);
            next.put(var, curNodeList);

            // We don't really use this map in the process, but we still want to keep it updated.
            contextMap = next;
            finalRes = visitSomeVarXq(ctx, curIndex + 1, next);
            contextMap = curMap;
            if (finalRes.size() > 0) return finalRes;
        }
        return empty;
    }
	
	@Override public LinkedList<Node> visitCond_Or(ExpressionGrammarParser.Cond_OrContext ctx) { 
		LinkedList<Node> res1;
        LinkedList<Node> res2;

        res1 = visit(ctx.cond(0));
        res2 = visit(ctx.cond(1));

        if (res1.size() > 0) return res1;
        if (res2.size() > 0) return res2;
        return res1;
	}
	
	@Override public LinkedList<Node> visitCond_And(ExpressionGrammarParser.Cond_AndContext ctx) { 
		System.out.println("");
		LinkedList<Node> res1;
        LinkedList<Node> res2;

        LinkedList<Node> empty = new LinkedList<>();
        Node oneNode = doc.createTextNode("random");
        LinkedList<Node> oneNodeList = new LinkedList<>();
        oneNodeList.add(oneNode);

        res1 = visit(ctx.cond(0));
        res2 = visit(ctx.cond(1));

        if (res1.size() > 0 && res2.size() > 0) return oneNodeList;
        return empty;
	}
	
	@Override public LinkedList<Node> visitVar(ExpressionGrammarParser.VarContext ctx) { 
		return visitChildren(ctx); 
		}
	
	////////////////////
	@Override
	public LinkedList<Node> visitAp_doc(Ap_docContext ctx) {
		System.out.println("visitAp_doc");
		//final Expression doc = visit(ctx.doc());
		return visit(ctx.doc());
	}

	@Override
	public LinkedList<Node> visitAp_Children(Ap_ChildrenContext ctx) {
		System.out.println("visitAp_Children");
		// TODO needs to find all children correspond to rp
		//final Expression doc = visit(ctx.doc());
		//final Expression rp = visit(ctx.rp());
		this.curNodes = visit(ctx.doc());
		return visit(ctx.rp());
	}

	@Override
	public LinkedList<Node> visitAp_Descendants(Ap_DescendantsContext ctx) {
		System.out.println("visitAp_Descendants");
		// TODO needs to find all descendants correspond to rp
		//final Expression doc = visit(ctx.doc());
		//final Expression rp = visit(ctx.rp());
		this.curNodes = visit(ctx.doc());
		return visitDescendants(ctx.rp());
	}

	@Override
	public LinkedList<Node> visitDocument(DocumentContext ctx) {
		System.out.println("visitDocument");
		// TODO not sure if the variables would be used
		//final String filename =ctx.WORD(0).getText();
		//final String extension = ctx.WORD(1).getText();
		String fileName = ctx.getText();
        File xmlFile = new File(fileName.substring(5, fileName.length()-2));
        LinkedList<Node> res = new LinkedList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);  
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(xmlFile);
            doc.getDocumentElement().normalize();
            res.add(doc);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        return res;
	}

	@Override
	public LinkedList<Node> visitRp_text(Rp_textContext ctx) {
		System.out.println("visitRp_text");
		// TODO needs to retrieve the text on this element
		NodeList children;
        Node child;
        LinkedList<Node> res = new LinkedList<>();
        for (Node node : this.curNodes) {
            children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                child = children.item(i);
                if (child.getNodeType() == Node.TEXT_NODE) {
                    res.add(child);
                }
            }
        }
        return res;
	}

	@Override
	public LinkedList<Node> visitRp_RpDescendant(Rp_RpDescendantContext ctx) {
		System.out.println("visitRp_RpDescendant");
		// TODO needs to find all descendants correspond to rpRight
		//final Expression rpLeft = visit(ctx.rp(0));
		//final Expression rpRight = visit(ctx.rp(1));
		this.curNodes = visit(ctx.rp(0));
		return visitDescendants(ctx.rp(1));
	}

	@Override
	public LinkedList<Node> visitRp_Tagname(Rp_TagnameContext ctx) {
		System.out.println("visitRp_Tagname");
		// TODO needs to retrieve the tagname of this element
		LinkedList<Node> res = new LinkedList<>();
        String tName = ctx.getText();
        for(Node temp : curNodes) {
            LinkedList<Node> nodeList = children(temp);
            for(Node i : nodeList) {
                if(i.getNodeName().equals(tName)) res.add(i);
            }
        }
        curNodes = res;
        return res;
	}

	@Override
	public LinkedList<Node> visitRp_Self(Rp_SelfContext ctx) {
		System.out.println("visitRp_Self");
		//final Expression self = visit(ctx);
		return curNodes;
	}

	@Override
	public LinkedList<Node> visitRp_Parent(Rp_ParentContext ctx) {
		System.out.println("visitRp_Parent");
		curNodes = getParents(curNodes);
        LinkedList<Node> results = curNodes;
        return results;
	}

	@Override
	public LinkedList<Node> visitRp_Attribute(Rp_AttributeContext ctx) {
		System.out.println("visitRp_Attribute");
		// TODO needs to retrieve the attribute of this element
		//final String attr = ctx.getText();
		LinkedList<Node> res = new LinkedList<>();
        for (Node temp : curNodes) {
            Element e = (Element) temp;
            String attr = e.getAttribute(ctx.WORD().getText());
            if (!attr.equals("")) {
                res.add(temp);
                attr = ctx.WORD().getText()+"=\""+ attr +"\"";
                System.out.println(attr);
            }
        }
        curNodes = res;
        return res;
	}

	@Override
	public LinkedList<Node> visitRp_RpChildren(Rp_RpChildrenContext ctx) {
		System.out.println("visitRp_RpChildren");
		// TODO needs to find all children correspnd to rpRight
		this.curNodes = visit(ctx.rp(0));
        return visit(ctx.rp(1));
	}

	@Override
	public LinkedList<Node> visitRp_Filter(Rp_FilterContext ctx) {
		System.out.println("visitRp_Filter");
		this.curNodes = visit(ctx.rp());
        return visit(ctx.filter());
	}

	@Override
	public LinkedList<Node> visitRp_Concat(Rp_ConcatContext ctx) {
		System.out.println("visitRp_Concat");
		// TODO needs to concatenate rpLeft and rpLeft
		LinkedList<Node> results;
        LinkedList<Node> oldCurrent = curNodes;
        visit(ctx.rp(0));
        LinkedList<Node> resultsLeft = curNodes;
        curNodes = oldCurrent;
        visit(ctx.rp(1));
        LinkedList<Node> resultsRight = curNodes;
        resultsLeft.addAll(resultsRight);
        results = resultsLeft;
        curNodes = results;
        return results;
	}

	@Override
	public LinkedList<Node> visitRp_Rp(Rp_RpContext ctx) {
		System.out.println("visitRp_Rp");
		return visit(ctx.rp());
	}

	@Override
	public LinkedList<Node> visitRp_Children(Rp_ChildrenContext ctx) {
		System.out.println("visitRp_Children");
		LinkedList<Node> res = new LinkedList<>();
        NodeList children;
        for (Node node : this.curNodes) {
            children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                res.add(children.item(i));
            }
        }
        return res;
	}

	@Override
	public LinkedList<Node> visitFltr_not(Fltr_notContext ctx) {
		//final Expression filter = visit(ctx.filter());
		 LinkedList<Node> res;
	        HashSet<Node> current = new HashSet<>(this.curNodes);
	        HashSet<Node> diff = new HashSet<>(visit(ctx.filter()));
	        current.removeAll(diff);
	        res = new LinkedList<>(current);
	        this.curNodes = res;
	        return res;
	}

	@Override
	public LinkedList<Node> visitFltr_RpIs(Fltr_RpIsContext ctx) {
		LinkedList<Node> tmp = this.curNodes;
        LinkedList<Node> res = new LinkedList<>();
        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<>();
            evalNode.add(node);
            this.curNodes = evalNode;
            LinkedList<Node> l = visit(ctx.rp(0));
            this.curNodes = evalNode;
            LinkedList<Node> r = visit(ctx.rp(1));
            for (Node ln: l)
                for (Node rn: r)
                    if (ln.isSameNode(rn) && !res.contains(node))
                        res.add(node);
        }
        this.curNodes = res;
        return res;
	}

	@Override
	public LinkedList<Node> visitFltr_And(Fltr_AndContext ctx) {
		LinkedList<Node> res;
        LinkedList<Node> tmp = this.curNodes;
        HashSet<Node> ls = new HashSet<>(visit(ctx.filter(0)));
        this.curNodes = tmp;
        HashSet<Node> rs = new HashSet<>(visit(ctx.filter(1)));
        ls.retainAll(rs);
        res = new LinkedList<>(ls);
        return res;
	}

	@Override
	public LinkedList<Node> visitFltr_RpEqual(Fltr_RpEqualContext ctx) {
		LinkedList<Node> tmp = this.curNodes;
        LinkedList<Node> res = new LinkedList<>();
        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<>();
            evalNode.add(node);
            this.curNodes = evalNode;
            LinkedList<Node> l = visit(ctx.rp(0)); // left nodes
            this.curNodes = evalNode;
            LinkedList<Node> r = visit(ctx.rp(1)); // right nodes
            for (Node ln: l)
                for (Node rn: r)
                    if (ln.isEqualNode(rn) && !res.contains(node))
                        res.add(node);
        }
        this.curNodes = res;
        return res;
	}

	@Override
	public LinkedList<Node> visitFltr_Parenthesis(Fltr_ParenthesisContext ctx) {
		//final Expression filter = visit(ctx.filter());
		return visit(ctx.filter());
	}

	@Override
	public LinkedList<Node> visitFltr_Or(Fltr_OrContext ctx) {
		LinkedList<Node> res;
        LinkedList<Node> tmp = this.curNodes;
        HashSet<Node> ls = new HashSet<>(visit(ctx.filter(0)));
        this.curNodes = tmp;
        HashSet<Node> rs = new HashSet<>(visit(ctx.filter(1)));
        ls.addAll(rs);
        res = new LinkedList<>(ls);
        return res;
	}

	@Override
	public LinkedList<Node> visitFltr_RpIsStringConstant(Fltr_RpIsStringConstantContext ctx) {
		 LinkedList<Node> res = new LinkedList<>();
	        LinkedList<Node> tmp = this.curNodes;
	        String str = ctx.STRINGCONSTANT().getText();
	        str = str.substring(1, str.length() - 1);
	        for (Node node: tmp) {
	            LinkedList<Node> evalNode = new LinkedList<>();
	            evalNode.add(node);
	            this.curNodes = evalNode;
	            LinkedList<Node> l = visit(ctx.rp());
	            for (Node ln: l) {
	                if (ln.getNodeValue().equals(str) && !res.contains(node)) {
	                    res.add(node);
	                }
	            }
	        }
	        this.curNodes = res;
	        return res;
	}

	@Override
	public LinkedList<Node> visitFltr_Rp(Fltr_RpContext ctx) {
		LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> tmp = this.curNodes;
        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<>();
            evalNode.add(node);
            this.curNodes = evalNode;
            if (visit(ctx.rp()).size() != 0)
                res.add(node);
        }
        this.curNodes = res;
        return res;
	}


}
