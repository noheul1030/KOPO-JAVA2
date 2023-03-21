package java2_0320;

public class Class0320 {

	public static void main(String[] args) {
//////////////////////////////////////////
// #1. ������ ����, �翬�� ��Ģ������ ����
		int kopo11_num1; // int���� ���� kopo11_num1 ����
		kopo11_num1 = 1 + 2; // kopo11_num1�� ������ 1 + 2�� ���� ��� ����
		System.out.printf("#1-1 : %d\n", kopo11_num1); // ����Ʈ #1���� 1�� ����� ��� : 3;
		kopo11_num1 = 1 + 2 * 3; // kopo11_num1�� ������ 1 + 2 * 3�� ���� ��� ����
		System.out.printf("#1-2 : %d\n", kopo11_num1); // ����Ʈ #1���� 2�� ����� ��� : 7;
		System.out.printf("\n");	// ����
		
//////////////////////////////////////////
// #2. �����ϱ�, �ձ��ϱ�

		int kopo11_num2; // int���� ���� kopo11_num2 ����

		kopo11_num2 = 0; // kopo11_num2�� 0�� �ʱⰪ���� ����

		for (int i = 1; i < 101; i++) { // 1~100������ �ݺ��� ����
			kopo11_num2 = kopo11_num2 + i; // 0�� �ʱⰪ���� �� kopo11_num2�� 1~100���� i���� �ϳ��� �������� ���ϱ�
		}
		System.out.printf("#2-1 : %d\n", kopo11_num2); // �� ������ kopo11_num2�� �� ���
		System.out.printf("#2-2 : %d\n", kopo11_num2 / 100); // kopo11_num2�� �������� 100�� ������ ��� ���ϱ� ���

		int[] kopo11_num3 = { 1, 2, 3, 4, 5 }; // intŸ���� �迭 kopo11_num3 �� �ʱⰪ {1,2,3,4,5} ����
		int kopo11_num3_Sum; // int���� ���� kopo11_num3_Sum ����

		kopo11_num3_Sum = 0; // 0�� �ʱⰪ���� ����

		for (int i = 0; i < 5; i++) { // 0 ~ 4������ �ݺ��� ����
			kopo11_num3_Sum = kopo11_num3_Sum + kopo11_num3[i]; // int �迭���� �ִ� {1,2,3,4,5}�� ���� �ϳ��� �����ͼ� ���ϱ�
		}
		System.out.printf("#2-3 : %d\n", kopo11_num3_Sum); // kopo11_num3_Sum�� ��� ������ ���
		System.out.printf("\n");	// ����
		
////////////////////////////////////////
// #3. ������ ������ �������� ������������ ����ó��

		int kopo11_num4 = 1000 / 3; // int���� ���� kopo11_num4�� 1000/3 ����
		System.out.printf("#3-1 : %d\n", kopo11_num4);	// # 3-1 :  kopo11_num4

		kopo11_num4 = 1000 % 3; // int���� ���� kopo11_num4�� 1000%3 ����
		System.out.printf("#3-2 : %d\n", kopo11_num4);	// # 3-2 :  kopo11_num4

		for (int i = 0; i < 20; i++) { // 0 ~ 20������ �ݺ��� ����
			System.out.printf("#3-3 : %d\t", i);	// # 3-3 :  i

			if (((i + 1) % 5) == 0) { // 5�� ��¸��� ��ٲ�
				System.out.printf("\n");	// ����
			}
		}
		System.out.printf("\n");	// ����
		
////////////////////////////////////////
// #4. ���ϴ� �ڸ��� �ݿø�, ����ó��

		int kopo11_num5 = 12345; // int���� ���� kopo11_num5�� 12345 ����
		int j = (kopo11_num5 / 10) * 10; // 10�� ���� ����ó��
		System.out.printf("#4-1 : %d\n", j);	// #4-1 : j

		kopo11_num5 = 12345; // int���� ���� kopo11_num5�� 12345 ����
		j = ((kopo11_num5 + 5) / 10) * 10; // 10�� ���� �ø�ó��

		System.out.printf("#4-2 : %d\n", j);	// #4-2 : j

		kopo11_num5 = 12344; // int���� ���� kopo11_num5�� 12344 ����
		j = ((kopo11_num5 + 5) / 10) * 10; // 10�� ���� �ø�ó��

		System.out.printf("#4-3 : %d\n", j);	// #4-3 : j

		kopo11_num5 = 12345; // int���� ���� kopo11_num5�� 12345 ����
		j = ((kopo11_num5) / 100) * 100; // 100�� ���� ����ó��

		System.out.printf("#4-4 : %d\n", j);	// #4-4 : j

		kopo11_num5 = 12345; // int���� ���� kopo11_num5�� 12345 ����
		j = ((kopo11_num5 + 55) / 100) * 100; // 100�� ���� �ø�ó��

		System.out.printf("#4-5 : %d\n", j);	// #4-5 : j
		System.out.printf("\n");	// ����
		
//////////////////////////////////////////
// #5. �Ҽ��� ���Ͽ����� ��� �ұ�?

		int kopo11_num6 = 14 / 5; // int���� ���� kopo11_num6�� 14/5 ����,int���� �Ҽ������� �ڸ��� ����

		System.out.printf("#5-1 : %d\n", kopo11_num6); // #5-1 : kopo11_num6 %d ���� ���

		double kopo11_num7; // double���� ���� kopo11_num7 ����

		kopo11_num7 = 14 / 5; // double�� ������ �Ҽ����� �Է������ʾ� �Ҽ������� �ڸ� ����ó�� ��
		System.out.printf("#5-2 : %f\n", kopo11_num7);	// #5-2 : kopo11_num7	%f �Ҽ��� �ڸ� ���

		kopo11_num7 = 14.0 / 5; // double������ �Ҽ��� �Է��� �Ǿ� �Ҽ��� �ڸ����� ���OK
		System.out.printf("#5-2 : %f\n", kopo11_num7);	// #5-2 : kopo11_num7	%f �Ҽ��� �ڸ� ���

		kopo11_num7 = (14.0) / 5 + 0.5; // ��Ģ���꿡 ���� 14.0/5�� ���� ����� +0.5 ���ش�
		System.out.printf("#5-2 : %f\n", kopo11_num7);	// #5-2 : kopo11_num7	%f �Ҽ��� �ڸ� ���

		kopo11_num6 = (int) ((14.0) / 5 + 0.5); // �Ҽ��� �ڸ��� ����ó���ǹǷ� ���� 3�� ���
		System.out.printf("#5-2 : %d\n", kopo11_num6);	// #5-2 : kopo11_num6	%d ���� ���
		System.out.printf("\n");	// ����
	
	}
}