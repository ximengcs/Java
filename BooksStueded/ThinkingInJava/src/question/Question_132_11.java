class Cleanser{
	private String s = "Cleanser";
	public void append( String a ){ s += a; }
	public void dilute(){ append(  "dilute()" ); }
	public void apply(){ append(  "apply()" ); }
	public void scrub(){ append(  "scrub()" ); }
	public String toString(){ return s; }
	public static void main( String[] args ){
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println( x );
	}
}
class Detergent{
	private Cleanser cleanser = new Cleanser();
	
	public void append( String s){
		cleanser.append(s);
	}
	public void dilute(){
		cleanser.dilute();
	}
	public void apply(){
		cleanser.apply();
	}
	public void scrub(){
		cleanser.scrub();
	}
	public static void main( String[] args ){
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		//x.foam();
		System.out.println( x );
		Cleanser.main(args);
	}
}
	