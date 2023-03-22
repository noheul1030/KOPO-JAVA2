package java2_2��3��;

public class PrintfEx1 {

	public static void main(String[] args) {

		byte kopo11_b = 1;	// byte Ÿ�� ���� 1 �ʱⰪ ����
		short kopo11_s = 2;	// short Ÿ�� ���� 2 �ʱⰪ ����
		char kopo11_c = 'A';	// char Ÿ�� ���� 'A' �ʱⰪ ����

		int finger = 10;	// int Ÿ�� ���� 10 �ʱⰪ ����
		long big = 1000000000000L;	// long Ÿ�� ���� 1000000000000L �ʱⰪ ����
		long hex = 0xFFFFFFFFFFFFFFFFL; // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010; // 8���� 10, 10�����δ� 8
		int hexNum = 0x10; // 16���� 10, 10 �����δ� 16
		int binNum = 0b10; // 2���� 10, 10�����δ� 2

		System.out.printf("b = %d%n", kopo11_b);	// b = 1
		System.out.printf("s = %d%n", kopo11_s);	// s = 2
		System.out.printf("c = %c, %d %n", kopo11_c, (int) kopo11_c);	// c = A, (int)����ȯ 65 ���
		System.out.printf("finget = [%5d]%n", finger);	// 5��ŭ ����� �ִ� �ڸ��� �����ϰ� ������ ����, �����ڸ��� ����
		System.out.printf("finget = [%-5d]%n", finger);	// 5��ŭ ����� �ִ� �ڸ��� �����ϰ� ���� ����, �����ڸ��� ����
		System.out.printf("finget = [%05d]%n", finger);	// ������ �ڸ��� ����ϰ� ���� �ڸ��� ������ 0 ���
		System.out.printf("big = %d%n", big);	// big = 1000000000000
		System.out.printf("hex = %#x%n", hex);	// hex = 0xFFFFFFFFFFFFFFFF (%x - 16�� ���·� ���)
		System.out.printf("octNum = %o, %d%n", octNum, octNum);	// 8���� 10, 10�����δ� 8 (%o - 8�����·� ���)
		System.out.printf("hexNum = %o, %d%n", hexNum, hexNum);	// 16���� 10, 10 �����δ� 16
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);	// 2���� 10, 10�����δ� 2
	
	}

}