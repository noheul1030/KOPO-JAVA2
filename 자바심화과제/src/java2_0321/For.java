package java2_0321;

public class For {

	public static void main(String[] args) {

		int kopo11_sum = 0;		// int �ʱⰪ 0 ����
		
		for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) {	// 0 ~ 9���� ������� ���� �ݺ��� 
			kopo11_sum = kopo11_sum + kopo11_i;	// int ������ ���� ���尪 + i���� ���� ���ϱ� �Ѵ�.
		}
		System.out.printf("kopo11_sum = %d\n", kopo11_sum);	// ������ ��� ������ ����Ʈ

		for (int kopo11_i = 1; kopo11_i < 10; kopo11_i++) {	// 1 ~ 9���� ������� ���� �ݺ��� 
			System.out.printf("***************************\n", kopo11_i);	// *���
			System.out.printf("	������ %d ��\n", kopo11_i);	// ������ i�� ���
			System.out.printf("***************************\n", kopo11_i);	// *���
			for (int kopo11_j = 1; kopo11_j < 10; kopo11_j++) {	// 1 ~ 9���� ������� ���� �ݺ���
				
				System.out.printf(" %d * %d = %d \n", kopo11_i, kopo11_j, kopo11_i * kopo11_j);		// i , j , i * j ���
			}
		}
	}

}
