package java2_4��;

import java.text.DecimalFormat;

public class ĭ���߱⿬�� {

	public static void main(String[] args) {
		
		String kopo11_item = "���";	// String ������ "���" �ʱⰪ ����
		int kopo11_unit_price = 5000;	// int ������ 5000 �ʱⰪ ����
		int kopo11_num = 500;	// int ������ 500 �ʱⰪ ����
		int kopo11_total = 0;	// int ������ 0 �ʱⰪ ����
		
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");	// DecimalFormat���� ��ü ����(###,###,###,###,###)���·� ���� �ǰԲ�
		
		// �ش� ���
		System.out.printf("==============================================================\n");	// ===== ��� ����
		// 20ĭ�ִ� string Ÿ�� "ǰ��" ���. 8ĭ�ִ� string Ÿ�� "�ܰ�" ���,8ĭ�ִ� string Ÿ�� "����" ���,8ĭ�ִ� string Ÿ�� "�հ�" ��� ����
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","ǰ��","�ܰ�","����","�հ�");	
		System.out.printf("==============================================================\n");	// ===== ��� ����
		
		// �� ���
		// 20ĭ�ִ� string Ÿ�� item ���. 10ĭ�ִ� string Ÿ�� kopo11_df.format(kopo11_unit_price) ���,
		// 10ĭ�ִ� string Ÿ�� kopo11_df.format(kopo11_num) ���,10ĭ�ִ� string Ÿ�� kopo11_df.format(kopo11_unit_price*kopo11_num) ��� ����
		System.out.printf("%20.20s%10.10s%10.10s   %10.10s\n",
				kopo11_item,kopo11_df.format(kopo11_unit_price),kopo11_df.format(kopo11_num),kopo11_df.format(kopo11_unit_price*kopo11_num));
		System.out.printf("==============================================================\n");	// ===== ��� ����

	}

}
