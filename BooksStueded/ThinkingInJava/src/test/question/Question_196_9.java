interface FaceOne{
	void print();
}
public class Question_196_9{
	static FaceOne use(){
	class Test implements FaceOne{
		public void print(){
			System.out.println( "Test.print()" );
		}
	}
		return new Test();
	}
	public static void main( String[] args ){
		FaceOne f = use();
		f.print();
	}
}