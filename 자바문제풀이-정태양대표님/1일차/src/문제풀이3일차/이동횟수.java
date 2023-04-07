package 문제풀이3일차;

import java.util.*;

// 완료
public class 이동횟수 {
	public int solution(int[] nums){
		int answer = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i: nums) list.add(i);
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size()-1; j >= 0; j--) {
				if(list.get(i)+list.get(j) > 5) {
					answer++;
					list.remove(j);
				}else if(list.get(i)+list.get(j) <= 5) {
					answer++;
					list.remove(j);
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args){
		이동횟수 T = new 이동횟수();
		System.out.println(T.solution(new int[]{2, 5, 3, 4, 2, 3}));
		System.out.println(T.solution(new int[]{2, 3, 4, 5}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3}));
	}
}
