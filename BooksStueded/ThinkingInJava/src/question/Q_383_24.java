package question;

import java.util.*;

interface FactoryTest<T>{
	T create( int arg );
}

class A implements FactoryTest<Integer>{
	public Integer create( int arg ){
		return new Integer(arg);
	}
}

class B{
	private int code;
	public B( int arg ){
		code = arg;
	}
	public static class Factory implements FactoryTest<B>{
		public B create( int arg ){
			return new B(arg);
		}
	}
	public String toString(){
		return "" + code;
	}
}

public class Q_383_24 {
	HashMap<String, FactoryTest<?>> map;
	public Q_383_24(){
		map = new HashMap<String, FactoryTest<?>>();
	}
	void addType( String str, FactoryTest<?> factory ){
		map.put( str, factory );
	}
	Object createNew( String typename, int arg ){
		try{
			return map.get(typename).create(arg);
		}catch( NullPointerException e ){
			System.out.println( "cannot be found this class" );
			//e.printStackTrace();
		}/*finally{
			System.out.println( "test" );
		}*/
		return null;
	}
	
	public static void main( String[] args ){
		Q_383_24 test = new Q_383_24();
		test.addType( "A", new A() );
		test.addType( "B", new B.Factory() );
		System.out.println( test.createNew("A", 1) );
		System.out.println( test.createNew("B", 2) );
		System.out.println( test.createNew("Integer", 1) );
	}
}
