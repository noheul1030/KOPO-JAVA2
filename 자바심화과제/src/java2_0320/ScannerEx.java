package java2_0320;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);	// Scanner ��ü ����-> import
		
		System.out.println("���ڸ� ������ �ϳ� �Է����ּ���. >> ");	// ��ĳ�� �Է� �ȳ����� ���
		
		String input = scanner.nextLine();	// String Ÿ���� �Է¹޴� ������ ���ڿ��� �Է¹޴� nextLine() �Լ� ���
		int kopo11_num = Integer.parseInt(input);	// Scanner�� ���� Strign Ÿ�� Input ������ int�� ����ȯ 
		
		System.out.println("�Է³��� : " + input);	// String Ÿ���� input �� ���
		System.out.printf("kopo11_num = %d%n",kopo11_num);	// int Ÿ���� kopo11_num �� ��� 

	}

}