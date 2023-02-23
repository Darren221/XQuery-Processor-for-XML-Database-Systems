package Utils;

public class FltrRpEqual implements Expression {

	final Expression rpLeft;
	final Expression rpRight;
	
	public FltrRpEqual(Expression rpLeft, Expression rpRight) {
		this.rpLeft = rpLeft;
		this.rpRight = rpRight;
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
