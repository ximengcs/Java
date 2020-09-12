class AlertStatus{
	public void talk(){
		System.out.println( "i am dad" );
	}
}
class Son1 extends AlertStatus{
	public void talk(){
		System.out.println( "i am son1" );
	}
}
class Son2 extends AlertStatus{
	public void talk(){
		System.out.println( "i am son2" );
	}
}
class Son3 extends AlertStatus{
	public void talk(){
		System.out.println( "i am son3" );
	}
}
class Starship{
	private AlertStatus alertStatus = new Son1();
	private int flag = 1;
	public void change(){
		if( flag == 1 ){
			System.out.println( "����son1����Ҫ�ı�" );
			flag = 2;
			alertStatus = new Son2();
		}else if( flag == 2 ){
			System.out.println( "����son2����Ҫ�ı�" );
			flag = 3;
			alertStatus = new Son3();
		}else{
			System.out.println( "����son3����Ҫ�ı�" );
			flag = 1;
			alertStatus = new Son1();
		}
	}
	public void performPlay(){
		alertStatus.talk();
	}
}
public class Question_165_16{
	public static void main( String[] args ){
		Starship starship = new Starship();
		starship.performPlay();
		starship.change();
		starship.performPlay();
		starship.change();
		starship.performPlay();
	}
}