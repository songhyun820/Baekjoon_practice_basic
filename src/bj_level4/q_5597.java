package bj_level4;

import java.util.Arrays;
import java.util.Scanner;

public class q_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean student[] = new boolean[30];
		Arrays.fill(student, false); 
		int a = -1;
		int b = -1;
		for(int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			student[num-1] = true;
		}
		for(int j = 0; j < 30; j++) {
			if(!student[j] && a == -1)
				a = j + 1;
			else if(!student[j]) {
				b = j + 1;
				if(a > b) {
					int temp = a;
					a = b;
					b = temp;
				}
				break;
			}
		}
		System.out.println(a + "\n" + b);
	}
}
