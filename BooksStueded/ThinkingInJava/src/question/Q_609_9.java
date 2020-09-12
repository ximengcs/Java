package question;

import java.util.EnumMap;
import java.util.Iterator;

import lib.net.mindview.util.Enums;

public class Q_609_9 {

	public static void main( String[] args ) {
		PostOffice_.main( args );
	}
}

class Mail_ {
	
	enum GeneralDelivery { YES, NO1, NO2, NO3, NO4, NO5 }
	enum Scannability { UNSCANNABLE, YES1, YES2, YES3, YES4 }
	enum Readability { ILLEGIBLE, YES1, YES2, YES3, YES4 }
	enum Address { INCORRECT, OK1, OK2, OK3, OK4, OK5 , OK6 }
	enum ReturnAddress { MISSING, OK1, OK2, OK3, OK4, OK5 }
	
	GeneralDelivery generalDelivery;
	Scannability scannability;
	Readability readability;
	Address address;
	ReturnAddress returnAddress;
	
	static long counter = 0;
	long id = counter++;
	
	public String toString() {
		return "Mail " + id;
	}
	public String details() {
		return toString() + 
				", General delivery : " + generalDelivery +
				", Scannability : " + scannability + 
				", Readability : " + readability +
				", Address : " + address + 
				", ReturnAddress : " + returnAddress;
	}
	
	public static Mail_ randomMail() {
		Mail_ m = new Mail_();
		m.generalDelivery = Enums.random( GeneralDelivery.class );
		m.scannability = Enums.random( Scannability.class );
		m.readability = Enums.random( Readability.class );
		m.address = Enums.random( Address.class );
		m.returnAddress = Enums.random( ReturnAddress.class );
		return m;
	}
	
	public static Iterable<Mail_> generator( final int count ) {
		return new Iterable<Mail_>() {
			int n = count;
			public Iterator<Mail_> iterator() {
				return new Iterator<Mail_>() {
					public boolean hasNext() { return n-- > 0; }
					public Mail_ next() { return randomMail(); }
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}

interface Command {
	public boolean handle( Mail_ m );
}

class PostOffice_ {

	private static EnumMap<MailHandler, Command> map = 
			new EnumMap<MailHandler, Command>( MailHandler.class);
	
	static {
		map.put( MailHandler.GENERAL_DELIVERY, new Command() {
			public boolean handle( Mail_ m ) {
				switch( m.generalDelivery ) {
					case YES :
						System.out.println( "Using general delivery for " + m );
						return true;
					default : return false;
				}
			}
		});
		map.put( MailHandler.MACHINE_SCAN, new Command() {
			public boolean handle( Mail_ m ) {
				switch( m.scannability ) {
					case UNSCANNABLE :return false;
					default : 
						switch( m.address ) {
							case INCORRECT : return false;
							default : 
								System.out.println( "Deliverying " + m + " automatically" );
								return true;
						}
				}
			}
		});
		map.put( MailHandler.VISUAL_INSPECTION, new Command() {
			public boolean handle( Mail_ m ) {
				switch( m.readability ) {
					case ILLEGIBLE : return false;
					default : 
						switch( m.address ) {
							case INCORRECT : return false;
							default :
								System.out.println( "Deliving " + m + " normally" );
								return true;
						}
				}
			}
		});
		map.put( MailHandler.RETURN_TO_SENDER, new Command() {
			public boolean handle( Mail_ m ) {
				switch( m.returnAddress ) {
					case MISSING : return false;
					default :
						System.out.println( "Returning " + m + "to sender" );
						return true;
						
				}
			}
		});
	}
	
	enum MailHandler {
		GENERAL_DELIVERY, MACHINE_SCAN, VISUAL_INSPECTION, RETURN_TO_SENDER
	}
	
	static void handle( Mail_ m ) {
		for( MailHandler handler : MailHandler.values() )
			if( map.get(handler).handle(m) )
				return;
		System.out.println( m + " is a dead letter" );
	}
	
	public static void main( String[] args ) {
		for( Mail_ mail : Mail_.generator( 10 ) ) {
			System.out.println( mail.details() );
			handle( mail );
			System.out.println( "***********" );
		}
	}
}
