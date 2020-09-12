package question;

public class Q_391_26 {
	public static void main( String[] args ){
		//协变
		Number[] test = new Integer[10];
		test[0] = Integer.valueOf(1);
		try{
			test[0] = Double.valueOf(1.1);
		}catch( Exception e ){
			throw new RuntimeException(e);
		}
		try{
			test[1] = Byte.valueOf( (byte)1 );
		}catch( Exception e ){
			throw new RuntimeException(e);
		}
		
		// ok
		/*Number[] test2;
		test2 = new Integer[10];
		Number[] test3;
		Integer[] test4 = new Integer[10];
		test3 = test4;
		Number[] test5 = new Number[10];
		Integer[] test6 = new Integer[10];
		test5 = test6;*/
	}
}
