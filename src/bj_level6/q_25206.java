package bj_level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_25206 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double credit = 0;
		double grade = 0;
		for(int i = 0; i < 20; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			str.nextToken();
			double sbcredit = Double.parseDouble(str.nextToken());
				credit += sbcredit;
			switch (str.nextToken()) {
			case "A+":
				grade += 4.5 * sbcredit;
				break;
			case "A0":
				grade += 4.0 * sbcredit;
				break;
			case "B+":
				grade += 3.5 * sbcredit;
				break;
			case "B0":
				grade += 3.0 * sbcredit;
				break;
			case "C+":
				grade += 2.5 * sbcredit;
				break;
			case "C0":
				grade += 2.0 * sbcredit;
				break;
			case "D+":
				grade += 1.5 * sbcredit;
				break;
			case "D0":
				grade += 1.0 * sbcredit;
				break;
			case "P":
				credit -= sbcredit;
				break;
			default:
				break;
			}
		}
		double result = grade / credit;
		System.out.println(result);
	}
}
