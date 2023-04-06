package 문제풀이2일차;

import java.util.*;

public class 회장선거 {
	public String solution(String[] votes, int k) {
		String answer = " ";

		Map<String, Integer> map = new HashMap<String, Integer>(); // 선물받는 사람 명단
		Map<String, Integer> map2 = new HashMap<String, Integer>(); // 학생회장 추천 명단

		// 주어진 배열의 길이만큼 도는 반복문
		for (int i = 0; i < votes.length; i++) {
			String[] name = votes[i].split(" ");	// 띄어쓰기 기준으로 나눔
			map2.put(name[1], map2.getOrDefault(name[1], 0) + 1);	// 추천 명단에 중복 체크
		}

		List<String> choice_People = new ArrayList<String>();	// 학생회장 후보 목록
		
		for (String key : map2.keySet()) {	// 추천 명단에서 하나씩 호출
			if (map2.get(key) >= k)		// k표 이상 받으면
				choice_People.add(key);		// 학생회장 목록에 올리기
		}
		System.out.println("회장후보 : " + choice_People);		// 회장후보 프린트

		// 주어진 배열의 길이만큼 도는 반복문
		for (int i = 0; i < votes.length; i++) {	
			String[] name = votes[i].split(" ");	// 띄어쓰기 기준으로 나눔
			for (String str : choice_People) {		// 학생회장 후보 하나씩 호출
				if (name[1].equals(str))	// 투표한 사람이름과 학생회장 이름이 같으면
					map.put(name[0], map.getOrDefault(name[0], 0) + 1);		// 선물받는 사람 명단에 중복 체크
			}
		}
		
		int maxValue = Collections.max(map.values());	// 선물받는 사람 명단중 value 최대값 저장

		List<String> present_People = new ArrayList<String>();		// 선물 value 최대값 사람 목록
		
		for (String str : map.keySet()) {		// 선물받는 사람 명단 하나씩 호출
			if (map.get(str) == maxValue)		// 선물 최대값과 같으면
				present_People.add(str);		// value 최대값 목록에 올리기
		}
		
		Collections.sort(present_People);	// 리스트 정렬
		
		System.out.println("선물받을 사람 : "+ present_People.get(0));	// 이름순 첫번째 출력
		
		return answer;
	}

	public static void main(String[] args) {
		회장선거 T = new 회장선거();
		System.out.println(T.solution(
				new String[] { "john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john" }, 2));
		System.out.println(T.solution(new String[] { "john tom", "park luis", "john luis", "luis tom", "park tom",
				"luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis" }, 2));
		System.out.println(T.solution(new String[] { "cody tom", "john tom", "cody luis", "daniel luis", "john luis",
				"luis tom", "daniel tom", "luis john" }, 2));
		System.out.println(T.solution(new String[] { "bob tom", "bob park", "park bob", "luis park", "daniel luis",
				"luis bob", "park luis", "tom bob", "tom luis", "john park", "park john" }, 3));
	}
}
