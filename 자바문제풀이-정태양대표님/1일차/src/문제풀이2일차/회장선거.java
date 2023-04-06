package ����Ǯ��2����;

import java.util.*;

public class ȸ�弱�� {
	public String solution(String[] votes, int k) {
		String answer = " ";

		Map<String, Integer> map = new HashMap<String, Integer>(); // �����޴� ��� ���
		Map<String, Integer> map2 = new HashMap<String, Integer>(); // �л�ȸ�� ��õ ���

		// �־��� �迭�� ���̸�ŭ ���� �ݺ���
		for (int i = 0; i < votes.length; i++) {
			String[] name = votes[i].split(" ");	// ���� �������� ����
			map2.put(name[1], map2.getOrDefault(name[1], 0) + 1);	// ��õ ��ܿ� �ߺ� üũ
		}

		List<String> choice_People = new ArrayList<String>();	// �л�ȸ�� �ĺ� ���
		
		for (String key : map2.keySet()) {	// ��õ ��ܿ��� �ϳ��� ȣ��
			if (map2.get(key) >= k)		// kǥ �̻� ������
				choice_People.add(key);		// �л�ȸ�� ��Ͽ� �ø���
		}
		System.out.println("ȸ���ĺ� : " + choice_People);		// ȸ���ĺ� ����Ʈ

		// �־��� �迭�� ���̸�ŭ ���� �ݺ���
		for (int i = 0; i < votes.length; i++) {	
			String[] name = votes[i].split(" ");	// ���� �������� ����
			for (String str : choice_People) {		// �л�ȸ�� �ĺ� �ϳ��� ȣ��
				if (name[1].equals(str))	// ��ǥ�� ����̸��� �л�ȸ�� �̸��� ������
					map.put(name[0], map.getOrDefault(name[0], 0) + 1);		// �����޴� ��� ��ܿ� �ߺ� üũ
			}
		}
		
		int maxValue = Collections.max(map.values());	// �����޴� ��� ����� value �ִ밪 ����

		List<String> present_People = new ArrayList<String>();		// ���� value �ִ밪 ��� ���
		
		for (String str : map.keySet()) {		// �����޴� ��� ��� �ϳ��� ȣ��
			if (map.get(str) == maxValue)		// ���� �ִ밪�� ������
				present_People.add(str);		// value �ִ밪 ��Ͽ� �ø���
		}
		
		Collections.sort(present_People);	// ����Ʈ ����
		
		System.out.println("�������� ��� : "+ present_People.get(0));	// �̸��� ù��° ���
		
		return answer;
	}

	public static void main(String[] args) {
		ȸ�弱�� T = new ȸ�弱��();
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
