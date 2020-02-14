import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 정올_1863_종교_안형석 {
	public static int cnt = 0;
//	public static void Dfs(ArrayList<Integer>[] L, int v, boolean[] visited) {
//		visited[v] = true;
//		
//		for (int i = 0; i < L[v].size(); i++) {
//			
//			int w = L[v].get(i);
//			if(  !visited[w]) {
//				Dfs(L,w,visited);
//			}
//		}
//	}
	public static void BFS(ArrayList<Integer>[] L,int v, boolean[] visited) {
		Queue<Integer> Q = new LinkedList<>();
		
		Q.offer(v);
		visited[v] = true;
		while(!Q.isEmpty()) {
			int w = Q.poll();
			for (int i = 0; i < L[w].size(); i++) {
				
				if(!visited[L[w].get(i)]) {
					Q.offer(L[w].get(i));
					visited[L[w].get(i)] =true;
				
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] visited = new boolean[n+1];
		
		ArrayList<Integer>[] L = new ArrayList[n+1];
		for (int i = 0; i < L.length; i++) {
			L[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			L[a].add(b);
			L[b].add(a);
		}
		int ea = 0;
		for (int i = 1; i < L.length; i++) {
			if(!visited[i]) {
				ea ++;
				BFS(L,i,visited);
				
			}
		}
	
		System.out.println(ea);
	}//m
}//c
