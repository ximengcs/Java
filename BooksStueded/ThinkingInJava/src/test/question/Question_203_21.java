interface Inter{
	void print();
	public static class In{
		static void get( Inter inter ){
			inter.print();
		}
	}
}
public class Question_203_21 implements Inter{
	public void print(){
		System.out.println( "Print()" );
	}
	public static void main( String[] args ){
		Question_203_21 q = new Question_203_21();
		Inter.In in = new Inter.In();
		in.get( q );
	}
}