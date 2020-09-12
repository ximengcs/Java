class Dog{
	Dog(){}
	void bark(){
		System.out.println( "shout" );
	}
	void bark( int str ){
		System.out.println( "barking" );
	}
	void bark( short str ){
		System.out.println( "howing" );
	}
	void bark( byte str ){
		System.out.println( "hello" );
	}
}
public class Question_83_5{
	public static void main( String[] args ){
		Dog d1 = new Dog();
		d1.bark();
		d1.bark(1);
		d1.bark((short)1);
		d1.bark((byte)1);
	}
}