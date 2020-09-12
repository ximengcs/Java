package question;

interface FactoryI<T>{
	T create( int arg );
}

class Foo2<T>{
	private T x;
	public <F extends FactoryI<T>> Foo2( F factory, int arg ){
		x = factory.create(arg);
	}
	public String toString(){
		return x.toString();
	}
}

class IntegerFactory implements FactoryI<Integer>{
	public Integer create( int g ){
		return new Integer(g);
	}
}

class Widget{
	private int code;
	public Widget( int arg ){
		code = arg;
	}
	public static class Factory implements FactoryI<Widget>{
		public Widget create( int arg ){
			return new Widget(arg);
		}
	}
	public String toString(){
		return code + "" ;
	}
}


public class Q_383_23 {
	public static void main( String[] args ){
		System.out.println( 
				new Foo2<Integer>( new IntegerFactory(), new java.util.Random().nextInt(100) ) );
		System.out.println( 
				new Foo2<Widget>( new Widget.Factory(), new java.util.Random().nextInt(100) ) );
	}
}
