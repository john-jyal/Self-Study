import java.util.Arrays;
import java.util.Scanner;

public class 백준_2628_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hor = sc.nextInt();
		int ver = sc.nextInt();
		int n = sc.nextInt();
		int[] cutx = new int[hor];
		int indx = 0;
		int[] cuty = new int[ver];
		int indy = 0;
		int firstIn , lastIn;
		for (int i = 0; i < n; i++) {
			firstIn = sc.nextInt();
			lastIn = sc.nextInt();
			switch (firstIn) {
			case 0:
				cuty[indy++] = lastIn; 
				break;
			case 1:
				cutx[indx++] = lastIn; 
				break;
			} // switch
		
		} // input 받기
		int maxx = -1;
		int maxy = -1;
		int[] cutY = new int[indy+2];
		int[] cutX = new int[indx+2];
		cutY[0] = 0;
		cutY[indy + 1] = ver;
		cutX[0] = 0;
		cutX[indx + 1] = hor;
		for (int i = 1; i <= indy; i++) {
			cutY[i] = cuty[i-1];
		}
		for (int i = 1; i <= indx; i++) {
			cutX[i] = cutx[i-1];
		}
		Arrays.sort(cutY);
		Arrays.sort(cutX);
		int tmp ;
		for (int i = 0; i < cutY.length - 1; i++) {
			tmp =(cutY[i+1] - cutY[i]);
			if ( tmp > maxy ){
				maxy = tmp;
			}
		}
		for (int i = 0; i < cutX.length - 1; i++) {
			tmp =(cutX[i+1] - cutX[i]);
			if ( tmp > maxx ){
				maxx = tmp;
			}
		}
		int maxArea = maxx*maxy;
		System.out.println(maxArea);
		
	
	
	}//m
}//c
