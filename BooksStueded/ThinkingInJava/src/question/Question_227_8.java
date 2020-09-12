import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

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

public class Question_227_8{
	public static void main( String[] args ){
		ArrayList<Gerbil> gerbil = new ArrayList<Gerbil>();
		for( int i = 0; i < new Random().nextInt(50); i++ )
			gerbil.add( new Gerbil() );
		//for( int i = 0; i < gerbil.size(); i++ )
		//	gerbil.get(i).hop();
		//for( Gerbil g : gerbil )
		//	g.hop();
		Iterator<Gerbil> a = gerbil.iterator();
		while( a.hasNext() ){
			Gerbil g = a.next();
			g.hop();
		}
	}
}