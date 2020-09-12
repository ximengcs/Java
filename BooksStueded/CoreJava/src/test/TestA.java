package test;

public class TestA {

	public static void main( String[] args ) {
		int n = 6;
		for( int i = 0; i < n; i++ ) {
			for( int j = 1; j <= n*2-1; j++ ) {
				if( j < n-i || j > n+i )
					System.out.print( "¡¡" );
				else
					System.out.print( "¿Ú" );
			}
			System.out.println(  );
		}
		/*Console cons = System.console();
		String username = cons.readLine( "User name:" );
		char[] passwd = cons.readPassword( "PassWord:" );
		int n;
		{
			int[] b = new int[10];
			b = new int[1];
		}*/
	}
}
