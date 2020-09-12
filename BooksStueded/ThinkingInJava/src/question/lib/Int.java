package question.lib;

public class Int {

	private int code;

	public Int(int code) {
		this.code = code;
	}

	public boolean equals( Object obj ) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Int instance = (Int) obj;
		if (instance.code == code)
			return true;
		else
			return false;
	}
}
