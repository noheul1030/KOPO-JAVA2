package java2_2��3��;

public class CastingEx4 {

	public static void main(String[] args) {
		int kopo11_i = 91234567; // 8�ڸ��� 10 ����
		float kopo11_f = (float) kopo11_i; // int�� float�� ����ȯ -> 91234568.000000
		int kopo11_i2 = (int) kopo11_f; // float�� �ٽ� int�� ����ȯ -> 91234568

		double kopo11_d = (double) kopo11_i; // int�� double�� ����ȯ -> 91234567.000000
		int kopo11_i3 = (int) kopo11_d; // double�� int�� �ٽ� ����ȯ	-> 91234567

		float kopo11_f2 = 1.666f; // float ���� 1.666f �ʱⰪ ����
		int kopo11_i4 = (int) kopo11_f2; // int�� float�� ����ȯ

		System.out.printf("kopo11_i = %d\n", kopo11_i);		// ���� 91234567 ���
		System.out.printf("kopo11_f = %f kopo11_i2 = %d\n", kopo11_f, kopo11_i2);	// float���� 91234568.000000, ���� 91234568 ���
		System.out.printf("kopo11_d = %f kopo11_i3 = %d\n", kopo11_d, kopo11_i3);	// double���� 91234567.000000, ���� 91234567 ���
		System.out.printf("(int)%f = %d\n", kopo11_f2, kopo11_i4);	// float���� 1.666000, (int)�� ����ȯ�� �Ҽ��� ���� 1 ���
	}

}