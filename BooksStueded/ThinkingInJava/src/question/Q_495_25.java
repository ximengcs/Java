package question;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import lib.net.mindview.util.Countries;

class SimpleHashMap<K, V> extends AbstractMap<K, V> {

	private static class Entry<K, V> implements Map.Entry<K, V> {

		private K key;
		private V value;
		Entry<K, V> next;

		Entry( K k, V v ) {
			key = k;
			value = v;
		}
		
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue( V arg0 ) {
			V result = value;
			value = arg0;
			return result;
		}
		
		public int hashCode() {
			return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
		}
		
		public boolean equals( Object obj ) {
			if( !(obj instanceof Entry) )
				return false;
			Entry me = (Entry)obj;
			return 
				(key == null ? me.getKey() == null : key.equals(me.getKey())) && 
				(value == null ? me.getValue() == null : value.equals(me.getValue()));
		}
		public String toString() {
			return key + "=" + value;
		}
	}
	
	static final int SIZE = 997;
	Entry<K, V>[] buckets = new Entry[ SIZE ];
	
	public V put( K key, V value ) {
		V oldValue = null;
		int index = Math.abs( key.hashCode() ) % SIZE;
		
		Entry<K, V> newPair = new Entry<K, V>( key, value );
		
		if( buckets[ index ] == null )
			buckets[ index ] = newPair;
		
		Entry<K, V> prePair = null;
		boolean found = false;
		
		for( Entry<K, V> pair = buckets[index]; pair != null; pair = pair.next ) {
			if( pair.getKey().equals( key ) ) {
				oldValue = pair.getValue();
				if( prePair != null )
					prePair.next = newPair;
				else
					buckets[index] = newPair;
				newPair.next = pair.next;
				found = true;
				break;
			}
		}

		if( !found )
			prePair.next = newPair;
		return oldValue;
	}
	
	public V get( Object key ) {
		int index = Math.abs( key.hashCode() ) % SIZE;
		for( Entry<K, V> pair = buckets[index]; pair != null; pair = pair.next )
			if( pair.getKey().equals( (K)key ) )
				return pair.getValue();
		return null;
	}
	
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		for( int i = 0; i < SIZE; i++ )
			if( buckets[i] != null )
				set.add( buckets[i] );
		return set;
	}
	
	public void clear() {
		// 简单粗暴
		buckets = new Entry[SIZE];
	}
	
/*	public V remove( Object key ) {
		V oldValue = null; // 此key关联的值
		int index = Math.abs( key.hashCode() ) % SIZE; //计算索引
		
		LinkedList<MapEntry<K, V>> list = buckets[index];
		// 迭代
		Iterator<MapEntry<K, V>> it = list.iterator();
		while( it.hasNext() ) {
			MapEntry entry = it.next();
			if( entry.getKey().equals(key) ) {
				oldValue = (V)entry.getValue();
				list.remove( entry );
				break;
			}
		}
		return oldValue;
	}

	@Override
	public boolean containsKey( Object arg0 ) {
		int index = Math.abs( ((K)arg0).hashCode() ) % SIZE;
		LinkedList<MapEntry<K, V>> tmp = buckets[index];
		Iterator<MapEntry<K, V>> it = tmp.iterator();
		while( it.hasNext() ) {
			MapEntry entry = it.next();
			if( entry.getKey().equals( (K)arg0 ) )
				return true;
		}
		return false;
	}


	@Override
	public boolean containsValue( Object arg0 ) {
		for( int i = 0; i < SIZE; i++ ) {
			LinkedList<MapEntry<K, V>> tmp = buckets[i];
			Iterator<MapEntry<K, V>> it = tmp.iterator();
			while( it.hasNext() ) {
				MapEntry<K, V> entry = it.next();
				if( entry.getValue().equals( (V)arg0 ) )
					return true;
			}
		}
		return false;
	}


	@Override
	public boolean isEmpty() {
		for( int i = 0; i < SIZE; i++ ) {
			if( buckets[i] != null )
				return false;
		}
		return true;
	}


	@Override
	public Set<K> keySet() {
		Set<K> set = new HashSet<K>();
		for( int i = 0; i < SIZE; i++ ) {
			LinkedList<MapEntry<K, V>> tmp = buckets[i];
			Iterator<MapEntry<K, V>> it = tmp.iterator();
			while( it.hasNext() )
				set.add( it.next().getKey() );
		}
		return set;
	}

	
	@Override
	public void putAll( Map<? extends K, ? extends V> arg0 ) {
		Set<?> set = arg0.entrySet();
		Iterator<?> it = set.iterator();
		while( it.hasNext() ) {
			K k = (K)it.next();
			put( k, get(k) );
		}
	}
*/

	@Override
	public int size() {
		int sz = 0;
		for( Entry<K, V> list : buckets )
			if( list != null )
				sz++;
		return sz;
	}


	@Override
	public Collection<V> values() {
		throw new UnsupportedOperationException();
	}

}


public class Q_495_25 {

	public static void main( String[] args ) {
		SimpleHashMap<String, String> m = new SimpleHashMap<String, String>();
		m.putAll( Countries.capitals(5) );
		System.out.println( m );
		System.out.println( m.get( "BENIN" ) );
		System.out.println( m.entrySet() );
		
	}
}
