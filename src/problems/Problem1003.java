package problems;

import java.util.Scanner;

public class Problem1003 { //fibonacci(1)과 fibonacci(0)이 호출되는 수를 구할 것..
	static int zero;
	static int one;
	
	static Integer[][] dp = new Integer[41][2];
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		StringBuilder sb = new StringBuilder();
		
		while(n --> 0) {
			int N = sc.nextInt();
			fibonacci(N);
			sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
		}
		
		System.out.println(sb);
		sc.close();
	}

	static Integer[] fibonacci(int N) {
//		if(n == 0) { 
//			return 0;
//		} else if (n == 1) {
//			return 1;
//		} else {
//			return fibonacci(n-1) + fibonacci(n-2);
//		}
		if(dp[N][0] == null || dp[N][1] == null) {
			dp[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
			dp[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
		}
		
		return dp[N];
	}
}
