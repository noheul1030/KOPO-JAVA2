package java2_0320;

public class VarEx1 {

	public static void main(String[] args) {

		int kopo_year = 0; // int ���� year �ʱⰪ 0 ����
		int kopo11_age = 14; // int ���� age �ʱⰪ 14 ����

		System.out.println(kopo_year); // 0 ���
		System.out.println(kopo11_age);	// 14 ���

		kopo_year = kopo11_age + 2000;	// year ������ 14 + 2000 �� ����
		kopo11_age = kopo11_age + 1;	// 14 + 1

		System.out.println(kopo_year);	// 2014 ���
		System.out.println(kopo11_age);	// 15 ���

	}

}
