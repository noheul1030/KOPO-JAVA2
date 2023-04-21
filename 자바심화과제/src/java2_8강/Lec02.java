package java2_8��;

import java.io.*;

public class Lec02 {
	public static void main(String[] args) throws IOException {
		// File ���� ���� (������ ������ ��θ� �Է��Ѵ�.)
		File kopo11_f = new File("C:\\Users\\����\\Documents\\GitHub\\KOPO-JAVA2\\���������������ǥ�ص�����.txt");
		// BufferedReader ���� ����(kopo11_f)�� �Է�
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f));

		String kopo11_readtxt; // String ���� ����
		
		// �Է� ���� ���� null�̸�
		if ((kopo11_readtxt = kopo11_br.readLine()) == null) {
			System.out.printf("�� �����Դϴ�\n"); // ��� ����
			return; // ����
		}
		
		// \t �������� ������ �迭�� ����
		String[] kopo11_field_name = kopo11_readtxt.split("\t");

		// �д����� ��� �������� ����,�浵�� ��
		double kopo11_lat = 37.3860521;
		double kopo11_lng = 127.1214038;
		
		// int Lineī��Ʈ,�ִܰŸ�ī��Ʈ, ����Ÿ�ī��Ʈ �ʱⰪ 0 ����
		int kopo11_LineCnt = 0;
		int kopo11_MINCnt = 0;
		int kopo11_MAXCnt = 0;
		
		// double �ִܰŸ� ������� Double �ּҰ� ����, ����Ÿ� ������� Double  �ִ밪 ����
		double kopo11_resultMIN = Double.MAX_VALUE;
		double kopo11_resultMAX = Double.MIN_VALUE;		
		
		// String �ִܰŸ� �ּ�,����Ÿ� �ּ� ���� 
		String kopo11_MINadress = "";
		String kopo11_MAXadress = "";
		
		// �ݺ���
		// ���� kopo11_readtxt�� �Է°��� null�� �ƴϸ� ����
		while ((kopo11_readtxt = kopo11_br.readLine()) != null) {
			
			// \t �������� ������ �迭�� ����
			String[] kopo11_field = kopo11_readtxt.split("\t");
			// ������ �浵�� ���� ����ؼ� �� ������ �Ÿ� ���
			double kopo11_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo11_field[13]) - kopo11_lat, 2)
					+ Math.pow(Double.parseDouble(kopo11_field[14]) - kopo11_lng, 2));
			
			// ����� �Ÿ��� ���� �ּҰ����� ������ �Ÿ����, MINCnt��ȣ, MINadress�ּ� �� ����
			if(kopo11_dist < kopo11_resultMIN) {
				kopo11_resultMIN = kopo11_dist;
				kopo11_MINCnt = kopo11_LineCnt;
				kopo11_MINadress = kopo11_field[9];
			}
			
			// ����� �Ÿ��� ���� �ִ밪���� ũ�� �Ÿ����, MAXCnt��ȣ, MAXadress�ּ� �� ����
			if(kopo11_dist > kopo11_resultMAX) {
				kopo11_resultMAX = kopo11_dist;
				kopo11_MAXCnt = kopo11_LineCnt;
				kopo11_MAXadress = kopo11_field[9];
			}
			
			kopo11_LineCnt++; // 1 �߰�
		}
		kopo11_br.close(); // BufferedReader ����
		
		System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
		System.out.printf("<< ���� ����� �� >>\n"); // ��� ����
		System.out.printf("**[%d��° �׸�]*************\n", kopo11_MINCnt); // �� ��� ����
		System.out.printf(" %s : %s\n", kopo11_field_name[9], kopo11_MINadress); // �� ��� ����
		System.out.printf(" ���������� �Ÿ� : %f\n", kopo11_resultMIN); // �� ��� ����
		System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
		System.out.println(); // ����
		
		
		System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
		System.out.printf("<< ���� �� �� >>\n"); // ��� ����
		System.out.printf("**[%d��° �׸�]*************\n", kopo11_MAXCnt); // �� ��� ����
		System.out.printf(" %s : %s\n", kopo11_field_name[9], kopo11_MAXadress); // �� ��� ����
		System.out.printf(" ���������� �Ÿ� : %f\n", kopo11_resultMAX); // �� ��� ����
		System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
	}
}



////�ݺ���
//		// ���� kopo11_readtxt�� �Է°��� null�� �ƴϸ� ����
//		while ((kopo11_readtxt = kopo11_br.readLine()) != null) {
//			
//			// \t �������� ������ �迭�� ����
//			String[] kopo11_field = kopo11_readtxt.split("\t");
////			System.out.printf("**[%d��° �׸�]*************\n", LineCnt);
////			System.out.printf(" %s : %s\n", field_name[9], field[9]);
////			System.out.printf(" %s : %s\n", field_name[13], field[13]);
////			System.out.printf(" %s : %s\n", field_name[14], field[14]);
//			double kopo11_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo11_field[13]) - kopo11_lat, 2)
//					+ Math.pow(Double.parseDouble(kopo11_field[14]) - kopo11_lng, 2));
////			resultMIN = Math.min(resultMIN, dist);
////			resultMAX = Math.max(resultMAX, dist);
//			if(kopo11_dist < kopo11_resultMIN) {
////			if(resultMIN == dist) {
//				kopo11_resultMIN = kopo11_dist;
//				kopo11_MINCnt = kopo11_LineCnt;
//				kopo11_MINadress = kopo11_field[9];
//			}
//			if(kopo11_dist > kopo11_resultMAX) {
////			if(resultMAX == dist) {
//				kopo11_resultMAX = kopo11_dist;
//				kopo11_MAXCnt = kopo11_LineCnt;
//				kopo11_MAXadress = kopo11_field[9];
//			}
////			System.out.printf(" ���������� �Ÿ� : %f\n", dist);
////			System.out.printf("******************************\n");









