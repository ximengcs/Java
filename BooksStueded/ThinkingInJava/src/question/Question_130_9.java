class Component1{
	Component1( int i ){
		System.out.println( "Component1" );
	}
}
class Component2{
	Component2( int i ){
		System.out.println( "Component2" );
	}
}
class Component3{
	Component3( int i ){
		System.out.println( "Component3" );
	}
}
class Root{
	Component1 component1 = new Component1(0);
	Component2 component2 = new Component2(0);
	Component3 component3 = new Component3(0);
	Root( int i ){
		System.out.println( "Root" );
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
}
public class Question_130_9{
	public static void main( String[] args ){
		Stem s = new Stem(0);
	}
}