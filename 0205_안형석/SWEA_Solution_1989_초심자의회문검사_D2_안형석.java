import java.util.Scanner;

public class SWEA_Solution_1989_�ʽ�����ȸ���˻�_D2_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int ans = 1;
			String str = sc.next();
			for (int i = 0; i < (str.length()/2); i++) {
				if(str.charAt(i) != str.charAt(str.length()-i-1)) {
					ans = 0;
					break;
				}
			}
			System.out.println("#"+t+ " "+ ans);
			
			
			
		}//t
	}//m
}//c
