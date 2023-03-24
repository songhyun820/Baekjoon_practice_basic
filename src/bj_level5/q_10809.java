package bj_level5;

import java.util.Arrays;
import java.util.Scanner;

public class q_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result[] = new int[26];
		Arrays.fill(result,-1);
		String str = sc.nextLine();
		int i = 0;
		
		while(str.length()-i > 0) {
			int c =(int)str.substring(str.length()-1-i, str.length()-i).charAt(0);
			result[c-97] = str.length()-i-1;
			i++;
		}
		System.out.print(result[0]);
		for(i = 1; i < 26; i++)
		System.out.print(" "+ result[i]);
	}
}
