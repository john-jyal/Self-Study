import java.util.Scanner;

public class ����_1085_���簢��Ż��_������ {
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
