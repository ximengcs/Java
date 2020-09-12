import java.lang.reflect.*;

public class Question_318_9{
	public static void printClass( Class<?> c ){
		if( c == null )
			return;
		System.out.println( c.getName() );
		for( Class k : c.getInterfaces() ){
			System.out.print( "Interface: " + k.getName() + "\n" );
			Field[] field = k.getDeclaredFields();
			for( Field f : field )
				System.out.println( "info: " + f.toString() );
			printClass( k.getSuperclass() );
		}
		printClass( c.getSuperclass() );
	}
	public static void main( String[] args ) throws Exception{
		for( int i = 0; i < args.length; i++ ){
			System.out.println( "class: " + args[i] );
			printClass( Class.forName( args[i] ) );
		}
	}
}