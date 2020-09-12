package other;

public class NiBoLan {

	public static void main(String[] args) {
		System.out.println( "result = " + evaluate( "-+3*5+261" )[0]
				+ "\n time = " + evaluate( "-+3*5+261" )[1] );
		// 3 + 5 * ( 2 + 6 ) - 1
	}
	
	static int[] evaluate( String x ) {
		if( x.length() == 0 )
			return new int[]{0,0};
		
		char c = x.charAt(0);
		
		if( c >= '0' && c <= '9' )
			return new int[]{ c - '0', 1 };
		 
		int[] v1 = evaluate( x.substring(1) );
		int[] v2 = evaluate( x.substring(1+v1[1]) );
		int v = Integer.MAX_VALUE;
		
		if( c == '+' )
			v = v1[0] + v2[0];
		if( c == '*' )
			v = v1[0] * v2[0];
		if( c == '-' )
			v = v1[0] - v2[0];
		
		// 1 是符号 加上 v1的运算符号数 加上 v2的运算符号数
		return new int[]{ v, 1+v1[1] + v2[1] };
	}
}
