package java2_8��;

import java.io.*;

public class L08 {

	public static void main(String[] args) throws IOException {

		File kopo11_f = new File("C:\\Users\\����\\Documents\\GitHub\\day_data\\THTSKS010H00.dat"); // File ��ü ����
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f)); // BufferedReader ��ü ������ File �� �Է�

		File kopo11_f1 = new File("C:\\Users\\����\\Documents\\GitHub\\day_data\\StockDailyPrice.csv"); // File ��ü ����
		BufferedWriter kopo11_bw1 = new BufferedWriter(new FileWriter(kopo11_f1)); // BufferedReader ��ü ������ File �� �Է�

		String kopo11_readtxt; // String ���� ����

		int kopo11_cnt = 0; // int ���� ���� �� 0 �ʱⰪ ����
		int kopo11_wcnt = 0; // int ���� ���� �� 0 �ʱⰪ ����

		while ((kopo11_readtxt = kopo11_br.readLine()) != null) { // readtxt�� ���� null�� �ƴϸ� ���� �ݺ���
			StringBuffer kopo11_s = new StringBuffer(); // StringBuffer ��ü ���� ��ü ����
			String[] kopo11_field = kopo11_readtxt.split(","); // String �迭�� %_%�� �������� �����Ͽ� ����

			// field�� ���̰� 2���� ũ�� '�׸���' field[2]��° ���� ^�� ""�� replace,trim �������� �� substring(0, 1) ���� "A"�� ��ġ�ϸ�
			if (kopo11_field.length > 2 && kopo11_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				kopo11_s.append(kopo11_field[0].replace("^", "").trim()); // s�� field[0]��° ���� ^�� ""�� replace,trim ���������� �����͸� �߰����ش�.
				for (int kopo11_i = 1; kopo11_i < kopo11_field.length; kopo11_i++) { // field[i]��°�� ���� ��ŭ ���� �ݺ���
					kopo11_s.append("," + kopo11_field[kopo11_i].replace("^", "").trim()); // s�� , +  s�� field[i]��° ���� ^�� ""�� replace,trim ���������� �����͸� �߰����ش�.
				}
				kopo11_bw1.write(kopo11_s.toString()); // BufferedWriter�� s�� ���� �Է�
				kopo11_bw1.newLine(); // BufferedWriter ����
				kopo11_wcnt++; // 1�߰� 
			}
			kopo11_cnt++; // 1�߰�
		}
		kopo11_br.close(); // BufferedReader ����
		kopo11_bw1.close(); // BufferedWriter ����

		System.out.printf("Program End[%d][%d]records\n", kopo11_cnt, kopo11_wcnt); // ��� ����
	}
}
