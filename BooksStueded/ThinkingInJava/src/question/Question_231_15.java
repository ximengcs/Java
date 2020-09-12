import net.mindview.util.Stack;

public class Question_231_15{
	public static void main( String[] args ){
		Stack<Character> stack = new Stack<Character>();
		
		stack.push('U');
		stack.push('n');
		stack.push('c');
		System.out.print( stack.pop() + " " );
		System.out.print( stack.pop() + " " );
		System.out.print( stack.pop() + " " );
		stack.push('e');
		stack.push('r');
		stack.push('t');
		System.out.print( stack.pop() + " " );
		System.out.print( stack.pop() + " " );
		System.out.print( stack.pop() + " " );
		stack.push('a');
		System.out.print( stack.pop() + " " );
		stack.push('i');
		System.out.print( stack.pop() + " " );
		stack.push('n');
		stack.push('t');
		stack.push('y');
		System.out.print( stack.pop() + " " );
		System.out.print( stack.pop() + " " );
		System.out.print( stack.pop() + " " );
		stack.push('-');
		stack.push('r');
		stack.push('u');
		System.out.print( stack.pop() + " " );
		System.out.print( stack.pop() + " " );
		stack.push('l');
		stack.push('e');
		stack.push('s');
		System.out.print( stack.pop() + " " );
		System.out.print( stack.pop() + " " );
		System.out.print( stack.pop() + " " );
	}
}