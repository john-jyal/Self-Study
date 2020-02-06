import java.util.Scanner;

public class ����_1244_����ġ�Ѱ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] sw = new int[s+1];
		sw[0] = Integer.MIN_VALUE;
		for (int i = 1; i <= s; i++) {
			sw[i] = sc.nextInt();
			
		}
		int student = sc.nextInt();
		for (int i = 0; i < student; i++) {
			int sex = sc.nextInt();
			int ind = sc.nextInt();
			
			switch(sex) {
			case 1: // ����
				for (int j = 1; ind*j <= s; j++) {
					
					sw[ind*j] = ( sw[ind*j] + 1 ) % 2;
				}
				break;
			case 2: // ����
				int cnt =0 ;
				int next = ind + 1;
				int pre = ind - 1;
				while(next <= s && pre > 0) {
					if(sw[next] == sw[pre]) {
						cnt ++;
						next ++;
						pre --;
					} else {
						break;
					}
						
					
				}
				for (int j = ind - cnt; j <= ind + cnt; j++) {
					sw[j] = (sw[j] + 1) % 2;
				}
				
				break;
			} // switch
			
			
		}
		int pow =0 ;
		for (int i = 1; i <= s; i++) {
			System.out.print(sw[i+(20*pow)]);				
			if (i<s && i != 20) {
				System.out.print(" ");
			}
			
			if ( i >= 20 ) {
				System.out.println();
				s -= 20;
				i -= 20;
				pow ++;
			}
		}
	}//m
}//c
