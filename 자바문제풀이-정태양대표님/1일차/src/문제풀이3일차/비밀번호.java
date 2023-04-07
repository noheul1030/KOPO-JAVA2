package 문제풀이3일차;

import java.util.*;

// 미완료
public class 비밀번호 {
	public int solution(int[] keypad, String password) {
		int answer = 0;

		HashSet<Integer> num = new HashSet<Integer>();
		for (String str : password.split("")) {
			num.add(Integer.parseInt(str));
		}
		//////////////////////////////////////////////////////////////////
		int[][] pass = new int[3][3];

		int x = 0;
		int y = 0;

		for (int i = 0; i < keypad.length; i++) {
			pass[x][y] = keypad[i];
			y++;
			if (y == pass.length) {
				x++;
				y = 0;
			}
		}

//		int[][] pass2 = new int[9][9];
//
//		int x2 = 0;
//		int y2 = 0;
//
//		for (int i = 0; i < pass2.length * pass2.length; i++) {
//			if (x2 == y2)
//				pass2[x2][y2] = 0;
//			else
//				pass2[x2][y2] = 2;
//			y2++;
//			if (y2 == pass2.length) {
//				x2++;
//				y2 = 0;
//			}
//		}

		//////////////////////////////////////////////////////////////////

		int n = pass.length;
		int[] dx = { -1, 0, 1, 0, -1, 1, 1, -1 };
		int[] dy = { 0, 1, 0, -1, 1, 1, -1, -1 };
		int xx = 0, yy = 0, count = 0;
		int d = 0;

		while (count < password.length() * password.length()) {
			for (int set : num) {
				for (int i = 0; i < pass.length; i++) {
					for (int j = 0; j < pass.length; j++) {
						
					}
				}
			}

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

		////////////////////////////////
//		int n = board.length;
//		int[] dx = { -1, 0, 1, 0 };
//		int[] dy = { 0, 1, 0, -1 };
//		int x = 0, y = 0, count = 0;
//		int d = 1;
//		while (count < k) {
//			count++;
//			int nx = x + dx[d];
//			int ny = y + dy[d];
//			if (nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1) {
//				d = (d + 1) % 4;
//				continue;
//			}
//			x = nx;
//			y = ny;
//		}
//		answer[0] = x;
//		answer[1] = y;
///////////////////////////////////////////////////////////////////

		return answer;
	}

	public static void main(String[] args) {
		비밀번호 T = new 비밀번호();
		System.out.println(T.solution(new int[] { 2, 5, 3, 7, 1, 6, 4, 9, 8 }, "7596218"));
		System.out.println(T.solution(new int[] { 1, 5, 7, 3, 2, 8, 9, 4, 6 }, "63855526592"));
		System.out.println(T.solution(new int[] { 2, 9, 3, 7, 8, 6, 4, 5, 1 }, "323254677"));
		System.out.println(T.solution(new int[] { 1, 6, 7, 3, 8, 9, 4, 5, 2 }, "3337772122"));
	}
}