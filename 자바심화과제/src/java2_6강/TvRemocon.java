package java2_6��;

public class TvRemocon {

	int kopo11_channel_up = 10; // int ���������� 10 ����
	int kopo11_channel_down = 0; // int ���������� 0 ����
	int kopo11_vol_up = 5; // int ���������� 5 ����
	int kopo11_vol_down = 0; // int ���������� 0 ����

	int kopo11_channel = 0; // int ���������� 0 ����
	int kopo11_vol = 0; // int ���������� 0 ����

	String kopo11_Voice; // String �������� ����

	void VolUp() { // ���� UP �޼���

		kopo11_vol++; // 1�߰�
		kopo11_Voice = kopo11_Voice.format("����ũ�� : %d", kopo11_vol); // String ������ ����
		if (kopo11_vol == kopo11_vol_up) { // �� ������ ���� ��
			kopo11_Voice = "������ �ִ� 5 �Դϴ�."; // String ������ ����
		}

	}

	void VolDn() { // ���� DOWN �޼���

		kopo11_vol--; // 1����
		kopo11_Voice = kopo11_Voice.format("����ũ�� : %d", kopo11_vol); // String ������ ����
		if (kopo11_vol == kopo11_vol_down) {// �� ������ ���� ��
			kopo11_Voice = "������ �ּ� 0 �Դϴ�.";// String ������ ����
		}

	}

	void ChannelUp() { // ä�� UP �޼���
		kopo11_channel++; // 1�߰�
		kopo11_Voice = kopo11_Voice.format("ä�ι�ȣ : %d", kopo11_channel); // String ������ ����
		if (kopo11_channel == kopo11_channel_up) { // �� ������ ���� ��
			kopo11_Voice = "ä���� �ִ� 10 �Դϴ�."; // String ������ ����
		}

	}

	void ChannelDn() { // ä�� DOWN �޼���
		kopo11_channel--; // 1����
		kopo11_Voice = kopo11_Voice.format("ä�ι�ȣ : %d", kopo11_channel); // String ������ ����
		if (kopo11_channel == kopo11_channel_down) { // �� ������ ���� ��
			kopo11_Voice = "ä���� �ּ� 0 �Դϴ�."; // String ������ ����
		}

	}
}
