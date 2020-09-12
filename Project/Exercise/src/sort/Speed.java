package sort;

import java.util.Random;

public class Speed {

	public static void main( String[] args ) {
		Random rand = new Random();
		int[] n = new int[100000];
		for( int i = 0; i < n.length; i++ )
			n[i] = rand.nextInt(100000);
		
		long time;
		System.out.println( "BubbleSort" );
		time = System.nanoTime();
		BubbleSort.sort( n );
		System.out.println( System.nanoTime() - time );
		
		for( int i = 0; i < n.length; i++ )
			n[i] = rand.nextInt(100000);
		
		System.out.println( "SelectSort" );
		time = System.nanoTime();
		SelectSort.sort( n );
		System.out.println( System.nanoTime() - time );
		
		for( int i = 0; i < n.length; i++ )
			n[i] = rand.nextInt(100000);
		
		System.out.println( "QuickSort" );
		time = System.nanoTime();
		QuickSort.sort( n );
		System.out.println( System.nanoTime() - time );
	}
	
}
