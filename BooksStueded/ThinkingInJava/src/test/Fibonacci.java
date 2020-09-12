class Fibonacci{
	private int count = 0;
	public int next(){
		return fib(count++);
	}
	public int fib( int count ){
		if( count < 2 )
			return 1;
		else
			return fib(count-2) + fib(count-1);
	}
	
	public static void main( String[] args ){
		Fibonacci fibonacci = new Fibonacci();
		for( int i = 0; i < 100; i++ )
			System.out.print( fibonacci.next() + " " );
	}
}