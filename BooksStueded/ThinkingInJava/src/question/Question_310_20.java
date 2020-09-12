import java.util.Scanner;
import java.io.BufferedReader;
import java.io.StringReader;

public class Question_310_20{
	private int ints;
	private long longs;
	private float floats;
	private double doubles;
	private String str;
	public Question_310_20( String str ){
		Scanner scan = new Scanner( new BufferedReader( new StringReader( str ) ) );
		if( scan.hasNextInt() )
			ints = scan.nextInt();
		else
			ints = 0;
		if( scan.hasNextLong() )
			longs = scan.nextLong();
		else
			longs = 0L;
		if( scan.hasNextFloat() )
			floats = scan.nextFloat();
		else
			floats = 0.0F;
		if( scan.hasNextDouble() )
			doubles = scan.nextDouble();
		else
			doubles = 0.0D;
		this.str = scan.nextLine();
	}
	public String toString(){
		StringBuilder str = new StringBuilder( "(" );
		str.append( "int = " );
		str.append( ints );
		str.append( " long = " );
		str.append( longs );
		str.append( " float = " );
		str.append( floats );
		str.append( " double = " );
		str.append( doubles );
		str.append( " 剩余的字符:" );
		str.append( this.str );
		str.append( ")\n" );
		return str.toString();
	}
	public static void main( String[] args ){
		Question_310_20 test = new Question_310_20( "12 12332132132 12.12 1.12332 dsa" );
		System.out.println( test );
	}
}