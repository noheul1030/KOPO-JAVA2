package java2_5��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ���������̼� {

	public static void main(String[] args) {
		Calendar kopo11_cal = Calendar.getInstance();
		kopo11_cal.add(kopo11_cal.DATE, 14);

		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		SimpleDateFormat kopo11_sd2 = new SimpleDateFormat("MM�� dd��");
		
		String kopo11_date = kopo11_sd.format(new Date());
		String kopo11_chageDate = kopo11_sd2.format(kopo11_cal.getTime());
	
		
		
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");
		
		String kopo11_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";
		String kopo11_itemcode1 = "1031615";
		int kopo11_price1 = 3000;
		int kopo11_amount1 = 1;
		
		String kopo11_itemname2 = "�����̵�ĸ���(������)(100ȣ)";
		String kopo11_itemcode2 = "11008152";
		int kopo11_price2 = 1000;
		int kopo11_amount2 = 1;
		
		String kopo11_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String kopo11_itemcode3 = "1020800";
		int kopo11_price3 = 1000;
		int kopo11_amount3 = 1;
		
		int kopo11_priceSum = (kopo11_price1*kopo11_amount1)+(kopo11_price2*kopo11_amount2)+(kopo11_price3*kopo11_amount3);
		double kopo11_tax = 0.909;

		System.out.printf("%22s\n","\"���ΰ���, ���̼�\"");
		System.out.printf("%s\n","(��)�Ƽ����̼�_�д缭����");
		System.out.printf("��ȭ:%s\n","031-702-6016");
		System.out.printf("����:%s\n","���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.printf("��ǥ:%s\n","������,��ȣ�� 213-81-52063");
		System.out.printf("����:%s\n","��⵵ ������ �д籸 �д��53���� 11 (������)");
		System.out.printf("========================================\n");
		System.out.printf("%23s\n","�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%25s\n","ISO 9001 ǰ���濵�ý��� �������");
		System.out.printf("========================================\n");
		System.out.printf("%15s(%s)%s,\n","��ȯ/ȯ�� 14��",kopo11_chageDate,"�̳�");	
		System.out.printf("%s\n","(����)������, ����ī�� ���� �� ���Ը��忡�� ����");
		System.out.printf("%24s\n","����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%23s\n","üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.printf("========================================\n");
		System.out.printf("%s%26s\n","[POS 1058231]",kopo11_date);
		System.out.printf("========================================\n");
		System.out.printf("%.14s%1s%s%1s%d%1s%s\n",kopo11_itemname1,"",kopo11_df.format(kopo11_price1)," ",kopo11_amount1," ",
				kopo11_df.format(kopo11_price1*kopo11_amount1));
		System.out.printf("[%s]\n",kopo11_itemcode1);
		System.out.printf("%.14s%3s%s%1s%d%1s%s\n",kopo11_itemname2,"",kopo11_df.format(kopo11_price2)," ",kopo11_amount2," ",
				kopo11_df.format(kopo11_price2*kopo11_amount2));
		System.out.printf("[%s]\n",kopo11_itemcode2);
		System.out.printf("%.14s%1s%s%1s%d%1s%s\n",kopo11_itemname3,"",kopo11_df.format(kopo11_price3)," ",kopo11_amount3," ",
				kopo11_df.format(kopo11_price3*kopo11_amount3));
		System.out.printf("[%s]\n",kopo11_itemcode3);
		System.out.printf("%15s%21s\n","�����հ�",kopo11_df.format((int)(kopo11_priceSum * kopo11_tax)));
		System.out.printf("%16s%21s\n","�ΰ���",kopo11_df.format((int)(kopo11_priceSum-(kopo11_priceSum * kopo11_tax))));
		System.out.printf("----------------------------------------\n");
		System.out.printf("�Ǹ��հ�%32s\n",kopo11_df.format(kopo11_priceSum));
		System.out.printf("========================================\n");
		System.out.printf("�ſ�ī��%32s\n",kopo11_df.format(kopo11_priceSum));
		System.out.printf("----------------------------------------\n");
		System.out.printf("�츮ī��%32s\n","538720**********");
		System.out.printf("���ι�ȣ %s%10s %5s\n","77982843(0)","���αݾ�",kopo11_df.format(kopo11_priceSum));
		System.out.printf("========================================\n");
		System.out.printf("%24s %s\n",kopo11_date,"�д缭����");
		System.out.printf("��ǰ �� ��Ÿ ���� : %s\n","1544-4400");
		System.out.printf("����� �� �����̼� ���� ���� : %s\n","1599-2211");
		System.out.printf("%27s\n","2112820610158231");
		System.out.printf("----------------------------------------\n");
		System.out.printf("�� %s\n","���̼� ����� �� �Ǵ� Ȩ�������� ����"
				+ "�ϼż� ȸ������ �� �پ��� ������ ����������! ��\n"); 
		
		
		
	}

}
