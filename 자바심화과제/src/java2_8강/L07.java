package java2_8��;

import java.io.*;

public class L07 {

	public static void main(String[] args) throws IOException {

		File kopo11_f = new File("C:\\Users\\����\\Documents\\GitHub\\day_data\\THTSKS010H00.dat"); // File ��ü ����
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f)); // BufferedReader ��ü ������ File �� �Է�

		String kopo11_readtxt; // String ���� ����
		int kopo11_LineCnt = 0; // int ���� ���� �� 0 �ʱⰪ ����
		int kopo11_n = -1; // int ���� �� -1 �ʱⰪ ����

		StringBuffer kopo11_s = new StringBuffer(); // StringBuffer ��ü ���� ��ü ����
		while (true) { // true �� �� ���� �ݺ���
			char[] kopo11_ch = new char[1000]; // �迭 ũ�� 1000 ���� ����
			kopo11_n = kopo11_br.read(kopo11_ch); // int ������ br.read(ch) �� ����
			if (kopo11_n == -1) // n���� -1�̸�
				break; // break;

			for (char kopo11_c : kopo11_ch) { // ch�迭���� ���� �ϳ��� �����ͼ� c�� ��� �ݺ���
				if (kopo11_c == '\n') { // c���� �����̸�
					System.out.printf("[%s]***\n", kopo11_s.toString()); // ��� ����
					kopo11_s.delete(0, kopo11_s.length()); // s�� 0���� s�� ���� ��ŭ ����
				} else { // c���� ������ �ƴϸ�
					kopo11_s.append(kopo11_c); // s�� c �߰�
				}
			}
			kopo11_LineCnt++; // 1�߰�
		}
		System.out.printf("[%s]***\n", kopo11_s.toString()); // ��� ����
		kopo11_br.close(); // BufferedReader ����
	}
}
