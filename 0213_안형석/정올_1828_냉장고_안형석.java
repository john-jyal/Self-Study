package 정올;

import java.util.Arrays;
import java.util.Scanner;
class Chemi implements Comparable<Chemi>{
	int low;
	int high;
	public Chemi(int low, int high) {

		this.low = low;
		this.high = high;
	}
	@Override
	public int compareTo(Chemi o) {
		if(this.low < o.low) {
			return -1;
			
		} else if (this.low == o.low) {
			if(this.high < o.high) return -1;
		} else  {
			return 1;
		}
		return 0 ;
	}
	public String toString() {
		return this.low + " " +this.high;
	}
}
public class 정올_1828_냉장고_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Chemi[] ch = new Chemi[n];
		
		for (int i = 0; i < n; i++) {

			ch[i] = new Chemi(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(ch);
		/////////
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i].toString());
		}
		/////////
		int min = ch[0].low;
		int max = ch[0].high;
		int cnt = 1 ;
		for (int i = 1; i < ch.length; i++) {
			if(ch[i].low <= max) {
				min = ch[i].low;
				if(ch[i].high < max) {
					max = ch[i].high;
				}
			
			
			} else {
				cnt ++;
				min = ch[i].low;
				max = ch[i].high;
			}
		}
		System.out.println(cnt);
	}//m
}//c
