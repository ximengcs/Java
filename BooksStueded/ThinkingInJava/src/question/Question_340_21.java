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

/* class SimpleProxy implements Interface{
    private Interface proxied;
    
    public SimpleProxy( Interface proxied ){
        this.proxied = proxied;
    }
    
    public void doSomething(){
        System.out.println( "SimpleProxyDemo1" );
        proxied.doSomething();
    }
    
    public void somethingElse( String arg ){
        System.err.println( "SimpleProxyDemo2" );
        proxied.somethingElse( arg );
    }
} */

class SimpleProxy implements InvocationHandler{
	private static Map<String, Integer> ID = new HashMap<String, Integer>();
	private Object proxied;
	
	public SimpleProxy( Object proxied ){
		this.proxied = proxied;
	}
	
	public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable{
		String str = method.getName();
		if( ID.get(str) == null ){
			ID.put( str, 1 );
		}else{
			ID.put( str, ID.get(str)+1 );
		}
		System.out.println( str + ":" + ID.get(str) );
		return method.invoke( proxied, args );
	}
}

class Question_340_21{
    public static void customer( Interface inter ){
        inter.doSomething();
        inter.somethingElse( "bono" );
    }
    
    public static void main( String[] args ){
        RealObject o = new RealObject();
		Interface inter = ( Interface )Proxy.newProxyInstance( Interface.class.getClassLoader()
			, new Class[]{ Interface.class }, new SimpleProxy( o ) );
			customer( inter );
			customer( inter );
			customer( inter );
			customer( inter );
    }
}
