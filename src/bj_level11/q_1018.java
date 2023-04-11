package bj_level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringTokenizer Str = new StringTokenizer(str);
		int m = Integer.parseInt(Str.nextToken());
		int n = Integer.parseInt(Str.nextToken());
		char data[][] = new char[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				data[i][j] = (char) bf.read();	
			}
			bf.read();
			bf.read();
		}
		
	}
}
