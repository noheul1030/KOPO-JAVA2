package java2_8��;

import java.io.*;

public class Lec02_Parking {
	public static void main(String[] args) {
		// �д����� ��� �������� ����,�浵�� ��
		double kopo11_lat = 37.3860521;
		double kopo11_lng = 127.1214038;

		// int Lineī��Ʈ,�ִܰŸ�ī��Ʈ, ����Ÿ�ī��Ʈ �ʱⰪ 0 ����
		int kopo11_LineCnt = 0;
		int kopo11_MINCnt = 0;
		int kopo11_MAXCnt = 0;

		// double �ִܰŸ� ������� Double �ּҰ� ����, ����Ÿ� ������� Double �ִ밪 ����
		double kopo11_resultMIN = Double.MAX_VALUE;
		double kopo11_resultMAX = Double.MIN_VALUE;

		// String �ִܰŸ� �ּ�,����Ÿ� �ּ� ����
		String kopo11_MINadress = "";
		String kopo11_MAXadress = "";

		// String �ִܰŸ� ����, �浵 / ����Ÿ� ����, �浵 ���� �ʱⰪ ����
		String kopo11_MINlat = "", kopo11_MINlng = "", kopo11_MAXlat = "", kopo11_MAXlng = "";

		
		
		// File ���� ���� (������ ������ ��θ� �Է��Ѵ�.)
		File kopo11_f = new File("C:\\Users\\����\\Documents\\GitHub\\KOPO-JAVA2\\������������������.txt");

		// try ~ catch
		try {
			// BufferedReader ���� ����(kopo11_f)�� �Է�
			BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f));

			String kopo11_readtxt; // String ���� ����

			// �Է� ���� ���� null�̸�
			if ((kopo11_readtxt = kopo11_br.readLine()) == null) {
				System.out.printf("�� �����Դϴ�\n"); // ��� ����
//			return; // ����
			}

			// \t �������� ������ �迭�� ����
			String[] kopo11_field_name = kopo11_readtxt.split("\t");

			// �ݺ���
			// ���� kopo11_readtxt�� �Է°��� null�� �ƴϸ� ����
			while ((kopo11_readtxt = kopo11_br.readLine()) != null) {

				// \t �������� ������ �迭�� ����
				String[] kopo11_field = kopo11_readtxt.split("\t");
				// ������ �浵�� ���� ����ؼ� �� ������ �Ÿ� ���
				double kopo11_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo11_field[3]) - kopo11_lat, 2)
						+ Math.pow(Double.parseDouble(kopo11_field[2]) - kopo11_lng, 2));

				// ����� �Ÿ��� ���� �ּҰ����� ������ �Ÿ����, MINCnt��ȣ, MINadress�ּ�, ����, �浵 �� ����
				if (kopo11_dist < kopo11_resultMIN) {
					kopo11_resultMIN = kopo11_dist;
					kopo11_MINCnt = kopo11_LineCnt;
					kopo11_MINadress = kopo11_field[6];
					kopo11_MINlat = kopo11_field[3];
					kopo11_MINlng = kopo11_field[2];
				}

				// ����� �Ÿ��� ���� �ִ밪���� ũ�� �Ÿ����, MAXCnt��ȣ, MAXadress�ּ�, ����, �浵 �� ����
				if (kopo11_dist > kopo11_resultMAX) {
					kopo11_resultMAX = kopo11_dist;
					kopo11_MAXCnt = kopo11_LineCnt;
					kopo11_MAXadress = kopo11_field[6];
					kopo11_MAXlat = kopo11_field[3];
					kopo11_MAXlng = kopo11_field[2];
				}

				kopo11_LineCnt++; // 1 �߰�
			}

			kopo11_br.close(); // BufferedReader ����

			System.out.printf("******************* ���� ���������� *******************\n"); // ***** ���� ��� ����
			System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
			System.out.printf("<< �ִܰŸ� >>\n"); // ��� ����
			System.out.printf("********************[%d��° �׸�]********************\n", kopo11_MINCnt); // �� ��� ����
			System.out.printf(" \n%s : %s\n", kopo11_field_name[6], kopo11_MINadress); // �� ��� ����
			System.out.printf(" ���� : %s\n", kopo11_MINlat); // MIN���� �� ��� ����
			System.out.printf(" �浵 : %s\n", kopo11_MINlng); // MIN�浵 �� ��� ����
			System.out.printf(" ���������� �Ÿ� : %f\n", kopo11_resultMIN); // �� ��� ����
			System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
			System.out.println(); // ����

			System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
			System.out.printf("<< ����Ÿ� >>\n"); // ��� ����
			System.out.printf("********************[%d��° �׸�]********************\n", kopo11_MAXCnt); // �� ��� ����
			System.out.printf(" \n%s : %s\n", kopo11_field_name[6], kopo11_MAXadress); // �� ��� ����
			System.out.printf(" ���� : %s\n", kopo11_MAXlat); // MAX���� �� ��� ����
			System.out.printf(" �浵 : %s\n", kopo11_MAXlng); // MAX�浵 �� ��� ����
			System.out.printf(" ���������� �Ÿ� : %f\n", kopo11_resultMAX); // �� ��� ����
			System.out.printf("*******************************************************\n"); // ***** ���� ��� ����

		} catch (NullPointerException e) { // NullPointerException �� �߻��� �� catch
			System.out.printf("�Էµ� ���� NULL �Դϴ�. Ȯ���� �ּ���.\n"); // ��� ����
		} catch (Exception e) { // Exception ���� �߻� �� catch
			System.out.printf("���� �߻�!\n"); // ��� ����
		}
	}
}
