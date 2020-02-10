import java.util.Scanner;

public class SWEA_Solution_1233_사칙연산유효성검사_D4_안형석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t <= 10; t++) {
			int res = 1;
			int index =0 ;
			boolean done = false;
			int node =sc.nextInt();
			if(node%2 == 1) {
				int e = node/2;
				char[] tree = new char[node+1];
				for (int i = 1; i <= e ; i++) {
					index = sc.nextInt();
					char ch = sc.next().charAt(0);
					sc.next();
					sc.next();
					if(ch != '*' && ch != '+' && ch != '-' && ch != '/' ) {
						res = 0;
						done = true;
						break;
					}
					tree[index] = ch;
					
				}
				if(done) {
					sc.nextLine();
					for (int i = index+1; i <= node; i++) {
						sc.nextLine();
						
					}
				} else {
					for (int j = e+1; j <= node; j++) {
						index = sc.nextInt();
						
						char ch = sc.next().charAt(0);
						if(ch == '*' ||ch == '+' ||ch == '-' ||ch == '/' ) {
							res = 0;
							done = true;
							break;
						} 
						tree[index] = ch;
						
					}
					if(done) {
						for (int i = index+1; i <= node; i++) {
							sc.next();
							sc.next();
							
						}
					}
					
				}
					
					
				
				////입력 다받음
				
				
			} else {
				sc.nextLine();
				res = 0;
				for (int i = 0; i < node; i++) {
					sc.nextLine();
				}
			}
			
			
			System.out.println("#"+t+" "+ res);
		}//t
	}//m
}//c
