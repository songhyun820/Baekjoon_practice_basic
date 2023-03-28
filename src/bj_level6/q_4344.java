package bj_level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_4344 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		double result[] = new double[c];
		for(int i = 0; i < c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int sum = 0;
			int bigavg = 0;
			int score[] = new int[num];
			for(int j = 0; j < num; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			double avg = (double)sum / (double)num;
			for(int j = 0; j < num; j++) {
				if (score[j] > avg)
					bigavg++;
			}
			result[i] = ((double)bigavg / (double)num)*100;
		}
		for(int i = 0; i < c; i++) {
			System.out.println(String.format("%.3f", result[i])+"%");
		}
	}
}
