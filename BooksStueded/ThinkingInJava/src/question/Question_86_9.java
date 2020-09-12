class Test{
	float num1;
	int num2;
	
	Test(float num1, int num2){
		this(num2);
		this.num1 = num1;
	}
	Test( int num2 ){
		this.num2 = num2;
	}

}
public class Question_86_9{
	public static void main( String[] args ){
		Test t1 = new Test(1);
	}
}
		