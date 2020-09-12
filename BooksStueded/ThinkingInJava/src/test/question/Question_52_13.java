public class Question_52_13{
	public static void main( String[] args ){
		char ch;
		ch = '我';
		toBinaryString( ch, 0 );
		//toBinaryString( ch, 1 );
		
		ch = '爱';
		toBinaryString( ch, 0 );
		//toBinaryString( ch, 1 );
		
		ch = '你';
		toBinaryString( ch, 0 );
		//toBinaryString( ch, 1 );
	}
	// 如果flag为0， 则输出前导0，否则不输出
	public static void toBinaryString( char ch, int flag ){
		char check = 0x8000;
		int i = 1;
		boolean temp = false;
		while( check != 0 ){
			if( (ch & check) == check ){
				System.out.print( 1 );
				if( temp == false )
					temp = true;
			}
			else{
				if( temp == false ){
					if( flag == 0 )
						System.out.print( 0 );
				}
				else
					System.out.print( 0 );
			}
			check >>= 1;
			if( flag == 0 )
				if( i % 4 == 0 )
					System.out.print( " " );
			i++;
		}
		System.out.println();
	}
}