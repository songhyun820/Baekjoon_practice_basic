package bj_level2;

import java.util.Scanner;

public class q_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int temp = hour * 60 + min - 45;
		if(temp < 0)
			temp += 1440;
		System.out.println(String.format("%d %d",temp/60,temp%60));
	}
}
