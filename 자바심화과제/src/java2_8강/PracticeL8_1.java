package java2_8��;

import java.io.*;

public class PracticeL8_1 {

	public static void main(String[] args) throws IOException {

		File kopo11_f = new File("C:\\Users\\����\\Documents\\GitHub\\day_data\\StockDailyPrice.csv"); // File ��ü ����
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f)); // BufferedReader ��ü ������ File �� �Է�

		String kopo11_readtxt; // String ���� ����

		int kopo11_MAXValue = Integer.MIN_VALUE; // int ���� ���� �� Integer �ּҰ� �ʱⰪ ����
		int kopo11_MINValue = Integer.MAX_VALUE; // int ���� ���� �� Integer �ִ밪 �ʱⰪ ����

		while ((kopo11_readtxt = kopo11_br.readLine()) != null) { // readtxt�� ���� null�� �ƴϸ� ���� �ݺ���
			StringBuffer kopo11_s = new StringBuffer(); // StringBuffer ��ü ���� ��ü ����
			String[] kopo11_field = kopo11_readtxt.split(","); // String �迭�� ,�� �������� �����Ͽ� ����

			// field[1]��° ���� ^�� ""�� replace,trim �������� �� substring(0, 4) ���� "2015"�� ��ġ�ϸ�
			if (kopo11_field[1].replace("^", "").trim().substring(0, 4).equals("2015")) {

				if (Integer.parseInt(kopo11_field[3]) > kopo11_MAXValue) { // ������ ���� kopo11_MAXValue���� ũ��
					kopo11_MAXValue = Integer.parseInt(kopo11_field[3]); // kopo11_MAXValue�� �� ����
				}
				if (Integer.parseInt(kopo11_field[3]) < kopo11_MINValue) { // ������ ���� kopo11_MAXValue���� ������
					kopo11_MINValue = Integer.parseInt(kopo11_field[3]); // kopo11_MAXValue�� �� ����
				}
			}
		}
		kopo11_br.close(); // BufferedReader ����

		System.out.println("2015�� �Ｚ���� ���� ���� �ְ� : " + kopo11_MAXValue); // ��� ����
		System.out.println("2015�� �Ｚ���� ���� ���� ������ : " + kopo11_MINValue); // ��� ����
	}
}
