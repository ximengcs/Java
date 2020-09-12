class Father{}

class Son extends Father{}

class Test<T>{
	private T t;
	public Test( T t ){
		this.t = t;
	}
	public void set( T t ){
		this.t = t;
	}
}

public class Question_354_1{
	public static void main( String[] args ){
		Father father = new Father();
		Son son = new Son();
		
		Test<Father> test = new Test<Father>(father);
		test.set(son);
		Test<Father> test2 = new Test<Father>(son);
	}
}