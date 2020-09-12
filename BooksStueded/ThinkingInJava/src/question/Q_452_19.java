package question;

import java.util.Arrays;

class Q_452_19_Test {
	int code;

	public Q_452_19_Test(int code) {
		this.code = code;
	}

	public boolean equals( Object obj ) {
		if (this == obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		Q_452_19_Test instance = (Q_452_19_Test) obj;
		if (instance.code == code)
			return true;
		else
			return false;
	}
	
	public int get() {
		return code;
	}
	
	public String toString() {
		return "code : " + code;
	}
}

public class Q_452_19 {

	public static void main( String[] args ) {
		Q_452_19_Test[] t1 = new Q_452_19_Test[5];
		Q_452_19_Test[] t2 = new Q_452_19_Test[5];

		for (int i = 0; i < t1.length; i++) {
			t1[i] = new Q_452_19_Test( 47 );
			t2[i] = new Q_452_19_Test( 47 );
		}

		System.out.println( Arrays.equals( t1, t2 ) );
	}
}
