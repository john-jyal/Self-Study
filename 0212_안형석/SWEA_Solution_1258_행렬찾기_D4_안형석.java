import java.util.Arrays;
import java.util.Scanner;
class Size implements Comparable<Size>{
	int row;
	int column;
	int size;
	public Size(int row, int column, int size) {
		this.row = row;
		this.column = column;
		this.size = size;
	}
	public int compareTo(Size s) {
		if(this.size > s.size) {
			return 1;
		} else if (this.size == s.size) {
			if(this.row > s.row) {
				
				return 1;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
	public String toString() {
		return	this.row + " " + this.column + " ";
	}
}
public class SWEA_Solution_1258_행렬찾기_D4_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int t = 1; t <= tc; t++) {
			Size[] size = new Size[3];
			
			int n = sc.nextInt();
			//사이즈 정보도 저장
			//visited 필요
			//행, 열 따로저장
			int ea = 0;
			int[][] map = new int[n][n];
			int[][] visited = new int[n][n];
			int[][] tmp = new int[3][n];
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					map[r][c] = sc.nextInt();
				}
			} // set
			for (int y = 0; y < n; y++) {
				for (int x = 0; x < n; x++) {
					int cntx = 0;
					int cnty = 0;
					if(map[y][x] != 0 && visited[y][x] == 0 ) {
						
						
						for (int c = x; c < n; c++) {
							if(map[y][c] != 0) {
								cntx ++;
							} else {
								break;
							}
						}
						for (int r = y; r < n; r++) {
							if(map[r][x] != 0) {
								cnty ++;
							} else {
								break;
							}
						}
						tmp[0][ea] = cnty;
						tmp[1][ea] = cntx;
						tmp[2][ea++] = cnty * cntx;
						int endy = y + cnty ;
						int endx = x + cntx ;
						for (int r = y; r < endy ; r++) {
							for (int c = x; c < endx; c++) {
								visited[r][c] ++;
							}
						}
						x = endx;
					}
				}
			}
			
			
			int[][] ans = new int[3][ea];
			Size[] SS = new Size[ea];
			for (int i = 0; i < ea; i++) {
				Size s = new Size(tmp[0][i], tmp[1][i], tmp[2][i]);
				SS[i] = s;
			}
			Arrays.sort(SS);
//			for (int i = 0; i < ea; i++) {
//				for (int j = 0; j < 3; j++) {
//					ans[j][i] = tmp[j][i];
//				}
//			}
//			System.out.print("#" + t + " ");
//			
//			while(ea > 0) {
//				int max = 0 ;
//				int min = Integer.MAX_VALUE;
//				int same = 1 ;
//				int ind = -1;
//				for (int i = 0; i < ans.length; i++) {
//					if(max < ans[2][i]) {
//						max = ans[2][i];
//						same = 1;
//						min = ans[0][i];
//						ind = i;
//					} else if (max == ans[2][i]) {
//						same ++;
//						if(min > ans[0][i]) {
//							ind = i;
//						}
//					}
//				}
//				//for문돌면서 출력
//				
//				
//			} //while
			System.out.print("#"+t+" " + ea + " ");
			for (int i = 0; i < SS.length; i++) {
				System.out.print(SS[i].toString());
			}
			System.out.println();
			
			
		}//t
	}//m
		
}// c
