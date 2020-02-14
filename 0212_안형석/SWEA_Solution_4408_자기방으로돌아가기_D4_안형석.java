
import java.util.Scanner;

public class SWEA_Solution_4408_자기방으로돌아가기_D4_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int t = 1; t <= tc; t++) {
			int n  = sc.nextInt();
			int[] corr = new int[200];
			
			
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (a %2 == 0) {
					a --;
				}
				if (b % 2 == 0) {
					b -- ;
				}
				int start = Integer.min(a, b) / 2;
				int end = Integer.max(a, b) / 2;
				
				for (int j = start; j <= end; j++) {
					corr[j] ++;
				}
			}
			int max = -1;
			for (int i = 0; i < corr.length; i++) {
				if(corr[i] > max) {
					max = corr[i];
				}
			}
			System.out.println("#" + t + " " + max);
		}
	}//m
		
}// c
