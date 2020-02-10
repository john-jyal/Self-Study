import java.util.Scanner;

public class SWEA_Solution_1231_D4_¾ÈÇü¼® {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			int node = sc.nextInt();
			sc.nextLine();
			char[] tree = new char[node+1];
			for (int i = 1; i <= node; i++) {
				String[] str = sc.nextLine().split(" ");
				int index = Integer.parseInt(str[0]);
				char ch = str[1].charAt(0);
				tree[index] = ch;
			}
			System.out.print("#"+t+" ");
			inOrder(1,node,tree);
			System.out.println();
		}
					
	}//m
		
		private static void inOrder(int index,int node, char[] tree) {
			if(index > node || tree[index] == 0 ) {
				return ;
			} else {
				inOrder(2*index,node,tree);
				System.out.print(tree[index] );
				inOrder(2*index+1,node,tree);
			}
			
			
		}
		
}//c

		
