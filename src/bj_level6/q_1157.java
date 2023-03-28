package bj_level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q_1157 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int['Z' - 'A' + 1];
		Arrays.fill(arr, 0);
		String s = br.readLine();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				arr[s.charAt(i)-'A']++; 
			else
				arr[s.charAt(i)-'a']++;
		}
		int max = -1;
		char c = '?';
		for(int i = 0; i < 'Z' - 'A' + 1; i++) {
			if(arr[i] > max) {
				max = arr[i];
				c = (char)(i + 'A');
			}
			else if (arr[i] == max)
				c = '?';
		}
		System.out.println(c);
	}
}
