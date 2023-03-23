package bj_level3;

import java.util.Scanner;

public class q_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num >= 0) {
			sum += num--;
		}
		System.out.println(sum);
	}
}
