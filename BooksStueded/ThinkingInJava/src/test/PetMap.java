import typeinfo.pets.*;
import java.util.*;

public class PetMap{
	public static void main( String[] args ){
		Map<String, Pet> petMap = new HashMap<String, Pet>();
		petMap.put( "Mydog", new Dog(  ) );
		petMap.put( "MyCat", new Cat(  ) );
		petMap.put( "MyHastmer", new Hamster(  ) );
		System.out.println( petMap );
		Pet dog = petMap.get( "MyDog" );
		System.out.println( dog );
		System.out.println( petMap.containsKey( "Mydog" ) );
		System.out.println( petMap.containsValue(dog) );
	}
}