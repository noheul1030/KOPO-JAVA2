package 문제1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Problem1 pp = new Problem1();

		pp.solution(pp.pobi(), pp.crong());
	}

}

// 1. class Problem1
class Problem1 {

	// 2. 메서드들을 모아서 최종 결과값을 출력하는 메서드
	int solution(List<Integer> pobi, List<Integer> crong) {
		System.out.printf("%6s%6s%6s%6s%6s\n", "pobi", " ", "crong", " ", "result");
		int answer = Integer.MAX_VALUE;
		
		for (int i = 0; i < 1; i++) {
			if (pobi.get(i)+1 != pobi.get(i + 1) || crong.get(i) + 1 != crong.get(i + 1)) {
				answer = -1;
				System.out.println(pobi + "  " + crong + "   " + answer);
				break;
			} 
			else {
				answer = finalGame(pobi_Max(pobi), crong_Max(crong));
				System.out.println(pobi + "  " + crong + "   " + answer);
			}
		}
		return answer;
	}

//////////////////////////////////////////////////////////////////////////////////
	// 3. random값을 만드는 메서드
	int random() {

		return (int) (Math.random() * 400 + 1);
	}

//////////////////////////////////////////////////////////////////////////////////
	// 4. pobi의 리스트에 random page를 저장하는 메서드
	public List<Integer> pobi() {
		List<Integer> pobi = new ArrayList<Integer>();

		while (true) {
			int random = this.random();
			if (random == 1 || random == 2 || random == 399 || random == 400) {
				continue;
			} else {
				if (random % 2 == 0) {
					pobi.add(random - 1);
					pobi.add(random);
				} else {
					pobi.add(random);
					pobi.add(random + 1);
				}
			}
			return pobi;
		}
	}

/////////////////////////////////////////////////////////////////////////////////
	// 5. crong의 리스트에 random page를 저장하는 메서드
	public List<Integer> crong() {
		List<Integer> crong = new ArrayList<Integer>();

		while (true) {
			int random = this.random();
			if (random == 1 || random == 2 || random == 399 || random == 400) {
				continue;
			} else {
				if (random % 2 == 0) {
					crong.add(random - 1);
					crong.add(random);
				} else {
					crong.add(random);
					crong.add(random + 1);
				}
			}
			return crong;
		}
	}

/////////////////////////////////////////////////////////////////////////////////
	// 6. pobi의 리스트에 담긴 값에서 큰 수를 찾아내는 메서드
	public int pobi_Max(List<Integer> pobi) {

		int left = 0, right = 0, pobi_Max = 0;

		for (int i = 0; i < pobi.size(); i++) {
			if (i == 0)
				left = pobi.get(i);
			else
				right = pobi.get(i);
		}

		String left2 = Integer.toString(left);
		String right2 = Integer.toString(right);

		int[] sumul = { 0, 1, 0, 1 };

		for (int i = 0; i < left2.length(); i++) {
			sumul[0] += (int) left2.charAt(i) - '0';
			sumul[1] *= (int) left2.charAt(i) - '0';
		}
		for (int i = 0; i < right2.length(); i++) {
			sumul[2] += (int) right2.charAt(i) - '0';
			sumul[3] *= (int) right2.charAt(i) - '0';
		}

		for (int i = 0; i < sumul.length; i++) {
			if (pobi_Max < sumul[i]) {
				pobi_Max = sumul[i];
			}
		}

		return pobi_Max;
	}

/////////////////////////////////////////////////////////////////////////////////
	// 7. crong의 리스트에 담긴 값에서 큰 수를 찾아내는 메서드
	public int crong_Max(List<Integer> crong) {

		int left = 0, right = 0, crong_Max = 0;

		for (int i = 0; i < crong.size(); i++) {
			if (i == 0)
				left = crong.get(i);
			else
				right = crong.get(i);
		}

		String left2 = Integer.toString(left);
		String right2 = Integer.toString(right);

		int[] sumul = { 0, 1, 0, 1 };

		for (int i = 0; i < left2.length(); i++) {
			sumul[0] += (int) left2.charAt(i) - '0';
			sumul[1] *= (int) left2.charAt(i) - '0';
		}
		for (int i = 0; i < right2.length(); i++) {
			sumul[2] += (int) right2.charAt(i) - '0';
			sumul[3] *= (int) right2.charAt(i) - '0';
		}

		for (int i = 0; i < sumul.length; i++) {
			if (crong_Max < sumul[i]) {
				crong_Max = sumul[i];
			}
		}

		return crong_Max;
	}

/////////////////////////////////////////////////////////////////////////////////
	// 8. 최종 pobi와 crong의 값 비교 return
	public int finalGame(int pobi_Max, int crong_Max) {
		if (pobi_Max > crong_Max) {
			return 1;
		} else if (pobi_Max < crong_Max) {
			return 2;
		} else if (pobi_Max == crong_Max) {
			return 0;
		} else {
			return -1;
		}
	}
}
