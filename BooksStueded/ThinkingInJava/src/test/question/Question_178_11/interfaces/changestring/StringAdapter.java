package interfaces.changestring;
import interfaces.classprocessor.*;;
public class StringAdapter implements Processor{
	ChangeString changestring;
	public StringAdapter( ChangeString c ){
		changestring = c;
	}
	public String name(){
		return "StringAdapter";
	}
	public String process( Object o ){
		return changestring.process( (String)o );
	}
}