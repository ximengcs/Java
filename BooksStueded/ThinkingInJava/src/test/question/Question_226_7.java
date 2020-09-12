import java.util.List;
import java.util.ArrayList;

class MyClass{
	private static int counter = 0;
	private final int id = counter++;
	public String toString(){
		return "MyClass : " + id;
	}
}

public class Question_226_7{
	public static void main( String[] args ){
		List<MyClass> my = new ArrayList<MyClass>();
		my.add(new MyClass());
		my.add(new MyClass());
		my.add(new MyClass());
		my.add(new MyClass());
		my.add(new MyClass());
		System.out.println( my );
		List<MyClass> sub = my.subList( 2, 4 );
		System.out.println(sub);
		my.removeAll(sub);
		System.out.println(my);
	}
}