import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1978_소수찾기_S4_안형석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		boolean[] prime = new boolean[1001];
		int len = prime.length - 1;
		for (int i = 2; i <= len; i++) {
			prime[i] = true;
		}
		for (int i = 2; i <= len; i++) {
			if (prime[i]) {
				for (int j = 2; i * j <= len; j++) {
					prime[i*j] = false;
				}
			}
		}
		int tmp ;
		int cnt = 0;
		for (int i = 0; i < tc; i++) {
			tmp = Integer.parseInt(st.nextToken());
			if ( prime[tmp] ) cnt ++;		
		}
		System.out.println(cnt);
		
		
		
	}//m
}//c
