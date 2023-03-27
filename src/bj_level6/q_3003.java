package bj_level6;

import java.util.Scanner;

public class q_3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chess[] = new int[6];
		int result[] = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < 6; i++) {
			chess[i] = sc.nextInt();
			result[i] = result[i] - chess[i];
		}
		
		System.out.print(result[0]);
		for(int i = 1; i < 6; i++) {
			System.out.print(" " + result[i]);
		}
	}
}
