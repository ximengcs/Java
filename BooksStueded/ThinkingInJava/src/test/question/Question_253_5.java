public class Question_253_5{
	public static void main( String[] args ){
		int i = 0;
		while(true){
			boolean flag = false;
			try{
				flag = test(i);
			}catch( Exception exception ){
				System.out.println( "��������쳣����: " );
				exception.printStackTrace();
			}
			i++;
			if(flag)
				break;
		}
	}
	public static boolean test( int i ) throws Exception{
		if( i < 10000 )
			throw new Exception();
		else{
			System.out.println( "�����ѻָ�����" );
			return true;
		}
	}
}