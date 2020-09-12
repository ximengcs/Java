package test;
import java.util.Scanner;
class Main {
	boolean flag = false;
	public void call(int[] n) {
		for(int i = 1; i < n.length; i++) {
			int tmp = 0;
			for(int j = 0; j < i; j++){
				if(n[j] > n[i])
					tmp++;
			}
			if(tmp == 1) {
				System.out.print(i +" ");
				flag = true;
			}
		}
		if(!flag)
			System.out.print(-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Main s = new Main();
		int N = 9;
		while (scanner.hasNext()) {
			int n[] = new int[N];
			for(int i = 0; i < N; i++)
				n[i] = scanner.nextInt();
			s.call(n);
		}
	}
}
