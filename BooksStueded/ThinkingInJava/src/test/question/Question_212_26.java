class Test{
	class Inner{
		Inner( int i ){
		}
	}
}

public class Question_212_26{
	class Main extends Test.Inner{
		Main( Test test ){
			test.super(982599829); 
		}
	}
}