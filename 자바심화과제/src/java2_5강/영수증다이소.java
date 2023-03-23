package java2_5��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ���������̼� {

	public static void main(String[] args) {
		
		Calendar kopo11_cal = Calendar.getInstance(); // �ð� ���� ���� ����
		kopo11_cal.add(kopo11_cal.DATE, 14);	// �ð� ������ �ϼ����� 14�� ���Ѵ�

		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // �ð��� ���� ������ Ʋ�� format�ؼ� �̾��ִ� ��ü ����
		SimpleDateFormat kopo11_sd2 = new SimpleDateFormat("MM�� dd��"); // �ð��� ���� ������ Ʋ�� format�ؼ� �̾��ִ� ��ü ����
		
		String kopo11_date = kopo11_sd.format(new Date()); // ���ϴ� �������� ���� �ð������͸� �޴� ����
		String kopo11_chageDate = kopo11_sd2.format(kopo11_cal.getTime()); // 14�� ���ؼ� ���� �ð������͸� �޴� ����
	
		
		// ���� ������ �������� format���ִ� ��ü ����
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");
		
		String kopo11_itemname1 = "����Ȩ SAFE365 �ڵ�";	// String ������ "ǻ��� �����ܿ븶��ũ(�ְ����)" ����
//		String kopo11_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";	// String ������ "ǻ��� �����ܿ븶��ũ(�ְ����)" ����
		String kopo11_itemcode1 = "1031615"; // String ������ "1031615" ����
		int kopo11_price1 = 3000;	// int ������ 3000 ����
		int kopo11_amount1 = 1; // int ������ 1 ����
		
		String kopo11_itemname2 = "(��)����������"; // String ������ "�����̵�ĸ���(������)(100ȣ)" ����
//		String kopo11_itemname2 = "�����̵�ĸ���(������)(100ȣ)"; // String ������ "�����̵�ĸ���(������)(100ȣ)" ����
		String kopo11_itemcode2 = "11008152"; // String ������ "11008152" ����
		int kopo11_price2 = 1000; // int ������ 1000 ����
		int kopo11_amount2 = 1; // int ������ 1 ����
		
		String kopo11_itemname3 = "DZ�ִϾ�縻3��C_WH"; // String ������ "�������� ���׸�����ũ(�˷�̴�Ÿ��)" ����
//		String kopo11_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)"; // String ������ "�������� ���׸�����ũ(�˷�̴�Ÿ��)" ����
		String kopo11_itemcode3 = "1020800"; // String ������ "1020800" ����
		int kopo11_price3 = 1000; // int ������ 1000 ����
		int kopo11_amount3 = 1; // int ������ 1 ����
		
		// int ������ ���� ���� * ���� �� ����
		int kopo11_priceSum = (kopo11_price1*kopo11_amount1)+(kopo11_price2*kopo11_amount2)+(kopo11_price3*kopo11_amount3);
		
		double kopo11_tax = (double)Math.round((double)kopo11_priceSum / 11); // double ������ �ΰ��� ��� ����(����)
		
		if(kopo11_tax == (double)((int)kopo11_tax)) 	// double tax���� int�� �Ҽ��� ������ double ����ȯ�� tax�� ������
			kopo11_tax = kopo11_tax;	 //  tax = tax
		else // double tax���� int�� �Ҽ��� ������ double ����ȯ�� tax�� ���� ������
			kopo11_tax = (double)Math.round(((double)kopo11_priceSum / 11)+0.5); // �ΰ��� +0.5 �ݿø��� ����

		System.out.printf("%22s\n","\"���ΰ���, ���̼�\"");	// String ��� ����
		System.out.printf("%s\n","(��)�Ƽ����̼�_�д缭����"); // String ��� ����
		System.out.printf("��ȭ:%s\n","031-702-6016"); // String ��� ����
		System.out.printf("����:%s\n","���� ������ ���μ�ȯ�� 2748 (���)"); // String ��� ����
		System.out.printf("��ǥ:%s\n","������,��ȣ�� 213-81-52063"); // String ��� ����
		System.out.printf("����:%s\n","��⵵ ������ �д籸 �д��53���� 11 (������)"); // String ��� ����
		System.out.printf("========================================\n"); // ============ ���� ��� ����
		System.out.printf("%23s\n","�Һ����߽ɰ濵(CCM) �������"); // String ��� ����
		System.out.printf("%25s\n","ISO 9001 ǰ���濵�ý��� �������"); // String ��� ����
		System.out.printf("========================================\n"); // ============ ���� ��� ����
		System.out.printf("%15s(%s)%s,\n","��ȯ/ȯ�� 14��",kopo11_chageDate,"�̳�"); // ���� �ð����� 14�� ���� ��ȯȯ���� ��� ����
		System.out.printf("%s\n","(����)������, ����ī�� ���� �� ���Ը��忡�� ����"); // String ��� ����
		System.out.printf("%24s\n","����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�"); // String ��� ����
		System.out.printf("%23s\n","üũī�� ��� �� �ִ� 7�� �ҿ�"); // String ��� ����
		System.out.printf("========================================\n"); // ============ ���� ��� ����
		System.out.printf("%s%26s\n","[POS 1058231]",kopo11_date); // ���� ��¥ ��� ����
		System.out.printf("========================================\n"); // ============ ���� ��� ����
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String kopo11_str1 = subStrByte(kopo11_itemname1, 21); // kopo11_itemname1�� Byte 21������ ���
		if (kopo11_itemname1.getBytes().length < 21) {	// itemname1�� byte ũ�Ⱑ 21���� ������
            System.out.printf("%s", kopo11_itemname1);	// itemname1 ��� ����
            for (int j = 0; j < 21 - kopo11_itemname1.getBytes().length; j++) {	 // 21 - itemname1�� byte ũ�⸸ŭ
               System.out.printf("%s", " ");	// �������
            }
         } else System.out.printf("%s", kopo11_itemname1);	// itemname1�� byte ũ�Ⱑ 21���� ũ�� �׳� ���
			
		
		System.out.printf("%8s%3s%8s\n",kopo11_df.format(kopo11_price1),kopo11_amount1,
				kopo11_df.format(kopo11_price1*kopo11_amount1)); // 1. ��ǰ��. ���� , ���� , ���� * ���� ��� ����

		System.out.printf("[%s]\n",kopo11_itemcode1); // String kopo11_itemcode1 ��� ���� 

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String kopo11_str2 = subStrByte(kopo11_itemname2, 21); // kopo11_itemname2�� Byte 21������ ���
		if (kopo11_itemname2.getBytes().length < 21) { // itemname2�� byte ũ�Ⱑ 21���� ������
            System.out.printf("%s", kopo11_itemname2); // itemname2 ��� ����
            for (int j = 0; j < 21 - kopo11_itemname2.getBytes().length; j++) { // 21 - itemname2�� byte ũ�⸸ŭ
               System.out.printf("%s", " "); // �������
            }
         } else System.out.printf("%s", kopo11_itemname2); // itemname2�� byte ũ�Ⱑ 21���� ũ�� �׳� ���
			
		
		System.out.printf("%8s%3s%8s\n",kopo11_df.format(kopo11_price1),kopo11_amount1,
				kopo11_df.format(kopo11_price1*kopo11_amount1)); // 1. ��ǰ��. ���� , ���� , ���� * ���� ��� ����
		System.out.printf("[%s]\n",kopo11_itemcode2); // String kopo11_itemcode2 ��� ���� 

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String kopo11_str3 = subStrByte(kopo11_itemname3, 21); // kopo11_itemname3�� Byte 21������ ���
		if (kopo11_itemname3.getBytes().length < 21) { // itemname3�� byte ũ�Ⱑ 21���� ������
            System.out.printf("%s", kopo11_itemname3); // itemname3 ��� ����
            for (int j = 0; j < 21 - kopo11_itemname3.getBytes().length; j++) { // 21 - itemname3�� byte ũ�⸸ŭ
               System.out.printf("%s", " "); // �������
            }
         } else System.out.printf("%s", kopo11_itemname3); // itemname3�� byte ũ�Ⱑ 21���� ũ�� �׳� ���
			
		
		System.out.printf("%8s%3s%8s\n",kopo11_df.format(kopo11_price1),kopo11_amount1,
				kopo11_df.format(kopo11_price1*kopo11_amount1)); // 1. ��ǰ��. ���� , ���� , ���� * ���� ��� ����
		System.out.printf("[%s]\n",kopo11_itemcode3); // String kopo11_itemcode3 ��� ���� 
		
		
		
		
		
		System.out.printf("%15s%21s\n","�����հ�",kopo11_df.format((int)(kopo11_priceSum - kopo11_tax)));	// ���� ������ �� �ݾ� ��� ����
		System.out.printf("%16s%21s\n","�ΰ���",kopo11_df.format((int)(kopo11_priceSum-(kopo11_priceSum - kopo11_tax))));	// �ΰ��� ��� ����
		System.out.printf("----------------------------------------\n"); // ------------ ���� ��� ����
		System.out.printf("�Ǹ��հ�%32s\n",kopo11_df.format(kopo11_priceSum));	// �Ǹ� �հ� kopo11_priceSum ��� ����
		System.out.printf("========================================\n"); // ============ ���� ��� ����
		System.out.printf("�ſ�ī��%32s\n",kopo11_df.format(kopo11_priceSum)); // kopo11_priceSum ��� ����
		System.out.printf("----------------------------------------\n"); // ------------ ���� ��� ����
		System.out.printf("�츮ī��%32s\n","538720**********"); // String ��� ����
		System.out.printf("���ι�ȣ %s%10s %5s\n","77982843(0)","���αݾ�",kopo11_df.format(kopo11_priceSum));
		System.out.printf("========================================\n"); // ============ ���� ��� ����
		System.out.printf("%24s %s\n",kopo11_date,"�д缭����");	// ���� ��¥ ��� ����
		System.out.printf("��ǰ �� ��Ÿ ���� : %s\n","1544-4400"); // String ��� ����
		System.out.printf("����� �� �����̼� ���� ���� : %s\n","1599-2211"); // String ��� ����
		System.out.printf("%27s\n","2112820610158231"); // String ��� ����
		System.out.printf("----------------------------------------\n"); // ------------ ���� ��� ����
		System.out.printf("�� %s\n","���̼� ����� �� �Ǵ� Ȩ�������� ����" // String ��� ����
				+ "�ϼż� ȸ������ �� �پ��� ������ ����������! ��\n"); 
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
