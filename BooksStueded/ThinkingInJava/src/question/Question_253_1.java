class MyException extends Exception{
	public MyException(){}
	public MyException( String s ){
		super(s);
	}
}

public class Question_253_1{
	public static void main( String[] args ){
		try{
			g();
		}catch( MyException exception ){
			exception.printStackTrace();
			System.out.println();
			System.out.println( exception.getMessage() );
		}finally{
			System.out.println( "runed" );
		}
	}
	public static void g() throws MyException{
		throw new MyException( "error :g()" );
	}
}