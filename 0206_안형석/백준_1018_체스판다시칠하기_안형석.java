import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String[][] board = new String[n][m];
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			for (int j = 0; j < m; j++) {
				board[i][j] = tmp.charAt(j)+"";
			}
		}
		String[][] bChess = {
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"}		
		};
		String[][] wChess = {
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				{"W","B","W","B","W","B","W","B"},
				{"B","W","B","W","B","W","B","W"},
				
		};
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n-7; i++) {
			for (int j = 0; j < m-7; j++) {
				int cntb =0;
				int cntw =0;
				for (int y = 0; y < 8; y++) {
					for (int x = 0; x < 8; x++) {
						if (!board[i+y][j+x].equals(wChess[y][x])) {
							cntw++;
						}
						if (!board[i+y][j+x].equals(bChess[y][x])) {
							cntb++;
						}
					}
				}
				
				if ( min > Integer.min(cntw, cntb)) {
					min = Integer.min(cntw, cntb);
				}
			}
		}
		System.out.println(min);
		
	}
}
