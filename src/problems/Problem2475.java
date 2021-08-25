package problems;

import java.util.Scanner;

public class Problem2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0, b = 0;
		
		
		while(b == 9) {
			n = sc.nextInt();
			sc.nextLine();		
			
			b++;
		}
		
		char[] nums = new char[n];
		String str = "";
		int sum = 0;
		
		for(int i : nums) {
			str.charAt(i*2);
		}
		
		System.out.println(sum%10);
	}

}
