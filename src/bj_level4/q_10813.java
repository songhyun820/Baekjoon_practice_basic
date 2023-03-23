package bj_level4;

import java.util.Scanner;

public class q_10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int num[] = new int[N];
		int temp;
		for(int i = 0; i < N; i++) { num[i] = i+1;}
		for(int j = 0; j < M; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			temp = num[a-1];
			num[a-1] = num[b-1];
			num[b-1] = temp;
		}
		System.out.print(num[0]);
		for(int k = 1; k < N; k++) {
			System.out.print(" " + num[k]);
		}
	}
}

