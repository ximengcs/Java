import java.lang.reflect.*;
import java.util.*;

interface Interface{
    void doSomething();
    void somethingElse( String arg );
}

class RealObject implements Interface{
    public void doSomething(){
        System.out.println( "doSomething" );
    }
    
    public void somethingElse( String arg ){
        System.out.println( "SomethingElse:" + arg );
    }
}

class DynamicProxyHandler implements InvocationHandler{
    private Object proxied;
	private Map<String, Integer> ID = new HashMap<String, Integer>();
    
    public DynamicProxyHandler( Object proxied ){
        this.proxied = proxied;
    }
    
    public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable{
        System.out.println( "test" );
        if( args != null )
            for( Object arg : args )
                System.out.println( " " + args );
		String str = method.getName();
		if( ID.get(str) == null )
			ID.put( str, 1 );
		else
			ID.put( str, ID.get(str)+1 );
		System.out.println( str + " Method of time : " + ID.get(str) );
        return method.invoke( proxied, args);
    }
}

class Question_340_22{
    public static void coustmer( Interface iface ){
        iface.doSomething();
        iface.somethingElse( "bonobo" );
    }
    
    public static void main( String[] args ){
        RealObject realObject = new RealObject();
        Interface inter = (Interface)Proxy.newProxyInstance( Interface.class.getClassLoader(),
            new Class[]{ Interface.class }, new DynamicProxyHandler( realObject ) );
        
        coustmer( inter );
		coustmer( inter );
        coustmer( inter );
        coustmer( inter );
    }
}