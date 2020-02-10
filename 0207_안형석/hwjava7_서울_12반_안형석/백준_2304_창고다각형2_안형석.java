import java.util.Scanner;

public class 백준_2304_창고다각형2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[1001];//1차원 배열 이용 저장
		int n = sc.nextInt();
		int x , h;
		//for 탐색하면서
		int maxH = 0;
		int pos = -1;
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			h = sc.nextInt();
			arr[x] = h;
			if (maxH < h) {
				maxH = h;
				pos = x;
			}
		} // setting
		// 왼쪽
		int lx = pos;
		int rx = pos;
		int llx = pos;
		int lrx = pos;
		int area = maxH;
		while(true) {
			int maxl = -1;
			boolean done = false;
			for (int i = lx-1; i > 0; i--) {
				if(maxl <= arr[i]) {
					maxl = arr[i];
					lx = i;
					done = true;
				}
			}
			if(done) {
				area += maxl * (llx - lx);
				llx = lx;
				
			} else {
				break;
			}
			
		}
		while(true) {
			int maxr = -1;
			boolean done = false;
			for (int i = rx+1; i <= 1000; i++) {
				if(maxr <= arr[i]) {
					maxr = arr[i];
					rx = i;
					done = true;
				}
			}
			if(done) {
				area += maxr * (rx - lrx);
				lrx = rx;
				
			} else {
				break;
			}
			
		}
		//오른쪽
		System.out.println(area);
		
		
	}//m
}//c
