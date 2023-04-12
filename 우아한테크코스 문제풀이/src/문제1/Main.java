package ����1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Problem1 pp = new Problem1();

		pp.solution(pp.pobi, pp.crong);
	}

}
// 1. class Problem1
class Problem1 {
	List<Integer> pobi = new ArrayList<Integer>();
	List<Integer> crong = new ArrayList<Integer>();
	
	// 2. �޼������ ��Ƽ� ���� ������� ����ϴ� �޼���
	int solution(List<Integer> pobi, List<Integer> crong) {
		pobi();
		crong();
		
		int answer = finalGame(pobi_Max(), crong_Max());

		return answer;
	}

//////////////////////////////////////////////////////////////////////////////////
	// 3. random���� ����� �޼���
	int random() {

		return (int) (Math.random() * 400 + 1);
	}

//////////////////////////////////////////////////////////////////////////////////
	// 4. pobi�� ����Ʈ�� random page�� �����ϴ� �޼���
	public void pobi() {
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
				break;
			}
		}
	}

/////////////////////////////////////////////////////////////////////////////////
	// 5. crong�� ����Ʈ�� random page�� �����ϴ� �޼���
	public void crong() {
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
				break;
			}
		}
	}

/////////////////////////////////////////////////////////////////////////////////
	// 6. pobi�� ����Ʈ�� ��� ������ ū ���� ã�Ƴ��� �޼���
	public int pobi_Max() {
		int left = 0, right = 0, pobi_Max = 0;

		for (int i = 0; i < pobi.size(); i++) {
			if (i == 0) 
				left = pobi.get(i);
			else 
				right = pobi.get(i);
		}
		
		String left2 = Integer.toString(left);
		String right2 = Integer.toString(right);
		
		int[] sumul = {0,1,0,1};
		
		for (int i = 0; i < left2.length(); i++) {
			sumul[0] += (int)left2.charAt(i)-'0';
			sumul[1] *= (int)left2.charAt(i)-'0';
		}
		for (int i = 0; i < right2.length(); i++) {
			sumul[2] += (int)right2.charAt(i)-'0';
			sumul[3] *= (int)right2.charAt(i)-'0';
		}
		
		for (int i = 0; i < sumul.length; i++) {
			if(pobi_Max < sumul[i]) {
				pobi_Max = sumul[i];
			}
		}

		return pobi_Max;
	}
/////////////////////////////////////////////////////////////////////////////////
	// 7. crong�� ����Ʈ�� ��� ������ ū ���� ã�Ƴ��� �޼���
	public int crong_Max() {
		int left = 0, right = 0, crong_Max = 0;
		
		for (int i = 0; i < crong.size(); i++) {
			if (i == 0) 
				left = crong.get(i);
			else 
				right = crong.get(i);
		}
		
		String left2 = Integer.toString(left);
		String right2 = Integer.toString(right);
		
		int[] sumul = {0,1,0,1};
		
		for (int i = 0; i < left2.length(); i++) {
			sumul[0] += (int)left2.charAt(i)-'0';
			sumul[1] *= (int)left2.charAt(i)-'0';
		}
		for (int i = 0; i < right2.length(); i++) {
			sumul[2] += (int)right2.charAt(i)-'0';
			sumul[3] *= (int)right2.charAt(i)-'0';
		}
		
		for (int i = 0; i < sumul.length; i++) {
			if(crong_Max < sumul[i]) {
				crong_Max = sumul[i];
			}
		}
		
		return crong_Max;
	}
/////////////////////////////////////////////////////////////////////////////////
	// 8. ���� pobi�� crong�� �� �� return
	public int finalGame(int pobi_Max,int crong_Max) {
		if(pobi_Max > crong_Max) {
			return 1;
		}else if(pobi_Max < crong_Max) {
			return 2;
		}else if(pobi_Max == crong_Max) {
			return 0;
		}else {
			return -1;
		}
	}
}
























