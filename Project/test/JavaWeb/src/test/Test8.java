package test;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		StringBuilder result = new StringBuilder();

		int base = 26;
		int check;
		do {
			check = num % base;
			if (check == 0)
				result.append("Z");
			else
				result.append((char) (check + 64));

			base *= 26;
		} while (num>base);

		System.out.println(result);
		
		in.close();
	}
}
