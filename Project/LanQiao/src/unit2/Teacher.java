package unit2;

import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 接收行
		int m = sc.nextInt(); // 列
		Teacher.k(n, m);
	}
	public static void k(int n ,int m ){
		long time = System.nanoTime();
		char arr[][] = new char [n][m]; 
		arr[0][0] = 'A';
		for(int k = 1;k<m;k++){
			arr[0][k] = (char) (arr[0][k-1] + 1);
		}
		for(int i = 1; i < n ;i++){
			boolean E = true;
			for(int j = 0;j<m;j++){
				if(j == 0){
					arr[i][j] = (char) (arr[i-1][j]+1);
				}else{
					if(E == true){
						arr[i][j] = (char)(arr[i][j-1] -1);
						if(arr[i][j] == 'A'){
							E = false;
						}
					}else{
						arr[i][j] = (char)(arr[i][j-1]+1);
					}
				}
			}
		}
		
		InputShow(arr,n,m);
		
		time = System.nanoTime() - time;
		System.out.println( time );
	}
	public static void InputShow(char arr[][],int n, int m){
		for(int i =0;i<n;i++){
			for(int j = 0;j<m;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
