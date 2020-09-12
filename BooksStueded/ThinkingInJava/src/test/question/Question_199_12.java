class Use{
	public void getCode(){}
	public void getPrint(){}
}
class Test{
	public Use get( final int codes ){
		return new Use(){
			private int code = 0;
			private void print(){
				System.out.println( "class:use code = " + code );
			}
			{
				code = codes;
				System.out.println( "“—≥ı ºªØ" );
			}
			public void getCode(){
				System.out.println( code );
			}
			public void getPrint(){
				print();
			}
		};
	}
}
public class Question_199_12{
	public static void main( String[] args ){
		Test test = new Test();
		Use use = test.get(1);
		use.getCode();
		use.getPrint();
	}
}