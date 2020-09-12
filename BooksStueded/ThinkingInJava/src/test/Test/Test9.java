import java.util.*;

class New{
	public static <T> ArrayList<T> arrayList(){
		return new ArrayList<T>();
	}
	public <T> LinkedList<T> linkedList(){
		return new LinkedList<T>();
	}
}

class Test4{
	public static void testStatic( ArrayList<String> arrarList ){}
	
	public void test( ArrayList<String> arrayList ){}
	
	public static void main( String[] args ){
		testStatic( New.<String>arrayList() );
		test( New.this.linkedList() );
	}
}