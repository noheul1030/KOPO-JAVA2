package java2_6��;

public class TestMain {

	private static int inVal; // int �������� ����
	public static void up() { // up �޼ҵ�
		inVal++; // inVal 1 �߰�
		System.out.printf("�� �׳� �޼ҵ�[%d]\n",inVal); // ���
	}
	public static void main(String[] args) { // ����
		
		inVal = 0; // �ʱⰪ 0 ����
		Elevater elev; // Elevater Ŭ������ elev ���� ����
		
		elev = new Elevater(); // ���ο� ��ü ����
		
		up(); // up�޼ҵ� ����
		for (int i = 0; i < 10; i++) { // 0 ~ 9 ���� ���� �ݺ���
			elev.up(); // elev �� up�޼ҵ� ����
			
			System.out.printf("MSG[%s]\n",elev.kopo11_help); // elev �� help �������� ����Ʈ
		}
		for (int i = 0; i < 10; i++) { // 0 ~ 9 ���� ���� �ݺ���
			elev.down(); // elev �� down�޼ҵ� ����
			
			System.out.printf("MSG[%s]\n",elev.kopo11_help);  // elev �� help �������� ����Ʈ
		}
	}

}
