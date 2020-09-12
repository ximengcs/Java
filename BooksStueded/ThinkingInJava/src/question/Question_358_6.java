import java.util.*;

class RandomList<T>{
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random();
	public void add( T item ){
		storage.add( item );
	}
	public T select(){
		return storage.get( rand.nextInt(storage.size()) );
	}
	
	public static void main( String[] args ){
		//String
		RandomList<String> rs = new RandomList<String>();
		for( String s : ("the fds dsfdsf" + "dsffds").split(" ") )
			rs.add(s);
		for( int i = 0; i < 4; i++ )
			System.out.print( rs.select() + " " );
		
		//Integer
		RandomList<Integer> rs2 = new RandomList<Integer>();
		for( int i : Arrays.asList( 1, 2, 3, 4 ) )
			rs2.add(i);
		for( int i = 0; i < 4; i++ )
			System.out.print( rs2.select() + " " );
	}
}