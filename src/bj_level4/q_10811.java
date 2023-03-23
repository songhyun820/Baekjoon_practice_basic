package bj_level4;

import java.util.Arrays;
import java.util.Scanner;

public class q_10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int num[] = new int[N];
		for(int i = 0; i < N; i++) { num[i] = i+1;}
		for(int j = 0; j < M; j++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			while (a < b) {
				int temp = num[a];
				num[a++] = num[b];
				num[b--] = temp;
			}
		}
		System.out.print(num[0]);
		for(int m = 1; m < N; m++) {
			System.out.print(" " + num[m]);
		}
	}
}
