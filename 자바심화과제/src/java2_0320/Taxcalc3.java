package java2_0320;

public class Taxcalc3 {

	public static void main(String[] args) {

		String[] kopo11_item = { "������", "���Ͻ�", "�Ե�����", "����", "��극" }; // String Ÿ�� �����̸� �迭 ����
		int[] kopo11_price = { 1000, 2000, 3000, 2500, 1450 }; // ��ǰ���� ����
		int[] kopo11_amount = { 10, 2, 1, 3, 5 }; // ���� ���� ����
		double tax_rate = 0.1; // ����
		int total_sum = 0; // int�� �ʱⰪ 0 ����

		System.out.printf("*******************************************************\n");	// **���� ��� ����
		System.out.printf("                ���� �� ���ڵ�              \n");	// ���� �� ���ڵ� ��� ����
		System.out.printf(" �׸�		�ܰ�		����		�հ� 	\n");	// �׸� �ܰ� ���� �հ� ��� ����

		for (int i = 0; i < kopo11_item.length; i++) { // �������� ��ŭ �ݺ��� ����
			int sum = kopo11_price[i] * kopo11_amount[i]; // ���� ����[i] * ���� ����[i]
			total_sum = total_sum + sum; // ���� (���� ����[i] * ���� ����[i]) ���ϱ�

			if (i == 2) { // i == 2�̸� �� �ѹ��� ���
				System.out.printf("%s	%d		%d		%d\n", kopo11_item[i], kopo11_price[i], kopo11_amount[i], sum);
			} else { // �ƴϸ� �� �ι� ���
				System.out.printf("%s		%d		%d		%d\n", kopo11_item[i], kopo11_price[i], kopo11_amount[i],
						sum);

			}
		}

		System.out.printf("*******************************************************\n");	// **���� ��� ����
		System.out.printf(" ���� �ݾ� : 	%20d\n", total_sum); // %20d ->�ִ� 20����,������ total_sum ���

		int total_net_price = (int) (total_sum / (1 + tax_rate)); // ������ ���ڰ� / 1.1
		System.out.printf(" ���� �ݾ� :	%20d\n", total_net_price);	// %20d ->�ִ� 20����, �����ݾ� : total_net_price
		int tax = total_sum - total_net_price; // ���� = ������ ���ڰ�- �����ݾ�
		System.out.printf(" ��	�� : 	%20d\n", tax);	// %20d ->�ִ� 20����,�� �� : tax
	}

}