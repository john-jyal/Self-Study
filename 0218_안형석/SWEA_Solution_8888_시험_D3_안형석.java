
import java.util.Scanner;

public class SWEA_Solution_8888_����_D3_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt(); // �����ڼ� 
			int q = sc.nextInt(); // ���� ��
			int p = sc.nextInt(); // ������ ��ȣ
			
			int[][] cor = new int[q+1][n+1];
			int[] qScore = new int[q];
			int[] nScore = new int[n+1];
			long startTime = System.currentTimeMillis();
			for (int i = 1; i <= n; i++) { // i >> ������ ��ȣ�� �Ϸ��� 1���ͽ���
				
				for (int j = 0; j < q; j++) {
					cor[j][i] = sc.nextInt();
					if(cor[j][i] == 1) {
						cor[q][i] ++;
					} else {
						qScore[j] ++;
					}
				}
			} // setting

			System.out.println(System.currentTimeMillis() - startTime + "ms");
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < q; j++) {
					if(cor[j][i] == 1) {
						nScore[i] += qScore[j];
					}
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
		}//t
	}//m
}	//c