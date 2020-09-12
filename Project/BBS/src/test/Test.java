package test;

public class Test {

	public static void main( String[] args ){
		try {
			Class.forName( "com.mysql.jdbc.Driver" );
		} catch (ClassNotFoundException e) {
			System.out.println( "链接失败" );
		}
		System.out.println( "链接成功" );
	}
}