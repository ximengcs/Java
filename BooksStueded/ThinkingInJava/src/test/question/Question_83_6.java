class Dog{
	Dog(){}
	void bark( int i, short j ){
		System.out.println( "barking" );
	}
	void bark( short i, int j ){
		System.out.println( "howling" );
	}
}
public class Question_83_6{
	public static void main( String[] args ){
		Dog d1 = new Dog();
		d1.bark( 1, (short)1 );
		d1.bark( (short)1, 1 );
	}
}