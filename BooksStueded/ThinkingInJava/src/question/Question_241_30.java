import typeinfo.pets.*;
import java.util.*;

class InterfaceVsIterator{
	public static void display( Iterator<Pet> it ){
		while( it.hasNext() ){
			Pet p = it.next();
			System.out.print( p.id() + ":" + p + " " );
		}
		System.out.println();
	}
	public static void display( Collection<Pet> pets ){
		for( Pet p : pets )
			System.out.print( p.id() + ":" + p + " " );
		System.out.println();
	}
}

public class Question_241_30 implements Collection, Iterable{
	private Pet[] pets = Pets.createArray(8);
	public boolean add( Object o ){
		throw new UnsupportedOperationException();
	}
	public boolean addAll( Collection c ){
		throw new UnsupportedOperationException();
	}
	public void clear(){
		throw new UnsupportedOperationException();
	}
	public boolean contains( Object p ){
		Iterator<Pet> it = this.iterator();
		while( it.hasNext() ){
			Pet tmp = it.next();
			if( tmp.equals(p) )
				return true;
		}
		return false;
	}
	public boolean containsAll( Collection c ){
		Iterator<Pet> it = ((Collection<Pet>)c).iterator();
		Iterator<Pet> it2 = this.iterator();
		while( it.hasNext() ){
			Pet tmp = it.next();
			while( it2.hasNext() ){
				if( it2.next().equals(tmp) )
					if( !it.hasNext() )
						return true;
			}
		}
		return false;
	}
	public boolean equals( Pet[] p ){
		return p == pets;
	}
	public boolean isEmpty(){
		return size() > 0;
	}
	public boolean remove( Object o ){
		throw new UnsupportedOperationException();
	}
	public boolean removeAll( Collection c ){
		throw new UnsupportedOperationException();
	}
	public int size(){
		return pets.length;
	}
	public Object[] toArray(){
		return pets;
	}
	public Pet[] toArray( Object[] o ){
		return pets;
	}
	public boolean retainAll( Collection c ){
		throw new UnsupportedOperationException();
	}
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>(){
			private int index = 0;
			public boolean hasNext(){
				return index < pets.length;
			}
			public Pet next(){
				return pets[index++];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main( String[] args ){
		Question_241_30 c = new Question_241_30();
		//InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
}