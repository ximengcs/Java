package sort;

public class BubbleSort {

	public static void main( String[] args ) {
		int[] a = { 52, 12, 65, 8, 0, 8, 32 };
		Show.showAll( a );
		sort( a );
		Show.showAll( a );
	}
	
	public static void sort( int[] ar ) {
		for( int i = 0; i < ar.length-1; i++ )
			for( int j = 0; j < ar.length-1-i; j++ )
				if( ar[j] > ar[j+1] ) {
					int tmp = ar[j+1];
					ar[j+1] = ar[j];
					ar[j] = tmp;
				}
	}
}
