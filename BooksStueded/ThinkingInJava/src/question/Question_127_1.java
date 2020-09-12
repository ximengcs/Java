class Simple{
	Simple(){}
}
class Test{
	private Simple s;
	public Simple get(){
		s = new Simple();
		return s;
	}
}