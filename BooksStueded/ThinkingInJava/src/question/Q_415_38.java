package question;

import lib.generics.coffee.Coffee;

class Decorator extends Coffee {
	Coffee coffee = new Coffee();
	public Decorator( Coffee coffee ) {
		this.coffee = coffee;
		System.out.print( "" );
	}
	public void get() {
		System.out.println( coffee.toString() );
	}
}

class AddSugar extends Decorator {
	public AddSugar( Coffee coffee ) {
		super( coffee );
		System.out.print( "additional sugar " );
	}
}

class Milk extends Decorator {
	public Milk( Coffee coffee ) {
		super( coffee );
		System.out.print( "additional milk " );
	}
}

public class Q_415_38 {
	public static void main( String[] args ) {
		AddSugar t1 = new AddSugar( new Coffee() );
		System.out.println();
		Milk t2 = new Milk( new Coffee() );
		System.out.println();
		Milk t3 = new Milk( new AddSugar( new Coffee() ) );
	}
}
