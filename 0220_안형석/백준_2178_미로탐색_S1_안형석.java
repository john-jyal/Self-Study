import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Point {
	int y;
	int x;
	public Point(int y, int x) {
		super();
		this.y = y;
		this.x = x;
	}
	public Point() {}
}
public class 백준_2178_미로탐색_S1_안형석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] map = new char[n+1][m+1];
		int[] dy = {1, 0, -1, 0};
		int[] dx = {0, 1, 0, -1};
		
		for (int i = 1; i <= n; i++) {
			String tmp = br.readLine();
			
			for (int j = 1; j <= m; j++) {
				map[i][j] = tmp.charAt(j-1);
			}
		}// set
		
		///BFS
		Point now = new Point(1,1);
		Point next = new Point();
		Queue<Point> Q = new LinkedList<Point>();
		Q.offer(now);
		boolean[][] visited = new boolean[n+1][m+1];
		int[][] cnt = new int[n+1][m+1];
		cnt[1][1] = 1;
		here:
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			int y = tmp.y;
			int x = tmp.x;
			for (int i = 0; i < 4; i++) {
				int ny = y + dy[i];
				int nx = x + dx[i];
				if(ny <= n && ny > 0 && nx <= m && nx > 0 && map[ny][nx] == '1' && cnt[ny][nx] == 0) {
					Q.offer(new Point(ny,nx));
					cnt[ny][nx] = cnt[y][x] + 1;
					if (ny == n && nx == m) {
						break here;
					}
				}
			}
		}
		 System.out.println(cnt[n][m]);
		
		
		
	}//m
}//c
