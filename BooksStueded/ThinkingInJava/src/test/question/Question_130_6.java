class Game{
	Game( int i ){
		System.out.println( "Game" );
	}
}
class BoardGame extends Game{
	BoardGame( int i ){
		super(1);
		System.out.println( "BBoardGame" );
	}
}
class Chess extends BoardGame{
	Chess(){
		super(1);
		System.out.println( "Chess" );
	}
}
public class Question_130_6{
	public static void main( String[] args ){
		Chess x = new Chess();
	}
}