package java2_5강;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class 달력 {

	public static void main(String[] args) {
		// int 배열에 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 } 초기값 대입
		int[] kopo11_month = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		// String 배열에 { "일", "월", "화", "수", "목", "금", "토" } 초기값 대입
		String[] kopo11_week = { "일", "월", "화", "수", "목", "금", "토" };

		// int 배열에 { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } 초기값 대입
		int[] kopo11_day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int kopo11_weekday = 5; // int 타입의 변수에 0 초기값 대입

		// 0 ~ kopo11_month의 길이만큼 반복
		for (int kopo11_i = 0; kopo11_i < kopo11_month.length; kopo11_i++) {
			System.out.printf("%13d월\n", kopo11_i + 1); // kopo11_i + 1월 출력 개행
			System.out.printf("===========================\n"); // ======라인 출력 개행

			// 0 ~ kopo11_week의 길이만큼 반복
			for (int kopo11_j = 0; kopo11_j < kopo11_week.length; kopo11_j++) {
				System.out.printf("%2s ", kopo11_week[kopo11_j]); // kopo11_week의 j 번째 출력
			}
			System.out.printf("\n"); // 개행

			// 0 ~ kopo11_weekday의 길이만큼 반복
			for (int kopo11_j = 0; kopo11_j < kopo11_weekday; kopo11_j++) {
				System.out.printf("%4s", " ");	// 공백 출력
			}
			
			// 1 ~ kopo11_day[kopo11_i]의 길이만큼 반복
			for (int kopo11_j = 1; kopo11_j <= kopo11_day[kopo11_i]; kopo11_j++) {
					System.out.printf("%3d ", kopo11_j);	// kopo11_j 출력
					kopo11_weekday++;	// kopo11_weekday에 1씩 더한다

				if (kopo11_weekday == 7) {	// kopo11_weekday가 7이되면 
					System.out.printf("\n");	// 개행
					kopo11_weekday = 0;	// kopo11_weekday에 0 대입
				}
			}
			System.out.print("\n");	// 개행

		}

	}

}
