package bj_level3;

import java.util.Scanner;

public class q_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num[]= new int[count];
		for (int i = 0; i < count; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			num[i] = a + b; 
		}
		for (int j = 0; j < count; j++) {
			System.out.println(num[j]);
		}
	}
}
