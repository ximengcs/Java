package test;

public class Array {
	public static void main( String[] args ){
		Object[] a = new Object[10];
		for( int i = 0; i < 10; i++ )
			a[i] = (Object)i;
		
		Integer[] num = (Integer[])a;
	}
}
