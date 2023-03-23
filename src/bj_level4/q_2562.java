package bj_level4;

import java.util.Scanner;

public class q_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int count = 1;
		for(int i = 0; i < 9; i++) {
			int temp = sc.nextInt();
			if(temp > max) {
				max = temp;
				count = i+1;
			}
		}
		System.out.println(max + "\n" + count);
	}
}
