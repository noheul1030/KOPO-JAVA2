package java2_6��;

public class ������_Practice {

	public static void main(String[] args) {
		TvRem_ocon kopo11_tv; // Ŭ���� ���� ����
		
		kopo11_tv = new TvRem_ocon(); // ������ �� Ŭ���� ��ü ����
		
		for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9 ���� ���� �ݺ���
			kopo11_tv.ChannelUp(); // tv ��ü�� ChannelUp ����
			System.out.printf("[%s]\n",kopo11_tv.Voice); // String ��� ����
		}
		System.out.printf("\n"); // ����
		for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9 ���� ���� �ݺ���
			kopo11_tv.ChannelDn(); // tv ��ü�� ChannelDn ����
			System.out.printf("[%s]\n",kopo11_tv.Voice); // String ��� ����
		}
		System.out.printf("\n"); // ����
		for (int kopo11_i = 0; kopo11_i < 5; kopo11_i++) { // 0 ~ 5 ���� ���� �ݺ���
			kopo11_tv.VolUp();  // tv ��ü�� VolUp ����
			System.out.printf("[%s]\n",kopo11_tv.Voice); // String ��� ����
		}
		System.out.printf("\n"); // ����
		for (int kopo11_i = 0; kopo11_i < 5; kopo11_i++) { // 0 ~ 5 ���� ���� �ݺ���
			kopo11_tv.VolDn(); // tv ��ü�� VolDn ����
			System.out.printf("[%s]\n",kopo11_tv.Voice); // String ��� ����
		}
		System.out.printf("\n"); // ����

	}

}
