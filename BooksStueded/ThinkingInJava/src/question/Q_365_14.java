package question;

import lib.generics.*;

class BasicGeneratorDemo {
	public static void main( String[] args ){
		/*Generator<CountedObject> gen = BasicGenerator.create( CountedObject.class );
		for( int i = 0; i < 5; i++ )
			System.out.println( gen.next() );*/
		
		try{
			System.out.println( CountedObject.class.newInstance() );
			System.out.println( CountedObject.class.newInstance() );
			System.out.println( CountedObject.class.newInstance() );
			System.out.println( CountedObject.class.newInstance() );
			System.out.println( CountedObject.class.newInstance() );
		}catch( Exception e ){
			throw new RuntimeException(e);
		}
	}
}
