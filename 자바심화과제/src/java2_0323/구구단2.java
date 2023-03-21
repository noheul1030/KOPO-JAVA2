package java2_0323;

public class 구구단2 {

	public static void main(String[] args) {

		for (int kopo11_i = 1; kopo11_i < 4; kopo11_i++) { // 1 ~ 9까지 순서대로 도는 반복문

			System.out.printf("*************\t*************\t*************\n", kopo11_i, kopo11_i + 1, kopo11_i + 2);
			// 3단씩 출력 이므로 *****\t 해서 간격을 띄워주고 마지막에는 \n으로 개행 출력
			System.out.printf(" 구구단 %d 단\t 구구단 %d 단\t 구구단 %d 단\n", kopo11_i, (kopo11_i + 3), (kopo11_i + 6));
			// 3단씩 출력 구구단 i번 \t i+3번 \t i+6번 \n 개행 출력
			System.out.printf("*************\t*************\t*************\n", kopo11_i, kopo11_i + 1, kopo11_i + 2);
			// 3단씩 출력 이므로 *****\t 해서 간격을 띄워주고 마지막에는 \n으로 개행 출력
			for (int kopo11_j = 1; kopo11_j < 10; kopo11_j++) { // 1 ~ 9까지 순서대로 도는 반복문

				System.out.printf(" %d * %d = %d \t", kopo11_i, kopo11_j, kopo11_i * kopo11_j);
				// i , j , i * j \t 줄간격 출력
				System.out.printf(" %d * %d = %d \t", kopo11_i + 3, kopo11_j, (kopo11_i + 3) * kopo11_j);
				// i+1 , j , (i+3) * j \t 줄간격 출력
				System.out.printf(" %d * %d = %d \n", kopo11_i + 6, kopo11_j, (kopo11_i + 6) * kopo11_j);
				// i+2 , j , (i+6) * j \n 개행 출력
			}
		}

	}

}
