package java2_2��3��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ChangeMoney {

	public static void main(String[] args) {

		int kopo11_MyWon = 1000000; // int�� MyWon���� �ʱⰪ 1000000 ����
		double kopo11_MoneyEx = 1238.21; // �޷� ȯ����
		double kopo11_commission = 0.003; // ������

		int kopo11_usd = (int) (kopo11_MyWon / kopo11_MoneyEx); // �޷� : ���� / ȯ����
		int kopo11_remain = (int) (kopo11_MyWon - kopo11_usd * kopo11_MoneyEx); // �ܵ� : ���� - (�޷�*ȯ����)

		System.out.printf("************************************************************************\n");	// **���� ��� ����
		System.out.printf("			  ������ ���� ���		\n");	// ������ ���� ��� ��� ����
		// �� ��ȭȯ���ݾ�: kopo11_MyWon�� => ��ȭ: usd�޷�, �ܵ�: remain�� ���
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, �ܵ�: %d��\n", kopo11_MyWon, kopo11_usd, kopo11_remain);

		System.out.printf("************************************************************************\n");	// **���� ��� ����
		System.out.printf("\n");	// ����
//		
//		
//		
//
		double kopo11_ComPerOne = kopo11_MoneyEx * kopo11_commission; // 1 �޷��� �޷� ȯ�� * ������

		double totalcom = kopo11_usd * kopo11_ComPerOne; // �� ȯ���� �޷� * ȯ�� ������
		System.out.printf("************************************************************************\n");	// **���� ��� ����
		System.out.printf("			  ������ ���		\n");	// ������ ��� ��� ����
		// �� ������: totalcom�� => ��ȭ: usd�޷�, �޷��� ������: ComPerOne�� ���
		System.out.printf("�� ������: %f�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", totalcom, kopo11_usd, kopo11_ComPerOne);

		System.out.printf("************************************************************************\n");	// **���� ��� ����
		System.out.printf("\n");	// ����
//		
//		
//		
//
		int i_totalcom; // int�� �Ѽ����� ���� ����

		if (totalcom != (double) ((int) totalcom)) { // totalcom�� �������� int ��ȯ �� �Ҽ��� ���� ���� ���� �ʴٸ�!
			i_totalcom = (int) totalcom + 1; // i_totalcom = totalcom + 1�� ���� ���Ѵ�.
		} else {
			i_totalcom = (int) totalcom; // ������ �� int�� �Ҽ��� �������� i_totalcom�� ����
		}
		System.out.printf("************************************************************************\n");	// **���� ��� ����
		System.out.printf("			  ������ ����ȯ��		\n");	// ������ ���� ȯ�� ��� ����
		// �� ������: i_totalcom�� => ��ȭ: usd�޷�, �޷��� ������: ComPerOne�� ���
		System.out.printf("�� ������: %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", i_totalcom, kopo11_usd, kopo11_ComPerOne);

		// �ܵ� : int������ �Ҽ��� ���� ���� (���� - (�޷�ȯ���� * ȯ����) - �� ������)
		kopo11_remain = (int) (kopo11_MyWon - kopo11_usd * kopo11_MoneyEx - i_totalcom);
		// �� ��ȭȯ���ݾ�: kopo11_MyWon�� => ��ȭ: usd�޷�, ������¡��: i_totalcom�� �ܵ�: remain ���
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������¡��: %d�� �ܵ�: %d\n", kopo11_MyWon, kopo11_usd, i_totalcom, kopo11_remain);
		System.out.printf("************************************************************************\n");	// **���� ��� ����
		System.out.printf("\n");	// ����
//
//		
//		
//		
		kopo11_usd = (int) (kopo11_MyWon / (kopo11_MoneyEx + kopo11_ComPerOne)); // �� ȯ�� �޷� = ���� / ȯ���� + 1�޷��� ȯ�� ������
		totalcom = kopo11_usd * kopo11_ComPerOne; // �� ������ = �� ȯ�� �޷� * 1�޷��� ȯ�� ������
		///////////////////
		// ������ �ø�ó��
		if (totalcom != (double) ((int) totalcom)) // totalcom�� �������� int ��ȯ �� �Ҽ��� ���� ���� ���� �ʴٸ�!
			i_totalcom = (int) totalcom + 1; // i_totalcom = totalcom + 1�� ���� ���Ѵ�.
		else
			i_totalcom = (int) totalcom; // ������ int�� �Ҽ��� �������� i_totalcom�� ����
		///////////////////
		System.out.printf("************************************************************************\n");	// **���� ��� ����
		System.out.printf("			 (��Ȯ��)������ ����ȯ��		\n");	// (��Ȯ��)������ ����ȯ�� ��� ����

		// �� ������: i_totalcom�� => ��ȭ: usd�޷�, �޷��� ������: ComPerOne�� ���
		System.out.printf("�� ������: %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", i_totalcom, kopo11_usd, kopo11_ComPerOne);

		// �ܵ� : int������ �Ҽ��� ���� ����(���� - (�޷�ȯ���� * ȯ����) - �� ������
		kopo11_remain = (int) (kopo11_MyWon - kopo11_usd * kopo11_MoneyEx - i_totalcom);
		// �� ��ȭȯ���ݾ�: kopo11_MyWon�� => ��ȭ: usd�޷�, ������¡��: i_totalcom�� �ܵ�: remain ���
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������¡��: %d�� �ܵ�: %d\n", kopo11_MyWon, kopo11_usd, i_totalcom, kopo11_remain);

		System.out.printf("************************************************************************\n");	// **���� ��� ����
		System.out.printf("\n");	// ����
//
//		
//		
//		

		DecimalFormat kopo11_decimal = new DecimalFormat("###,###,###,###,###");	// ���� 1,000������ ,�ĸ� ��� ���� ����

		System.out.printf("************************************************************************\n");	// **���� ��� ����
		System.out.printf("			�޸����, ��¥ ����			\n");	// �޸����, ��¥ ���� ��� ����
		
		// 1000 ������ , �� ���
		// �� ������: kopo11_decimal.format(i_totalcom)�� => ��ȭ: kopo11_decimal.format(usd) �޷�, �޷��� ������: ComPerOne��
		System.out.printf("�� ������: %s�� => ��ȭ: %s �޷�, �޷��� ������: %f��\n", 
				kopo11_decimal.format(i_totalcom),kopo11_decimal.format(kopo11_usd),kopo11_ComPerOne);

		// �ܵ� : int������ �Ҽ��� ���� ����(���� - (�޷�ȯ���� * ȯ����) - �� ������
		kopo11_remain = (int)(kopo11_MyWon - kopo11_usd * kopo11_MoneyEx - i_totalcom);	
		
		// 1000 ������ , �� ���
		// �� ��ȭȯ���ݾ�: kopo11_decimal.format(kopo11_MyWon)�� => ��ȭ: kopo11_decimal.format(usd)�޷�, 
		// ������ ¡��: kopo11_decimal.format(i_totalcom)�� �ܵ�: kopo11_decimal.format(remain)��
		System.out.printf("�� ��ȭȯ���ݾ�: %s�� => ��ȭ: %s�޷�, ������ ¡��: %s�� �ܵ�: %s��\n",
				kopo11_decimal.format(kopo11_MyWon),kopo11_decimal.format(kopo11_usd), 
				kopo11_decimal.format(i_totalcom),kopo11_decimal.format(kopo11_remain));
		
		System.out.printf("\n");	// ����
//
//
//		
//		
		Calendar kopo11_cal = Calendar.getInstance();	// �ð� ���� �Լ� �ҷ�����
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");	// SimpleDataFormat ��ü ����("YYYY/MM/dd HH:mm:ss")���·� 
		System.out.printf("���� ���� �ð�: %s\n", sdt.format(kopo11_cal.getTime()));	// sdt ��ü�� getTime�Է�
		
		System.out.printf("************************************************************************\n");	// **���� ��� ����
	}

}