package lib.annotation;

import java.util.List;

public class PassWordUtils {

	@Deprecated
	public static void test() {
		System.out.println( "test" );
	}
	
	@UseCase( id = 47, description = " Password " )
	public boolean validatePassword( String password ) {
		return password.matches( "\\w*\\d\\w*" );
	}
	
	@UseCase( id = 48 )
	public String encryptPassWord( String password ) {
		return new StringBuilder( password).reverse().toString();
	}
	
	@UseCase( id = 49, description = "list" )
	public boolean checkForNewPassWord( List<String> prePassWords, String password ) {
		return prePassWords.contains(password);
	}
	
	public static void main( String[] args ) {
		test();
	}
}
