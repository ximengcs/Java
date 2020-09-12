import java.util.*;
import net.mindview.util.*;

class Test{
	private int code = 0;
	public Test(){
		code = new Random().nextInt(1000);
	}
	public int getCode(){
		return code;
	}
	public String toString(){
		return "(" + code + ")";
	}
}

public class Question_236_24{
	public static void main( String[] args ){
		Map<String, Test> map = new LinkedHashMap<String, Test>();
		List<String> list = new ArrayList<String>( new TextFile( "Question_236_23.java", "\\W+" ) );
		
		//填充
		Iterator<String> it = list.iterator();
		while( it.hasNext() )
			map.put( it.next(), new Test() );
		
		//提取
		list = new ArrayList<String>();
		it = map.keySet().iterator();
		while( it.hasNext() )
			list.add( it.next() );
		
		//排序
		Collections.sort( list );
		
		//清除map
		map.clear();
		
		//重新填充map
		it = list.iterator();
		while( it.hasNext() ){
			map.put( it.next(), new Test() );
		}
		
		System.out.println( map );
	}
}