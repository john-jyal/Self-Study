import java.util.Scanner;

public class ����_2304_â��ٰ���2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[1001];//1���� �迭 �̿� ����
		int n = sc.nextInt();
		int x , h;
		//for Ž���ϸ鼭
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
		// ����
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
		//������
		System.out.println(area);
		
		
	}//m
}//c
