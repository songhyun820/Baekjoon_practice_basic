package bj_level3;

import java.util.Scanner;

public class q_25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int amount = sc.nextInt();
		int check = 0;
		while(amount > 0) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			check += num * price;
			amount--; 
		}
		if(sum == check)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
