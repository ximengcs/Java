package simon.home.test;

import simon.home.model.Dog;
import simon.home.model.Home;
import simon.home.model.Thief;

public class Test {

	public static void main(String[] args) {
		Home home = new Home();
		
		Dog dog = new Dog();
		
		home.addDog(dog);
		
		Thief thief = new Thief();
		
		thief.setName("simon");
		thief.setAge(18);
		thief.setSex("male");
		
		System.out.println("Everything is good.");
		home.intoThief(thief);
		
	}
}
