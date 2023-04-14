package bj_level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringTokenizer Str = new StringTokenizer(str);
		int m = Integer.parseInt(Str.nextToken());
		int n = Integer.parseInt(Str.nextToken());
		char data[][] = new char[m][n];
		int i,j;
		int result = 64; 
		for (i = 0; i < m; i++) {
            String line = bf.readLine();
            for (j = 0; j < n; j++) {
                data[i][j] = line.charAt(j);
            }
        }
		
		for(i = 0; i < m - 7; i++) {
			for(j = 0; j < n-7; j++) {
				//System.out.println("i:" + i + "  j: "+ j +" COUNT : " + countColor(i, j, data));
				int count = countColor(i, j, data);
				if(count < result)
					result = count;
			}
		}
		System.out.println(result);
	}
	
	public static int countColor(int a, int b, char data[][]) {
		int count1 = 0;
		int count2 = 0;
		int x, y;
		for(x = a; x < a + 8; x++) {
			for(y = b; y < b+8; y++) {
				if(x % 2 == 0 && y % 2 == 0 && data[x][y] != 'W')
					count1++;
				else if(x % 2 == 1 && y % 2 == 1 && data[x][y] != 'W')
					count1++;
				else if(x % 2 == 0 && y % 2 == 1 && data[x][y] != 'B')
					count1++;
				else if(x % 2 == 1 && y % 2 == 0 && data[x][y] != 'B')
					count1++;
			}
		}
		
		for(x = a; x < a + 8; x++) {
			for(y = b; y < b+8; y++) {
				if(x % 2 == 0 && y % 2 == 0 && data[x][y] != 'B')
					count2++;
				else if(x % 2 == 1 && y % 2 == 1 && data[x][y] != 'B')
					count2++;
				else if(x % 2 == 0 && y % 2 == 1 && data[x][y] != 'W')
					count2++;
				else if(x % 2 == 1 && y % 2 == 0 && data[x][y] != 'W')
					count2++;
			}
		}

		return Math.min(count1, count2);
	}			
}
