package 백준;

import java.util.Scanner;

public class 백준_1157_단어공부_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int[] cnt = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i)-65] ++;
			
		}
		int max = 0 ;
		int ind = 0 ;
		boolean same = false;
		for (int i = 0; i < cnt.length; i++) {
			if (max < cnt[i]) {
				same = false;
				ind = i;
				max = cnt[i];
			} else if (max == cnt[i]) {
				same = true;
			}
		}
		if (same) {
			System.out.println("?");
		} else if (!same) {
			System.out.println((char) (ind+65));
		}
		
		
	}//m
}//c
