package java2_0321;

public class switch_case {

	public static void main(String[] args) {

		String kopo11_jumin = "123456-1234567"; // String Ÿ�� "123456-1234567" �ʱⰪ ����

		switch (kopo11_jumin.charAt(7)) { // kopo11_jumin 7��° ���ڸ� charŸ������ �����´�.
		case '1': // charŸ�� '1'�϶�
			System.out.printf("20������ �¾ ���� ���\n"); // break�� ��� break�� ���ö����� �귯����.20������ �¾ ���� ���  \n����
		case '2': // charŸ�� '2'�϶�
			System.out.printf("20������ �¾ ���� ���\n"); // 20������ �¾ ���� ��� \n����
			break; // switch���� ���⼭ �����.
		case '3': // charŸ�� '3'�϶�
			System.out.printf("20������ �¾ ���� ���\n");// 20������ �¾ ���� ��� \n����
			break; // switch���� ���⼭ �����.
		case '4': // charŸ�� '4'�϶�
			System.out.printf("20������ �¾ ���� ���\n"); // 20������ �¾ ���� ��� \n����
			break; // switch���� ���⼭ �����.
		default: // �� ��
			System.out.printf("���\n"); // ��� \n����
			break; // switch���� ���⼭ �����.
		}
	}

}
