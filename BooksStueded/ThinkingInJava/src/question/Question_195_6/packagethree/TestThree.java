package packagethree;
import packagetwo.TestTwo;
import packageone.TestOne;
public class TestThree extends TestTwo{
	TestOne getClassIn(){
		return get();
	}
}