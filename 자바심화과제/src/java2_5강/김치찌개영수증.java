package java2_5��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ��ġ������� {

	public static void main(String[] args) {
		// �ð��� ���� ������ Ʋ�� format�ؼ� �̾��ִ� ��ü ����
		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String kopo11_date = kopo11_sd.format(new Date()); // ���ϴ� �������� ���� �ð������͸� �޴� ����
		
		// ���� ������ �������� format���ִ� ��ü ����
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");
		
		int kopo11_price = 30000;	// int ������ ������ 30000 �ʱⰪ ����
		
		double kopo11_tax = 0.1;	// double ������ ������ 0.1 �ʱⰪ ����
		
		System.out.printf("%s\n","�ſ����");	// String ��� ����
		System.out.printf("�ܸ��� : %s%5s��ǥ��ȣ : %s\n","2N68665898","","041218"); // String ��� ����
		System.out.printf("������ : %s\n","�Ѿ��ġ�"); // String ��� ����
		System.out.printf("��  �� : %s\n","��� ������ �д籸 Ȳ�����351���� 10 , 1��"); // String ��� ����
		System.out.printf("��ǥ�� : %s\n","��â��"); // String ��� ����
		System.out.printf("����� : %s%7sTEL : %s\n","752-53-00558","","7055695"); // String ��� ����
		System.out.printf("-----------------------------------------\n"); // ----- ���� ��� ����
		System.out.printf("��  ��%32s ��\n",kopo11_df.format((int)kopo11_price)); // ���ϴ� ���·� format�� kopo11_price ��� ����
		System.out.printf("�ΰ���%32s ��\n",kopo11_df.format((int)(kopo11_price * kopo11_tax))); // ���ϴ� ���·� format�� (kopo11_price * kopo11_tax) ��� ����
		// ���ϴ� ���·� format�� kopo11_price+(kopo11_price * kopo11_tax) ��� ����
		System.out.printf("��  ��%32s ��\n",kopo11_df.format((int)kopo11_price+(kopo11_price * kopo11_tax))); 
		System.out.printf("-----------------------------------------\n"); // ----- ���� ��� ����
		System.out.printf("%s\n","�츮ī��"); // String ��� ����
		System.out.printf("ī���ȣ : %s%5s\n","5387-20**-****-4613(s)","�Ͻú�"); // String ��� ����
		System.out.printf("�ŷ��Ͻ� : %s\n",kopo11_date); 	// ���ϴ� ���·� format �� kopo11_date ��� ����
		System.out.printf("���ι�ȣ : %s\n","70404427"); // String ��� ����
		System.out.printf("�ŷ���ȣ : %s\n","357734873739"); // String ��� ����
		System.out.printf("���� : %s%5s���� : %s\n","��ī���","","720068568"); // String ��� ����
		System.out.printf("�˸� : %s\n","EDC����ǥ"); // String ��� ����
		System.out.printf("���� : %s\n","TEL)1544-4700"); // String ��� ����
		System.out.printf("-----------------------------------------\n"); // ----- ���� ��� ����
		System.out.printf("%22s\n","* �����մϴ� *"); // String ��� ����
		System.out.printf("%39s\n","ǥ��v2.08_20200212"); // String ��� ����

	}

}
