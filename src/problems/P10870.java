package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P10870 {
	static long[] arr;
	public static void main(String[] args) throws IOException { //동적계획법
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new long[n + 1];
		
		for(int i = 0; i < n+1; i++) {
			arr[i] = -1;
		}
		
		arr[0]=0;
		arr[1]=1;
		
		System.out.println(fibonacci(n));
	}
	
	public static long fibonacci(int n) {
		if(arr[n] == -1) {
			arr[n] = fibonacci(n-1) + fibonacci(n-2);
		}
		
		return arr[n];
	}
}
