package 문제풀이;

import java.util.*;

public class 강아지 {

	public int solution(int[][] board) {

//		int n = board.length;
//		int[] dx = { -1, 0, 1, 0 };
//		int[] dy = { 0, 1, 0, -1 };
//		int personX = 0;
//		int personY = 0;
//		int dogX = 0;
//		int dogY = 0;
//		
//		int count = 0;
//		int d1 = 0;
//		int d2 = 0;
//
//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board.length; j++) {
//				if (board[i][j] == 2) {
//					personX = i;
//					personY = j;
//				}
//				if (board[i][j] == 3) {
//					dogX = i;
//					dogY = j;
//				}
//			}
//		}
//
//		while (count < 10000) {
//			count++;
//			int personx = personX + dx[d1];
//			int persony = personY + dy[d1];
//			int dogx = dogX + dx[d2];
//			int dogy = dogY + dy[d2];
//			boolean flag1 = true, flag2 = true;
//
//			if (personx < 0 || personx >= n || persony < 0 || persony >= n || board[personx][persony] == 1) {
//				d1 = (d1 + 1) % 4;
//				flag1 = false;
//			}
//
//			if (dogx < 0 || dogx >= n || dogy < 0 || dogy >= n || board[dogx][dogy] == 1) {
//				d2 = (d2 + 1) % 4;
//				flag2 = false;
//			}
//			if(flag1 == true) {
//				personX = personx;
//				personY = persony;
//				
//			}
//			if(flag2 == true) {
//				dogX = dogx;
//				dogY = dogy;
//			}
//
//			if (dogX == personX && dogY == personY) {
//				break;
//			}
//		}
//		if(count >= 10000) return 0;{
//			return count;
//			
//		}

		int n = board.length;
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		int personX = 0;
		int personY = 0;
		int dogX = 0;
		int dogY = 0;

		int count = 0;
		int d1 = 0;
		int d2 = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 2) {
					personX = i;
					personY = j;
				}
				if (board[i][j] == 3) {
					dogX = i;
					dogY = j;
				}
			}
		}

		while (count < 10000) {
			count++;
			int personx = personX + dx[d1];
			int persony = personY + dy[d1];
			int dogx = dogX + dx[d2];
			int dogy = dogY + dy[d2];

			if (personx < 0 || personx >= n || persony < 0 || persony >= n || board[personx][persony] == 1) {
				d1 = (d1 + 1) % 4;

			} else {
				personX = personx;
				personY = persony;
			}

			if (dogx < 0 || dogx >= n || dogy < 0 || dogy >= n || board[dogx][dogy] == 1) {
				d2 = (d2 + 1) % 4;

			} else {
				dogX = dogx;
				dogY = dogy;
			}

			if (dogX == personX && dogY == personY) {
				break;
			}
		}

		return count;

	}

	public static void main(String[] args) {
		강아지 T = new 강아지();
		int[][] arr1 = { { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 2, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 3, 0, 0, 0, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 0 } };
		System.out.println(T.solution(arr1));
		int[][] arr2 = { { 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 0, 0, 2, 1 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0, 0, 0, 0, 0, 3 } };
		System.out.println(T.solution(arr2));
	}
}