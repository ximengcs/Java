class Art{
	Art(){ System.out.println( "Art" );}
}
class Drawing extends Art{
	Drawing(){ System.out.println( "Drawing" ); }
}
class Cartoon extends Drawing{
}
public class Question_129_3{
	public static void main( String[] args ){
		Cartoon c = new Cartoon();
	}
}