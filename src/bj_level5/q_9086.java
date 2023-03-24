package bj_level5;

import java.util.Scanner;

public class q_9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		String result = "";
		for(int i = 0; i < T; i++) {
			String str = sc.nextLine();
			if(str.length() == 0)
				result += "\n";
			else
				result += str.substring(0,1) + str.substring(str.length()-1) + "\n";
		}
		System.out.println(result);
	}
}
