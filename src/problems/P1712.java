package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1712 {
	public static void main(String[] args) {
		/*
		 * nc = a + nb
		 * n(c-b) = a
		 * n = a / (c-b) -> ������ �������� ����
		 * ��n + 1 = ( a / (c-b) ) + 1 -> ���ͺб��� 
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		int a = 0, b = 0, c = 0;
		try {
			st = new StringTokenizer(br.readLine());
			
			//a: �������, b: �������, c: ��ǰ ����
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(c <= b) {
			System.out.println("-1");
		} else {
			System.out.println( (a/(c-b))+1 );
		}		
	}
}
