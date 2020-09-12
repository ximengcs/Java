import java.util.*;

class Test extends Object{}

public class Question_238_29{
	public static void main( String[] args ){
		Queue<Test> queue = new PriorityQueue<Test>();
		queue.offer( new Test() );
		queue.offer( new Test() );
		
		System.out.print( queue );
	}
}