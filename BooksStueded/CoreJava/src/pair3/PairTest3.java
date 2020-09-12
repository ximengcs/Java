package pair3;

import java.time.LocalDate;

class Pair<T> {
	T first;
	T second;
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}

	public void setFirst( T t ) {
		// TODO 自动生成的方法存根
		
	}

	public void setSecond( T t ) {
		// TODO 自动生成的方法存根
		
	}
}

class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	public Employee( String n, double s, int year, int month, int day ) {
		name = n;
		salary = s;
		hireDay = LocalDate.of( year, month, day );
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary( double byPercent ) {
		double raise = salary * byPercent/100;
		salary += raise;
	}
}

class Manager {

	public int getBounds() {
		// TODO 自动生成的方法存根
		return 0;
	}
	
}

public class PairTest3 {

	public static void main( String[] args ) {
		
	}
	
	public static void printBuddies( Pair<? extends Employee> p ) {
		Employee first = p.getFirst();
		Employee second = p.getSecond();
		System.out.println( first.getName() + " and " + second.getName() + " are buddies." );
	}
	
	public static void minmaxBouns( Manager[] a, Pair<? super Manager> result ) {
		if( a.length == 0 )
			return;
		Manager min = a[0];
		Manager max = a[1];
		for( int i = 1; i < a.length; i++ ) {
			if( min.getBounds() > a[i].getBounds() )
				min = a[i];
			if( max.getBounds() < a[i].getBounds() )
				max = a[i];
		}
		result.setFirst( min );
		result.setSecond( max );
	}
	
	public static void maxminBounds( Manager[] a, Pair<? super Manager> result ) {
		minmaxBouns( a, result );
		PairAlg.swapHelper( result );
	}
}

class PairAlg {
	public static boolean hasNulls( Pair<?> p ) { // <?>只能赋给object
		return p.getFirst() == null || p.getSecond() == null;
	}
	
	public static void swap( Pair<?> p ) {
		swapHelper(p);
	}
	
	public static <T> void swapHelper( Pair<T> p ) {
		T t = p.getFirst();
		p.setFirst( p.getSecond() );
		p.setSecond(t);    
	}
}