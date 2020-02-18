
import java.util.Scanner;

/**
 * 
 * 
 */
public class 백준_3933_라그랑주_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			int cnt = 0;
			for (int i = 1; i <= 181; i++) {

				if (i*i > num) {
					break;
				} else if (i*i == num) {
					cnt ++;
					break;
				}
				for (int j = i; j <= 181; j++) {
					
					if (i*i+j*j > num) {
						break;
					} else if (i*i+j*j == num) {
						cnt ++;
						break;
					}
					for (int k = j; k <= 181; k++) {
						
						if (i*i+j*j+k*k > num) {
							break;
						} else if (i*i+j*j+k*k == num) {
							cnt ++;
							break;
						}
						for (int l = k; l <= 181; l++) {
							
							if (i*i+j*j+k*k+l*l > num) {
								break;
							} else if (i*i+j*j+k*k+l*l == num) {
								cnt ++;
								break;
							}
							
						}
					}
				}
				
			}//for
			System.out.println(cnt);
		}//while
	}//m
}//c
