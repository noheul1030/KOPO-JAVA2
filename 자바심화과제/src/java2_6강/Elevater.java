package java2_6��;

public class Elevater {

	int kopo11_limit_uo_floor = 10;	// �ֻ��� ��
	int kopo11_limit_down_floor = 0;	// ������ ��
	int kopo11_floor = 1; // ���� ��
	String kopo11_help; // String �������� ����
	
	void up()	// ���������Ͱ� �ö� �� �޼���
	{
		if(kopo11_floor == kopo11_limit_uo_floor) { // floor�� �ֻ����� ��
			kopo11_help = "���������Դϴ�."; // String ������ ����
		}else { // �ֻ����� �ƴ� ��
			kopo11_floor++; // floor 1 �߰�
			kopo11_help = String.format("%d���Դϴ�.", kopo11_floor); // String ������ ����
		}
	}
	void down()	// ���������Ͱ� ������ �� �޼���
	{
		if(kopo11_floor == kopo11_limit_down_floor) { // floor�� 1���� ��
			kopo11_help = "ó���� �Դϴ�.";// String ������ ����
		}else { // 1���� �ƴ� ��
			kopo11_floor--; // floor 1 ����
			kopo11_help = String.format("%d���Դϴ�.", kopo11_floor); // String ������ ����
		}
	}

}

