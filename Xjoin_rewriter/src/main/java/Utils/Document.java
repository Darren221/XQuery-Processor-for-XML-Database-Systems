package Utils;

public class Document implements Expression {

	final String filename;
	final String extension;
	
	public Document(String filename, String extension) {
		this.filename = filename;
		this.extension = extension;
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
		final StringBuilder stringBuilder = new StringBuilder();
		final String extension = this.extension.length() == 0 ? "" : "." + this.extension;
		stringBuilder.append("doc(\"" + filename + extension + "\")");
		return stringBuilder.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
