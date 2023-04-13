package 문제풀이4일차;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int n = 10;
		
		for (int i = 0; i < n; i++) {
			System.out.println(Fibonacci(i) + " ");
		}

	}

	private static int Fibonacci(int n) {
		
		if(n == 0) 
			return 0;
		if(n == 1 || n == 2) 
			return 1;
		else return Fibonacci(n - 1) + Fibonacci(n - 2);
		
	}
}
