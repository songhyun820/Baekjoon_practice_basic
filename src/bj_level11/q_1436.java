package bj_level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1436 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		int num = Integer.parseInt(in.readLine()); 
		int count = 1;
		int number = 666;
		while (count != num) {
			number++;
			if(Integer.toString(number).indexOf("666") != -1)
				count++;
		}
		System.out.println(number);
	}
}
