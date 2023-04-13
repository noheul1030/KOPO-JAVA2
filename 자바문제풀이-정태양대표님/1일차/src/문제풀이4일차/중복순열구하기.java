package 문제풀이4일차;

import java.util.*;

public class 중복순열구하기 {

	static int[] pm;
	static int n, m;

	public void DFS(int L) {
		if(L == m) {
			for(int x : pm)
				System.out.println(x + " ");
			System.out.println();
		}else {
			for (int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}

	public static void main(String[] args) {
		중복순열구하기 T = new 중복순열구하기();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
	}

}

