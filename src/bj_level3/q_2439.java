package bj_level3;

import java.util.Scanner;

public class q_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			for(int k = 1; k < num-i; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
