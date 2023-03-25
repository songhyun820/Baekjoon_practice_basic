package bj_level7;

import java.util.Arrays;
import java.util.Scanner;

public class q_10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char words[][] = new char[5][15];
		String result = "";
		for(int i = 0; i < 5; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < str.length(); j++) {
				words[i][j] = str.charAt(j);
			}
		}
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if (words[j][i] == '\0')
					continue;
				result += words[j][i];
			}
		}
		System.out.println(result);
	}
}
