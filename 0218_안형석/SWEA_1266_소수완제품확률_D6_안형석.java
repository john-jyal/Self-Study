import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1266_소수완제품확률_D6_안형석 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		final int[] prime = {2, 3, 5, 7, 11, 13, 17};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double sum = 0 ;
			double A = 0;
			double B = 0;
			for (int i = 0; i < 7; i++) {
				double prNum = prime[i];
				double comb = 1;
				double ea = 18;
				for (int j = 1; j <= prNum; j++) {
					comb *= ea --;
					comb /= j;
				}
				double proA = Math.pow(a/100, prNum);
				double antA = Math.pow((1 - a/100) , 18-prNum);
				double proB = Math.pow(b/100, prNum);
				double antB = Math.pow((1 - b/100) , 18-prNum);

				
				A += comb * proA * antA ;
				B += comb * proB * antB ;
			}
			sum += A + B - A*B;
			
			System.out.printf("#" + t + " " + "%.6f",sum);
			System.out.println();
			
		}
	}//m
}//c
