abstract class Test{
	abstract void print();
	Test(){
		print();
	}
}
class Out extends Test{
	private int code = 98259;
	void print(){
		System.out.println( "Out.print() " + code );
	}
}
public class Question_171_3{
	public static void main( String[] args ){
		Out o = new Out();
		o.print();
	}
}