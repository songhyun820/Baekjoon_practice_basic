package bj_level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class q_10812 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer a = new StringTokenizer(str, " ");
		int N = Integer.parseInt(a.nextToken());
		int M = Integer.parseInt(a.nextToken());
		int i = 0;
		int j = 0;
		int box[] = new int[N];
		int temp[] = new int[N];
		
		for(i = 0; i < N; i++) {
			box[i] = i + 1;
		}
		
		for(i = 0; i < M; i++) {
			str = br.readLine();
			a = new StringTokenizer(str, " ");
			int begin = Integer.parseInt(a.nextToken())-1;
			int end = Integer.parseInt(a.nextToken())-1;
			int mid = Integer.parseInt(a.nextToken())-1;
			for(j = mid; j <= end; j++) {
				temp[j-mid] = box[j];
			}
			for(j = begin; j < mid; j++) {
				temp[end - mid + j - begin + 1] = box[j];
			}
			for(j = begin; j <= end; j++) {
				box[j] = temp[j-begin];
			}
		}
		System.out.print(box[0]);
		for(i = 1; i < N; i++) {
			System.out.print(" " + box[i]);
		}		
	}
}
