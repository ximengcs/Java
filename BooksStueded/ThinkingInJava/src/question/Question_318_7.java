import static net.mindview.util.Print.*;

class Candy{
	static {
		print( "Loading Candy" );
	}
}

class Gum{
	static {
		print( "Loading Gum" );
	}
}

class Cookie{
	static {
		print( "Loading Cookie" );
	}
}

public class Question_318_7{
	public static void main( String[] args ) throws Exception{
		for( String str : args ){
			Class.forName( str );
		}
	}
}