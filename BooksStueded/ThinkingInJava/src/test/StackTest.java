import net.mindview.util.*;

public class StackTest{
	public static void main( String[] args ){
		Stack<String> stack = new Stack<String>();
		for( String s : "a b c d e f g".split(" ") )
			stack.push(s);
		
		while( !stack.empty() )
			System.out.print( stack.pop() + ", " );
	}
}