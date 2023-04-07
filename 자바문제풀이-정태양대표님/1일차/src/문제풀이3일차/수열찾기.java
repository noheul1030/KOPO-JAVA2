package ����Ǯ��3����;

import java.util.*;

// �Ϸ�
public class ����ã�� {
	public int[] solution(int[] nums) {
		int[] answer = new int[nums.length / 2];

		List<Integer> list = new ArrayList<Integer>();

		for (int i : nums)
			list.add(i);

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++)
			for (int j = 0; j < list.size(); j++)
				if (list.get(i) * 2 == list.get(j)) {
					answer[i] = list.get(i);
					list.remove(j);
				}

		return answer;
	}

	public static void main(String[] args) {
		����ã�� T = new ����ã��();
		System.out.println(Arrays.toString(T.solution(new int[] { 1, 10, 2, 3, 5, 6 })));
		System.out.println(Arrays.toString(T.solution(new int[] { 1, 1, 6, 2, 2, 7, 3, 14 })));
		System.out.println(Arrays.toString(T.solution(new int[] { 14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14 })));
	}
}
