package bj_level4;

import java.util.Scanner;

public class q_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int count = 0;
		for(int i = 0; i < 10; i++) {
			int temp = sc.nextInt()%42;
			num[i] = temp;
			count++;
			for(int j = 0; j < i; j++) {
				if(num[j]==temp) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
