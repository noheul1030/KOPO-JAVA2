package java2_0320;

public class CastingEx3 {

	public static void main(String[] args) {
		float kopo11_f = 9.1234567f;	// float Ÿ�� 9.1234567f �ʱⰪ ����
		double kopo11_d = 9.1234567;	// double Ÿ�� 9.1234567f �ʱⰪ ����
		double kopo11_d2 = (double)kopo11_f;	// float�� double Ÿ������ �� ��ȯ ����
		
		// %20.18f = �Ҽ��� ���� �ִ� 18�ڸ��� float ���·� ���
		// float�� ���е��� 7�̿��� 7�ڸ����� ��Ȯ ���� ���ڴ� �ǹ̾��� ����
		// double�� ���е��� 15 ���� 15�ڸ����� ��Ȯ! 
		System.out.printf("kopo11_f = %20.18f\n", kopo11_f);	
		System.out.printf("kopo11_d = %20.18f\n", kopo11_d);
		System.out.printf("kopo11_d2 = %20.18f\n", kopo11_d2);

	}

}
