class MyExceptionOne extends Exception{}
class MyExceptionTwo extends Exception{}

public class Question_263_11{
	public static void g() throws RuntimeException{
		throw new RuntimeException(MyExceptionOne());
	}
	
	public static void f(){
		try{
			g();
		}catch( RuntimeException exception ){
			MyExceptionTwo temp = new MyExceptionTwo();
			exception.initCause(exception);
			throw temp;
		}
	}
	
	public static void main( String[] args ){
		//try{
		//	g();
		//}catch( RuntimeException exception ){
		//	exception.printStackTrace();
		//}
		try{
			f();
		}catch( MyExceptionTwo exception ){
			exception.printStackTrace();
		}
	}
}