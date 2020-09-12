import java.util.*;

class Command{
	private String name = null;
	public Command( String name ){
		this.name = name;
	}
	public void operation(){
		System.out.println( name + " " );
	}
}

class Use{
	private Queue<Command> queue = null;
	public Use(){
		queue = new LinkedList<Command>();
	}
	public Command offer( Command command ){
		queue.offer(command);
		return command;
	}
	public Queue<Command> get(){
		return queue;
	}
}

class Question_237_27{
	public static void user( Queue<Command> queue ){
		for( Command q : queue )
			q.operation();
	}
	public static void main( String[] args ){
		Use use = new Use();
		for( int i = 0; i < 10; i++ )
			use.offer( new Command( "simon" ) );
		user(use.get());
	}
}