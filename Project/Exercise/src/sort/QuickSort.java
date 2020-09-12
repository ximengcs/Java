package sort;

import java.util.logging.Level;
import java.util.logging.Logger;

public class QuickSort {

	public static void main( String[] args ) {
		Logger.getGlobal().setLevel( Level.OFF );
		int[] a = { 52, 12, 65, 8, 0, 8, 32,52, 12, 65, 8, 0, 8, 32 };
		Show.showAll( a );
		sort( a );
		Show.showAll( a );
	}
	
	public static void sort( int[] ar ) {
		sort_code( ar, 0, ar.length-1 );
	}

	private static void sort_code( int[] ar, int start, int end ) {
		if( start > end )
			return;

		Logger.getGlobal().info( start + " " + end );
		int left = start;
		int right = end;
		boolean direction = true;
		
		int std = left;
		while( left < right ) {
			if( direction ) {
				while( right > left ) {
					if( ar[right] < ar[std] ) {
						int tmp = ar[right];
						ar[right] = ar[std];
						ar[std] = tmp;
						
						std = right;
						direction = !direction;
						break;
					}
					right--;
				}
			} else {
				while( left < right ) {
					if( ar[left] > ar[std] ) {
						int tmp = ar[left];
						ar[left] = ar[std];
						ar[std] = tmp;
						
						std = left;
						direction = !direction;
						break;
					}
					left++;
				}
			}
		}

		sort_code( ar, start, std-1 );
		sort_code( ar, std+1, end );
	}
}
