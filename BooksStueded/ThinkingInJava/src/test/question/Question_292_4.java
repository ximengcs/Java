import java.util.*;

public class Question_292_4{
	private double total = 0;
	private Formatter f = new Formatter( System.out );
	private final int ITEM = 15;
	private final int QTY = 5;
	private final int PRICE = 10;
	public void printTitle(){
		f.format( "%-" + ITEM + "s %" + QTY + "s %" + PRICE + "s\n", "Item", "Qty", "Price" );
		f.format( "%-" + ITEM + "s %" + QTY + "s %" + PRICE + "s\n", "----", "---", "-----" );
	}
	public void print( String name, int qty, double price ){
		f.format( "%-" + ITEM + "." + ITEM + "s %" + QTY + "d %" + PRICE + ".2f\n", name, qty, price );
		total += price;
	}
	public void printTotal(){
		f.format( "%-" + ITEM + "s %" + QTY + "s %" + PRICE + ".2f\n", "Tax", "", total*0.06 );
		f.format( "%-" + ITEM + "s %" + QTY + "s %" + PRICE + "s\n", "", "", "-----" );
		f.format( "%-" + ITEM + "s %" + QTY + "s %" + PRICE + ".2f\n", "Total", "", total*1.06 );
	}
	public static void main( String[] args ){
		Question_292_4 test = new Question_292_4();
		test.printTitle();
		test.print( "Jack's magic beanas", 4, 4.25 );
		test.print( "princess peas", 3, 5.1 );
		test.print( "three bears porridge", 1, 14.29 );
		test.printTotal();
	}
}