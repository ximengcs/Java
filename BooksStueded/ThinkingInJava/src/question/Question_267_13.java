class MyExceptionOne extends Exception{}
class MyExceptionTwo extends Exception{}
class MyExceptionThree extends Exception{}

public class Question_267_13{
	private static int flag = 1;
	public /* static */ void exception() throws MyExceptionOne, MyExceptionTwo, MyExceptionThree{
		if( flag == 1 ){
			flag++;
			throw new MyExceptionOne();
		}
		else if( flag == 2 ){
			flag++;
			throw new MyExceptionTwo();
		}
		else
			throw new MyExceptionThree();
	}
	public static void main( String[] args ) throws MyExceptionOne, MyExceptionTwo, MyExceptionThree{
		Question_267_13 test = null;
/* 		test.exception(); */
		try{
			test.exception();
		}catch( Exception e ){
			System.out.println( "已捕获所有异常" );
		}finally{
			System.out.println( "已执行finally" );
		}
	}
}