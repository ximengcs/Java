package question;

import java.util.Iterator;

import lib.net.mindview.util.Enums;


public class Q_609_8 {

	public static void main( String[] args ) {
		PostOffice.main( args );
	}
}

class Mail {
	
	enum GeneralDelivery { YES, NO1, NO2, NO3, NO4, NO5 }
	enum Scannability { UNSCANNABLE, YES1, YES2, YES3, YES4 }
	enum Readability { ILLEGIBLE, YES1, YES2, YES3, YES4 }
	enum Address { INCORRECT, OK1, OK2, OK3, OK4, OK5 , OK6 }
	enum ReturnAddress { MISSING, OK1, OK2, OK3, OK4, OK5 }
	enum Send { SCCESS, FAILURE1, FAILURE2, FAILURE3, FAILURE4 }
	
	GeneralDelivery generalDelivery;
	Scannability scannability;
	Readability readability;
	Address address;
	ReturnAddress returnAddress;
	Send send;
	
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
				", ReturnAddress : " + returnAddress +
				", send : " + send;
	}
	
	public static Mail randomMail() {
		Mail m = new Mail();
		m.generalDelivery = Enums.random( GeneralDelivery.class );
		m.scannability = Enums.random( Scannability.class );
		m.readability = Enums.random( Readability.class );
		m.address = Enums.random( Address.class );
		m.returnAddress = Enums.random( ReturnAddress.class );
		m.send = Enums.random( Send.class );
		return m;
	}
	
	public static Iterable<Mail> generator( final int count ) {
		return new Iterable<Mail>() {
			int n = count;
			public Iterator<Mail> iterator() {
				return new Iterator<Mail>() {
					public boolean hasNext() { return n-- > 0; }
					public Mail next() { return randomMail(); }
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}

class PostOffice {

	enum MailHandler {
		GENERAL_DELIVERY {
			boolean handle( Mail m ) {
				switch( m.generalDelivery ) {
					case YES :
						System.out.println( "Using general delivery for " + m );
						return true;
					default : return false;
				}
			}
		},
		MACHINE_SCAN {
			boolean handle( Mail m ) {
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
		},
		VISUAL_INSPECTION {
			boolean handle( Mail m ) {
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
		},
		RETURN_TO_SENDER {
			boolean handle( Mail m ) {
				switch( m.returnAddress ) {
					case MISSING : return false;
					default :
						System.out.println( "Returning " + m + "to sender" );
						return true;
						
				}
			}
		},
		SEND_CHECK {
			boolean handle( Mail m ) {
				switch( m.send ) {
					case SCCESS : return true;
					default :
						System.out.println( "send " + m + "failure" );
						return false;
				}
			}
		};
		abstract boolean handle( Mail m );
	}
	
	static void handle( Mail m ) {
		for( MailHandler handler : MailHandler.values() )
			if( handler.handle(m) )
				return;
		System.out.println( m + " is a dead letter" );
	}
	
	public static void main( String[] args ) {
		for( Mail mail : Mail.generator( 10 ) ) {
			System.out.println( mail.details() );
			handle( mail );
			System.out.println( "***********" );
		}
	}
}
