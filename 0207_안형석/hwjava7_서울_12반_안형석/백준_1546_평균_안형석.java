import java.util.Arrays;
import java.util.Scanner;

public class 백준_1546_평균_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] arr = new float[n];
		float max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				
			}
		}
		float avg = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]*100 / max ;
			avg += arr[i];
		}
		avg /= (float) n ;
		System.out.println(avg);
	}//m
}//c
