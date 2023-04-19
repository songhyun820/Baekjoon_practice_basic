package bj_level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int min = 5000;
		int num;
		for(int i = 0; i < N/5 +1; i++) {
			num = i + (N - (i * 5))/3;
			if((N - (i * 5))%3 == 0 && num < min)
				min = num;	
		}
		if(min == 5000)
			System.out.println(-1);
		else {
			System.out.println(min);
		}
	}
}
