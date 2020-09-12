public class Question_337_20{
	public static void display( String msg, Object[] vals ){
		System.out.println( msg );
		for( Object val : vals )
			System.out.println( " " + val );
	}
	
	public static void classInfo( Class<?> c ) throws Exception{
		System.out.println( "c.getName():" + c.getName() );
		System.out.println( "c.getPackage():" + c.getPackage() );
		System.out.println( "c.getSuperclass():" + c.getSuperclass() );
		display( "c.getDeclaredClasses():", c.getDeclaredClasses() );
		if( c.getSuperclass() != null )
			classInfo(c.getSuperclass());
	}
	
	public static void main( String[] args ){
		if( args.length < 1 )
			System.exit(0);
		try{
			classInfo( Class.forName( args[0] ) );
		}catch( Exception e ){
			System.out.println( "Exception" );
		}
	}
}