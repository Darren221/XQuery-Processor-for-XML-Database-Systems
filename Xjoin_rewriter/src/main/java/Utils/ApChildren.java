package Utils;

public class ApChildren implements Expression {
	
	final Expression doc;
	final Expression ap;

	public ApChildren(Expression doc, Expression ap) {
		this.doc = doc;
		this.ap = ap;
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
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public ExpressionKind getExpressionKind() {
		// TODO Auto-generated method stub
		return null;
	}

}
