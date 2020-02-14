
import java.util.Scanner;
import java.util.Stack;

public class ����_1260_DFS��BFS_�ǹ�1_������ {
	
//	public static void DFS(int[][] G,int v) { //////Ʋ���ڵ� : ��Ʋ�ȴ��� �ǹ�
//		int[] visited = new int[G.length ];
//		int[] stack = new int[G.length];
//		int top = -1;
//		stack[++top] = v;
//		visited[v] ++ ;
//		System.out.print(v + " ");
//		while(top > -1) {//������ ����������� �ݺ�
//			int w= -1; // v�� ������ ����
//			//������ ������ �̹湮 ���� ã�� - ������
//			for (int i = 1; i < G.length; i++) {
//				if(G[v][i] == 1 && visited[i] == 0) {// ����, �̹湮
//					w = i;
//					// ���ÿ� �ֱ�
//					stack[++top]= w;
//					visited[w] ++;
//					System.out.print(w + " ");
//					v = w;
//					break;					
//				} 
//			}
//			if(w==-1) {
//				
//				//������ ������ �̹湮 ���� ã�� - ������
//				// ���� ������� ���ư��� ���ÿ��� ������
//				v = stack[top--];
//			}
//		}
//		System.out.println();
//			
//	}
	
	public static void DFS(int[][] G,int v) { /// �����ڵ�
		
		Stack<Integer> stack = new Stack<>();
		
		boolean[] visited = new boolean[G.length];
		boolean flag = false;
		int n = G.length - 1;
		stack.push(v);
		visited[v] = true;
		System.out.print(v + " ");
		while (!stack.isEmpty()) {
			int vv = stack.peek();
			flag = false; 
			for (int i = 1; i <= n; i++) {
				if (G[vv][i] == 1 && !visited[i]) { 
					stack.push(i);
					System.out.print(i + " ");
					visited[i] = true;
					flag = true;
					break;
				}
			}
			if (!flag) { 
				stack.pop();
			}
		}
		System.out.println();
	}
	
//	public static void DFS(int[][] G, int v,boolean[] visited) { // ��ͱ���
//		visited[v] = true;
//		System.out.print(v + " ");
//		for (int i = 1; i < G[v].length; i++) {
//			if(G[v][i] != 0 && !visited[i]) {
//				DFS(G,i,visited);
//			}
//		}
//	}
	public static void BFS(int[][] G,int v) {
		int[] visited = new int[G.length];
		int[] Q = new int[G.length];
		int front = 	0;
		int rear = 0;
		visited[v] ++;
		Q[rear++] = v;
		System.out.print(v + " ");
		while(front != rear) {
			
			int w = -1;
			for (int i = 1; i < G.length; i++) {
				if(G[v][i] != 0 && visited[i] == 0) {
					w ++;
					Q[rear++] = i;
					visited[i] ++;
					System.out.print(i + " ");
				}
			}
			if ( w == -1) {
				v = Q[++front];
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		int[][] G = new int[n+1][n+1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			G[a][b] = 1;
			G[b][a] = 1;
		}
		DFS(G,v);
		BFS(G,v);
		
		
		
	}//m
		
}// c
