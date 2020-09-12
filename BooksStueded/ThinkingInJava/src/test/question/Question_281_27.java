public class Question_281_27{
	public static void main( String[] args ){
		String[] strs = new String[10];
		try{
			System.out.println( strs[-1] );
		}catch( ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException ){
			throw new RuntimeException( arrayIndexOutOfBoundsException );
		}
	}
}