package other;

public class GuessAge {

	public static void main(String[] args) {

		int startAge = 11;
		
		long sum = 0; 
		
		while( startAge <= 100 ) {
			sum = Long.parseLong( "" + (int)Math.pow(startAge, 3) + (int)Math.pow(startAge, 4) );
			if( sum >= 1023456789 && sum <= 10000000000l && check(sum, startAge) ) {
				System.out.println(startAge);
				//break;
			}
			sum = 0;
			startAge++;
		}
	}
	
	private static boolean check( long sum, int age ) {
		int[] nums = new int[10];
		System.out.println(sum + " : " + age);
		int len = 0;
		while( sum != 0 ) {
			int tmp = (int)sum%10;
			
			int i = 0;
			while( i < len ) {
				if( tmp == nums[i] )
					return false;
				i++;
			}
			nums[len] = tmp;
			len++;
			sum /= 10;
		}
		
		return true;
	}
}
