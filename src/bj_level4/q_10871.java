package bj_level4;

import java.util.Scanner;

public class q_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int check = sc.nextInt();
		int number[] = new int[num];
		String result = null;
		for(int i = 0; i < num; i++) {
			int temp = sc.nextInt();
			if(temp < check && result == null) {
				result = Integer.toString(temp);
			}
			else if(temp < check) {
				result += " " + Integer.toString(temp);
			}
		}
		System.out.println(result);
	}
}
