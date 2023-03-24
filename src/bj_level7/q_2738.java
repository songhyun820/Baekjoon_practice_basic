package bj_level7;

import java.util.Scanner;

public class q_2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int A[][] = new int[a][b];
		int B[][] = new int[a][b];
		int sum[][] = new int[a][b];
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				B[i][j] = sc.nextInt();
				sum[i][j] = A[i][j] + B[i][j]; 
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(j == 0)
					System.out.print(sum[i][j]);
				else
					System.out.print(" "+sum[i][j]);
			}
			System.out.print("\n");
		}
	}
}
