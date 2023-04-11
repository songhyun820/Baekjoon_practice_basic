package bj_level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_19532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer Str = new StringTokenizer(str);
		int a = Integer.parseInt(Str.nextToken());
		int b = Integer.parseInt(Str.nextToken());
		int c = Integer.parseInt(Str.nextToken());
		int d = Integer.parseInt(Str.nextToken());
		int e = Integer.parseInt(Str.nextToken());
		int f = Integer.parseInt(Str.nextToken());
		int  x = -999;
		int y = - 999;
		loopOut:
		for(x = x;  x < 1000; x++) {
			for(y = -999; y < 1000; y++) {
				if(a*x + b*y == c && d*x + e*y == f)
					break loopOut;
			}
		}
		System.out.println(x + " " + y );
	}
}
