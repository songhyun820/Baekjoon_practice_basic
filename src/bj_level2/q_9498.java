package bj_level2;

import java.util.Scanner;

public class q_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String a = (String)null;
		do {
			if(score <= 100) a = "A";
			if(score < 90) a = "B";
			if(score < 80) a = "C";
			if(score < 70) a = "D";
			if(score < 60) a = "F";
			break;
		}while(a == (String)null);
		System.out.println(a);
	}
}
