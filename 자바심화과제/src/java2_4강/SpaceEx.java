package java2_4��;

public class SpaceEx {

	public static void main(String[] args) {
		//////////////////
		// ���� ����
		// 
		
		for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) {		// 0 ~ 9�� ���� ���� �ݺ��� 
			for (int kopo11_j = 0; kopo11_j < kopo11_i; kopo11_j++) { // 0 ~ kopo11_i�� ���� ���� �ݺ��� 
				System.out.printf(" ");	// kopo11_i �� ��ŭ ������ ��´�.
			}
			System.out.printf("%d\n",kopo11_i);	// kopo11_i �� ��� �� ����
		}

	}

}
