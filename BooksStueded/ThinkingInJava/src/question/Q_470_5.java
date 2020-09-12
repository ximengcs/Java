package question;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Q_470_5_CountingMapData extends AbstractMap<Integer, String> {

	private int size;
	private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split( " " );
	public Q_470_5_CountingMapData( int size ) {
		if( size < 0 ) 
			this.size = size;
		this.size = size;
	}
	
	// 实现abstarctmap必须实现 entryset方法， 该方法映射关系set视图:Set<Map.Entry<K, V>>
	private static class Entry implements Map.Entry<Integer, String> {
		int index;
		Entry( int index ) {
			this.index = index;
		}
		public boolean equals( Object o ) {
			return Integer.valueOf( index ).equals( o );
		}
		public Integer getKey() {
			return index;
		}
		public String getValue() {
			return chars[ index%chars.length ] + Integer.toString( index/chars.length );
		}
		public String setValue( String string ) {
			throw new UnsupportedOperationException();
		}
		public int hashCode() {
			return Integer.valueOf( index ).hashCode();
		}
	}

	// 用abstractset实现entryset视图， 必须实现size和iterator方法（和abstractcollection相同)
	private static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {
		private int size;
		
		EntrySet( int size ) {
			if( size < 0 )
				size = chars.length;
			this.size = size;
		}
		
		// Iterator接口需实现next, hasNext, remove
		// 不支持remove throw UnsupportedOperationException
		private class Iter implements Iterator<Map.Entry<Integer, String>> {
			private Entry entry = new Entry(-1);
			public boolean hasNext() { 
				return entry.index < size;
			}
			public Map.Entry<Integer, String> next() {
				// 上面构造器用-1， 所以这里先自增1
				entry.index++;
				return entry;
			}
		}
		
		public int size() {
			return size;
		}
		public Iterator<Map.Entry<Integer, String>> iterator() {
			return new Iter();
		}
	}

	
	public Set<Map.Entry<Integer, String>> entrySet() {
		return new EntrySet( size );
	}
}

public class Q_470_5 {

	public static void main( String[] args ) {
		System.out.println( new Q_470_5_CountingMapData(60) );
	}
}
