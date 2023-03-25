package bj_level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		int num = Integer.parseInt(br.readLine());
		boolean[][] paper = new boolean[101][101];
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for(int j = a; j < a + 10; j++) {
				for(int k = b; k < b + 10; k++) {
					if(!paper[j][k]) {
						paper[j][k] = true;
						result++;
					}
				}
			}
		}
		System.out.print(result);
	}
}
