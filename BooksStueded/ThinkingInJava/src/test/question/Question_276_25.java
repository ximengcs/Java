class AException extends Exception{}
class BException extends AException{}
class CException extends BException{}

class A{
	public void f() throws AException{
		throw new AException();
	}
}

class B extends A{
	public void f() throws BException{
		throw new BException();
	}
}

class C extends B{
	public void f() throws CException{
		throw new CException();
	}
}

public class Question_276_25{
	public static void main( String[] args ){
		C test = new C();
		A quiz = (A)test;
		try{
			quiz.f();
		}catch( CException exception ){
			System.out.println( "exception of C" );
		}catch( BException exception ){
			System.out.println( "exception of B" );
		}catch( AException exception ){
			System.out.println( "exception of A" );
		}
	}
}