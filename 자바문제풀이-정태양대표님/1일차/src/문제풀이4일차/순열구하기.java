package 문제풀이4일차;

import java.util.*;

public class 순열구하기 {
	
	static int[] pm, ch, arr;
	static int n, m;
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm)
				System.out.println(x + " ");
			System.out.println();
		}else {
			for (int i = 0; i <= n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		순열구하기 T = new 순열구하기();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
		ch = new int [n];
		pm = new int [m];
		T.DFS(0);
	}
}


/*
 * 입력설명
 * 첫 번째 줄에서 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
 * 두번째 줄에 N개의 자연수가 오름차순으로 주어집니다.
 * 
 * 출력 설명
 * 첫 번째 줄에 결과를 출력합니다.
 * 출력순서는 사전순으로 오름차순으로 출력합니다.
 */
