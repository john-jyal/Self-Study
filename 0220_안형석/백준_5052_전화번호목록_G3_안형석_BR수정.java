import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 백준_5052_전화번호목록_G3_안형석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		
		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(br.readLine());
			int[] ind = new int[10];
			
			String[] hp = new String[n];
			for (int i = 0; i < hp.length; i++) {
				hp[i] = br.readLine();

			}
			Arrays.sort(hp);
			for (int i = 0; i < n; i++) {
				if (i == n-1) {
					ind[hp[i].charAt(0)-48] = i;
				}else if( (hp[i].charAt(0)-48) != (hp[i+1].charAt(0)-48)) {
					ind[hp[i].charAt(0)-48] =  i;
				
				}
			}
			
			
			int flag1 =0 ;
			int flag2 =0 ;
			int last =0 ;

			// ind reset
			for (int sNum = 0; sNum < 10; sNum++) {
				if(ind[sNum] != 0) {
					for (int i = last; i < ind[sNum]; i++) {
						for (int j = i+1; j <= ind[sNum]; j++) {
							flag1 = 0;
							for (int k = 0; k < hp[i].length(); k++) {
								if(hp[i].charAt(k) != hp[j].charAt(k)) {
									flag1 ++;
									break;
								}
							}
							if ( flag1 == 0) {
								flag2 ++;
								break;
							}
						}
						if(flag2 != 0) {
							break;
						}
					}
					last = ind[sNum];
					
					if (flag2 != 0) break;
				}
			
			}// (수정된 코드 안쪽)
			
			String ans = "";
			if (flag2 == 0 ) {
				ans = "YES";
			} else {
				ans = "NO";
			}
			
			System.out.println(ans);
			
			
		}//t
	}//m
}//c
