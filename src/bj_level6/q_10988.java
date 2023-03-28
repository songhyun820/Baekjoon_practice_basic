package bj_level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder temp = new StringBuilder(br.readLine());
		if(temp.toString().equals(temp.reverse().toString()))
			System.out.println(1);
		else
			System.out.println(0);
	}
}
