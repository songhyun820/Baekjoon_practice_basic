package bj_level6;

import java.util.Scanner;

public class q_2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			for(int j =0; j <N-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j< i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (N-1-i)*2-1; j++) {
				System.out.print("*");
			}

			System.out.print("\n");
		}
	}
}
