import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Sorting implements Comparable<Sorting>{
	String str;

	public Sorting(String str) {
	
		this.str = str;
	}

	@Override
	public int compareTo(Sorting o) {
		if ( this.str.length() != o.str.length()) {
			
			return this.str.length() - o.str.length();
			
		}else {
			return 0;
		}
	}
	
}
public class 백준_1181_단어정렬_S4_안형석 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		String[] tmp = new String[tc];
		String[] tmp2 = new String[tc];
		for (int i = 0; i < tc; i++) {
			tmp[i] = br.readLine();
		}
		Arrays.sort(tmp);
		int index = 1;
		tmp2[0] = tmp[0];
		for (int i = 1; i < tc; i++) {
			if (!tmp[i].equals(tmp[i-1])) {
				
				tmp2[index++] = tmp[i];
			}
		}
		Sorting[] str = new Sorting[index];
		
		
		for (int i = 0; i < index; i++) {
			str[i] = new Sorting(tmp2[i]);
		}
		
		Arrays.sort(str);
		for (int i = 0; i < index; i++) {
			System.out.println(str[i].str);
		}
	}//m
}//c
