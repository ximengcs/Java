package other;

public class MaHu {

	public static void main(String[] args) {
		int start = 10234;
		int end = 56789;
		
		while( start <= end ) {
			
			if( check(start) && count(start)  )
				System.out.println(start);
			
			start++;
		}
	}
	private static boolean count( int num ) {
		String n = num + "";
		
		int pre = Integer.parseInt( n.substring(0, 1) + n.substring(3, 4) + n.substring(1, 2) );
		
		int next = Integer.parseInt( n.substring(2, 3) + n.substring(4, 5) );
		
		if( (num/1000) * (num%1000) == pre*next ) {
			//System.out.println("num = " + num + " pre = " + pre + " next = " + next + " num/1000 = " + (num/1000) + " num%1000 = " + (num%1000) );
			
			return true;
		}
		
		return false;
	}
	
	private static boolean check( long sum ) {
		int[] nums = new int[10];
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
