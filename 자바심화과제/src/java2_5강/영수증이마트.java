package java2_5��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class �������̸�Ʈ {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat kopo11_sd2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat kopo11_sd3 = new SimpleDateFormat("yyyyMMdd");

		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");

		String[] itemname = { "����Ȩ SAFE365 �ڵ�", "(G)LH��������ȭ�� 10", "��������E", "���� ���Ϸ� �� ��", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ��120gx5", "* (��)����������", "���ѱ� ������� 156g", "* GAP ������ 4-6��", "* �� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500", "* ���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65gx6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "* 1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ" };

		int[] price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130, 3980,
				4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };

		int[] num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 };
		int numSum = 0;	// int ������ �ʱⰪ 0 ���� (�� ǰ�� ����)
		int taxpass = 0; // int ������ �ʱⰪ 0 ���� (* �鼼 ��ǰ �� �ݾ�)
		int sum = 0; // int ������ �ʱⰪ 0 ���� (�հ�)
		
		

		System.out.printf("%40s\n", "�̸�Ʈ ������(031)888-1234");
		System.out.printf("%36s\n", "206-86-50913 ����");
		System.out.printf("%35s\n", "���� ������ ������� 552");
		System.out.printf("\n");
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("\n");
		System.out.printf("[����]%s%22s\n", kopo11_sd.format(new Date()), "POS:0011-9861");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%6s%20s%6s%6s\n", "��ǰ��", "�ܰ�", "����", "�ݾ�");
		System.out.printf("-----------------------------------------------\n");

		for (int i = 0; i < itemname.length; i++) {
			sum += price[i]*num[i];	// ��� ǰ�� �հ�
			numSum += num[i];	// �� ǰ�� ���� ���� ���ϱ�
			if(itemname[i].contains("*")) 	// *�� ǥ�Ե� ����ǰ�� ã��
				taxpass += price[i]*num[i]; // taxpass �� ���� ���ϱ�
			
			if (i != 0)
				if (i % 5 == 0)
					System.out.printf("-----------------------------------------------\n");
			if (itemname[i].contains("*")) {
				System.out.printf("%.15s", itemname[i]);
			} else
				System.out.printf("  %.14s", itemname[i]);

			if (itemname[i].length() < 15) {
				if (itemname[i].contains("SAFE")) {
					for (int j = 0; j < 22 - itemname[i].length(); j++) {
						System.out.printf("%s", " ");
					}
				} else if (itemname[i].contains("g")) {
					for (int j = 0; j < 22 - itemname[i].length(); j++) {
						System.out.printf("%s", " ");
					}
				} else if (itemname[i].contains("120")) {
					for (int j = 0; j < 22 - itemname[i].length(); j++) {
						System.out.printf(" %s", " ");
					}
				}
			}
			System.out.printf("%5s%5d%10s\n", kopo11_df.format(price[i]), num[i], kopo11_df.format(price[i] * num[i]));
		}
		System.out.printf("\n");
		System.out.printf("%25s%17d\n","�� ǰ�� ����",numSum);
		System.out.printf("%26s%17s\n","(*)�� ��  �� ǰ",kopo11_df.format(taxpass));
		System.out.printf("%26s%17s\n","�� ��  �� ǰ",kopo11_df.format((sum-taxpass)-(sum-taxpass)/11));
		System.out.printf("%27s%17s\n","��   ��   ��",kopo11_df.format((sum-taxpass)/11));
		System.out.printf("%28s%17s\n","��        ��",kopo11_df.format(sum));
		System.out.printf("�������ݾ�%35s\n",kopo11_df.format(sum));
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("0012 KEB �ϳ� %33s\n","541707**0484/35860658");
		System.out.printf("ī�����(IC)%22s / %6s\n","�Ͻú�",kopo11_df.format(sum));
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%25s\n","[�ż�������Ʈ ����]");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("��ȸ�߻�����Ʈ%21s%12s\n","9350**9995",kopo11_df.format(sum/1000));
		System.out.printf("����(����)����Ʈ%17s(%12s)\n",kopo11_df.format(sum/1000),kopo11_df.format(sum/1000));
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%25s\n","���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("������ȣ :%36s\n","34��****");
		System.out.printf("�����ð� :%37s\n",kopo11_sd2.format(new Date()));
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("ĳ��:084599 %s%31s\n","��00","1150");
		System.out.printf("%17s/%s/%s/%s\n",kopo11_sd3.format(new Date()),"00119861","00164980","31");
	}

}
