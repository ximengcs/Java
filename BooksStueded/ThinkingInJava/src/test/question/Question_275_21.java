class AException extends Exception{}
class BException extends Exception{}

class A extends AException{
	public A() throws AException{
		throw new AException();
	}
}
class B extends A{
	public B() throws BException{
		super();
		try{
			
		}catch( AException exception ){
			System.out.println( "catch a " );
		}
	}
}

public class Question_275_21{
	public static void main( String[] args ){
		
	}
}