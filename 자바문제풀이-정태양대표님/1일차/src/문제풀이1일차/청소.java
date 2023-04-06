package 巩力钱捞1老瞒;

import java.util.*;

public class 没家 {
	 public static void main(String[] args) {
		
		没家 T2 = new 没家();
		
		int[][] arr1 = { { 0, 0, 0, 0, 0 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0 } };
		System.out.println(Arrays.toString(T2.solution(arr1, 10)));
		int[][] arr2 = { { 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1 }, { 1, 1, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
		System.out.println(Arrays.toString(T2.solution(arr2, 20)));
		int[][] arr3 = { { 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 0 } };
		System.out.println(Arrays.toString(T2.solution(arr3, 25)));

	}
	 
	 public int[] solution(int[][] board, int k) {
		int[] answer = new int[2];
//		
//		int[] x = {-1,0,1,0};
//		int[] y = {0,1,0,-1};
//		int d = 1;
//
//		for (int[] i : board) {
//			int num = 0;
//			int num2 = 0;
//			
//			if (i[num2] == 0) {
//				answer[0] = num;
//				num2++;
//				answer[1] = num2;
//			} else {
//				num++;
//				answer[0] = num;
//				
//			}
//		}

		int n = board.length;
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		int x = 0, y = 0, count = 0;
		int d = 1;
		while (count < k) {
			count++;
			int nx = x + dx[d];
			int ny = y + dy[d];
			if (nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1) {
				d = (d + 1) % 4;
				continue;
			}
			x = nx;
			y = ny;
		}
		answer[0] = x;
		answer[1] = y;

		return answer;
	}
}