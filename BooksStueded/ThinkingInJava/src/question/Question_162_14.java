class Rodent{
	Rodent(){
		System.out.println( "Rodent" );
	}
}
class Mouse extends Rodent{
	Mouse(){
		System.out.println( "Mouse" );
	}
}
class Gerbil{
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	Gerbil(){
		System.out.println( "Createing Gerbil" );
	}
	public void addRef(){
		refcount++;
	}
	protected void dispose(){
		if( --refcount == 0 )
			System.out.println( "Disposing" + this );
	}
	public String toString(){
		return "Gerbil" + id;
	}
}
class Hamster extends Rodent{
	private Gerbil g;
	private static long counter = 0;
	private final long id = counter++;
	void dispose(){
		System.out.println( "cleaning Hamster" );
		g.dispose();
	}
	Hamster( Gerbil g ){
		System.out.println( "Createing Gerbil" );
		this.g = g;
		g.addRef();
	}
	public String toString(){
		return "Hamster" + id;
	}
}
public class Question_162_14{
	public static void main( String[] args ){
		Gerbil g = new Gerbil();
		Hamster[] hamster = {
			new Hamster(g),
			new Hamster(g),
			new Hamster(g),
			new Hamster(g),
		};
		for( Hamster h : hamster )
			h.dispose();
	}
}