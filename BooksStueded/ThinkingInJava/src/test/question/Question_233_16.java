import net.mindview.util.*;
import java.util.*;

public class Question_233_16{
	public static void main( String[] args ){
		Set<String> words = new HashSet<String>( new TextFile( "UniqueWords.java", "\\W+" ) );
		Iterator<String> it = words.iterator();
		
		int count = 0;
		int sum = 0;
		
		while( it.hasNext() ){
			char[] s = it.next().toCharArray();
			for( int i = 0; i < s.length; i++ ){
				if( s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' ){
					count++;
					sum++;
				}
			}
			System.out.println( Arrays.toString(s) + " 元音字母有: " + sum + "个" );
			sum = 0;
		}
		System.out.println( "总元音数为: " + count );
	}
}