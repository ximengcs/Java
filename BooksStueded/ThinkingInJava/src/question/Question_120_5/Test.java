class Quiz{
	int num1; 			//default
	private int num2; 	//private
	public int num3; 	//public
	protected int num4; //protected
	void getDefault(){
		System.out.println( "default" );
	}
	private void getPrivate(){
		System.out.println( "private" );
	}
	public void getPublic(){
		System.out.println( "public" );
	}
	protected void getProtected(){
		System.out.println( "protected" );
	}
}
public class Test{
	public static void main( String[] args ){
		Quiz q = new Quiz();
		System.out.println( q.num1 );
		System.out.println( q.num2 );
		System.out.println( q.num3 );
		System.out.println( q.num4 );
		q.getDefault();
		q.getPrivate();
		q.getPublic();
		q.getProtected();
	}
}
	