package java2_2��3��;

public class Test1 {

	public static void main(String[] args) {
		
		String kopo11_s = "12345";	// String Ÿ���� kopo11_s ������ "12345" �ʱⰪ ����
		int kopo11_i = Integer.parseInt(kopo11_s);	// int Ÿ���� ������ ����ȯ
		
		System.out.printf("���ڸ� ���ڷ� %d	 (%d)\n", kopo11_i, kopo11_i+10); // ���ڷ� ��ȯ�� 12345 �� (12345+10)�� ���
		
		String kopo11_a;	// String Ÿ���� ���� kopo11_a ����
		kopo11_a = String.format("%d", kopo11_i);	// int 12345�� String���� ����ȯ
		
		System.out.printf("���ڸ� ���ڷ� %s	 (%s)\n", kopo11_a, kopo11_a+"abcde");	// String "12345"�� ("12345"+"abcde") ���

	}

	
}