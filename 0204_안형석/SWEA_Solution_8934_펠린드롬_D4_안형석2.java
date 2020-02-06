
import java.util.Scanner;

public class SWEA_Solution_8934_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		String res;
		for (int t = 1; t <= tc; t++) {
			String str = sc.next();
			int[] cnt = new int[3];
			
			for (int i = 0; i < str.length(); i++) {
				switch (str.charAt(i)) {
				case 'a':
					cnt[0] ++;
					break;
				case 'b':
					cnt[1] ++;
					break;
				case 'c':
					cnt[2] ++;
					break;
				}
			}
			res = "NO";
			boolean done = false;
			if ( str.length() < 3 ) {//
				for (int i = 0; i < cnt.length; i++) {
					if(cnt[i]>=2) {
						done = true;
						break;
					}
				}
				if (!done) {
					res = "YES";
					
				}
				System.out.println("#"+t+" "+res);
				continue;
			} 
			
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < cnt.length; i++) {
				if (max < cnt[i]) {
					max = cnt[i];
				} 
				if( min > cnt[i]) {
					min = cnt[i];
				}
				
				
			}
			if ((max - min) == 1) {
				res = "YES";
			}
			System.out.println("#"+t+" "+res);
		}//t
	}//m
}//c
