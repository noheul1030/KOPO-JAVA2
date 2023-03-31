package 문제풀이;

import java.util.*;

class Solution {
	public char[] solution(int n, int[][] ladder) {
		char[] answer = new char[n];
		char A;

		for (int i = 0; i < n; i++) {
			answer[i] = (char) (i + 65);
		}

		for (int[] ld : ladder) {
			for (int i : ld) {
				A = answer[i];
				answer[i] = answer[i - 1];
				answer[i - 1] = A;
			}
		}
		return answer;
	}

	 public static void main(String[] args) {
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(5, new int[][] { { 1, 3 }, { 2, 4 }, { 1, 4 } })));
		System.out.println(Arrays.toString(T.solution(7, new int[][] { { 1, 3, 5 }, { 1, 3, 6 }, { 2, 4 } })));
		System.out.println(
				Arrays.toString(T.solution(8, new int[][] { { 1, 5 }, { 2, 4, 7 }, { 1, 5, 7 }, { 2, 5, 7 } })));
		System.out.println(Arrays.toString(T.solution(12,
				new int[][] { { 1, 5, 8, 10 }, { 2, 4, 7 }, { 1, 5, 7, 9, 11 }, { 2, 5, 7, 10 }, { 3, 6, 8, 11 } })));
	}
}
