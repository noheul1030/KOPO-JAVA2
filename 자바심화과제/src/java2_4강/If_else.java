package java2_4��;

public class If_else {
	public static void main(String[] args) {

		int kopo11_iI; // int Ÿ�� ���� ����
		double kopo11_iD; // double Ÿ�� ���� ����

		kopo11_iI = 10 / 3; // int ������ �Ҽ��� ������ 3 ����
		kopo11_iD = 10 / 3.0; // double ������ 3.33333... ����

		if (kopo11_iI == kopo11_iD)
			System.out.printf("equal\n"); // iI �� iD�� ������ "equal" ���
		
		// �� �� "Not equal" double ����ȯ�� �� 3.00000...�� 3.333333....���
		else
			System.out.printf("Not equal[%f][%f]\n", (double) kopo11_iI, kopo11_iD);

		if (kopo11_iI == 3.333333)
			System.out.printf("equal\n"); // iI�� 3.333333�� ������ "equal" ���
		else
			System.out.printf("Not equal[3.333333][%f]\n", kopo11_iD); // �ƴϸ� "Not equal" ���

		kopo11_iD = (int) kopo11_iD; // iD ������ (int) ����ȯ�Ͽ� �Ҽ��� ���� 3.000000 ����
		
		if (kopo11_iI == kopo11_iD)
			System.out.printf("equal\n"); // iI �� iD�� ������ "equal" ���
		else
			System.out.printf("Not equal[%f][%f]\n", (double) kopo11_iI, kopo11_iD); // �� �� "Not equal" ���

		System.out.printf("int�� �μ�[%d][%f]\n", kopo11_iI, kopo11_iD);	// iI�� ����������, iD�� �Ҽ������� ���
		System.out.printf("double�� �μ�[%f][%f]\n", (double) kopo11_iI, kopo11_iD);	// �Ѵ� �Ҽ������� ���

		char kopo11_a = 'c';	// char Ÿ�� ���� 'c' �ʱⰪ ����

		if (kopo11_a == 'b')	// 'b'�� ������	���
			System.out.printf("kopo11_a�� b�̴�\n");
		if (kopo11_a == 'c')	// 'c'�� ������ ���
			System.out.printf("kopo11_a�� c�̴�\n");
		if (kopo11_a == 'd')	// 'd'�� ������ ���
			System.out.printf("kopo11_a�� d�̴�\n");

		String kopo11_aa = "abcd";	// String Ÿ�� ���ڿ� "abcd" �ʱⰪ ����

		if (kopo11_aa.equals("abcd"))	// "abcd"'�� ������	���
			System.out.printf("kopo11_aa�� abcd�̴�\n");
		else	// "abcd"'�� ���� ������	���
			System.out.printf("kopo11_aa�� abcd�� �ƴϴ�\n");

		boolean kopo11_bb = true;	// boolean Ÿ�� true �ʱⰪ ����

		if (!!kopo11_bb)	// true�� �ι� ���� -> ��
			System.out.printf("kopo11_bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		else	// �� �� 
			System.out.printf("kopo11_bb�� �ƴϰ� �ƴϸ� �����̴�\n");

	}
}