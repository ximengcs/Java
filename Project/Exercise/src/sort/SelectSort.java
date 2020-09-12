package sort;

public class SelectSort {

	public static void main( String[] args ) {
		int[] a = { 52, 12, 65, 8, 0, 8, 32 };
		Show.showAll( a );
		sort( a );
		Show.showAll( a );
	}
	
	public static void sort( int[] ar ) {
		for( int i = 0; i < ar.length-1; i++ )
			for( int j = i+1; j < ar.length; j++ )
				if( ar[j] < ar[i] ) {
					int tmp = ar[j];
					ar[j] = ar[i];
					ar[i] = tmp;
				}
	}
}
