class Test{
	public void dispose(){
		System.out.println( "sidpose()" );
	}
}

class FailingConstructor{
	Test test1, test2;
	public FailingConstructor( boolean flag ) throws Exception{
		test1 = new Test();
		try{
			if( flag )
				throw new Exception();
		}catch( Exception exception ){
			throw new Exception();
		}
		test2 = new Test();
	}
	public void dispose(){
		test1.dispose();
		test2.dispose();
	}
}

public class Question_275_23{
	public static void main( String[] args ){
		boolean flag = false;
		while(true){
			try{
				FailingConstructor t = new FailingConstructor(flag);
				try{
					System.out.println( "processing" );
				}finally{
					t.dispose();
					System.out.println( "successful" );
				}
			}catch( Exception exception ){
				System.out.println( "failure" );
				break;
			}
			flag = !flag;
		}
	}
}