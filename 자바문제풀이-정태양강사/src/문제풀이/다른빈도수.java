package ����Ǯ��;

import java.util.*;
public class �ٸ��󵵼� {
	public int solution(String s){
		int answer = 0;
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x,0) + 1);
		}
		System.out.println(map);
		System.out.println();
		
		for (int i = 0; i < map.size(); i++) {
			
		}
		
		
		
		
		return answer;
	}

	public static void main(String[] args){
		�ٸ��󵵼� T = new �ٸ��󵵼�();
		System.out.println(T.solution("aaabbbcc"));	
		System.out.println(T.solution("aaabbc"));	
		System.out.println(T.solution("aebbbbc"));	
		System.out.println(T.solution("aaabbbcccde"));	
		System.out.println(T.solution("aaabbbcccdddeeeeeff"));	
	}
}