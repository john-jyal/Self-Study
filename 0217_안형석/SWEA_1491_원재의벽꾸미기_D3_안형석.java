import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class SWEA_1491_원재의벽꾸미기_D3_안형석 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tc = Integer.parseInt(st.nextToken());
		for (int t = 1; t <= tc; t++) {
			st = new StringTokenizer(br.readLine());
			
			long n = Integer.parseInt(st.nextToken());
			long a = Integer.parseInt(st.nextToken());
			long b = Integer.parseInt(st.nextToken());
			
			long min = Integer.MAX_VALUE;
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; i * j <= n; j++) {
					long tmp = (a * (Long.max(i-j, j-i) ) ) + (b * (n - i*j));
					if(min > tmp) min = tmp;
				}
			}
			System.out.println("#" + t + " " + min);
			
			
			
		}//t
		
		
		
	}//m
}//c