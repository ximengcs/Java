package question;

import lib.typeinfo.pets.*;

class Generic1<T> {
	void t( T t ){}
}

class Generic2<T> {
	T get(){
		return null;
	}
}

public class Q_395_28 {
	// 逆变
	static <T> void f1( Generic1<? super T> obj, T item ){
		obj.t( item );
	}
	//协变
	static <T> T f2( Generic2<? extends T> obj ){
		return obj.get();
	}
	public static void main( String[] args ){
		Generic1<Pet> t1 = new Generic1<Pet>();
		f1( t1, new Cat() );
		f1( t1, new EgyptianMau() );
		f1( t1, new Manx() );
		f1( t1, new Dog() );
		f1( t1, new Mutt() );
		f1( t1, new Pug() );
		f1( t1, new Pet() );
		f1( t1, new Rodent() );
		
		Generic2<Cat> t2 = new Generic2<Cat>();
		Cat c1 = f2( t2 );
		Pet c2 = f2( t2 );
		Individual c3 = f2( t2 );
		// ! Dog c4 = f2( t2 );
		// ! EgyptianMau c5 = f2( t2 );
		// ! Manx c6 = f2( t2 );
	}
}
