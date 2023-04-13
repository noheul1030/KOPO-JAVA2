package ����Ǯ��4����;

import java.util.*;

public class �������ϱ� {
	
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
		�������ϱ� T = new �������ϱ�();
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
 * �Է¼���
 * ù ��° �ٿ��� �ڿ��� N(3<=N<=10)�� M(2<=M<=N)�� �־����ϴ�.
 * �ι�° �ٿ� N���� �ڿ����� ������������ �־����ϴ�.
 * 
 * ��� ����
 * ù ��° �ٿ� ����� ����մϴ�.
 * ��¼����� ���������� ������������ ����մϴ�.
 */
