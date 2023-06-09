package java2_4강;

public class Test2 {

	public static void main(String[] args) {

//		// String 배열에 {"영","일","이","삼","사","오","육","칠","팔","구"} 초기값 선언
//		String [] kopo11_units = {"영","일","이","삼","사","오","육","칠","팔","구"};
//		for (int kopo11_i = 0; kopo11_i < 101; kopo11_i++) {	 	// 0 ~ 100 까지 도는 반복문
//			
//			if(kopo11_i >= 0 && kopo11_i < 10) {	// i가 0보다 크거나 같고 '그리고' i가 10 보다 작으면 출력
//				System.out.printf("일의자리 : %s\n",kopo11_units[kopo11_i]);	// 일의자리 : i 
//			}
//			else if(kopo11_i >= 10 && kopo11_i < 100) {	// i가 10보다 크거나 같고 '그리고' i가 100 보다 작으면 출력
//				
//				int kopo11_i10,kopo11_i0;	// int 변수 두개 선언
//				
//				kopo11_i10 = kopo11_i/10;	// i 나누기 10 의 값 저장 : 십의자리
//				kopo11_i0 = kopo11_i%10;	// i를 10으로 나누고 그 나머지 값을 저장 : 일의자리
//				
//				if(kopo11_i0 ==0) {	// 나머지값이 0 이면 출력 
//					System.out.printf("십의자리 : %s십\n",kopo11_units[kopo11_i10]);	// 십의자리 : kopo11_i10 십
//				}else {	// 나머지값이 0이 아니라면 출력
//					// 십의자리 : kopo11_i10 십 kopo11_i0
//					System.out.printf("십의자리 : %s십%s\n",kopo11_units[kopo11_i10],kopo11_units[kopo11_i0]);
//					
//				}
//			}
//			else System.out.printf("==> %d\n",kopo11_i);	// 그 외 i ==> 100 출력
//		}
//		
//		
//		
//		
		int kopo11_iNumVal = 1001034567; // int 타입의 변수에 1001034567 초기값 선언

		String kopo11_sNumVal = String.valueOf(kopo11_iNumVal); // int 타입의 변수를 String.valueOf() 함수로 형변환 후 String 변수에 대입

		String kopo11_sNumVoice = ""; // 비어있는 String 타입의 변수 선언

		// %s 스트링타입 출력, %d 정수 출력
		// ==> kopo11_sNumVal [kopo11_sNumVal.length()] 출력 개행
		System.out.printf("==> %s [%d자리]\n", kopo11_sNumVal, kopo11_sNumVal.length());
		System.out.printf("\n"); // 개행

		int kopo11_i, kopo11_j; // int 타입의 변수 2개 선언

		// String 배열에 {"영","일","이","삼","사","오","육","칠","팔","구"} 초기값 선언
		String[] kopo11_units2 = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// String 배열에 {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"} 초기값 선언
		String[] kopo11_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };

		kopo11_i = 0; // 초기값 0 대입
		kopo11_j = kopo11_sNumVal.length() - 1; // 초기값 10 - 1 = 9 대입

		while (true) { // while 반복문 true일때 계속 실행한다
			if (kopo11_i >= kopo11_sNumVal.length()) // if( 0 >= 10) 이면 break;
				break;

			System.out.printf("%s[%s]", kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1),
					// kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1 -> kopo11_sNumVal 값을
					// .substring(kopo11_i, kopo11_i + 1) 만큼 잘라와서 %s에 String 타입으로 출력한다.
					kopo11_units2[Integer.parseInt(kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1))]);
			// (kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1))를 Integer.parseInt로 int
			// 타입으로 형변환하여
			// kopo11_units2[ ]의 배열에서 []번째에 해당되는 값을 가져와 [%s] String 타입으로 출력한다.

			// kopo11_sNumVal 변수를 .substring( , ) 하여 하나씩 가져온 값이 "0"과 일치하는지 확인한다.
			if (kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1).equals("0")) {

				// kopo11_unitX 배열의 [kopo11_j]번째가 "만"과 일치하는지 '또는' "억"과 일치하는지 확인한다.
				if (kopo11_unitX[kopo11_j].equals("만") || kopo11_unitX[kopo11_j].equals("억")) {
					// 일치할 시 kopo11_sNumVoice 변수에 kopo11_sNumVoice + ""(string타입)+ kopo11_unitX 배열의
					// [kopo11_j]번째 대입
					kopo11_sNumVoice = kopo11_sNumVoice + "" + kopo11_unitX[kopo11_j];

				} else {
					// else는 패스~
				}

			} else {// kopo11_sNumVal 변수를 .substring( , ) 하여 하나씩 가져온 값이 "0"과 일치하지 않을 때
				// kopo11_sNumVoice = kopo11_sNumVoice +
				// (kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1))를 Integer.parseInt로 int
				// 타입으로 형변환하여
				// kopo11_units2의 배열에서 []번째에 해당되는 값을 가져와 더한다.
				// +kopo11_unitX의 [[kopo11_j] 번째 값을 더한다.
				kopo11_sNumVoice = kopo11_sNumVoice
						+ kopo11_units2[Integer.parseInt(kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1))]
						+ kopo11_unitX[kopo11_j];
			}

			kopo11_i++; // kopo11_i에 1을 더한다.
			kopo11_j--; // kopo11_j에 1을 뺀다.

		}
		System.out.printf("\n"); // 개행

		String kopo11_chage_iNumVal = Integer.toString(kopo11_iNumVal);	// String타입 변수에 kopo11_iNumVal변수를 형변환하여 대입
		
		int kopo11_count = 0;	// int 타입 변수에 초기값 0 대입
		// 0 ~ kopo11_chage_iNumVal의 길이만큼 도는 반복문
		for (int kopo11_num = 0; kopo11_num < kopo11_chage_iNumVal.length(); kopo11_num++) {
			// kopo11_chage_iNumVal의 kopo11_num번째가 '0' 이면
			if (kopo11_chage_iNumVal.charAt(kopo11_num) == '0') {
				kopo11_count++;	// kopo11_count에 1씩 더한다
			}
		}

		if (kopo11_count >= 8) {	// count가 8과 같거나 크면 
			// kopo11_chage_iNumVal의 뒤에서 -8번째 부터 끝까지의 값이 "00000000"과 같으면
			if (kopo11_chage_iNumVal.substring(kopo11_chage_iNumVal.length() - 8, kopo11_chage_iNumVal.length()).equals("00000000")) {
				// kopo11_sNumVoice 변수에서 "만" 글자를 삭제하고 String 변수에 대입
				String kopo11_remove = kopo11_sNumVoice.replaceAll("만", "");
				System.out.printf("\n%s[%s]\n", kopo11_sNumVal, kopo11_remove);	// 개행 kopo11_sNumVal[kopo11_remove] 출력 개행
			}
		}else if(kopo11_chage_iNumVal.equals("0")) {	// kopo11_chage_iNumVal가 0과 같으면
			System.out.printf("\n%s[영]\n", kopo11_sNumVal);	// 개행 kopo11_sNumVal[영] 출력 개행
		}
		else	// count가 8 이 아니면
			System.out.printf("\n%s[%s]\n", kopo11_sNumVal, kopo11_sNumVoice); // 개행 kopo11_sNumVal[kopo11_sNumVoice] 출력 개행
	}

}