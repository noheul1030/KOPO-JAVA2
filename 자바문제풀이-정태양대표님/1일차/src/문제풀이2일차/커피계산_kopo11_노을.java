package ����Ǯ��2����;

import java.util.Scanner;

public class Ŀ�ǰ��_kopo11_���� {

	public static void main(String[] args) {
		int coffePay = 2000;
		int albaPay = 10000;
		int coffeMakeTime = 3;
		double money = 0.66;
		
		// 10�� -> 1�� free
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ֹ��� Ŀ�� �� ���� �Է��ϼ��� >>> ");
		
		int input = scanner.nextInt();
		System.out.println();
		
		System.out.println("*****10�� �ֹ��� 1�� ��¥!*****");
		int ���� = input/10;
		System.out.println("���� Ŀ�Ǵ� "+����+" �� �Դϴ�.");
		System.out.println();
		
		if(input < 10) {
		System.out.printf("�����Ͻ� �ݾ��� : %d ��\n",input*coffePay);
		System.out.println();
		
		int Ŀ�Ǹ���½ð� = input * coffeMakeTime;
		System.out.println("��� �ð��� "+Ŀ�Ǹ���½ð�+" �� �Դϴ�.");
		System.out.println();
		
		int �˹ٺ� = albaPay+(Ŀ�Ǹ���½ð�/60)*albaPay;
		System.out.println("�˹ٺ�� "+�˹ٺ�+" �� �Դϴ�.");
		System.out.println();
		
		int ������ = (int)((coffePay * input)*money)- �˹ٺ�;
		System.out.println("�������� "+������+" �� �Դϴ�.");
		System.out.println();
		
		}
		else if(input >= 10) {
			System.out.printf("�����Ͻ� �ݾ��� : %d ��\n",(input*coffePay)-(����*coffePay));
			System.out.println();
			
			int Ŀ�Ǹ���½ð� = input * coffeMakeTime;
			System.out.println("��� �ð��� "+Ŀ�Ǹ���½ð�+" �� �Դϴ�.");
			System.out.println();
			
			int �˹ٺ� = albaPay+(Ŀ�Ǹ���½ð�/60)*albaPay;
			System.out.println("�˹ٺ�� "+�˹ٺ�+" �� �Դϴ�.");
			System.out.println();
			
			int ������ = (int)((coffePay * input)*money)- �˹ٺ� - (int)((����*coffePay)*money);
			System.out.println("�������� "+������+" �� �Դϴ�.");
			System.out.println();
		}
	}

}
