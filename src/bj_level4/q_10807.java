package bj_level4;

import java.util.Scanner;

public class q_10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number[] = new int[num];
		for(int i = 0; i < num; i++) {
			number[i] = sc.nextInt();
		}
		int check = sc.nextInt();
		int count = 0;
		for(int j = 0; j < num; j++) {
			if(number[j] == check)
				count++;
		}
		System.out.println(count);
	}
}
