import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 백준_14502_연구소_G5_안형석 {
	public static int[] dy = {1, -1, 0, 0};
	public static int[] dx = {0, 0, -1, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] map = new char[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = st.nextToken().charAt(0);
			}
		} // set
		
		
		//////반복
		// 벽세우기 ( 완탐 )
		int xi2 = 0;
		int xi3 = 0;
		int max = Integer.MIN_VALUE;
		for (int y1 = 0; y1 < n; y1++) {
			for (int x1 = 0; x1 < m; x1++) {
				if (map[y1][x1] == '0') {
					map[y1][x1] = '1';
					
					for (int y2 = y1; y2 < n; y2++) {
						if ( y2 == y1) {
							xi2 = x1 + 1;
						} else {
							xi2 = 0;
						}
						for (int x2 = xi2; x2 < m; x2++) {
							if(map[y2][x2] == '0') {
								map[y2][x2] = '1';
								
								for (int y3 = y2; y3 < n; y3++) {
									if ( y3 == y2) {
										xi3 = x2 + 1;
									} else {
										xi3 = 0;
									}
									for (int x3 = xi3; x3 < m; x3++) {
										if(map[y3][x3] == '0') {
											map[y3][x3] = '1';
											//벽세운채로 BFS
											int tmp = BFS(map);
											// min값 비교
											if (max < tmp) {
												max = tmp;
//												System.out.println("("+y1+","+x1+"), "+"("+y2+","+x2+"), "+"("+y3+","+x3+") " + "   "+ max);
											}
											map[y3][x3] = '0';
										}
									}
								}
								map[y2][x2] = '0';
							}
						}
					}
					map[y1][x1] = '0';
					
				}	
			}
		}
		System.out.println(max);
		
	}//m

	private static int BFS(char[][] map) {
		int cnt = 0;
		int n = map.length;
		int m = map[0].length;
		char[][] tmp = new char[n][m];
		for (int i = 0; i < n; i++) {
			tmp[i] = Arrays.copyOf(map[i], m);
		}
		Queue<int[]> Q = new LinkedList<int[]>();
		for (int i = 0; i < n; i++) { // 바이러스 위치를 미리 파악해두면 시간단축 가능할듯
			for (int j = 0; j < m; j++) {
				if(tmp[i][j] == '2') {
					int[] a = {i,j};
					int y, x, ny, nx;
					Q.offer(a);
					while(!Q.isEmpty()) {
						int[] arr = Q.poll();
						y = arr[0];
						x = arr[1];
						for (int k = 0; k < 4; k++) {
							ny = y + dy[k];
							nx = x + dx[k];
							if(ny < n && ny >=0 && nx < m && nx >= 0 && tmp[ny][nx] == '0') {
								tmp[ny][nx] = '3';
								a = new int[] {ny, nx};
								Q.offer(a);
							}
						}
					}
					
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(tmp[i][j] == '0') cnt ++;
			}
		}
		return cnt;
	}

}//c
