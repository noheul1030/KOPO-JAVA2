package java2_2��3��;

public class Taxcalc {

	public static void main(String[] args) {
		int kopo11_val = 271; // int�� ���� val�� 271 �ʱⰪ ����
		int kopo11_rate = 3; // int�� ���� rate�� 3 �ʱⰪ ����

		int tax = taxcal(kopo11_val, kopo11_rate); // int�� ���� tax�� taxcal�޼��忡
													// �Ķ���ͷ� (kopo11_val,kopo11_rate) �����ϰ� ����� ret �ޱ�

		System.out.printf("********************************************\n");	// **���� ��� ����
		System.out.printf("****************�ܼ� ���� ���**************\n");	// **���� ��� ����
		// ���� ���ݰ�� :  kopo11_val * kopo11_rate / 100.0
		System.out.printf("���� ���ݰ��: %f\n", kopo11_val * kopo11_rate / 100.0);	// %f �Ҽ������� ���
		
		// ��������: kopo11_val,����: tax,�������԰���: kopo11_val + tax
		System.out.printf("��������: %d ����: %d �������԰���: %d\n", kopo11_val, tax, kopo11_val + tax);	// %d ������ ���
		System.out.printf("********************************************\n");	// **���� ��� ����
	}

	public static int taxcal(int kopo11_val, int kopo11_rate) { // �Ķ���ͷ� (kopo11_val,kopo11_rate)�� ����
		int ret; // int�� ret ����

		// kopo11_val�� ���� ���� kopo11_rate�� ������ ���� �� /100.0 �� ����
		// kopo11_val * kopo11_rate / 100�� ������ ----> ���ǹ� Ȯ��

		if (((double) kopo11_val * (double) kopo11_rate / 100.0) == kopo11_val * kopo11_rate / 100)

			ret = kopo11_val * kopo11_rate / 100; // true --> ret�� kopo11_val * kopo11_rate / 100 �� ����

		else

			ret = kopo11_val * kopo11_rate / 100 + 1; // else --> ret�� kopo11_val * kopo11_rate / 100 +1 �� ����

		return ret; // ret�� ����� �� return
	}
}