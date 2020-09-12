import java.util.List;
import java.util.Random;
import java.util.ListIterator;
import java.util.ArrayList;

class Question_228_12{
	public static void main( String[] args ){
		List<Integer> listOne = new ArrayList<Integer>();
		List<Integer> listTwo = new ArrayList<Integer>();
		
		for( int i = 0; i < 10; i++ )
			listOne.add(new Random().nextInt(100));
		
		ListIterator it = listOne.listIterator();
		while( it.hasNext() )
			System.out.print( it.next() + ", " );
		System.out.println();
		
		//reverse
		while( it.hasPrevious() )
			listTwo.add( (Integer)(it.previous()) );
		it = listTwo.listIterator();
		while( it.hasNext() )
			System.out.print( it.next() + ", " );
		System.out.println();
	}
}