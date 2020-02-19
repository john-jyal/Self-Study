import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Point {
	int y;
	int x;
	public Point() {};
	public Point(int y, int x) {
	
		this.y = y;
		this.x = x;
	}
	
}

public class SWEA_1226_7일차미로1_D4_안형석 {
	public static int[] dy = {1, -1, 0, 0};
	public static int[] dx = {0, 0, -1, 1};
	public static boolean flag = false;
	public static int ans = 0;
	public static void DFS(Point point, int[][] map, boolean[][] visited) {
		int y = point.y;
		int x = point.x;
		if ( !flag ) {
			
			if(map[y][x] == 3) {
				flag = true;
				ans = 1;
			}
			visited[y][x] = true;
			
			
			for (int i = 0; i < 4; i++) {
				
				int ny = y + dy[i];
				int nx = x + dx[i];
				if ( ny <16 && ny >= 0 && nx < 16 && nx >= 0 && map[ny][nx] != 1 && !visited[ny][nx] && !flag) {
					Point np = new Point(ny,nx);
					DFS(np, map, visited);
				}
			}
			
			
		} else {
			return;
		}
		
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] map = new int[16][16];
		for (int t = 1; t <= 10; t++) {
			boolean[][] visited = new boolean[16][16];
			t = Integer.parseInt(br.readLine());
			flag = false;
			ans = 0;
			for (int i = 0; i < 16; i++) {
				String str = br.readLine();
				for (int j = 0; j < 16; j++) {
					map[i][j] = str.charAt(j) - '0';
				}
			} // 세팅
			Point start = new Point();
			p1:
			for (int y = 0; y < 16; y++) {
				for (int x = 0; x < 16; x++) {
					if(map[y][x] == 2) {
						start.y = y;
						start.x = x;
						break p1;
					}
				}
			}
			DFS(start, map, visited);
			System.out.println("#" + t + " " + ans);
			
			
			
		}//t
		
		
	}//m
}//c
