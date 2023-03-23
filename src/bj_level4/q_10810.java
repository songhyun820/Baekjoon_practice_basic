package bj_level4;

import java.util.Arrays;
import java.util.Scanner;

public class q_10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		int max = sc.nextInt();
		int count = sc.nextInt();
		int num[] = new int[max];
		Arrays.fill(num, 0);
		for(int a = 0; a < count; a++) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			for(i = i - 1; i <= j-1; i++) {
				num[i]=k;
			}
		}
		System.out.print(num[0]);
		for(int b = 1; b < max; b++) {
			System.out.print(" "+num[b]);
		}
	}
}
