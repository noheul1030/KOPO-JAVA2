package java2_4��;

public class ����� {

	public static void main(String[] args) {
		
		int kopo11_n, kopo11_m;	// intŸ���� n,m���� ����

		kopo11_m = 20;	// m������ 20 �ʱⰪ ����
		kopo11_n = 1;	// n������ 1 �ʱⰪ ����

		while(true) {	// true�϶� �ݺ����� ���� while��
			
			for (int kopo11_i = 0; kopo11_i < kopo11_m; kopo11_i++) System.out.printf(" ");	// 0 ~ m ��ŭ �ݺ����� ���� " "������ ���
			for (int kopo11_i = 0; kopo11_i < kopo11_n; kopo11_i++) System.out.printf("*");	// 0 ~ n ��ŭ �ݺ����� ���� "*"�� ���
			System.out.printf("\n");	// ����
			
			kopo11_m = kopo11_m-1;	// m ������ m-1�� ����
			kopo11_n = kopo11_n+2;	// n ������ n+2�� ����
			
			if (kopo11_m < 0) break;	// m������ ���� 0�̵Ǹ� break;
		}
	}

}
