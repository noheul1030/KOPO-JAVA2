package 문제풀이1일차;

import java.util.*;

// 완료
public class 타이타닉 {
	public int solution(int[] nums, int m){
		int answer = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i: nums) list.add(i);
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size()-1; j >= 0; j--) {
				if(list.get(i)+list.get(j) > m) {
					answer++;
					list.remove(j);
				}else if(list.get(i)+list.get(j) <= m) {
					answer++;
					list.remove(j);
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args){
		타이타닉 T = new 타이타닉();
		System.out.println(T.solution(new int[]{90, 50, 70, 100, 60}, 140));
		System.out.println(T.solution(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 100));
		System.out.println(T.solution(new int[]{68, 72, 30, 105, 55, 115, 36, 67, 119, 111, 95, 24, 25, 80, 55, 85, 75, 83, 21, 81}, 120));
	}
}
