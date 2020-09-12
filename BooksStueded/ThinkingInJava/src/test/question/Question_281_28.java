class MyException extends RuntimeException{
	private String str = null;
	public MyException(){}
	public MyException( String string ){
		str = string;
	}
	public void getString(){
		System.out.println( str + " " );
	}
}

public class Question_281_28{
	public static void main( String[] args ){
		/* try{ */
			test();
		/* }catch( MyException myException ){
			myException.printStackTrace();
			myException.getString();
		} */
	}
	public static void test() throws MyException{
		throw new MyException( "test" );
	}
}