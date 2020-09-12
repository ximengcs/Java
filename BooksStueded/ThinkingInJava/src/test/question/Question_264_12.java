interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Question_264_12 {
  private Object[] items;
  private int next = 0;
  public Question_264_12(int size) { items = new Object[size]; }
  public void add(Object x) throws ArrayIndexOutOfBoundsException{
    if(next < items.length)
      items[next++] = x;
	else
	  throw new ArrayIndexOutOfBoundsException();
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
  }
  public Selector selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
    Question_264_12 sequence = new Question_264_12(10);
    for(int i = 0; i < 11; i++)
      try{
		  sequence.add(Integer.toString(i));
	  }catch( ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException ){
		  arrayIndexOutOfBoundsException.printStackTrace();
	  }
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
