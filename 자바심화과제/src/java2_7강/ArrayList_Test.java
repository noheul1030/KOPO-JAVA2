package java2_7��;

import java.util.ArrayList;

public class ArrayList_Test {

	public static void main(String[] args) {
//		List1();
		List2();
	}

	public static void List1() {
		ArrayList kopo11_iAL = new ArrayList(); // ����Ʈ new ��ü ����

		kopo11_iAL.add("abc"); // ����Ʈ�� �߰�
		kopo11_iAL.add("abcd"); // ����Ʈ�� �߰�
		kopo11_iAL.add("efga"); // ����Ʈ�� �߰�
		kopo11_iAL.add("������0"); // ����Ʈ�� �߰�
		kopo11_iAL.add("1234"); // ����Ʈ�� �߰�
		kopo11_iAL.add("12rk34"); // ����Ʈ�� �߰�

		System.out.printf("******************************\n"); // ****** ���� ��� ����
		System.out.printf(" ���� ArraySize %d \n", kopo11_iAL.size()); // ���ް� ��� ����
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ ����Ʈ ������ ��ŭ ���� �ݺ���
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // ���ް� ��� ����
		}

		kopo11_iAL.set(3, "������"); // ����Ʈ 3���� ���� ����
		System.out.printf("******************************\n"); // ****** ���� ��� ����
		System.out.printf(" ���뺯�� ArraySize %d \n", kopo11_iAL.size()); // ���ް� ��� ����
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ ����Ʈ ������ ��ŭ ���� �ݺ���
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // ���ް� ��� ����
		}

		kopo11_iAL.remove(4); // ����Ʈ 4���� ����
		System.out.printf("******************************\n"); // ****** ���� ��� ����
		System.out.printf(" ���뺯�� ArraySize %d \n", kopo11_iAL.size()); // ���ް� ��� ����
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ ����Ʈ ������ ��ŭ ���� �ݺ���
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // ���ް� ��� ����
		}

		kopo11_iAL.sort(null); // null���� ����Ʈ�� ����
		System.out.printf("******************************\n"); // ****** ���� ��� ����
		System.out.printf(" ����ƮSort ArraySize %d \n", kopo11_iAL.size()); // ���ް� ��� ����
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ ����Ʈ ������ ��ŭ ���� �ݺ���
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // ���ް� ��� ����
		}

		kopo11_iAL.clear(); // ����Ʈ �ʱ�ȭ
		System.out.printf("******************************\n"); // ****** ���� ��� ����
		System.out.printf(" ���� ���� ArraySize %d \n", kopo11_iAL.size()); // ���ް� ��� ����
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ ����Ʈ ������ ��ŭ ���� �ݺ���
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // ���ް� ��� ����
		}
	}
	
	public static void List2() {
		int kopo11_iTestMAX = 1000000; // int ���� �ʱⰪ 1000000 eodlq
		ArrayList kopo11_iAL = new ArrayList(); // ����Ʈ new ��ü ����
		
		for (int kopo11_i = 0; kopo11_i < kopo11_iTestMAX; kopo11_i++) { // 0 ~ 1000000���� ���� �ݺ���
			kopo11_iAL.add((int)(Math.random()*1000000)); // ����Ʈ�� ���� �� �߰�
		}
		
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // ����Ʈ�� ������ ��ŭ ���� �ݺ���
			System.out.printf(" ArrayList %d = %d\n",kopo11_i,kopo11_iAL.get(kopo11_i)); // ���� �� ��� ����
		}
		
		System.out.printf("******************************\n"); // ****** ���� ��� ����
		kopo11_iAL.sort(null); // �� ���� ����
		
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // ����Ʈ�� ������ ��ŭ ���� �ݺ���
			System.out.printf(" ArrayList %d = %d\n",kopo11_i,kopo11_iAL.get(kopo11_i)); // ���� �� ��� ����
		}
	}

}
