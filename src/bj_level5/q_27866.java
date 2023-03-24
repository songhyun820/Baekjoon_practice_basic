package bj_level5;

import java.util.Scanner;

public class q_27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = sc.nextInt()-1;
		System.out.println(str.subSequence(num, num+1));
	}
}
