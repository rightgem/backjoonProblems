package problems;

import java.util.Scanner;

public class Problem1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a;
		a = sc.nextLine();
		
		System.out.println("입력값 >> " + a);
		String[] ary = a.split(" ");	
		int i, num = 0;
		for( i = 0 ; i < ary.length; i++ ) {
			if(ary[i].equals(" ") || ary[i].equals(null) || ary[i].equals("")) {
				num--;
			}
			num++;
		}
		
		System.out.println(num);
	}
}
