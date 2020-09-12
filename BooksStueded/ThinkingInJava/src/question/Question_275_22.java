class FailingConstructor{
	public FailingConstructor() throws Exception{
		switch( new java.util.Random().nextInt(2) ){
			case 0 : System.out.println( "construct if successful" );break;
			case 1 : throw new Exception();
		}
	}
}

public class Question_275_22{
	public static void main( String[] args ){
		try{
			FailingConstructor failingConstructor = new FailingConstructor();
			try{
				//code
			}finally{
				System.out.println( "执行完毕" );
			}
		}catch( Exception exception ){
			System.out.println( "construct is failure" );
		}
	}
}