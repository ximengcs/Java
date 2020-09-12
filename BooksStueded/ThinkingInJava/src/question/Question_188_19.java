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
			System.out.println( "你抛出的硬币是 正 面" );
		else
			System.out.println( "你抛出的硬币是 反 面" );
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
		System.out.println( "你扔出的骰子点数为 " + (rand.nextInt(5)+1) );
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