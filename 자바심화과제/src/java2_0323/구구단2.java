package java2_0323;

public class ������2 {

	public static void main(String[] args) {

		for (int kopo11_i = 1; kopo11_i < 4; kopo11_i++) { // 1 ~ 9���� ������� ���� �ݺ���

			System.out.printf("*************\t*************\t*************\n", kopo11_i, kopo11_i + 1, kopo11_i + 2);
			// 3�ܾ� ��� �̹Ƿ� *****\t �ؼ� ������ ����ְ� ���������� \n���� ���� ���
			System.out.printf(" ������ %d ��\t ������ %d ��\t ������ %d ��\n", kopo11_i, (kopo11_i + 3), (kopo11_i + 6));
			// 3�ܾ� ��� ������ i�� \t i+3�� \t i+6�� \n ���� ���
			System.out.printf("*************\t*************\t*************\n", kopo11_i, kopo11_i + 1, kopo11_i + 2);
			// 3�ܾ� ��� �̹Ƿ� *****\t �ؼ� ������ ����ְ� ���������� \n���� ���� ���
			for (int kopo11_j = 1; kopo11_j < 10; kopo11_j++) { // 1 ~ 9���� ������� ���� �ݺ���

				System.out.printf(" %d * %d = %d \t", kopo11_i, kopo11_j, kopo11_i * kopo11_j);
				// i , j , i * j \t �ٰ��� ���
				System.out.printf(" %d * %d = %d \t", kopo11_i + 3, kopo11_j, (kopo11_i + 3) * kopo11_j);
				// i+1 , j , (i+3) * j \t �ٰ��� ���
				System.out.printf(" %d * %d = %d \n", kopo11_i + 6, kopo11_j, (kopo11_i + 6) * kopo11_j);
				// i+2 , j , (i+6) * j \n ���� ���
			}
		}

	}

}
