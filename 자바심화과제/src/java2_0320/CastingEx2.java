package java2_0320;

public class CastingEx2 {

	public static void main(String[] args) {
		int kopo11_i = 10;	// int Ÿ�� 10 �ʱⰪ ����
		byte kopo11_b = (byte) kopo11_i;	//(byte)�� ����ȯ�Ͽ�10 ����

		System.out.printf("[int -> byte] i = %d -> b = %d%n", kopo11_i, kopo11_b); // i = 10, b = 10 ���
		
		kopo11_i = 300;	// 300 ����
		kopo11_b = (byte)kopo11_i; // (byte)�� ����ȯ�Ͽ� 300 ����
		System.out.printf("[int -> byte] i = %d -> b = %d%n", kopo11_i, kopo11_b);	 // i = 300, b = byte ũ�� �ʰ��ؼ� �� �ҽ�!
		
		kopo11_b = 10;	// 10 ����
		kopo11_i = (int)kopo11_b;	// (int)�� ����ȯ�Ͽ� 10 ����
		System.out.printf("[int -> byte] b = %d -> i = %d%n", kopo11_b, kopo11_i);	 // b = 10, i = 10 ���
		
		kopo11_b = -2;	// -2 ����
		kopo11_i = (int)kopo11_b;	// (int)�� ����ȯ�Ͽ� -2 ����
		System.out.printf("[int -> byte] b = %d -> i = %d%n", kopo11_b, kopo11_i);	// b = -2, i = -2 ���
		
		// toBinaryString() -> 10������ 2����String ���� ��ȯ
		System.out.println("i = "+ Integer.toBinaryString(kopo11_i));
	}

}
