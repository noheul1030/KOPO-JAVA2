package java2_8��;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// Ŭ���� CharArray
public class CharArray {
	// main 
	public static void main(String[] args) {
		// try ~ catch
		try {
			// File ���� ���� (������ ������ ��θ� �Է��Ѵ�.)
			File kopo11_f = new File("C:\\Users\\����\\Documents\\GitHub\\KOPO-JAVA2\\Mytest.txt");
			// FileWriter ���� ����(kopo11_f)�� �Է�
			FileWriter kopo11_fw = new FileWriter(kopo11_f);
			
			kopo11_fw.write("�ȳ� �ڹ�\n"); // �Է� ����
			kopo11_fw.write("�� �̸��� �����̾�\n"); // �Է� ����
			
			kopo11_fw.close(); // Write ����
			
			// FileReader ���� ���� (kopo11_f)�� �Է�
			FileReader kopo11_fr = new FileReader(kopo11_f);
			
			int kopo11_n = -1;	// int ���� ���� �ʱⰪ -1
			char [] kopo11_ch; // char �迭 ����
			int kopo11_HanCount = 0; // �ѱۼ��� Return �޴� int ����
			
			while(true) { // ���� true �� �� �ݺ�
				kopo11_ch = new char[100]; // �迭�� ũ�� 100���� ����
				kopo11_n = kopo11_fr.read(kopo11_ch); // kopo11_ch�� ũ�� ����
				
				if(kopo11_n == -1) break; // -1�̸� break;
				
				for (int kopo11_i = 0; kopo11_i < kopo11_n; kopo11_i++) { // �ݺ���
					// for(char c :ch)
					System.out.printf("%c",kopo11_ch[kopo11_i]); // �迭�� ���� �ϳ��� ����Ʈ		
				}
				for(char c : kopo11_ch) { // �ݺ���
					// �迭���� �������� byte���̰� 2�̸� kopo11_HanCount++;
					if(Character.toString(c).getBytes().length == 2) 
						kopo11_HanCount++; // 1�߰�
				}
			}
			kopo11_fr.close(); // Read ����
			System.out.printf("\n FILE READ END \n"); // ��� ����
			System.out.printf("\n�ѱ��� ������ : %d��",kopo11_HanCount); // �ѱ� ���� ��� ����
		}catch(Exception kopo11_e) { // ���� catch
			System.out.printf("����!!!![%s]\n", kopo11_e); // ���� ��� ����
		}
	}
}
