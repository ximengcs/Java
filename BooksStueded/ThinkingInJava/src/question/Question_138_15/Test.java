class Son extends access.Test{
	Son(){}
	public int getFather(){
		return getCode();
	}
}
public class Test{
	public static void main( String[] args ){
		Son t = new Son();
		System.out.println( t.getFather() );
	}
}