class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		System.out.println( "i = " + i + ", j = " + j );
		j = 39;
	}
	private static int x1 = printInit( "static Insect.x1 initialized" );
	static int printInit( String s ){
		System.out.println(s);
		return 47;
	}
}

public class Question_147_24 extends Insect{
	private int k = printInit( "Beetle.k initialized" );
	public Question_147_24(){
		System.out.println( "k = " + k );
		System.out.println( "j = " + j );
	}
	private static int x2 = printInit( "static Beetle.x2 initialized" );
	public static void main( String[] args ){
		System.out.println( "Beetle constructor" );
		Question_147_24 b = new Question_147_24();
	}
}
