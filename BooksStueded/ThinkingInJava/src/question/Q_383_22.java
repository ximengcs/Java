package question;

import java.lang.reflect.*;

class ClassAsConstructor<T>{
	Class<T> kind;
	public ClassAsConstructor( Class<T> kind ){
		this.kind = kind;
	}
	public T create( int args ){
		try{
			for( Constructor<?> c : kind.getConstructors() ){
				Class<?>[] params = c.getParameterTypes();
				if( params.length == 1 )
					if( params[0] == int.class )
						return kind.cast( c.newInstance( args ) );
			}
		}catch( InvocationTargetException e ){
			throw new RuntimeException(e);
		}catch( Exception e ){
			throw new RuntimeException(e);
		}
		return null;
	}
}

public class Q_383_22 {
	public static void main( String[] args ){
		ClassAsConstructor<Integer> test = new ClassAsConstructor<Integer>( Integer.class );
		Integer i = test.create(1);
		if( i == null )
			System.out.println( "null" );
		else
			System.out.println( i );
	}
}
