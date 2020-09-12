class Fat{
	void printOne(){
		System.out.println( "Fat.One()" );
	}
	void print(){
		printOne();
	}
}
class Son extends Fat{
	void printOne(){
		System.out.println( "Son.One()" );
	}
}
public class Question_155_10{
	public static void main( String[] args ){
		Fat s = new Son();
		s.print();
	}
}