package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class PuKe {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> desk = new ArrayList<String>();

		Scanner in = new Scanner(System.in);

		a.addAll(Arrays.asList(in.nextLine().split("")));
		b.addAll(Arrays.asList(in.nextLine().split("")));

		boolean flag = true;
		while (a.size() != 0 && b.size() != 0) {
			if (flag) {
				String tmp = a.remove(0);
				if (desk.size() > 0 && tmp.equals(desk.get(desk.size() - 1))) {
					a.add(tmp);
					int i = desk.lastIndexOf(tmp) - desk.indexOf(tmp) + 1;
					while (i > 0) {
						a.add(desk.remove(desk.size() - 1));
						i--;
					}
				} else {
					desk.add(tmp);
				}
			} else {
				String tmp = b.remove(0);
				if (desk.size() > 0 && tmp.equals(desk.get(desk.size() - 1))) {
					b.add(tmp);
					int i = desk.lastIndexOf(tmp) - desk.indexOf(tmp) + 1;
					while (i > 0) {
						a.add(desk.remove(desk.size() - 1));
						i--;
					}
				} else {
					desk.add(tmp);
				}
			}
			flag = !flag;
			
			System.out.printf("%6s%-20s", "DESK:", show(desk));
			System.out.printf("%6s%-20s", "   A:", show(a));
			System.out.printf("%6s%-20s", "   B:", show(b));
			System.out.println("   NEXT:" + (flag ? "A" : "B") );
			//Thread.sleep(1000);
		}
		
		System.out.println("WINNER:");
		if( a.size() != 0 ) 
			System.out.print("A:" + show(a));
		else 
			System.out.print("B:" + show(b));

		in.close();
	}
	
	static String show( ArrayList<String> array ) {
		Iterator<String> it = array.iterator();
		StringBuilder result = new StringBuilder();
		while( it.hasNext() ) {
			result.append(it.next());
		}
		
		return result.toString();
	}
}
