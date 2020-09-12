package question;

import lib.generics.Holder;

public class Q_401_30 {
	public static void main( String[] args ){
		Holder<Integer> t1 = new Holder<Integer>();
		t1.set(1);
		int ints = t1.get();
		
		Holder<Short> t2 = new Holder<Short>();
		t1.set( 1 );
		short shorts = t2.get();
	}
}
