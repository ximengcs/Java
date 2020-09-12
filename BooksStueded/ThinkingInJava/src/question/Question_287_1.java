class WaterSource {
  private String s;
  WaterSource() {
    System.out.println("WaterSource()");
    s = "Constructed";
  }
  public String toString() { return s; }
}	

public class Question_287_1 {
  private String value1, value2, value3, value4;
  private WaterSource source = new WaterSource();
  private int i;
  private float f;
  public String toString() {
	StringBuilder result = new StringBuilder();
	result.append( "value1 = " );
	result.append( value1 );
	result.append( " " );
	result.append( "value2 = " );
	result.append( value2 );
	result.append( " " );
	result.append( "value3 = " );
	result.append( value3 );
	result.append( " " );
	result.append( "value4 = " );
	result.append( value4 );
	result.append( "\n" );
	result.append( "i = " );
	result.append( i );
	result.append( " " );
	result.append( "f = " );
	result.append( f );
	result.append( " " );
	result.append( "source = " );
	result.append( source );
	return result.toString();
  }	
  public static void main(String[] args) {
    Question_287_1 sprinklers = new Question_287_1();
    System.out.println(sprinklers);
  }
} /* Output:
WaterSource()
valve1 = null valve2 = null valve3 = null valve4 = null
i = 0 f = 0.0 source = Constructed
*///:~
