import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * 
[input]
10
1 4 1 6 6 10 5 7 3 8 5 9 3 5 8 11 2 13 12 14
 */
class Time implements Comparable<Time>{
	int start;
	int end ;
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public int compareTo(Time o) {
		
		return this.end - o.end;
	}
	
	
}
public class 회의실문제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Time[] time = new Time[n];
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			time[i] = new Time(a,b);
			
		}
		Arrays.sort(time);
		int start = -1;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if(start < time[i].start) {
				cnt ++;
				start = time[i].end;
				
			}
		}
		System.out.println(cnt);
		
		
	
	}//m
}//c
