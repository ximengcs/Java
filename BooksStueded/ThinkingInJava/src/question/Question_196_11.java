public interface Question_196_11{
	void print();
}
class Test{
	/*private*/ class TestIn implements Question_196_11{
		public void print(){
			System.out.print( "printIn()" );
		}
	}
	Question_196_11 getIn(){
		return new TestIn();
	}
}
class Quiz{
	public static void main( String[] args ){
		Test t1 = new Test();
		Question_196_11 i1 = (Test.TestIn)t1.getIn(); 
		
		
	}
}