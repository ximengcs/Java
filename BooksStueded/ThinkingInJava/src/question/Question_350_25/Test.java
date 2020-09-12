import Question_350_25.Inner.*;
import java.lang.reflect.*;

public class Test{
	public static void main( String[] args ) throws Exception{
		Class<?> c = In.class;
		Method method = c.getDeclaredMethod( "privateMethod" );
		method.setAccessible(true);
		method.invoke( c.newInstance() );
		
		method = c.getDeclaredMethod( "protectedMethod" );
		method.setAccessible(true);
		method.invoke( c.newInstance() );
		
		method = c.getDeclaredMethod( "packageMethod" );
		method.setAccessible(true);
		method.invoke( c.newInstance() );
	}
}