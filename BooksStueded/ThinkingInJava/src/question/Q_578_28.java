package question;

/**
 * 因为public类默认构造器为public的
 * 而如果不是public的，在恢复对象序列是会抛出异常
 * 
 */
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Blip1 implements Externalizable {
	public Blip1() {
		System.out.println( "Blip1 Constructor" );
	}
	public void writeExternal( ObjectOutput out ) throws IOException {
		System.out.println( "Blip1.writeExternal()" );
	}
	public void readExternal( ObjectInput in ) throws IOException {
		System.out.println( "Blip1.readExternal()" );
	}
}

public class Q_578_28 implements Externalizable {
	/*Q_578_28() {
		System.out.println( "Blip2 Constructor" );
	}*/
	public void writeExternal( ObjectOutput out ) throws IOException {
		System.out.println( "Blip2.writeExternal" );
	}
	public void readExternal( ObjectInput in ) throws IOException {
		System.out.println( "Blip2.readExternal" );
	}
	
	public static void main( String[] args ) throws ClassNotFoundException, IOException {
		Blips.main(args);
	}
}

class Blips {

	public static void main( String[] args ) throws IOException, ClassNotFoundException {
		System.out.println( "Constructing objects:" );
		Blip1 b1 = new Blip1();
		Q_578_28 b2 = new Q_578_28();
		ObjectOutputStream o = new ObjectOutputStream(
				new FileOutputStream( "Blips.out" ) );
		System.out.println( "Saving objects" );
		o.writeObject( b1 );
		o.writeObject( b2 );
		o.close();
		
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream( "Blips.out" ) );
		System.out.println( "Recovering b1 : " );
		b1 = (Blip1)in.readObject();
		System.out.println( "Recovering b2 : " );
		b2 = (Q_578_28)in.readObject();
	}
}

