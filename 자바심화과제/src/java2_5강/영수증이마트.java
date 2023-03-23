package java2_5��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class �������̸�Ʈ {

	public static void main(String[] args) {
		Calendar kopo11_cal = Calendar.getInstance(); // �ð� ���� ���� ����
		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // �ð��� ���� ������ Ʋ�� format�ؼ� �̾��ִ� ��ü ����
		SimpleDateFormat kopo11_sd2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �ð��� ���� ������ Ʋ�� format�ؼ� �̾��ִ� ��ü ����
		SimpleDateFormat kopo11_sd3 = new SimpleDateFormat("yyyyMMdd"); // �ð��� ���� ������ Ʋ�� format�ؼ� �̾��ִ� ��ü ����

		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###"); // ���� ������ �������� format���ִ� ��ü ����

		// String �迭 �� 30�� ����
		String[] kopo11_itemname = { "����Ȩ SAFE365 �ڵ�", "(G)LH��������ȭ�� 10", "��������E", "���� ���Ϸ� �� ��", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ��120gx5", "(��)����������", "���ѱ� ������� 156g", "GAP ������ 4-6��", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500", "���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65gx6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ", "���Ϸ� Ǫ���ֽ�", "�ＤǪ ���ö��϶�", "�ش�������ÿ708g" };

		// int �迭 �� 30�� ����
		int[] kopo11_price = { 11117500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980,
				7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 14980, 11780, 8980 };

		// int �迭 �� 30�� ����
		int[] kopo11_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2 };

		// �鼼 ���� üũ boolean �迭 �� 30�� ����
		boolean[] kopo11_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				true, false, false };

		int kopo11_taxpass = 0; // int ������ �ʱⰪ 0 ���� (* �鼼 ��ǰ �ݾ�)
		int kopo11_sum = 0; // int ������ �ʱⰪ 0 ���� (�հ�)
		int kopo11_point = 5473; // int ������ ���� ����Ʈ 5473 ����

//		
//		System.out.println(subStrByte(itemname[0], 2));

		System.out.printf("%35s\n", "�̸�Ʈ ������(031)888-1234"); // String ��� ����
		System.out.printf("%7s%21s\n", "�̸�Ʈ", "206-86-50913 ����"); // String ��� ����
		System.out.printf("%30s\n", "���� ������ ������� 552"); // String ��� ����
		System.out.printf("\n"); // ����
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�"); // String ��� ����
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)"); // String ��� ����
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)"); // String ��� ����
		System.out.printf("%s\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)"); // String ��� ����
		System.out.printf("\n"); // ����
		System.out.printf("[����]%s%19s\n", kopo11_sd.format(new Date()), "POS:0011-9861"); // ���ų�¥ �������� String ��� ����
		System.out.printf("------------------------------------------\n"); // --------- ���� ��� ����
		System.out.printf("%6s%11s%5s%8s\n", "��ǰ��", "�ܰ�", "����", "�ݾ�"); // String ��� ����
		System.out.printf("------------------------------------------\n"); // --------- ���� ��� ����

		for (int kopo11_i = 0; kopo11_i < kopo11_itemname.length; kopo11_i++) { // 0 ~ String �迭 kopo11_itemname�� ���̸�ŭ
																				// ���� �ݺ���
			int kopo11_pricenum = kopo11_price[kopo11_i] * kopo11_num[kopo11_i]; // int ������ price[i]��° * num[i]��° ����
			kopo11_sum += kopo11_price[kopo11_i] * kopo11_num[kopo11_i]; // kopo11_sum price[i]��° * num[i]��° ��� ǰ�� �հ� ����
																			// ���ϱ�

			if (kopo11_i != 0) // i�� 0�� �ƴ� ��
				if (kopo11_i % 5 == 0) // i % 5 �� 0�̸�
					System.out.printf("------------------------------------------\n"); // --------- ���� ��� ����
			if (kopo11_taxfree[kopo11_i] == true) { // �鼼 true �� ��
				kopo11_taxpass += kopo11_price[kopo11_i] * kopo11_num[kopo11_i]; // kopo11_taxpass ������ price[i]��° *
																					// num[i]��° ����
				System.out.printf("* "); // *���� ���
			} else // �鼼 false �� ��
				System.out.printf("  "); // ���� 2�� ���

			String kopo11_str = subStrByte(kopo11_itemname[kopo11_i], 13); // String ������ kopo11_itemname�� byte 13�ڸ� ������
																			// ����

			if (kopo11_str.getBytes().length < 13) { // kopo11_str�� ���̰� 13 �̸��� ��
				System.out.printf("%s", kopo11_str); // kopo11_str ���
				for (int j = 0; j < 13 - kopo11_str.getBytes().length; j++) { // 0 ~ 13 - kopo11_str�� ���̸�ŭ
					System.out.printf("%s", " "); // �������
				}
			} else // kopo11_str�� ���̰� 13 �̻��� ��
				System.out.printf("%s", kopo11_str); // kopo11_str �ٷ� ���
			
			// format�� �������� �� ��� ����
			System.out.printf(" %9s%3d %12s\n", kopo11_df.format(kopo11_price[kopo11_i]), kopo11_num[kopo11_i],
					kopo11_df.format(kopo11_pricenum));
		}
		System.out.printf("\n"); // ����

		double kopo11_tax = (double) Math.round(((double) kopo11_sum - kopo11_taxpass) / 11); // double ������ �ΰ��� ��갪 ����

		if (kopo11_tax == (double) ((int) kopo11_tax)) // double tax���� int�� �Ҽ��� ������ double ����ȯ�� tax�� ������
			kopo11_tax = kopo11_tax; //  tax = tax
		else // double tax���� int�� �Ҽ��� ������ double ����ȯ�� tax�� ���� ������
			kopo11_tax = (double) Math.round(((double) kopo11_sum - kopo11_taxpass) / 11 + 0.5); // �ΰ��� +0.5 �ݿø��� ����

		System.out.printf("%22s%14d\n", "�� ǰ�� ����", kopo11_itemname.length); // String �� ǰ�� ���� ���� ��� ����
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", kopo11_df.format(kopo11_taxpass)); // String �鼼 ��ǰ�� �� ���� ��� ����
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", kopo11_df.format((kopo11_sum - kopo11_taxpass) - kopo11_tax)); // ������ǰ ��� �� format ��� ����
		System.out.printf("%24s%14s\n", "��   ��   ��", kopo11_df.format(kopo11_tax)); // �ΰ��� ��� �� format ��� ����
		System.out.printf("%25s%14s\n", "��        ��", kopo11_df.format(kopo11_sum)); // String ��� ������ �� �հ� ��� ����
		System.out.printf("�� �� �� �� �� ��%24s\n", kopo11_df.format(kopo11_sum)); // String �հ� ��� ����
		System.out.printf("------------------------------------------\n"); // --------- ���� ��� ����
		System.out.printf("0012 KEB �ϳ� %27s\n", "541707**0484/35860658"); // String ��� ����
		System.out.printf("ī�����(IC)%26s\n", "�Ͻú� / "+ kopo11_df.format(kopo11_sum)); // String �հ� ��� ����
		System.out.printf("------------------------------------------\n"); // --------- ���� ��� ����
		System.out.printf("%23s\n", "[�ż�������Ʈ ����]"); // String ��� ����
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n"); // String ��� ����
		System.out.printf("��ȸ�߻�����Ʈ%16s%11s\n", "9350**9995", kopo11_df.format(kopo11_sum / 1000)); // �� �հ�ݾ� / 1000 ��� ����
		System.out.printf("����(����)����Ʈ%12s(%11s)\n", kopo11_df.format((kopo11_sum / 1000) + kopo11_point), // ���� point �ݾ� + ���ο� point ��� ����
				kopo11_df.format(kopo11_point));
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n"); // String ��� ����
		System.out.printf("------------------------------------------\n"); // --------- ���� ��� ����
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�"); // String ��� ����
		System.out.printf("������ȣ :%30s\n", "34��****"); // String ��� ����
		System.out.printf("�����ð� :%31s\n", kopo11_sd2.format(new Date())); // format�� ���� ��¥ ���� String ��� ����
		System.out.printf("------------------------------------------\n"); // --------- ���� ��� ����
		System.out.printf("ĳ��:084599 %s%25s\n", "��00", "1150"); // String ��� ����
		System.out.printf("%15s/%s/%s/%s\n", kopo11_sd3.format(new Date()), "00119861", "00164980", "31"); // format�� ���� ��¥ ���� String ��� ����

	}

	public static String subStrByte(String kopo11_str, int kopo11_num) {	// String str, int cutlen�� �Ķ���ͷ� ���޹޴� �޼��� ����
		if (!kopo11_str.isEmpty()) {	// str�� ������� ���� �� = false 
			kopo11_str = kopo11_str.trim();	// ���� ����
			if (kopo11_str.getBytes().length <= kopo11_num) { // str�� byte���̰� cutlen �����϶�
				return kopo11_str;	// str ����
			} else {	// // str�� byte���̰� cutlen �ʰ��϶�
				StringBuffer kopo11_sbStr = new StringBuffer(kopo11_num);	// StringBuffer ��ü ����
				int kopo11_nCnt = 0;	// intŸ�� �ʱⰪ 0 ����
				for (char kopo11_ch : kopo11_str.toCharArray()) {	// str.toCharArray()��ŭ ���� �ݺ���
					kopo11_nCnt += String.valueOf(kopo11_ch).getBytes().length;	// nCnt�� String.valueOf(ch).getBytes().length ���� ���ϱ�
					if (kopo11_nCnt > kopo11_num)	// nCnt�� cutlen ���� ũ�� break;
						break;
					kopo11_sbStr.append(kopo11_ch);	// kopo11_sbStr�� kopo11_ch�� ���Ѵ�.
				}
				return kopo11_sbStr.toString() + "";	// kopo11_sbStr.toString() + "" �� ����
			}
		} else { // str�� ������� �� = true
			return ""; // ""����
		}
	}
}
