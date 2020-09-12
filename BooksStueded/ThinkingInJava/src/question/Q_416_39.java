package question;

import java.util.*;
import java.lang.reflect.*;
import lib.net.mindview.util.*;

import static lib.net.mindview.util.Tuple.*;

class MixinProxy implements InvocationHandler {
	//参数1为方法名 参数2为实例
	Map<String, Object> delegatesByMethod;
	//将元祖中的方法名保存
	public MixinProxy( TwoTuple<Object, Class<?>>... pairs ) {
		delegatesByMethod = new HashMap<String, Object>();
		for( TwoTuple<Object, Class<?>> pair : pairs ) {
			for( Method method : pair.second.getMethods() ) {
				String methodName = method.getName();
				if( !delegatesByMethod.containsKey( methodName ) )
					delegatesByMethod.put( methodName, pair.first );
			}
		}
	}
	//动态代理
	public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable {
		String methodName = method.getName();
		Object delegate = delegatesByMethod.get( methodName );
		return method.invoke( delegate, args );
	}
	@SuppressWarnings( "unchecked" )
	public static Object newInstance( TwoTuple... pairs ) {
		Class[] interfaces = new Class[pairs.length];
		for( int i = 0; i < pairs.length; i++ ) {
			interfaces[i] = (Class)pairs[i].second;
		}
		ClassLoader c1 = pairs[0].first.getClass().getClassLoader();
		return Proxy.newProxyInstance( c1, interfaces, new MixinProxy( pairs ) );
	}
}

interface ColorBase {
	public void print();
}

class Colored implements ColorBase {
	public void print() {
		System.out.println( "color" );
	}
}

public class Q_416_39 {
	public static void main( String[] args ) {
		Object obj = MixinProxy.newInstance( 
				tuple( new Colored(), ColorBase.class ),
				tuple( new TimeStampedImp(), TimeStamped.class ),
				tuple( new SerialNumberedImp(), SerialNumbered.class )
				);
		ColorBase t1 = (ColorBase)obj;
		TimeStamped t2 = (TimeStamped)obj;
		SerialNumbered t3 = (SerialNumbered)obj;
		t1.print();
		System.out.println( t2.getStamp() );
		System.out.println( t3.getSerialNumber() );
	}
}
