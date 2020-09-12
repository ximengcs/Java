interface interface1{
	void act1();
	void act2();
}
interface interface2{
	void act3();
	void act4();
}
interface interface3{
	void act5();
	void act6();
}
interface interface4 extends interface1, interface2, interface3{
	void act();
}
class Test implements interface4{
	public void act(){ System.out.println( "act" ); }
	public void act1(){ System.out.println( "act1" ); }
	public void act2(){ System.out.println( "act2" ); }
	public void act3(){ System.out.println( "act3" ); }
	public void act4(){ System.out.println( "act4" ); }
	public void act5(){ System.out.println( "act5" ); }
	public void act6(){ System.out.println( "act6" ); }
}
public class Question_181_14{
	public static void a( interface1 x ){ x.act1(); x.act2(); }
	public static void b( interface2 x ){ x.act3(); x.act4(); }
	public static void c( interface3 x ){ x.act5(); x.act6(); }
	public static void d( interface4 x ){ x.act(); }
	public static void main( String[] args ){
		Test t = new Test();
		a(t);
		b(t);
		c(t);
		d(t);
	}
}