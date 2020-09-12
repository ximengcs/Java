import java.util.*;
public class Question_75_10{
	public static void main( String[] args ){
		xxg(8);
	}
	
	public static void xxg( int n ){
		int bits = n / 2;
		int start = 10, end, startNum, endNum = 10;
		for( int i = 2; i < bits; i++ )
			start *= 10;
		end = start*10 - 1;
		
		for( int i = 2; i < n; i++ )
			endNum *= 10;
		startNum = endNum*10 - 1;
		
		for( int i = start; i <= end; i++ ){
			for( int j = i+1; j <= end; j++ ){
				int sum = i*j;
				if( sum <= startNum && sum >= endNum ){
					char[] t1 = String.valueOf(sum).toCharArray();
					char[] t2 = (String.valueOf(i)+String.valueOf(j)).toCharArray();
					Arrays.sort(t1);
					Arrays.sort(t2);
					if( Arrays.equals(t1, t2) ){
						System.out.println( i + "*" + j + "=" + i*j );
					}
				}
			}
		}
		/*
		String[] t1 = (sum +"").split("");
		String[] t2 = ("" + i + j).split("");
		
		char[] t1 = String.valueOf(sum).toCharArray();
		char[] t2 = (String.valueOf(i)+String.valueOf(j)).toCharArray();
		*/
	}
}
