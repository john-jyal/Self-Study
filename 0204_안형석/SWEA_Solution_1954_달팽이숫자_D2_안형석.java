import java.util.Scanner;

public class SWEA_Solution_1954_달팽이숫자_D2_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			int[][] Map = new int[n][n];
			int[] dy = {0,1,0,-1};
			int[] dx = {1,0,-1,0};
			int dir = 0;
			int x = 0;
			int y = 0;
			int num = 1;
			while(num <= n*n) {
				Map[y][x] = num ++;
				int ny = y +dy[dir];
				int nx = x +dx[dir];
				//가면서 저장
				//if 다음꺼 불가능
				 //dir 변경
				
				
				if (ny >= n || ny < 0 || nx >= n || nx < 0 || Map[ny][nx] != 0) {
					dir ++;
					dir %= 4;
					y += dy[dir];
					x += dx[dir];
				} else {
					y = ny;
					x = nx;
				}
				
			}
			
			System.out.println("#"+t);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(Map[i][j]+ " ");
				}
				System.out.println();
			}
		}//t
	}//m
}//c
