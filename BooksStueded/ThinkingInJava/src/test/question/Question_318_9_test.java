class A{
	private String name = "A";
}
class B extends A{}
class C extends B{}

interface D{}
interface E{}
interface F{}

public class Question_318_9_test extends C implements D, E, F{
	private int i;
	private long l = 123;
	private String str = "318_9";
}