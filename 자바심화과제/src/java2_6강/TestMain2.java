package java2_6��;

public class TestMain2 {
	public static void main(String[] args) {
		Calc1 cc = new Calc1(); // Ŭ���� ��ü ����
		System.out.printf("2�� ������ ȣ��� [%d]\n", cc.sum(1, 2)); // ������ ��� ����
		System.out.printf("3�� ������ ȣ��� [%d]\n", cc.sum(1, 2, 3));// ������ ��� ����
		System.out.printf("4�� ������ ȣ��� [%d]\n", cc.sum(1, 2, 3, 4));// ������ ��� ����
		System.out.printf("������ ������ ȣ��� [%f]\n", cc.sum(1.3, 2.4)); // �Ǽ��� ��� ����

	}

}

class Calc1 {

	public int sum(int a, int b) { // int return �Ķ���� 2���޴� �޼���
		return a + b; // a + b �� ����
	}

	public int sum(int a, int b, int c) { // int return �Ķ���� 3���޴� �޼���
		return a + b + c; // a + b + c ����
	}

	public int sum(int a, int b, int c, int d) { // int return �Ķ���� 4���޴� �޼���
		return a + b + c + d; // a + b + c + d �� ����
	}

	public double sum(double a, double b) { // double return�Ķ���� 2���޴� �޼���
		return a + b; // a + b �� ����
	}

}
