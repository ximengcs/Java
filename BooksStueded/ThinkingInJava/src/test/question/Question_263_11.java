class MyExceptionOne extends Exception{}
class MyExceptionTwo extends Exception{}

public class Question_263_11{
	public static void g() throws MyExceptionOne{
		throw new MyExceptionOne();
	}
	
	public static void f() throws MyExceptionTwo{
		try{
			g();
		}catch( MyExceptionOne exception ){
			MyExceptionTwo temp = new MyExceptionTwo();
			exception.initCause(exception);
			throw temp;
		}
	}
	
	public static void main( String[] args ){
		try{
			g();
		}catch( MyExceptionOne exception ){
			exception.printStackTrace();
		}
		try{
			f();
		}catch( MyExceptionTwo exception ){
			exception.printStackTrace();
		}
	}
}