package test;

public class Test9 {

	public static void main(String[] args) {
		new Thread(new Runnable1()).start();
		new Thread(new Runnable2()).start();
		new Thread(new Runnable3()).start();
		new Thread(new Runnable4()).start();		
	}
}

class Runnable1 implements Runnable {
	@Override
	public void run() {
		System.out.println("1");
	}
}
class Runnable2 implements Runnable {
	@Override
	public void run() {
		System.out.println("2");
	}
}class Runnable3 implements Runnable {
	@Override
	public void run() {
		System.out.println("3");
	}
}class Runnable4 implements Runnable {
	@Override
	public void run() {
		System.out.println("4");
	}
}