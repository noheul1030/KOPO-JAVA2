package ����Ǯ��2����;

import java.util.*;

// �Ϸ�
public class �����κм��� {
	public int solution(int[] nums, int m) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();

		int sum = 0;

		for (int i : nums)
			list.add(i);

		while (true) {
			for (int i = 0; i < list.size(); i++) {
				sum = sum + list.get(i);
				if (sum == m)
					answer++;
			}
			list.remove(0);
			sum = 0;
			if (list.size() == 0)
				break;
		}
		return answer;
	}

	public static void main(String[] args) {
		�����κм��� T = new �����κм���();
		System.out.println(T.solution(new int[] { 2, 2, 3, -1, -1, -1, 3, 1, 1 }, 5));
		System.out.println(T.solution(new int[] { 1, 2, 3, -3, 1, 2, 2, -3 }, 5));
		System.out.println(T.solution(new int[] { 1, 2, 3, -3, 1, 2 }, 3));
		System.out.println(T.solution(new int[] { -1, 0, 1 }, 0));
		System.out.println(T.solution(new int[] { -1, -1, -1, 1 }, 0));
	}
}