interface Cycle{
	void draw();
	void clean();
}
interface CycleFactory{
	Cycle getCycle();
}
class Unicycle implements Cycle{
	public void draw(){
		System.out.println( "unicycle.draw" );
	}
	public void clean(){
		System.out.println( "unicycle.clean" );
	}
}
class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}
class Bycle implements Cycle{
	public void draw(){
		System.out.println( "Bycle.draw" );
	}
	public void clean(){
		System.out.println( "Bycle.clean" );
	}
}
class BycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bycle();
	}
}
class Tricycle implements Cycle{
	public void draw(){
		System.out.println( "Tricycle.draw" );
	}
	public void clean(){
		System.out.println( "Tricycle.clean" );
	}
}
class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}
public class Question_187_18{
	public static void user( CycleFactory c ){
		Cycle cycle = c.getCycle();
		cycle.draw();
		cycle.clean();
	}
	public static void main( String[] args ){
		user( new UnicycleFactory() );
		user( new BycleFactory() );
		user( new TricycleFactory() );
	}
}