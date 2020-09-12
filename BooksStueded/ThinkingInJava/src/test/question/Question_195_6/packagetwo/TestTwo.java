package packagetwo;
import packageone.TestOne;
public class TestTwo{
	protected class TestIn implements TestOne{
		public void print(){
			System.out.println( "TestTwo.TestIn.print()" );
		}
	}
	protected TestOne get(){
		return new TestIn();
	}
}