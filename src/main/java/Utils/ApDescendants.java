package Utils;

public class ApDescendants implements Expression {

	final Expression doc;
	final Expression ap;

	public ApDescendants(Expression doc, Expression ap) {
		this.doc = doc;
		this.ap = ap;
	}
	
	@Override
	public ExpressionKind getExpressionKind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		final StringBuilder str = new StringBuilder();
		str.append(doc.toString());
		str.append("//");
		str.append(ap.toString());
		return str.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
