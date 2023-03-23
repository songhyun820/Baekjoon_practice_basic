package bj_level3;

import java.util.Scanner;

public class q_11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int plus[] = new int[num];
		int temp = num;
		while(num > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			plus[num-1] = a + b;	
			num--;
		}
		for(int i = temp; i > 0; i--) {
			System.out.println(String.format("Case #%d: %d",temp - i + 1, plus[i-1]));
		}
	}
}
