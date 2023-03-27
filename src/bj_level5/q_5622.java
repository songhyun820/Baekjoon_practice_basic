package bj_level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_5622 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int result = 0;
		for(int i = 0; i<s.length(); i++) {
			int a = s.charAt(i);
			if(a >= 87)
				result += 10;
			else if(a == 83 || a == 86)
				result += (a-62)/3 + 1;
			else				
				result += (a-62)/3 + 2;
		}
		System.out.println(result);
	}
}
