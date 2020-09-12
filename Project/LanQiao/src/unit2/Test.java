package unit2;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 接收行
		int m = sc.nextInt(); // 列
		
		long time = System.nanoTime();
		
		char arr[] = new char[m];
		
		for(int i = 0; i<m;i++){
			arr[i] = (char) (65+i);
		}
		for(int i = 0; i <n;i++){
			for(int j = i;j>0;j--){
				System.out.print(arr[j]);
			}
			for(int j = 0;j<m-i;j++){
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
		time = System.nanoTime() - time;
		
		System.out.println( time );
	}
}
