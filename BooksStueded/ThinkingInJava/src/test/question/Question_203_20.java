interface Inter{
	void print();
	class Test{
		void test(){
			System.out.println( "test" );
		}
	}
}
public class Question_203_20 implements Inter{
	public void print(){
		System.out.println( "print()" );
	}
	public static void main( String[] args ){
		Question_203_20 t = new Question_203_20();
		t.print();
		Inter.Test t2 = new Inter.Test();
	}
}