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
class Gerbil extends Rodent{
	Gerbil(){
		System.out.println( "Gerbil" );
	}
}
class Hamster extends Rodent{
	private Gerbil g = new Gerbil();
	Hamster(){
		System.out.println( "Hamster" );
	}
}
public class Question_161_12{
	public static void main( String[] args ){
		new Hamster();
	}
}