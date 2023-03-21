package java2_0320;

public class PrintfEx2 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";

		float kopo11_f1 = .10f; // 0.10 == 0.10, 1.0e-1 
		float kopo11_f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1		// e�� �ڿ� ���ڰ� ������ ���ڸ�ŭ 0�� �ٿ��ֳ�����
		float kopo11_f3 = 3.14e3f;	// 3.14e3f == 3140.0f
		double d = 1.23456789; // double Ÿ�� ������ 1.23456789 �ʱⰪ ����

		// %f - ���� �Ҽ��� �Ǽ� ��� (float)
		// %e - �ε� �Ҽ��� �Ǽ� ��� (double)
		// %g - �Ҽ��� ���� �ڸ����� ���� �Ǵ� �ε� �Ҽ������� ��� (double)
		System.out.printf("kopo11_f1 = %f, %e, %g%n", kopo11_f1, kopo11_f1, kopo11_f1);
		System.out.printf("kopo11_f2 = %f, %e, %g%n", kopo11_f2, kopo11_f2, kopo11_f2);
		System.out.printf("kopo11_f3 = %f, %e, %g%n", kopo11_f3, kopo11_f3, kopo11_f3);
		
		System.out.printf("d = %f%n", d);	// float ���·� �Ҽ��� 6�ڸ� ������ ��� 
		System.out.printf("d = %14.10f%n", d);		// ��ü 14�ڸ� �� �Ҽ��� 10�ڸ�
		
		System.out.printf("[12345678901234567890]%n");	// [12345678901234567890] ��� �� ����
		System.out.printf("[%s]%n",url);	// [www.codechobo.com] ��� �� ����
		System.out.printf("[%20s]%n",url);	// �ִ� 20�ڸ� ���� �� ������ ���� ��� �� ����
		System.out.printf("[%-20s]%n",url);	// �ִ� 20�ڸ� ���� �� ���� ���� ��� �� ����
		System.out.printf("[%.8s]%n",url);	// ���ʿ��� 8���ڸ� ���
	}

}