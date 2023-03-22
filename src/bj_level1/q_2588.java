package bj_level1;

import java.util.Scanner;

public class q_2588 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2;
		num1 = in.nextInt();
		num2 = in.nextInt();
		System.out.println(num1 * (num2%10));
		System.out.println(num1 * ((num2%100)/10));
		System.out.println(num1 * (num2/100));
		System.out.println(num1 * num2);
	}
}
