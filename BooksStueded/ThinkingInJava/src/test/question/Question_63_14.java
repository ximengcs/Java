public class Question_63_14{
	public static void main( String[] args ){
		if( args.length < 1 )
			System.exit(0);
		System.out.println( args[0] == args[1] );
		System.out.println( args[0] != args[1] );
		System.out.println( args[0].equals(args[1]) );
		System.out.println( args[0].equals("b") );
		System.out.println( args[1].equals("b") );
		System.out.println( args[0].equals("c") );
		System.out.println( args[1].equals("c") );
	}
}