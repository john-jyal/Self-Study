import java.util.Scanner;

public class 백준_1085_직사각형탈출_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int minX = x;
		int minY = y;
		if((w-x) < minX) {
			minX = w - x;
		}
		if ((h-y) < minY) {
			minY = h - y;
			
		}
		System.out.println(Integer.min(minX, minY));
	}
}
