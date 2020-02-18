import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 정올_1011_소수369_안형석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		boolean[] prime = new boolean[m+1];
		int cnt = 0;
		for (int i = 2, len = prime.length; i < len; i++) {
			prime[i] = true;
		}
	    
		
		for (int i = 2, len = prime.length; i < len; i++) {
			if( prime[i] ) {
				for (int j = 2  ; i*j < len; j++) {
					prime[i*j] = false;
				}
			}
		}
		int add = 0;
		while(true) {
			if(add + k +1 > m) {
				break;
			}
			if(prime[add + k+1]) {
				cnt ++;
			}
			add += n;
		}
		System.out.println(cnt);
	}//m
}//c
