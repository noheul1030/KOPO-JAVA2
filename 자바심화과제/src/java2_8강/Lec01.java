package java2_8��;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec01 {
	public static void main(String[] args) throws IOException {
		// File ���� ���� (������ ������ ��θ� �Է��Ѵ�.)
		File kopo11_f = new File("C:\\Users\\����\\Documents\\GitHub\\KOPO-JAVA2\\���������������ǥ�ص�����.csv");
		// BufferedReader ���� ����(kopo11_f)�� �Է�
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f));

		String kopo11_readtxt; // String ���� ����
		
		// �Է� ���� ���� null�̸� 
		if ((kopo11_readtxt = kopo11_br.readLine()) == null) {
			System.out.printf("�� �����Դϴ�\n"); // ��� ����
			return; // ����
		}
		
		// , �������� ������ �迭�� ����
		String[] kopo11_field_name = kopo11_readtxt.split(",");

		int kopo11_LineCnt = 0; // int ���� �ʱⰪ 0����
		// �ݺ���
		// ���� kopo11_readtxt�� �Է°��� null�� �ƴϸ� ����
		while ((kopo11_readtxt = kopo11_br.readLine()) != null) {
			
			// , �������� ������ �迭�� ����
			String[] kopo11_field = kopo11_readtxt.split(",");
			
			System.out.printf("**[%d��° �׸�]*************\n", kopo11_LineCnt); // ��� ����
			// kopo11_field_name�� ���̸�ŭ ���� �ݺ���
			for (int kopo11_i = 0; kopo11_i < kopo11_field_name.length; kopo11_i++) {
				// kopo11_field_name[kopo11_i]�� : kopo11_field[kopo11_i]�� ��� ����
				System.out.printf(" %s : %s\n", kopo11_field_name[kopo11_i], kopo11_field[kopo11_i]); 
			}
			System.out.printf("******************************\n"); // ***** ���� ��� ����
			if (kopo11_LineCnt == 100) // LineCnt�� 100�� �Ǹ� 
				break;	// break;
			kopo11_LineCnt++; // 1�� �߰�
		}
		kopo11_br.close(); // BufferedReader ����
	}
}
