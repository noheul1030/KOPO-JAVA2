package 문제풀이2일차;

import java.util.*;

// 미완료
public class 바이토닉수열 {
	public int solution(int[] nums) {
//		int answer = 0;
//		
//		int count = 0;
//
//		List<Integer> num = new ArrayList<Integer>();
//		for (int i = 1; i < nums.length-1; i++) {
//			if (i - 1 == 0)
//				num.add(nums[i - 1]);
//
//			if (nums[i - 1] == nums[i]) {
//				continue;
//			}
//			if (nums[i - 1] < nums[i]) {
//				num.add(nums[i]);
//				if (count > 0 && nums[i - 1] < nums[i]) {
//					num.clear();
//					num.add(nums[i - 1]);
//					num.add(nums[i]);
//				}
//
//			}
//			if (nums[i - 1] > nums[i]) {
//				count++;
//				num.add(nums[i]);
//
//			}
//			
//
//		}
//		answer = num.size();
//		return answer;

		////////////////////////////////////////////////////////////
		int answer = 0;

		List<Integer> peaknum = new ArrayList<Integer>();

		for (int i = 1; i < nums.length - 1; i++) {

			if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
				peaknum.add(i);
			}
		}
		for (int x : peaknum) {
			int left = x;
			int right = x;
			int cnt = 1;
			while (left - 1 >= 0 && nums[left - 1] < nums[left]) {
				left--;
				cnt++;
			}
			while (right + 1 < nums.length && nums[right] > nums[right + 1]) {
				right++;
				cnt++;
			}
			answer = Math.max(answer, cnt);

		}
		return answer;
	}

	public static void main(String[] args) {
		바이토닉수열 T = new 바이토닉수열();
		System.out.println(T.solution(new int[] { 1, 3, 2, 5, 7, 4, 2, 5, 1 }));
		System.out.println(T.solution(new int[] { 1, 1, 2, 3, 5, 7, 4, 3, 1, 2 }));
		System.out.println(T.solution(new int[] { 3, 2, 1, 3, 2, 4, 6, 7, 3, 1 }));
		System.out.println(T.solution(new int[] { 1, 3, 1, 2, 1, 5, 3, 2, 1, 1 }));
	}
}