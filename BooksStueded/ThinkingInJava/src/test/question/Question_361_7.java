import java.util.*;

class Fibonacii{
	private int count = 0;
	public int next(){
		return fib(count++);
	}
	private int fib( int count ){
		if( count < 2 )
			return 1;
		else
			return fib(count-2) + fib(count-1);
	}
}

//适配
class IterableFibonacii implements Iterable<Integer>{
	Fibonacii fibonacii = new Fibonacii();
	private int count = 0;
	IterableFibonacii( int count ){
		this.count = count;
	}
	
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>(){
			public boolean hasNext(){
				return count > 0;
			}
			public Integer next(){
				count--;
				return fibonacii.next();
			}
			public void remove(){
				throw new UnsupportedOperationException();

			}
		};
	}
}

public class Question_361_7{
	public static void main( String[] args ){
		for( int i : new IterableFibonacii(50) )
			System.out.print( i + " " );
	}
}