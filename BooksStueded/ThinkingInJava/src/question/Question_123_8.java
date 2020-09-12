class Connection{
	int i;
	Connection(){
	};
	public String toString(){
		return String.valueOf(i);
	}
}
class ConnectionManager{
	private ConnectionManager(){};
	private static Connection[] connection = new Connection[10];
	static{
		for( int i = 0; i < 10; i++ ){
			connection[i] = new Connection();
		}
	}
	private static int count = 0;
	private static boolean check(){
		if( count < 10 )
			return true;
		else
			return false;
	}
	public static Connection getConnection(){
		if( check() ){
			return connection[count++];
		}else{
			return null;
		}
	}
}
public class Question_123_8{
	public static void main( String[] args ){
		for( int i = 0; i < 11; i++ ){
			System.out.println( ConnectionManager.getConnection() );
		}
	}
}