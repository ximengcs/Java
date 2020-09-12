class Component1{
	Component1( int i ){
		System.out.println( "Component1" );
	}
	void dispose(){
		System.out.println( "clean component1" );
	}
}
class Component2{
	Component2( int i ){
		System.out.println( "Component2" );
	}
	void dispose(){
		System.out.println( "clean component2" );
	}
}
class Component3{
	Component3( int i ){
		System.out.println( "Component3" );
	}
	void dispose(){
		System.out.println( "clean component3" );
	}
}
class Root{
	Component1 component1 = new Component1(0);
	Component2 component2 = new Component2(0);
	Component3 component3 = new Component3(0);
	Root( int i ){
		System.out.println( "Root" );
	}
	void dispose(){
		System.out.println( "clean root" );
		component1.dispose();
		component2.dispose();
		component3.dispose();
	}
}
class Stem extends Root{
	Component1 component1 = new Component1(0);
	Component2 component2 = new Component2(0);
	Component3 component3 = new Component3(0);
	Stem( int i ){
		super(i);
		System.out.println( "Stem" );
	}
	void dispose(){
		System.out.println( "clean stem" );
		component1.dispose();
		component2.dispose();
		component3.dispose();
		super.dispose();
	}
}
public class Question_135_12{
	public static void main( String[] args ){
		Stem s = new Stem(0);
		try{
		}finally{
			s.dispose();
		}
	}
}