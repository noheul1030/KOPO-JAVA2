package java2_5��;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class �޷� {

	public static void main(String[] args) {
		// int �迭�� { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 } �ʱⰪ ����
		int[] kopo11_month = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		// String �迭�� { "��", "��", "ȭ", "��", "��", "��", "��" } �ʱⰪ ����
		String[] kopo11_week = { "��", "��", "ȭ", "��", "��", "��", "��" };

		// int �迭�� { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } �ʱⰪ ����
		int[] kopo11_day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int kopo11_weekday = 5; // int Ÿ���� ������ 0 �ʱⰪ ����

		// 0 ~ kopo11_month�� ���̸�ŭ �ݺ�
		for (int kopo11_i = 0; kopo11_i < kopo11_month.length; kopo11_i++) {
			System.out.printf("%13d��\n", kopo11_i + 1); // kopo11_i + 1�� ��� ����
			System.out.printf("===========================\n"); // ======���� ��� ����

			// 0 ~ kopo11_week�� ���̸�ŭ �ݺ�
			for (int kopo11_j = 0; kopo11_j < kopo11_week.length; kopo11_j++) {
				System.out.printf("%2s ", kopo11_week[kopo11_j]); // kopo11_week�� j ��° ���
			}
			System.out.printf("\n"); // ����

			// 0 ~ kopo11_weekday�� ���̸�ŭ �ݺ�
			for (int kopo11_j = 0; kopo11_j < kopo11_weekday; kopo11_j++) {
				System.out.printf("%4s", " ");	// ���� ���
			}
			
			// 1 ~ kopo11_day[kopo11_i]�� ���̸�ŭ �ݺ�
			for (int kopo11_j = 1; kopo11_j <= kopo11_day[kopo11_i]; kopo11_j++) {
					System.out.printf("%3d ", kopo11_j);	// kopo11_j ���
					kopo11_weekday++;	// kopo11_weekday�� 1�� ���Ѵ�

				if (kopo11_weekday == 7) {	// kopo11_weekday�� 7�̵Ǹ� 
					System.out.printf("\n");	// ����
					kopo11_weekday = 0;	// kopo11_weekday�� 0 ����
				}
			}
			System.out.print("\n");	// ����

		}

	}

}
