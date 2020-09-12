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
	public static CycleFactory cycleFactory = new CycleFactory(){
		public Cycle getCycle(){
			return new Unicycle();
		}
	};
}
class Bycle implements Cycle{
	public void draw(){
		System.out.println( "Bycle.draw" );
	}
	public void clean(){
		System.out.println( "Bycle.clean" );
	}
	public static CycleFactory cycleFactory = new CycleFactory(){
		public Cycle getCycle(){
			return new Bycle();
		}
	};
}
class Tricycle implements Cycle{
	public void draw(){
		System.out.println( "Tricycle.draw" );
	}
	public void clean(){
		System.out.println( "Tricycle.clean" );
	}
	public static CycleFactory cycleFactory = new CycleFactory(){
		public Cycle getCycle(){
			return new Tricycle();
		}
	};
}
public class Question_201_16{
	public static void user( CycleFactory c ){
		Cycle cycle = c.getCycle();
		cycle.draw();
		cycle.clean();
	}
	public static void main( String[] args ){
		user( Unicycle.cycleFactory );
		user( Bycle.cycleFactory );
		user( Tricycle.cycleFactory );
	}
}