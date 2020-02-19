import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_8888_����_D3_������2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt(); // �����ڼ� 
			int q = sc.nextInt(); // ���� ��
			int p = sc.nextInt(); // ������ ��ȣ
			
			int[][] cor = new int[q+1][n+1];
			int[] qScore = new int[q];
			int[] nScore = new int[n+1];
			int nCor ;
			
			
			for (int i = 1; i <= n; i++) { // i >> ������ ��ȣ�� �Ϸ��� 1���ͽ���
				nCor = 0;
				for (int j = 0; j < q; j++) {
					cor[j][i] = sc.nextInt();
					if(cor[j][i] == 1) {
						nCor ++;
					}
				}
				cor[q][i] = nCor;
			} // setting
			
			for (int i = 0; i < q; i++) {
				for (int j = 1; j <= n; j++) {
					if(cor[i][j] == 0 ) {
						qScore[i] ++;	
					}
				}
			}
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < q; j++) {
					nScore[i] += (cor[j][i] * qScore[j]);
				}
			}
			int rank = 1 ;
			for (int i = 1; i <= n; i++) {
				if(nScore[i] > nScore[p]) {
					rank ++;
				} else if(nScore[i] == nScore[p]) {
					if(cor[q][i] > cor[q][p]) {
						rank ++;
					} else if (cor[q][i] == cor[q][p]) {
						if(i < p) {
							rank ++;
						}
					}
				}
			}
			
			System.out.print("#"+t+" "+nScore[p]+" "+rank+"\n");
			System.out.println( System.currentTimeMillis()- startTime  +"ms");
		}//t
	}//m
}	//c
