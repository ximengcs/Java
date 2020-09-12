import net.mindview.util.*;
import java.util.*;

public class Question_236_23{
	public static void main( String[] args ){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<String> list = new ArrayList<String>( 
			new TextFile( "F:\\thinking_in_java\\Statistics.java", "\\W+" ) );
		list.addAll( new ArrayList<String>( new TextFile( "F:\\thinking_in_java\\PetMap.java", "\\W+" ) ) );
		list.addAll( new ArrayList<String>( new TextFile( "F:\\thinking_in_java\\ListFeatures.java", "\\W+" ) ) );
		//Collections.addAll( list, 
		//	(String[])new ArrayList<String>( new TextFile( "F:\\thinking_in_java\\PetMap.java", "\\W+" ) ).toArray() );
		//Collections.addAll( list, 
		//	(String[])new ArrayList<String>( new TextFile( "F:\\thinking_in_java\\MapOfList.java", "\\W+") ).toArray() );
		Iterator<String> it = list.iterator();
		while( it.hasNext() ){
			String str = it.next();
			if( isNum(str) ){
				Integer num = Integer.parseInt(str);
				Integer tmp = map.get(num);
				map.put( num, tmp == null ? 1 : map.get(num)+1 );
			}
			//System.out.print( isNum(str) + "," );
		}
		System.out.println( map );
	}
	public static boolean isNum( String str ){
		//System.out.print( str );
		List<String> list = new ArrayList<String>( Arrays.asList(str.split("")) );
		//System.out.println( list );
		Iterator<String> it = list.iterator();
		if( it.hasNext() )
			it.next();
		while( it.hasNext() ){
			String num = it.next();
			//System.out.print( num + "," );
			if( num.equals( "0" ) || num.equals( "1" ) || num.equals( "2" ) || num.equals( "4" ) || num.equals( "5" ) ||
				num.equals( "6" ) || num.equals( "7" ) || num.equals( "8" ) || num.equals( "9" ) )
				continue;
			else
				return false;
		}
		return true;
	}
}