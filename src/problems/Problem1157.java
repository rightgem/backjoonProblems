package problems;

import java.io.IOException;

public class Problem1157 { //왜 자꾸 틀렸다고 하지ㅠ
	public static void main(String[] args) throws IOException {
		int[] alpha = new int[26];
		for(int i = System.in.read(); i >= 'A'; i=System.in.read() ) {
			alpha[Character.toUpperCase(i) - 'A']++;
		}
		
		int index = 0;
		boolean isDup = false;
		for(int m=-1, i=0 ; i < 26 ; i++ ) {
			if(alpha[i] > m) {
				m = alpha[i];
				index = i; 
			} else if (alpha[i] == m) {
				isDup = true;
			}	
		}
		
		if(isDup) {
			System.out.println('?');
		} else {
			System.out.println( (char)(65+index) );
		}
	}
}
