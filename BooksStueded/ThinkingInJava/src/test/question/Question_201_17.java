import java.util.Random;

interface Game{
	void fruit();
}
interface GameFactory{
	Game getGame();
}
class Coin implements Game{
	Random rand = new Random();
	public void fruit(){
		if( rand.nextInt() % 2 == 0 )
			System.out.println( "���׳���Ӳ���� �� ��" );
		else
			System.out.println( "���׳���Ӳ���� �� ��" );
	}
	public static GameFactory gameFactory = new GameFactory(){
		public Game getGame(){
			return new Coin();
		}
	};
}
class Dice implements Game{
	Random rand = new Random();
	public void fruit(){
		System.out.println( "���ӳ������ӵ���Ϊ " + (rand.nextInt(5)+1) );
	}
	public static GameFactory gameFactory = new GameFactory(){
		public Game getGame(){
			return new Dice();
		}
	};
}
public class Question_201_17{
	public static void start( GameFactory g ){
		Game game = g.getGame();
		game.fruit();
	}
	public static void main( String[] args ){
		System.out.println();
		start( Coin.gameFactory );
		start( Coin.gameFactory );
		start( Coin.gameFactory );
		System.out.println();
		start( Dice.gameFactory );
		start( Dice.gameFactory );
		start( Dice.gameFactory );
	}
}