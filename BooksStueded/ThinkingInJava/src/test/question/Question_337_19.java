import java.lang.reflect.*;

class Toy{
	private String name;
	private int code;
	
	public Toy(){}
	public Toy( int code ){
		name = "default";
		this.code = code;
	}
	public Toy( String name, int code ){
		this.name = name;
		this.code = code;
	}
	
	public String toString(){
		return name + ":" + code;
	}
}

public class Question_337_19{
	public static Toy test( String name, int code ){
		try{
			Class<?> class1 = Class.forName( name );
			for( Constructor tmp : class1.getConstructors() ){
				Class<?>[] params = tmp.getParameterTypes();
				if( params.length == 1 ){
					if( params[0] == int.class ){
						return (Toy)tmp.newInstance( new Object[]{ Integer.valueOf(code) } );
					}
				}
			}
		}catch( Exception e ){
			System.out.println( "Exception" );
		}
		return null;
	}
	
	public static void main( String[] args ){
		System.out.println( test( "Toy", 1 ) );
	}
}