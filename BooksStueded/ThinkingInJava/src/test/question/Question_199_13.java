interface FaceOne{
	void print();
}
class Test implements FaceOne{
	public void print(){
		System.out.println( "Test.print()" );
	}
}
public class Question_199_13{
	static FaceOne use( FaceOne f ){
		return new Test(){
			public void print(){ 
				System.out.println( "abc" ); 
			}
		};
	}
	public static void main( String[] args ){
		FaceOne f = use( new Test() );
		f.print();
	}
}