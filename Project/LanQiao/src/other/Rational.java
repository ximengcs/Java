package other;

public class Rational {

	private long ra;
	private long rb;
	
	private long gcd( long a, long b ) {
		if( b == 0 )
			return a;
		return gcd(b, a%b);
	}
	
	public Rational( long a, long b ) {
		ra = a;
		rb = b;
		long k = gcd(ra, rb);
		if( k > 1 ) {
			ra /= k;
			rb /= k;
		}
	}
	
	public Rational add( Rational x ) {

		long minP = minPublic( x.rb < rb ? x.rb : rb, x.rb >= rb ? x.rb : rb );
		
		long newRa = minP/rb * ra + minP/x.rb * x.ra;
		
		Rational newRational = new Rational(newRa, minP);
		
		return newRational;
	}
	
	private long minPublic( long a, long b ) {
		long tmp = b;
		while( tmp < (a*b) ) {
			if( tmp%a == 0 )
				return tmp;
			tmp += b;
		}
		
		return a*b;
	}
	
	public String toString() {
		if( rb == 1 )
			return "" + ra;
		return ra + "/" + rb;
	}
	
	public static void main(String[] args) {
		Rational a = new Rational( 1, 3 );
		Rational b = new Rational( 4, 9 );
		
		Rational c = a.add(b);
		
		System.out.println(a + " + " + b + " = " + c);
		
	}
}
