package java2_6��;

public class �޼ҵ�_�����ε� {

	public static void main(String[] args) {
		methodOverloading kopo11_method = new methodOverloading(); // Ŭ���� ��ü ����
		for (int kopo11_i = 3; kopo11_i <= 5; kopo11_i++) { // 3�� ���� �ݺ���
			System.out.printf("%s�� ����ǥ\n", kopo11_i); // String ��� ����
			kopo11_method.kopo11_print(); // print �޼ҵ� ����

			int kopo11_���� = 100; // int ������ 100 �ʱⰪ ����
			int kopo11_���� = 100; // int ������ 100 �ʱⰪ ����
			int kopo11_���� = 100; // int ������ 100 �ʱⰪ ����
			int kopo11_���� = 100; // int ������ 100 �ʱⰪ ����
			int kopo11_��ȸ = 100; // int ������ 100 �ʱⰪ ����

			if (kopo11_i == 3) { // i�� 3�϶�
				System.out.printf("%s%5s%5s%5s%5s%5s\n", "�̸�", "����", "����", "����", "����", "���"); // String ��� ����
				kopo11_method.kopo11_print(); // print �޼ҵ� ����
				
				// ���� �� ��� ����
				System.out.printf("%s%5d%6d%7d%7d%7d\n", kopo11_method.kopo11_name(), kopo11_����, kopo11_����, kopo11_����,
						(int) kopo11_method.kopo11_sum(kopo11_����, kopo11_����, kopo11_����), (int) kopo11_method
								.kopo11_ave(kopo11_method.kopo11_sum(kopo11_����, kopo11_����, kopo11_����), kopo11_i)); 
				System.out.printf("\n"); // ����
			}
			if (kopo11_i == 4) { // i�� 4�϶�
				System.out.printf("%s%5s%5s%5s%5s%5s%5s\n", "�̸�", "����", "����", "����", "����", "����", "���"); // String ��� ����
				kopo11_method.kopo11_print(); // print �޼ҵ� ����
				
				// ���� �� ��� ����
				System.out.printf("%s%5d%6d%7d%7d%7d%4s%.1f\n", kopo11_method.kopo11_name(), kopo11_����, kopo11_����,
						kopo11_����, kopo11_����,
						(int) kopo11_method.kopo11_sum(kopo11_����, kopo11_����, kopo11_����, kopo11_����), "",
						(double) kopo11_method.kopo11_sum(kopo11_����, kopo11_����, kopo11_����, kopo11_����) / kopo11_i); 
				System.out.printf("\n"); // ����

			}
			if (kopo11_i == 5) { // i�� 5�϶�
				// String ��� ����
				System.out.printf("%s%5s%5s%5s%5s%5s%5s%5s\n", "�̸�", "����", "����", "����", "����", "��ȸ", "����", "���"); 
				
				kopo11_method.kopo11_print(); // print �޼ҵ� ����

				// ���� �� ��� ����
				System.out.printf("%s%5d%6d%7d%7d%7d%7d%4s%.1f\n", kopo11_method.kopo11_name(), kopo11_����, kopo11_����,
						kopo11_����, kopo11_����, kopo11_��ȸ,
						(int) kopo11_method.kopo11_sum(kopo11_����, kopo11_����, kopo11_����, kopo11_����, kopo11_��ȸ), "",
						(double) kopo11_method.kopo11_sum(kopo11_����, kopo11_����, kopo11_����, kopo11_����, kopo11_��ȸ)
								/ kopo11_i); 
				System.out.printf("\n"); // ����

			}
		}

	}

}

class methodOverloading { // Ŭ����
	public String kopo11_name() { // String return �޼���
		return "������";
	}

	public int kopo11_sum(int kopo11_a, int kopo11_b, int kopo11_c) { // int return �Ķ���� 3���޴� �޼���

		return kopo11_a + kopo11_b + kopo11_c; // a + b + c ����
	}

	public int kopo11_sum(int kopo11_a, int kopo11_b, int kopo11_c, int kopo11_d) { // int return �Ķ���� 4���޴� �޼���
		return kopo11_a + kopo11_b + kopo11_c + kopo11_d; // a + b + c + d �� ����
	}

	public int kopo11_sum(int kopo11_a, int kopo11_b, int kopo11_c, int kopo11_d, int kopo11_e) { // int return �Ķ����
																									// 5���޴� �޼���
		return kopo11_a + kopo11_b + kopo11_c + kopo11_d + kopo11_e; // a + b + c + d + e�� ����
	}

	public double kopo11_ave(double kopo11_a, double kopo11_b) { // double return�Ķ���� 2���޴� �޼���
		return kopo11_a / kopo11_b; // a / b �� ����
	}

	public void kopo11_print() { // print �޼���
		System.out.printf("==========================================================\n");
	}
}