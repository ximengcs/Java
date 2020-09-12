class Test{
	Test(){}
	protected void finalize(){
		System.out.println( "error" );
	}
}
public class Question_89_10{
	public static void main( String[] args ){
		//Test t1 = new Test();
		while(true){
			new Test();
			//System.gc();
		}
	}
}