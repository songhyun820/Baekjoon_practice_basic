package bj_level7;

import java.util.Scanner;

public class q_2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[][] = new int[9][9];
		int max = -1;
		int x = 0;
		int y = 0;
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				num[i][j] = sc.nextInt();
				if(num[i][j] > max) {
					max = num[i][j];
					x = i + 1;
					y = j + 1;
				}	
			}
		}
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}
