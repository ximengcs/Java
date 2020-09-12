import java.util.ArrayList;
import java.util.Random;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

class Gerbil{
	private static long counter;
	private final long id;
	Gerbil(){
		id = counter++;
	}
	public void hop(){
		System.out.println( "第" + id + "号沙鼠" );
	}
}

public class Question_235_17{
	public static Map<String, Gerbil> map = new HashMap<String, Gerbil>();
	static {
		map.put( "Fuzzy", new Gerbil() );
		map.put( "Spot", new Gerbil() );
	}
	public static void main( String[] args ){
		Iterator<String> it = map.keySet().iterator();
		
		while( it.hasNext() )
			map.get(it.next()).hop();
	}
}