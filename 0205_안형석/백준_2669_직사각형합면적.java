import java.util.Scanner;

public class 백준_2669_직사각형합면적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] Map = new int[100][100];
		for (int i = 0; i < 4; i++) {
			int lx = sc.nextInt();
			int dy = sc.nextInt();
			int rx = sc.nextInt();
			int uy = sc.nextInt();
			
			
			for (int y = dy; y < uy; y++) {
				for (int x = lx; x < rx ; x++) {
					Map[y][x] = 1;
				}
			}
		}
		int cnt =0 ;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(Map[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
		
	}//m
}//c
