package bj_level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_2798 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		int card[] = new int[n];
		int max = 0;
		StringTokenizer str2 = new StringTokenizer(br.readLine());
		for(int i = 0;  i < n; i++) {
			card[i] = Integer.parseInt(str2.nextToken());
		}
		for(int a = 0; a < n-2; a++) {
			for(int b = a+1; b< n-1; b++) {
				for(int c = b+1; c< n; c++) {
					int sum = card[a]+card[b]+card[c];
					if( sum <= M && sum > max)
						max = sum;
				}
			}
		}
		System.out.println(max);		
	}
}
