package java2_5��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ������ {

	public static void main(String[] args) {
		String kopo11_Time = "yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat kopo11_sd = new SimpleDateFormat(kopo11_Time);
		
		String kopo11_date = kopo11_sd.format(new Date());
		
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");
		int kopo11_price = 30000;
		double kopo11_tax = 0.1;
		
		System.out.printf("%s\n","�ſ����");
		System.out.printf("�ܸ��� : %s%3s��ǥ��ȣ : %s\n","2N68665898","","041218");
		System.out.printf("������ : %s\n","�Ѿ��ġ�");
		System.out.printf("��  �� : %s\n","��� ������ �д籸 Ȳ�����351���� 10 , 1��");
		System.out.printf("��ǥ�� : %s\n","��â��");
		System.out.printf("����� : %s%5sTEL : %s\n","752-53-00558","","7055695");
		System.out.printf("- - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("��  ��%30s ��\n",kopo11_df.format((int)kopo11_price));
		System.out.printf("�ΰ���%30s ��\n",kopo11_df.format((int)(kopo11_price * kopo11_tax)));
		System.out.printf("��  ��%30s ��\n",kopo11_df.format((int)kopo11_price+(kopo11_price * kopo11_tax)));
		System.out.printf("- - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("%s\n","�츮ī��");
		System.out.printf("ī���ȣ : %s%s\n","5387-20**-****-4613(s)","�Ͻú�");
		System.out.printf("�ŷ��Ͻ� : %s\n",kopo11_date);
		System.out.printf("���ι�ȣ : %s\n","70404427");
		System.out.printf("�ŷ���ȣ : %s\n","357734873739");
		System.out.printf("���� : %s%5s���� : %s\n","��ī���","","720068568");
		System.out.printf("�˸� : %s\n","EDC����ǥ");
		System.out.printf("���� : %s\n","TEL)1544-4700");
		System.out.printf("- - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("%21s\n","* �����մϴ� *");
		System.out.printf("%36s\n","ǥ��v2.08_20200212");

	}

}
