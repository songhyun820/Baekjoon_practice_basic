package bj_level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i =0; i < number+ 1; i++) {
			if (sum(i) + i == number) {
				result = i;
				break;
			}
		}
	System.out.println(result);
	}
	public static int sum(int a) {
		if(a<10)
			return a;
		else {
			int digit =(int) Math.log10((double)a);
			int temp = (int) Math.pow(10, digit);
			return (a/temp + sum(a % temp));
		}
	}
}
