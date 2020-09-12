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
}
class CoinFactory implements GameFactory{
	public Game getGame(){
		return new Coin();
	}
}
class Dice implements Game{
	Random rand = new Random();
	public void fruit(){
		System.out.println( "���ӳ������ӵ���Ϊ " + (rand.nextInt(5)+1) );
	}
}
class DiceFactory implements GameFactory{
	public Game getGame(){
		return new Dice();
	}
}
public class Question_188_19{
	public static void start( GameFactory g ){
		Game game = g.getGame();
		game.fruit();
	}
	public static void main( String[] args ){
		System.out.println();
		start( new CoinFactory() );
		start( new CoinFactory() );
		start( new CoinFactory() );
		System.out.println();
		start( new DiceFactory() );
		start( new DiceFactory() );
		start( new DiceFactory() );
	}
}