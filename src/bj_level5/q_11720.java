package bj_level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int sum =0;
		for(int i = 0; i < a; i++) {
			sum += bf.read()-48;	
		}
		System.out.println(sum);
	}
}
