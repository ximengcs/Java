class Test{
	private int code = 0;
	private void print(){
		System.out.println( "private Test.print()" );
	}
	class TestIn{
		private int i = 999;
		void setCode( int code ){
			Test.this.code = code;
		}
		void usePrint(){
			Test.this.print();
		}
	}
	void use(){
		TestIn testIn = new TestIn();
		//System.out.println( Test.this.code );
		testIn.setCode( 98259 );
		testIn.usePrint();
		code = testIn.i;
		//System.out.println( Test.this.code );
	}
}
public class Question_195_7{
	public static void main( String[] args ){
		Test test = new Test();
		test.use();
	}
}