package java2_0320;

public class VarEx2 {

	public static void main(String[] args) {
		int kopo11_x = 10;	// int 10 �ʱⰪ ����
		int kopo11_y = 20;	// int 20 �ʱⰪ ����
		int kopo11_tmp = 0;	// int 0 �ʱⰪ ����

		System.out.println("x:" + kopo11_x + " y:" + kopo11_y);	// x : 10  y : 20 ���

		kopo11_tmp = kopo11_x;	// tmp ������ x�� 10 ����
		kopo11_x = kopo11_y;	// x ������ y�� 20 ����
		kopo11_y = kopo11_tmp;	// y ������ x���� ���� �ٲ� tmp�� 10 ����

		System.out.println("x:" + kopo11_x + " y:" + kopo11_y);	// x : 20  y : 10 ��� 
	}

}