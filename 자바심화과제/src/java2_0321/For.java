package java2_0321;

public class For {

	public static void main(String[] args) {

		int kopo11_sum = 0;		// int �ʱⰪ 0 ����
		
		for (int i = 0; i < 10; i++) {	// 0 ~ 9���� ������� ���� �ݺ��� 
			kopo11_sum = kopo11_sum + i;	// int ������ ���� ���尪 + i���� ���� ���ϱ� �Ѵ�.
		}
		System.out.printf("kopo11_sum = %d\n", kopo11_sum);	// ������ ��� ������ ����Ʈ

		for (int i = 1; i < 10; i++) {	// 1 ~ 9���� ������� ���� �ݺ��� 
			System.out.printf("***************************\n", i);	// *���
			System.out.printf("	������ %d ��\n", i);	// ������ i�� ���
			System.out.printf("***************************\n", i);	// *���
			for (int j = 1; j < 10; j++) {	// 1 ~ 9���� ������� ���� �ݺ���
				
				System.out.printf(" %d * %d = %d \n", i, j, i * j);		// i , j , i * j ���
			}
		}
	}

}