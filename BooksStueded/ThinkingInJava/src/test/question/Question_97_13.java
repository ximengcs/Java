class Spoon{
	static int i;
	static {
		i = 47;
	}
	Spoon(){
		System.out.print(i);
	}
}
public class Question_97_13{
	public static void main( String[] args ){
		new Spoon();
	}
}