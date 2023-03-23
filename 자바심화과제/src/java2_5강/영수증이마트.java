package java2_5��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class �������̸�Ʈ {

	public static void main(String[] args) {
		Calendar kopo11_cal = Calendar.getInstance();
		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat kopo11_sd2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat kopo11_sd3 = new SimpleDateFormat("yyyyMMdd");

		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");

		String[] kopo11_itemname = { "����Ȩ SAFE365 �ڵ�", "(G)LH��������ȭ�� 10", "��������E", "���� ���Ϸ� �� ��", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ��120gx5", "(��)����������", "���ѱ� ������� 156g", "GAP ������ 4-6��", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500", "���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65gx6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ", "���Ϸ� Ǫ���ֽ�", "�ＤǪ ���ö��϶�", "�ش�������ÿ708g" };

		int[] kopo11_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980,
				7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 14980, 11780, 8980 };

		int[] kopo11_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2 };

		boolean[] kopo11_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				true, false, false };

		int kopo11_taxpass = 0; // int ������ �ʱⰪ 0 ���� (* �鼼 ��ǰ �ݾ�)
		int kopo11_sum = 0; // int ������ �ʱⰪ 0 ���� (�հ�)
		int kopo11_point = 5473;

//		
//		System.out.println(subStrByte(itemname[0], 2));

		System.out.printf("%35s\n", "�̸�Ʈ ������(031)888-1234");
		System.out.printf("%7s%21s\n", "�̸�Ʈ", "206-86-50913 ����");
		System.out.printf("%30s\n", "���� ������ ������� 552");
		System.out.printf("\n");
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("\n");
		System.out.printf("[����]%s%19s\n", kopo11_sd.format(new Date()), "POS:0011-9861");
		System.out.printf("------------------------------------------\n");
		System.out.printf("%6s%11s%5s%8s\n", "��ǰ��", "�ܰ�", "����", "�ݾ�");
		System.out.printf("------------------------------------------\n");

		for (int kopo11_i = 0; kopo11_i < kopo11_itemname.length; kopo11_i++) {
			int kopo11_pricenum = kopo11_price[kopo11_i] * kopo11_num[kopo11_i];
			kopo11_sum += kopo11_price[kopo11_i] * kopo11_num[kopo11_i]; // ��� ǰ�� �հ�

			if (kopo11_i != 0)
				if (kopo11_i % 5 == 0)
					System.out.printf("------------------------------------------\n");
			if (kopo11_taxfree[kopo11_i] == true) {
				kopo11_taxpass += kopo11_price[kopo11_i] * kopo11_num[kopo11_i];
				System.out.printf("* ");
			} else
				System.out.printf("  ");

			String kopo11_str = subStrByte(kopo11_itemname[kopo11_i], 13);

			if (kopo11_str.getBytes().length < 13) {
				System.out.printf("%s", kopo11_str);
				for (int j = 0; j < 13 - kopo11_str.getBytes().length; j++) {
					System.out.printf("%s", " ");
				}
				System.out.printf("%s", "");
			} else
				System.out.printf("%s", kopo11_str);

			if (String.valueOf(kopo11_price[kopo11_i]).length() > 4) {
				System.out.printf(" %9s%3d %12s\n", kopo11_df.format(kopo11_price[kopo11_i]), kopo11_num[kopo11_i],
						kopo11_df.format(kopo11_pricenum));

			} else
				System.out.printf(" %9s%3d %12s\n", kopo11_df.format(kopo11_price[kopo11_i]), kopo11_num[kopo11_i],
						kopo11_df.format(kopo11_pricenum));
		}
		System.out.printf("\n");

		double kopo11_tax = (double) Math.round(((double) kopo11_sum - kopo11_taxpass) / 11); // double ������ �ΰ��� ��갪 ����
																								// (�ΰ���)

		if (kopo11_tax == (double) ((int) kopo11_tax))
			kopo11_tax = kopo11_tax;
		else
			kopo11_tax = (double) Math.round(((double) kopo11_sum - kopo11_taxpass) / 11 + 0.5);

		System.out.printf("%22s%14d\n", "�� ǰ�� ����", kopo11_itemname.length);
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", kopo11_df.format(kopo11_taxpass));
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", kopo11_df.format((kopo11_sum - kopo11_taxpass) - kopo11_tax));
		System.out.printf("%24s%14s\n", "��   ��   ��", kopo11_df.format(kopo11_tax));
		System.out.printf("%25s%14s\n", "��        ��", kopo11_df.format(kopo11_sum));
		System.out.printf("�� �� �� �� �� ��%24s\n", kopo11_df.format(kopo11_sum));
		System.out.printf("------------------------------------------\n");
		System.out.printf("0012 KEB �ϳ� %27s\n", "541707**0484/35860658");
		System.out.printf("ī�����(IC)%12s / %11s\n", "�Ͻú�", kopo11_df.format(kopo11_sum));
		System.out.printf("------------------------------------------\n");
		System.out.printf("%23s\n", "[�ż�������Ʈ ����]");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("��ȸ�߻�����Ʈ%16s%11s\n", "9350**9995", kopo11_df.format(kopo11_sum / 1000));
		System.out.printf("����(����)����Ʈ%12s(%11s)\n", kopo11_df.format((kopo11_sum / 1000)+kopo11_point),
				kopo11_df.format(kopo11_point));
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("------------------------------------------\n");
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("������ȣ :%30s\n", "34��****");
		System.out.printf("�����ð� :%31s\n", kopo11_sd2.format(new Date()));
		System.out.printf("------------------------------------------\n");
		System.out.printf("ĳ��:084599 %s%25s\n", "��00", "1150");
		System.out.printf("%15s/%s/%s/%s\n", kopo11_sd3.format(new Date()), "00119861", "00164980", "31");

	}

	public static String subStrByte(String kopo11_str, int kopo11_cutlen) {
		if (!kopo11_str.isEmpty()) {
			kopo11_str = kopo11_str.trim();
			if (kopo11_str.getBytes().length <= kopo11_cutlen) {
				return kopo11_str;
			} else {
				StringBuffer kopo11_sbStr = new StringBuffer(kopo11_cutlen);
				int kopo11_nCnt = 0;
				for (char kopo11_ch : kopo11_str.toCharArray()) {
					kopo11_nCnt += String.valueOf(kopo11_ch).getBytes().length;
					if (kopo11_nCnt > kopo11_cutlen)
						break;
					kopo11_sbStr.append(kopo11_ch);
				}
				return kopo11_sbStr.toString() + "";
			}
		} else {
			return "";
		}
	}

}
