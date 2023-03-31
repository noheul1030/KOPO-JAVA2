package 문제풀이;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class 최초문자 {
	public int solution(String s) {
//		HashMap<Character, Integer> map = new HashMap<>();
//		for(char x : s.toCharArray()) {
//			map.put(x, map.getOrDefault(x,0) + 1);
//		}
//		for (int i = 0; i < s.length(); i++) {
//			if(map.get(s.charAt(i)) == 1) return i+1;
//		}
//		return -1;
		
		int answer = 0;
		char[] str = new char[s.length()];
		for (int i = 0; i < s.length(); i++) str[i] = s.charAt(i);
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character key : str)map.put(key, map.getOrDefault(key, 0) + 1);
		for (Character key : map.keySet()) {
			if(map.get(key) == 1) {
				answer = s.indexOf(key);
				return answer+1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		최초문자 T = new 최초문자();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}
