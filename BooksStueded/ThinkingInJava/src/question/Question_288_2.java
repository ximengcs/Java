import java.util.*;

public class Question_288_2{
	public String toString(){
		return "Question_288_2 address:" + /* this */ super.toString() + "\n";
	}
	public static void main( String[] args ){
		List<Question_288_2> v = new ArrayList<Question_288_2>();
		for( int i = 0; i < 10; i++ )
			v.add( new Question_288_2() );
		System.out.println( v );
	}
}