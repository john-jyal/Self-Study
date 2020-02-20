import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 백준_11866_요세푸스문제0_S4_안형석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> ll = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= n; i++) {
			ll.add(i);
		}
		int index = k-1;
		int ind = 0;
		int[] ans = new int[n];
		while(ll.size() != 0) {
			ans[ind++] = (ll.get(index));
			ll.remove(index);
			if (ll.size() != 0) {
				index = (index + k-1) % ll.size();
				
			}
		}
		
		System.out.print("<");
		for (int i = 0; i < n; i++) {
			if (i != n-1) {
				System.out.print(ans[i] + ", ");
			} else {
				System.out.print(ans[i] +">");
			}
		}
	}//m
}//c
