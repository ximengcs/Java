enum Coin{
	RMB, YB, MY, GB, HB
}
public class Question_107_21{
	public static void main( String[] args ){
		for( Coin c : Coin.values() )
			System.out.println( c + " " + c.ordinal() );
	}
}