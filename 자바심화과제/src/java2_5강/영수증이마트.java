package java2_5��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class �������̸�Ʈ {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String kopo11_date = kopo11_sd.format(new Date());

		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");

		String[] itemname = { "����Ȩ SAFE365 �ڵ�", "(G)LH��������ȭ�� 10", "��������E", "���� ���Ϸ� �� ��", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ��120gx5", "* (��)����������", "���ѱ� ������� 156g", "* GAP ������ 4-6��", "* �� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500", "* ���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65gx6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ" };

		int[] price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130, 3980,
				4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };

		int[] num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 };

		System.out.printf("%40s\n", "�̸�Ʈ ������(031)888-1234");
		System.out.printf("%36s\n", "206-86-50913 ����");
		System.out.printf("%35s\n", "���� ������ ������� 552");
		System.out.printf("\n");
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("\n");
		System.out.printf("[����]%s%22s\n", kopo11_date, "POS:0011-9861");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%6s%20s%6s%6s\n", "��ǰ��", "�ܰ�", "����", "�ݾ�");
		System.out.printf("-----------------------------------------------\n");

		for (int i = 0; i < itemname.length; i++) {
			if ((i + 1) % 5 == 0)
				System.out.printf("-----------------------------------------------\n");
			if(itemname[i].contains("*")) {
				System.out.printf("%.13s", itemname[i]);
			}else
				System.out.printf("  %.14s", itemname[i]);
				

			if (itemname[i].length() < 15) {
				if(itemname[i].contains("SAFE")) {
					for (int j = 0; j < 22 - itemname[i].length(); j++) {
						System.out.printf("%s", " ");
					}
				}
				else if(itemname[i].contains("g")) {
					for (int j = 0; j < 22 - itemname[i].length(); j++) {
						System.out.printf("%s", " ");
					}
				}
				else if(itemname[i].contains("120")) {
					for (int j = 0; j < 22 - itemname[i].length(); j++) {
						System.out.printf(" %s", " ");
					}
				}
			}
			System.out.printf("%5s%5d%10s\n",kopo11_df.format(price[i]), num[i],
					kopo11_df.format(price[i] * num[i]));
		}

	}

}
