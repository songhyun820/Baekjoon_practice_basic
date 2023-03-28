package bj_level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String croa[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String str = br.readLine();
		for(int i = 0; i< croa.length; i++) {
			str = str.replace(croa[i], "a");
		}
		System.out.println(str.length());	
	}
}
