import net.mindview.util.*;
import java.util.*;

public class Question_236_20{
	public static void main( String[] args ){
		Set<String> words = new HashSet<String>( new TextFile( "UniqueWords.java", "\\W+" ) );
		Iterator<String> it = words.iterator();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		int count = 0;
		int sum = 0;
		
		while( it.hasNext() ){
			char[] s = it.next().toCharArray();
			for( int i = 0; i < s.length; i++ ){
				if( s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' ){
					Integer num = map.get(s[i]);
					map.put( s[i], num == null ? 1 : num+1 );
					count++;
					sum++;
				}
			}
			System.out.println( Arrays.toString(s) + " 元音字母有: " + sum + "个" );
			sum = 0;
		}
		System.out.println( "总元音数为: " + count );
		
		Iterator<Character> it2 = map.keySet().iterator();
		while( it2.hasNext() ){
			Character ch = it2.next();
			System.out.println( ch + "字母共有 : " + map.get(ch) + "个" );
		}
	}
}