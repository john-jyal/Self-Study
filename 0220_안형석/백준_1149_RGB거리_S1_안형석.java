import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1149_RGB거리_S1_안형석 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] min = new int[3][n];
		int[] cost = new int[3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		min[0][0] = Integer.parseInt(st.nextToken());
		min[1][0] = Integer.parseInt(st.nextToken());
		min[2][0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				cost[j] = Integer.parseInt(st.nextToken());
				int postMin = 9999999;
				for (int k = 0; k < 3; k++) {
					if ( k == j ) continue;
					if (postMin > min[k][i-1]) {
						postMin = min[k][i-1];
					}
				}
				min[j][i] = cost[j] + postMin;
			}
			
		}
		int mincost = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			if ( mincost > min[i][n-1]) mincost = min[i][n-1];
		}
		System.out.println(mincost);
		
	}//m
}//c
