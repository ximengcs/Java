package question;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

class Snake implements Serializable {
	
	private Random rand = new Random();
	private int code = rand.nextInt(98259);
	public Snake next;
	
	Snake( int length ) {
		if( --length > 0 )
			next = new Snake(length);
	}
	Snake() {}
	
	public String toString() {
		return "Snake : " + code;
	}
}

public class Q_574_27 {

	static String fileName = "F:\\EclipseJava\\ThinkingInJava\\src\\testfiles\\data.txt";
	public static void main( String[] args ) throws IOException, ClassNotFoundException {
		
		// 写入对象
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream( new File( fileName ) ) );
		
		out.writeObject( new Snake(5) );
		out.close();
		
		// 读取对象
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream( new File( fileName ) ) );
		
		Snake snake = (Snake)in.readObject();
		while( snake != null ) {
			System.out.println( snake );
			snake = snake.next;
		}
		in.close();
	}
}
