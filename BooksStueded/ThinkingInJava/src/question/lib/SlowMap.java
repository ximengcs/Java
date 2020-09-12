package question.lib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lib.containers.MapEntry;
import lib.net.mindview.util.Countries;

public class SlowMap<K, V> implements Map<K, V> {

	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	
	public V put( K key, V value ) {
		V oldValue = get(key);
		if( !keys.contains(key) ) {
			keys.add( key );
			values.add( value );
		} else
			values.set( keys.indexOf(key), value );
		return oldValue;
	}
	
	public V get( Object key ) {
		if( !keys.contains(key) )
			return null;
		return values.get( keys.indexOf(key) );
	}
	
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		
		Iterator<K> ki = keys.iterator();
		Iterator<V> vi = values.iterator();
		while( ki.hasNext() )
			set.add( new MapEntry<K, V>( ki.next(), vi.next() ) );
		return set;
	}

	// 移除所有映射
	@Override
	public void clear() {
		keys.clear();
		values.clear();
	}

	// 如果包含指定映射，则返回true
	@SuppressWarnings("unchecked")
	@Override
	public boolean containsKey( Object arg0 ) {
		if( keys.contains((K)arg0) )
			return true;
		return false;
	}

	// 如果包含指定值，则返回true
	@SuppressWarnings( "unchecked" )
	@Override
	public boolean containsValue( Object arg0 ) {
		if( values.contains((V)arg0) )
			return true;
		return false;
	}

	// 是否为空映射
	@Override
	public boolean isEmpty() {
		return keys.isEmpty();
	}

	//返回键的set视图
	@Override
	public Set<K> keySet() {
		return new HashSet<K>( keys );
	}

	// 将map中所有映射添加， 相当于调用size次put
	@Override
	public void putAll( Map<? extends K, ? extends V> arg0 ) {
		Set<?> set = arg0.entrySet();
		Iterator<?> it = set.iterator();
		while( it.hasNext() ) {
			Map.Entry<K, V> entry = (java.util.Map.Entry<K, V>) it.next();
			put( entry.getKey(), entry.getValue() );
		}
	}

	// 如果存在指定元素，则移除并返回
	@Override
	public V remove( Object arg0 ) {
		V oldValue;
		int index = keys.indexOf( (K)arg0 );
		if( index == -1 )
			return null;
		else {
			oldValue = get( index );
			keys.remove(index);
			values.remove(index);
			return oldValue;
		}
	}

	@Override
	public int size() {
		return keys.size();
	}

	@Override
	public Collection<V> values() {
		return values;
	}
	
	public String toString() {
		return entrySet().toString();
	}
	
	public static void main( String[] args ) {
		SlowMap<String, String> m = new SlowMap<String, String>();
		m.putAll( Countries.capitals(15) );
		System.out.println( m );
		System.out.println( m.get( "BULGAIA" ) );
		System.out.println( m.entrySet() );
	}
}
