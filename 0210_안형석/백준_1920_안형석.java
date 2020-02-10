import java.util.Arrays;
import java.util.Scanner;

public class 백준_1920_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		int[] ans = new int[m];
		int start = 0;
		int end = n-1;
		int mid = (start + end) /2;
		int ind = 0;
		for (int i = 0; i < m; i++) {
			if (ans[i] == 0) {
				if( Arrays.binarySearch(a, b[i]) >= 0) {
					ans[i] = 1;
				} else {
					ans[i] = 0;
				}
			}//if
		}//for
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}//m
}//c
