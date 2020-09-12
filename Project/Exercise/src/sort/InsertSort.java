package sort;

public class InsertSort {

	public static void main( String[] args ) {
		int[] a = { 52, 12, 65, 8, 0, 8, 32 };
		Show.showAll( a );
		sort( a );
		Show.showAll( a );
	}
	
	public static void sort( int[] ar ) {
		for( int i = 1; i < ar.length; i++ ) {
			for( int j = i-1; j > 0; j-- ) {
				if( ar[i] < ar[j] && ar[i] >= ar[j-1] ) {
					int tmp = ar[i];
					for( int k = i; k > j; k++ )
						ar[k] = ar[k-1];
					ar[j] = tmp;
				}
			}
		}
	}
}
