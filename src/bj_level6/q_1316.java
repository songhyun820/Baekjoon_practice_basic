package bj_level6;

import java.util.Arrays;
import java.util.Scanner;

public class q_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean check[] = new boolean['z'-'a' + 1];
		int count = num;
		for(int i = 0; i < num; i++) {
			Arrays.fill(check, false);
			String str = sc.next();
			check[str.charAt(0)-'a'] = true;
			for(int j = 1; j < str.length(); j++) {
				if(str.charAt(j) == str.charAt(j-1))
					continue;
				if(check[str.charAt(j)-'a']) {
					count--;
					break;
				}
				check[str.charAt(j)-'a'] = true;				
			}	
		}
		System.out.println(count);
	}
}
