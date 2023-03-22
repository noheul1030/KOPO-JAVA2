package java2_4강;

public class Test {

	public static void main(String[] args) {

		////////////////////////////////////////
		// 범위를 주어서 찾기 //
		int kopo11_iVal; // int타입 변수 선언

		for (int kopo11_i = 0; kopo11_i < 300; kopo11_i++) { // 0 ~ 299 까지 도는 반복문

			kopo11_iVal = 5 * kopo11_i; // 5 * i 한 값을 변수에 대입

			// iVal의 값이 0과 같거나 크고 '그리고' 10보다는 작으면 "일 = 값 출력"
			if (kopo11_iVal >= 0 && kopo11_iVal < 10)
				System.out.printf("일 = %d\n", kopo11_iVal);

			// iVal의 값이 10과 같거나 크고 '그리고' 100보다는 작으면 "십 = 값 출력"
			else if (kopo11_iVal >= 10 && kopo11_iVal < 100)
				System.out.printf("십 = %d\n", kopo11_iVal);

			// iVal의 값이 100과 같거나 크고 '그리고' 1000보다는 작으면 "백 = 값 출력"
			else if (kopo11_iVal >= 100 && kopo11_iVal < 1000)
				System.out.printf("백 = %d\n", kopo11_iVal);

			// 조건에 없는 그 외의 값이 들어오면 "천 = 값 출력" 
			else System.out.printf("천 %d\n", kopo11_iVal);
		}

//		
//		
//		
//		

		for (int kopo11_i = 1; kopo11_i < 13; kopo11_i++) { // 1 ~ 12 까지 도는 반복문
			System.out.printf(" %d월 =>", kopo11_i); // i월 출력
			for (int kopo11_j = 1; kopo11_j < 32; kopo11_j++) { // // 1 ~ 32 까지 도는 반복문
				System.out.printf("%d", kopo11_j); // j 일수 출력

				if (true) { // if 문 안의 조건이 true가 되면
					if (kopo11_i == 1 && kopo11_j == 31) {
						break; // i가 1일때 j가 31 이면 break;
					}
					if (kopo11_i == 2 && kopo11_j == 28) {
						break; // i가 2일때 j가 28 이면 break;
					}
					if (kopo11_i == 3 && kopo11_j == 31) {
						break; // i가 3일때 j가 31 이면 break;
					}
					if (kopo11_i == 4 && kopo11_j == 30) {
						break; // i가 4일때 j가 30 이면 break;
					}
					if (kopo11_i == 5 && kopo11_j == 31) {
						break; // i가 5일때 j가 31 이면 break;
					}
					if (kopo11_i == 6 && kopo11_j == 30) {
						break; // i가 6일때 j가 30 이면 break;
					}
					if (kopo11_i == 7 && kopo11_j == 31) {
						break; // i가 7일때 j가 31 이면 break;
					}
					if (kopo11_i == 8 && kopo11_j == 31) {
						break; // i가 8일때 j가 31 이면 break;
					}
					if (kopo11_i == 9 && kopo11_j == 30) {
						break; // i가 9일때 j가 30 이면 break;
					}
					if (kopo11_i == 10 && kopo11_j == 31) {
						break; // i가 10일때 j가 31 이면 break;
					}
					if (kopo11_i == 11 && kopo11_j == 30) {
						break; // i가 11일때 j가 30 이면 break;
					}
					if (kopo11_i == 12 && kopo11_j == 31) {
						break; // i가 12일때 j가 31 이면 break;
					}
					System.out.printf(",", ""); // ",","" 마지막은 콤마를 찍지 않게 출력
				}
			}
			System.out.printf("\n"); // 개행
			System.out.printf("\n"); // 개행
		}

//		
//		
//		
//	
		for (int kpo11_i = 1; kpo11_i < 13; kpo11_i++) { // 1 ~ 12 까지 도는 반복문
			System.out.printf(" %d월 =>", kpo11_i); // i월 출력
			for (int kopo11_j = 1; kopo11_j < 32; kopo11_j++) { // 1 ~ 32 까지 도는 반복문
				System.out.printf("%d", kopo11_j); // j 일수 출력

				if (true) {
					// i가 4 또는 6 또는 9 또는 7 또는 11일때
					if (kpo11_i == 4 || kpo11_i == 6 || kpo11_i == 9 || kpo11_i == 7 || kpo11_i == 11) {
						if (kopo11_j == 30) // j가 30 이면
							break; // break;
					}
					if (kpo11_i == 2) { // i가 2 이고
						if (kopo11_j == 28)
							break; // j가 28과 같으면 break;
					} else if (kopo11_j == 31) // 그 외 j가 31 이면
						break; // break;
					System.out.printf(",", ""); // ",","" 마지막은 콤마를 찍지 않게 출력
				}
			}
			System.out.printf("\n"); // 개행
		}

//		
//		
//		
		for (int kopo11_i = 1; kopo11_i < 13; kopo11_i++) { // 1 ~ 12 까지 도는 반복문
			System.out.printf(" %d월 =>", kopo11_i); // i월 출력
			LOOP: for (int kopo11_j = 1; kopo11_j < 32; kopo11_j++) { // 1 ~ 32 까지 도는 반복문

				System.out.printf("%d,", kopo11_j); // j 일수 출력

				switch (kopo11_i) { // i 가 하나씩 들어올때 도는 스위치
				case 4:
				case 6:
				case 9:
				case 7:
				case 11: // i가 4 또는 6 또는 9 또는 7 또는 11일때
					if (kopo11_j == 30)
						break LOOP; // j가 30이면 LOOP break;
					break;
				case 2: // i가 2 이고
					if (kopo11_j == 28)
						break LOOP; // j가 28과 같으면 break;F
					break;
				}
			}
			System.out.printf("\n"); // 개행
		}
		System.out.printf("\n"); // 개행
//		
//		
//		
//		
		// int 배열에 {31,28,31,30,31,30,31,31,30,31,30,31} 초기값 선언
		int[] kopo11_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int kopo11_i = 1; kopo11_i < 13; kopo11_i++) { // 1 ~ 12 까지 도는 반복문
			System.out.printf(" %d월 =>", kopo11_i); // i월 출력
			for (int j = 1; j < 32; j++) { // 1 ~ 32 까지 도는 반복문
				System.out.printf("%d", j); // j 일수 출력

				if (kopo11_iLMD[kopo11_i - 1] == j)
					break; // iLMe의 i-1번째가 j랑 같으면 break;

				System.out.printf(","); // 마지막 콤마 안찍기
			}
			System.out.printf("\n"); // 개행
		}
	}

}