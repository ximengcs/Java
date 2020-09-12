package question;

interface Test{
	void f();
	void f2();
}

class Demo implements Test{
	public void f(){
		System.out.println( "Demo.f();" );
	}
	public void f2(){
		System.out.println( "Demo.f2();" );
	}
	public void f3(){
		System.out.println( "Demo.f3();" );
	}
}

public class Q_375_20 {
	public static <T extends Test> void use( T t ){
		t.f();
		t.f2();
	}
	public static void main( String[] args ){
		use( new Demo() );
	}
}
