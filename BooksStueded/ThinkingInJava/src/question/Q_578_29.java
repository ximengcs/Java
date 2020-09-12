package question;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Q_578_29 {

	public static void main( String[] args ) throws ClassNotFoundException, IOException, Exception {
		Blip3.main(args);
	}
}

class Blip3 implements Externalizable {

	private int i;
	private String s;
	public Blip3() {
		System.out.println( "Blip3 Constructor" );
	}
	public Blip3( String x, int a ) {
		System.out.println( "Blip3(String x, int a)" );
		s = x;
		i = a;
	}
	public String toString() {
		return s + i;
	}
	public void writeExternal( ObjectOutput out ) throws IOException {
		System.out.println( "Blip3.writeExternal" );
		/**
		 * 如果注释掉，在写入时对调用externalizable接口的writeexternal方法，而注释掉并没有写入s和i对象
		 * 而在读取时调用externalizable接口的readexternal方法，却试图读取没有写入的成员，就会抛出异常
		 * 
		 */
		// you must do this
		/*out.writeObject(s);
		out.writeInt(i);*/
	}
	public void readExternal( ObjectInput in ) throws ClassNotFoundException, IOException {
		System.out.println( "Blip3.readExternal" );
		// you must do this
		s = (String)in.readObject();
		i = in.readInt();
	}
	
	public static void main( String[] args ) throws Exception, IOException, ClassNotFoundException {
		System.out.println( "Constructoing objects" );
		Blip3 b3 = new Blip3( "A string ", 47 );
		System.out.println( b3 );
		
		ObjectOutputStream o = new ObjectOutputStream(
				new FileOutputStream( "Blip3.out" ) );
		System.out.println( "Saving object" );
		o.writeObject( b3 );
		o.close();
		
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream( "Blip3.out" ) );
		System.out.println( "Recovering b3 : " );
		b3 = (Blip3)in.readObject();
		System.out.println( b3 );
	}
}