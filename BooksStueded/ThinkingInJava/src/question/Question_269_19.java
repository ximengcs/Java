class VeryImportantException extends Exception{
	public String toString(){
		return "A very important exception";
	}
}

class HoHumException extends Exception{
	public String toString(){
		return "A hoHum exception";
	}
}

class PrettyException extends Exception{
	public String toString(){
		return "A pretty exception";
	}
}

public class Question_269_19{
	public static void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	public static void dispose() throws HoHumException{
		throw new HoHumException();
	}
	public static void myException() throws PrettyException{
		throw new PrettyException();
	}
	public static void main( String[] args ){
		try{
			Question_269_19 test = new Question_269_19();
			try{
				test.f();
			}finally{
				try{
					test.dispose();
				}catch( Exception exception ){
					System.out.println( exception );
					System.out.println( 1) ;
				}
			}
		}catch( Exception exception ){
			System.out.println( exception );
		}
	}
}