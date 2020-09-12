public class Question_37_6{
	public static void main( String[] args ){
		System.out.println( "the code string need " + storage( "the code string" ) );
	}
	public static int storage( String s ){
		return s.length() * 2;
	}
}