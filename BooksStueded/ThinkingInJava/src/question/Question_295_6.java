class Test{
	private int t1;
	private double t2;
	private long t3;
	private float t4;
	public Test( int t1, double t2, long t3, float t4 ){
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
	}
	public String toString(){
		return String.format( "int : %d, double : %.2f, long : %d, float : %.2f\n", t1, t2, t3, t4 );
	}
}

public class Question_295_6{
	public static void main( String[] args ){
		Test test = new Test( 1, 1.1, 1L, 1.1F );
		System.out.println( test );
	}
}