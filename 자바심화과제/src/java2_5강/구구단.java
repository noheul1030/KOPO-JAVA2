package java2_5��;

public class ������ {

	public static void main(String[] args) {

		for (int kopo11_i = 1; kopo11_i < 10; kopo11_i = kopo11_i + 3) { // 1 ~ 9���� ������� ���� �ݺ���

			System.out.printf("*************\t*************\t*************\n", kopo11_i, kopo11_i + 1, kopo11_i + 2);
			// 3�ܾ� ��� �̹Ƿ� *****\t �ؼ� ������ ����ְ� ���������� \n���� ���� ���
			System.out.printf(" ������ %d ��\t ������ %d ��\t ������ %d ��\n", kopo11_i, kopo11_i + 1, kopo11_i + 2);
			// 3�ܾ� ��� ������ i�� \t i+1�� \t i+2�� \n ���� ���
			System.out.printf("*************\t*************\t*************\n", kopo11_i, kopo11_i + 1, kopo11_i + 2);
			// 3�ܾ� ��� �̹Ƿ� *****\t �ؼ� ������ ����ְ� ���������� \n���� ���� ���
			for (int kopo11_j = 1; kopo11_j < 10; kopo11_j++) { // 1 ~ 9���� ������� ���� �ݺ���

				System.out.printf(" %d * %d = %d \t", kopo11_i, kopo11_j, kopo11_i * kopo11_j);
				// i , j , i * j \t �ٰ��� ���
				System.out.printf(" %d * %d = %d \t", kopo11_i + 1, kopo11_j, (kopo11_i + 1) * kopo11_j);
				// i+1 , j , (i+1) * j \t �ٰ��� ���
				System.out.printf(" %d * %d = %d \n", kopo11_i + 2, kopo11_j, (kopo11_i + 2) * kopo11_j);
				// i+2 , j , (i+2) * j \n ���� ���
			}
		}

	}

}
