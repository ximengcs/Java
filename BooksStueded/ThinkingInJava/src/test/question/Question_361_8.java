import java.util.*;

class StoryCharacters{
	private static int id = 1;
	private static int count = id++;
	public String toString(){
		return "characters" + count;
	}
}

class GoodGuy extends StoryCharacters{}

class A extends GoodGuy{
	public String toString(){
		return "A " + super.toString();
	}
}

class B extends GoodGuy{
	public String toString(){
		return "B " + super.toString();
	}
}

class BadGuy extends StoryCharacters{}

class C extends BadGuy{
	public String toString(){
		return "C " + super.toString();
	}
}

class D extends BadGuy{
	public String toString(){
		return "D " + super.toString();
	}
}

class StoryCharactersGenerator implements Iterable<StoryCharacters>{
	private Class<?>[] storyClass = new Class[]{
		A.class, B.class, C.class, D.class,
	};
	private int count = 0;
	private Random rand = new Random();
	
	public StoryCharactersGenerator(){}
	public StoryCharactersGenerator( int count ){
		this.count = count;
	}
	
	public StoryCharacters next(){
		try{
			return (StoryCharacters)storyClass[ rand.nextInt(storyClass.length) ].newInstance();
		}catch( Exception exception ){
			throw new RuntimeException(exception);
		}
	}
	
	class StoryIterator implements Iterator<StoryCharacters>{
		public boolean hasNext(){
			return count > 0;
		}
		public StoryCharacters next(){
			count--;
			return StoryCharactersGenerator.this.next();
		}
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}
	
	public Iterator<StoryCharacters> iterator(){
		return new StoryIterator();
	}
}

public class Question_361_8{
	public static void main( String[] args ){
		
		System.out.println( "Iterator:" );
		for( StoryCharacters storyCharacter : new StoryCharactersGenerator(10) )
			System.out.println( storyCharacter + " " );
		
		System.out.println( "for:" );
		StoryCharactersGenerator generator = new StoryCharactersGenerator();
		for( int i = 0; i < 10; i++ )
			System.out.println( generator.next() + " " );
	}
}