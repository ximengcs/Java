public class Question_75_9{
	public static void main( String[] args ){
		if( args.length != 1 ){
			System.out.print( "Please input a right number" );
			return;
		}
		for( long i = 0, j = 1, count = 1; count <= Integer.parseInt(args[0]); count++ ){
			i += j;
			System.out.print( i + " " );
			j = i - j;
		}
	}
}
		