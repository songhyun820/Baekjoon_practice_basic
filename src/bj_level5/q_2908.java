package bj_level5;

import java.util.Scanner;

public class q_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int aa = a/100 + ((a%100)/10)*10 + (a%10)*100 ;
		int bb = b/100 + ((b%100)/10)*10 + (b%10)*100 ;
		if(aa > bb)
			System.out.println(aa);
		else
			System.out.println(bb);
	}

}
