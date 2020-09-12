package question;

import question.lib.Apply;

import java.util.ArrayList;
import java.util.Arrays;

import lib.typeinfo.pets.*;

public class Q_423_40 {

	public static void main( String[] args ) throws Exception {
		Apply.apply( new ArrayList<Pet>(
				Arrays.asList( 
						new Pet(), new Cat() , new Manx(), new Dog(), new Rat() )
				) , Pet.class.getMethod( "speak" ) );
	}
}
