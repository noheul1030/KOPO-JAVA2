package java2_4��;

public class Test {

	public static void main(String[] args) {

		////////////////////////////////////////
		// ������ �־ ã�� //
		int kopo11_iVal; // intŸ�� ���� ����

		for (int kopo11_i = 0; kopo11_i < 300; kopo11_i++) { // 0 ~ 299 ���� ���� �ݺ���

			kopo11_iVal = 5 * kopo11_i; // 5 * i �� ���� ������ ����

			// iVal�� ���� 0�� ���ų� ũ�� '�׸���' 10���ٴ� ������ "�� = �� ���"
			if (kopo11_iVal >= 0 && kopo11_iVal < 10)
				System.out.printf("�� = %d\n", kopo11_iVal);

			// iVal�� ���� 10�� ���ų� ũ�� '�׸���' 100���ٴ� ������ "�� = �� ���"
			else if (kopo11_iVal >= 10 && kopo11_iVal < 100)
				System.out.printf("�� = %d\n", kopo11_iVal);

			// iVal�� ���� 100�� ���ų� ũ�� '�׸���' 1000���ٴ� ������ "�� = �� ���"
			else if (kopo11_iVal >= 100 && kopo11_iVal < 1000)
				System.out.printf("�� = %d\n", kopo11_iVal);

			// ���ǿ� ���� �� ���� ���� ������ "õ = �� ���" 
			else System.out.printf("õ %d\n", kopo11_iVal);
		}

//		
//		
//		
//		

		for (int kopo11_i = 1; kopo11_i < 13; kopo11_i++) { // 1 ~ 12 ���� ���� �ݺ���
			System.out.printf(" %d�� =>", kopo11_i); // i�� ���
			for (int kopo11_j = 1; kopo11_j < 32; kopo11_j++) { // // 1 ~ 32 ���� ���� �ݺ���
				System.out.printf("%d", kopo11_j); // j �ϼ� ���

				if (true) { // if �� ���� ������ true�� �Ǹ�
					if (kopo11_i == 1 && kopo11_j == 31) {
						break; // i�� 1�϶� j�� 31 �̸� break;
					}
					if (kopo11_i == 2 && kopo11_j == 28) {
						break; // i�� 2�϶� j�� 28 �̸� break;
					}
					if (kopo11_i == 3 && kopo11_j == 31) {
						break; // i�� 3�϶� j�� 31 �̸� break;
					}
					if (kopo11_i == 4 && kopo11_j == 30) {
						break; // i�� 4�϶� j�� 30 �̸� break;
					}
					if (kopo11_i == 5 && kopo11_j == 31) {
						break; // i�� 5�϶� j�� 31 �̸� break;
					}
					if (kopo11_i == 6 && kopo11_j == 30) {
						break; // i�� 6�϶� j�� 30 �̸� break;
					}
					if (kopo11_i == 7 && kopo11_j == 31) {
						break; // i�� 7�϶� j�� 31 �̸� break;
					}
					if (kopo11_i == 8 && kopo11_j == 31) {
						break; // i�� 8�϶� j�� 31 �̸� break;
					}
					if (kopo11_i == 9 && kopo11_j == 30) {
						break; // i�� 9�϶� j�� 30 �̸� break;
					}
					if (kopo11_i == 10 && kopo11_j == 31) {
						break; // i�� 10�϶� j�� 31 �̸� break;
					}
					if (kopo11_i == 11 && kopo11_j == 30) {
						break; // i�� 11�϶� j�� 30 �̸� break;
					}
					if (kopo11_i == 12 && kopo11_j == 31) {
						break; // i�� 12�϶� j�� 31 �̸� break;
					}
					System.out.printf(",", ""); // ",","" �������� �޸��� ���� �ʰ� ���
				}
			}
			System.out.printf("\n"); // ����
			System.out.printf("\n"); // ����
		}

//		
//		
//		
//	
		for (int kpo11_i = 1; kpo11_i < 13; kpo11_i++) { // 1 ~ 12 ���� ���� �ݺ���
			System.out.printf(" %d�� =>", kpo11_i); // i�� ���
			for (int kopo11_j = 1; kopo11_j < 32; kopo11_j++) { // 1 ~ 32 ���� ���� �ݺ���
				System.out.printf("%d", kopo11_j); // j �ϼ� ���

				if (true) {
					// i�� 4 �Ǵ� 6 �Ǵ� 9 �Ǵ� 7 �Ǵ� 11�϶�
					if (kpo11_i == 4 || kpo11_i == 6 || kpo11_i == 9 || kpo11_i == 7 || kpo11_i == 11) {
						if (kopo11_j == 30) // j�� 30 �̸�
							break; // break;
					}
					if (kpo11_i == 2) { // i�� 2 �̰�
						if (kopo11_j == 28)
							break; // j�� 28�� ������ break;
					} else if (kopo11_j == 31) // �� �� j�� 31 �̸�
						break; // break;
					System.out.printf(",", ""); // ",","" �������� �޸��� ���� �ʰ� ���
				}
			}
			System.out.printf("\n"); // ����
		}

//		
//		
//		
		for (int kopo11_i = 1; kopo11_i < 13; kopo11_i++) { // 1 ~ 12 ���� ���� �ݺ���
			System.out.printf(" %d�� =>", kopo11_i); // i�� ���
			LOOP: for (int kopo11_j = 1; kopo11_j < 32; kopo11_j++) { // 1 ~ 32 ���� ���� �ݺ���

				System.out.printf("%d,", kopo11_j); // j �ϼ� ���

				switch (kopo11_i) { // i �� �ϳ��� ���ö� ���� ����ġ
				case 4:
				case 6:
				case 9:
				case 7:
				case 11: // i�� 4 �Ǵ� 6 �Ǵ� 9 �Ǵ� 7 �Ǵ� 11�϶�
					if (kopo11_j == 30)
						break LOOP; // j�� 30�̸� LOOP break;
					break;
				case 2: // i�� 2 �̰�
					if (kopo11_j == 28)
						break LOOP; // j�� 28�� ������ break;F
					break;
				}
			}
			System.out.printf("\n"); // ����
		}
		System.out.printf("\n"); // ����
//		
//		
//		
//		
		// int �迭�� {31,28,31,30,31,30,31,31,30,31,30,31} �ʱⰪ ����
		int[] kopo11_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int kopo11_i = 1; kopo11_i < 13; kopo11_i++) { // 1 ~ 12 ���� ���� �ݺ���
			System.out.printf(" %d�� =>", kopo11_i); // i�� ���
			for (int j = 1; j < 32; j++) { // 1 ~ 32 ���� ���� �ݺ���
				System.out.printf("%d", j); // j �ϼ� ���

				if (kopo11_iLMD[kopo11_i - 1] == j)
					break; // iLMe�� i-1��°�� j�� ������ break;

				System.out.printf(","); // ������ �޸� �����
			}
			System.out.printf("\n"); // ����
		}
	}

}