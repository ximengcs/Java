import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;
import java.util.Random;

public class Question_229_14{
	public static void main( String[] args ){
		List<Integer> list = new LinkedList<Integer>();
		Random rand = new Random();
		ListIterator<Integer> listIterator = list.listIterator();
		
		for( int i = 0; i < 10; i++ ){
			listIterator.add(rand.nextInt(100));
		}
		
		while( listIterator.hasPrevious() ){
			Integer i = listIterator.previous();
			System.out.print( i + ", " );
		}
	}
}