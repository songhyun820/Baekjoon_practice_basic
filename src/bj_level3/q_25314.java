package bj_level3;

import java.util.Scanner;

public class q_25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		a /= 4;
		String result = "";
		while(a > 0) {
			result += "long ";
			a--;
		}
		System.out.println(result + "int");
	}
}
