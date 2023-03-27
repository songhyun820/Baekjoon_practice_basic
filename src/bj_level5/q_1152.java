package bj_level5;

import java.util.Scanner;

public class q_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[] = sc.nextLine().split(" ");
		int check = 0;
		for(int i =0; i < a.length; i++) {
			if(a[i] == "")
				check++;
		}
		System.out.println(a.length-check);
	}
}
