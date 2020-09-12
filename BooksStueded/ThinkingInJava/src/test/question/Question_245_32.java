import typeinfo.pets.*;
import java.util.*;

class PetSequence {
  protected Pet[] pets = Pets.createArray(8);
}

class NonCollectionSequence extends PetSequence implements Iterable<Pet>{
	
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }
  
  public Iterable<Pet> reversed(){
	  return new Iterable<Pet>(){
		  public Iterator<Pet> iterator(){
			  return new Iterator<Pet>(){
				  private int index = pets.length-1;
				  public boolean hasNext(){
					  return index > -1;
				  }
				  public Pet next(){
					  return pets[index--];
				  }
				  public void remove(){
					  throw new UnsupportedOperationException();
				  }
			  };
		  }
	  };
  }
  
  public Iterable<Pet> randomized(){
	  return new Iterable<Pet>(){
		  public Iterator<Pet> iterator(){
			  List<Pet> list = new ArrayList<Pet>(Arrays.asList(pets));
			  Collections.shuffle( list, new Random() );
			  return list.iterator();
		  }
		};
  }
  
  public static void main(String[] args) {
    NonCollectionSequence nc = new NonCollectionSequence();
    InterfaceVsIterator.display(nc.iterator());
  }
} 

public class Question_245_32{
	public static void main( String[] args ){
		NonCollectionSequence nc = new NonCollectionSequence();
		for( Pet p : nc )
			System.out.print( p.id() + " " );
		System.out.println();
		for( Pet p : nc.reversed() )
			System.out.print( p.id() + " " );
		System.out.println();
		for( Pet p : nc.randomized() )
			System.out.print( p.id() + " " );
		System.out.println();
	}
}
/* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
