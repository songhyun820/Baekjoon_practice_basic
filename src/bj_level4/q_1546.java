package bj_level4;

import java.util.Scanner;

public class q_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		int sum = 0;
		int score[] = new int[N];
		for(int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
			if(score[i] > max)
				max = score[i];
			sum += score[i];
		}
		double result = (double)sum / (double)max * 100 / N;
		System.out.println(result);
	}
}
