public class Question_318_8{
	public static void printClass( Class<?> c ){
		if( c == null )
			return;
		System.out.println( c.getName() );
		for( Class k : c.getInterfaces() ){
			System.out.println( "Interface: " + k.getName() );
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