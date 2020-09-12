import java.util.*;

class Create{
	private int i = 0;
	String next(){
		switch(i){
			case 0: 
					i++;
					return "White";
			case 1: 
					i++;
					return "Black";
			case 2: 
					i = 0;
					return "Blue";
			default : 
					return "red";
		}
	}
}

class Question_223_4{
	private static Create c = new Create();
	static String[] fill( String[] string ){
		string[0] = c.next();
		string[1] = c.next();
		string[2] = c.next();
		return string;
	}
	static Collection fill( Collection<String> collection ){
		collection.add( c.next() );
		collection.add( c.next() );
		collection.add( c.next() );
		return collection;
	}
	public static void main( String[] args ){
		String[] str = new String[3];
		fill(str);
		System.out.println( str[0] + "," + str[1] + "," + str[2] );
		System.out.println( fill(new ArrayList<String>()) );
		System.out.println( fill(new LinkedList<String>()) );
		System.out.println( fill(new HashSet<String>()) );
		System.out.println( fill(new LinkedHashSet<String>()) );
		System.out.println( fill(new TreeSet<String>()) );
	}
}