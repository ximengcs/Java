package other;

public class TaiJie {

	public static void main(String[] args) {
		
		check(0);
		System.out.println(count);
	}
	
	static int count = 0;
	
	static boolean o = true;
	
	private static void check( int i ) {
		o = !o;
		if( o && i == 39 ) {
			count++;
			return;
		}
		if( i > 39 )
			return;
		check( i+1 );
		check( i+2 );
	}
}
