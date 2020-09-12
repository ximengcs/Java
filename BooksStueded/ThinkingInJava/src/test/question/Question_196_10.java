interface FaceOne{
	void print();
}
public class Question_196_10{
	static FaceOne use( boolean n ){
		if(n){
			class Test implements FaceOne{
				public void print(){
					System.out.println( "Test.print()" );
				}
			}
			return new Test();
		}else
			return null;
	}
	public static void main( String[] args ){
		FaceOne f = use(true);
		f.print();
	}
}