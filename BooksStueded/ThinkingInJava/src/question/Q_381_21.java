package question;

import java.util.*;

class Building{}
class House extends Building{}

public class Q_381_21<T>{
	Class<T> kind;
	Map<String, Class<?>> map = new HashMap<String, Class<?>>();
	public Q_381_21( Class<T> kind ){
		this.kind = kind;
	}
	public boolean f( Object arg ){
		return kind.isInstance(arg);
	}
	
	void addType( String typename, Class<?> kind ){
		map.put( typename, kind );
	}
	
	Object createNew( String typename ){
		try{
			return map.get( typename ).newInstance();
		}catch( Exception exception ){
			throw new RuntimeException( exception );
		}
	}
	
	public static void main( String[] args ){
/*		ClassTypeCapture<Building> ctt1 = 
				new ClassTypeCapture<Building>( Building.class );
		System.out.println( ctt1.f(new Building()) );
		System.out.println( ctt1.f(new House()) );
		
		ClassTypeCapture<House> ctt2 = 
				new ClassTypeCapture<House>( House.class );
				System.out.println( ctt2.f( new Building() ) );
				System.out.println( ctt2.f( new House() ) );*/
		Q_381_21<Building> test = 
				new Q_381_21<Building>( Building.class );
		test.addType( "Building", Building.class );
		test.addType( "House", House.class );
		test.addType( "String", String.class );
		
		System.out.println( test.createNew( "House" ) );
		System.out.println( test.createNew( "Building" ) );
		System.out.println( test.createNew( "String" ) );
	}
}
