package java2_0320;

public class Taxcalc2 {

	public static void main(String[] args) {
		int kopo11_price = 1234; // int�� price ������ 1234 �ʱⰪ ����
		double kopo11_tax_rate = 0.1; // double�� tax_rate ������ 0.1 �ʱⰪ ����

		// int�� ������ netprice�޼��忡 �Ķ���ͷ� (int kopo11_price, double kopo11_tax_rate) �����ϰ� 
		// ����� return �ޱ�
		int kopo11_netprice = netprice(kopo11_price, kopo11_tax_rate); 
		
		// kopo11_tax = 1234-1121
		int kopo11_tax = kopo11_price - kopo11_netprice;

		System.out.printf("***********************************************\n");	// **���� ��� ����
		System.out.printf("*       �Һ��ڰ���, ��������, ���� ���      *\n");	// �Һ��ڰ���, ��������, ���� ��� ����
		// �Һ��ڰ���: kopo11_price, ��������:  kopo11_netprice, ���� ���: kopo11_tax ���
		System.out.printf("�Һ��ڰ���: %d, ��������: %d, ���� ���:%d\n", kopo11_price, kopo11_netprice, kopo11_tax);
		System.out.printf("***********************************************\n");	// **���� ��� ����

	}
	
	// �Ķ���ͷ� (int kopo11_price, double kopo11_tax_rate)�� ����
	public static int netprice(int kopo11_price, double kopo11_tax_rate) {	
		return (int) (kopo11_price / (1 + kopo11_tax_rate));	// 1121 �� ���� (int)�� ����!
	}

}