package 문제풀이;

import java.util.*;
public class 같은빈도수 {
	public int[] solution(String s){
		int[] answer = new int[5];
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('a', 0);
		map.put('b', 0);
		map.put('c', 0);
		map.put('d', 0);
		map.put('e', 0);
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x,0) + 1);
		}
		
		Integer maxValue = Collections.max(map.values());
		
		int i = 0;
		for (Character key : map.keySet()) {
			answer[i] = maxValue - map.get(key);
			i++;
		}
		
		return answer;
	}

	public static void main(String[] args){
		같은빈도수 T = new 같은빈도수();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}
