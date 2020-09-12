package test;

import java.util.Scanner;
class Main {
	public void count(int[][] n) {
		int count = 0;
		int start_node;
		int tmp;
		for(int i = 0; i < n.length; i++) {
			start_node = n[i][0];
			tmp = 0;
			int next = n[i][1];
			count = 0;
			while(tmp < n.length) {
				count++;
				if(next == start_node)
					break;
				next = n[next-1][1];
				tmp++;
			}
			if(next == start_node) {
				System.out.println(count);

				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Main s = new Main();
		int n[][] = { 
				{1, 2},
				{2, 3},
				{3, 4},
				{4, 5},
				{5, 3}
		};
		s.count(n);
	}
}
