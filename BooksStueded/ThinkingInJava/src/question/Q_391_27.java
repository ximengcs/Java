package question;

import java.util.List;
import java.util.ArrayList;

public class Q_391_27 {
	public static void main( String[] args ){
		List<? extends Number> test = new ArrayList<Integer>();
		// cannot compile
		//List<Number> test1 = new ArrayList<Integer>();
		//test.add(1);
		//test.add(1.1F);
		//test.add((byte)1);
		//test.add((char)1);
		//test.add(new Object());
	}
}
