package question;

import java.util.*;

interface TimeStamped {
	long getStamp();
}

class TimeStampedImp implements TimeStamped {
	private final long timeStamp;
	public TimeStampedImp() {
		timeStamp = new Date().getTime();
	}
	public long getStamp() {
		return timeStamp;
	}
}

interface SerialNumbered {
	long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered {
	private static long counter = 1;
	private final long serialNumber = counter++;
	public long getSerialNumber() {
		return serialNumber;
	}
}

interface Name {
	String getName();
}

class NameImp implements Name {
	private final String name = "simon";
	public String getName(){
		return name;
	}
}

interface Basic {
	public void set( String val );
	public String get();
}

class BasicImp implements Basic {
	private String value;
	public void set( String val ){
		value = val;
	}
	public String get() {
		return value;
	}
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered, Name {
	private TimeStamped timeStamp = new TimeStampedImp();
	private SerialNumbered serialNumber = new SerialNumberedImp();
	private Name name = new NameImp();
	public long getStamp() {
		return timeStamp.getStamp();
	}
	public long getSerialNumber() {
		return serialNumber.getSerialNumber();
	}
	public String getName() {
		return name.getName();
	}
}

public class Q_414_37 {
	public static void main( String[] args ) {
		Mixin mixin1 = new Mixin(), mixin2 = new Mixin(), mixin3 = new Mixin();
		mixin1.set( "test string 1" );
		mixin2.set( "test string 2" );
//add	
		mixin3.set( "test string 3" );
		System.out.println( 
				mixin1.get() + " " + mixin1.getStamp() 
				+ " " + mixin1.getSerialNumber() + "," + mixin1.getName() );
		System.out.println( 
				mixin2.get() + " " + mixin2.getStamp() 
				+ " " + mixin2.getSerialNumber() + "," + mixin2.getName() );
		System.out.println( 
				mixin3.get() + " " + mixin3.getStamp() 
				+ " " + mixin3.getSerialNumber() + "," + mixin3.getName() );
	}
}