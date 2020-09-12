import java.util.*;
import net.mindview.util.*;

class Word{
	private String name = null;
	private int count = 1;
	public Word( String s ){
		name = s;
	}
	public String getName(){
		return name;
	}
	public int getCount(){
		return count;
	}
	public void addCount(){
		count++;
	}
	public String toString(){
		return name + "(" + count + ")";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	public boolean equals( Object obj ){
		if( obj == null )
			return false;
		else{
			if( this.getClass() == obj.getClass() ){
				Word word = (Word)obj;
				if( this.getName().equals(word.getName()) )
					return true;
				else
					return false;
			}else
				return false;
		}
	}
}

public class Question_236_22{
	public static void main( String[] args ){
		Set<Word> set = new HashSet<Word>();
		List<String> words = new ArrayList<String>( new TextFile( "SetOperations.java", "\\W+" ) );
		Iterator<String> it = words.iterator();
		while( it.hasNext() ){
			Word w = new Word( it.next() );
			if( set.add(w) == false ){
				Iterator<Word> it2 = set.iterator();
				while( it2.hasNext() ){
					Word temp = it2.next();
					if( temp.equals(w) ){
						temp.addCount();
						break;
					}
				}
			}
		}
		System.out.println(set);
	}
}