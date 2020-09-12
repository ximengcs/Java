class A{
	A(){ System.out.println( "A" ); }
}
class B{
	B(){ System.out.println( "B" ); }
}
class C extends A{
	B b = new B();
}
public class Question_130_5{
	public static void main( String[] args ){
		C c = new C();
	}
}