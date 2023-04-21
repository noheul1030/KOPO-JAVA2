package java2_8��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
	
	// FileWrite �޼��� throws IOException���� ����ó�� �ý��� �޼��� ���� ����
	public static void FileWrite() throws IOException{
		// File ���� ���� (������ ������ ��θ� �Է��Ѵ�.)
		File kopo11_f = new File("C:\\Users\\����\\Documents\\GitHub\\KOPO-JAVA2\\Mytest.txt");
		// BufferedWriter ���� ����(kopo11_f)�� �Է�
		BufferedWriter kopo11_bw = new BufferedWriter(new FileWriter(kopo11_f));
		
		kopo11_bw.write("�ȳ� File"); // �Է� 
		kopo11_bw.newLine(); // ����
		kopo11_bw.write("hello ���"); // �Է�
		kopo11_bw.newLine(); // ����
		
		kopo11_bw.close(); // BufferedWriter ����
	}
	// FileRead �޼��� throws IOException���� ����ó�� �ý��� �޼��� ���� ����
	public static void FileRead() throws IOException{
		// File ���� ���� (������ ������ ��θ� �Է��Ѵ�.)
		File kopo11_f = new File("C:\\Users\\����\\Documents\\GitHub\\KOPO-JAVA2\\Mytest.txt");
		// BufferedReader ���� ����(kopo11_f)�� �Է�
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f));
		
		String kopo11_readtxt; // String ���� ����
		
		// �ݺ���
		// ���� kopo11_readtxt�� �Է°��� null�� �ƴϸ� ����
		while((kopo11_readtxt = kopo11_br.readLine())!=null) {
			System.out.printf("%s\n",kopo11_readtxt); // ��� ����
		}
		kopo11_br.close(); // BufferedReader ����
	}
	
	// main 
		public static void main(String[] args) throws IOException{
			FileWrite(); // FileWrite �޼��� ����
			FileRead(); // FileRead �޼��� ����
		}
}
