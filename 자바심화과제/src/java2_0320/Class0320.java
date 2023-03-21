package java2_0320;

public class Class0320 {

	public static void main(String[] args) {
//////////////////////////////////////////
// #1. 연산후 대입, 당연히 사칙연산의 순서
		int kopo11_num1; // int형의 변수 kopo11_num1 선언
		kopo11_num1 = 1 + 2; // kopo11_num1의 변수에 1 + 2의 연산 결과 대입
		System.out.printf("#1-1 : %d\n", kopo11_num1); // 프린트 #1번의 1번 결과물 출력 : 3;
		kopo11_num1 = 1 + 2 * 3; // kopo11_num1의 변수에 1 + 2 * 3의 연산 결과 대입
		System.out.printf("#1-2 : %d\n", kopo11_num1); // 프린트 #1번의 2번 결과물 출력 : 7;
		System.out.printf("\n");	// 개행
		
//////////////////////////////////////////
// #2. 누적하기, 합구하기

		int kopo11_num2; // int형의 변수 kopo11_num2 선언

		kopo11_num2 = 0; // kopo11_num2에 0을 초기값으로 선언

		for (int i = 1; i < 101; i++) { // 1~100까지의 반복문 생성
			kopo11_num2 = kopo11_num2 + i; // 0을 초기값으로 준 kopo11_num2에 1~100까지 i값을 하나씩 누적으로 더하기
		}
		System.out.printf("#2-1 : %d\n", kopo11_num2); // 총 누적된 kopo11_num2의 값 출력
		System.out.printf("#2-2 : %d\n", kopo11_num2 / 100); // kopo11_num2의 누적값에 100을 나누어 평균 구하기 출력

		int[] kopo11_num3 = { 1, 2, 3, 4, 5 }; // int타입의 배열 kopo11_num3 에 초기값 {1,2,3,4,5} 선언
		int kopo11_num3_Sum; // int형의 변수 kopo11_num3_Sum 선언

		kopo11_num3_Sum = 0; // 0을 초기값으로 선언

		for (int i = 0; i < 5; i++) { // 0 ~ 4까지의 반복문 생성
			kopo11_num3_Sum = kopo11_num3_Sum + kopo11_num3[i]; // int 배열값에 있는 {1,2,3,4,5}의 값을 하나씩 가져와서 더하기
		}
		System.out.printf("#2-3 : %d\n", kopo11_num3_Sum); // kopo11_num3_Sum에 담긴 누적값 출력
		System.out.printf("\n");	// 개행
		
////////////////////////////////////////
// #3. 정수형 변수의 나눗셈은 정수범위에서 버림처리

		int kopo11_num4 = 1000 / 3; // int형의 변수 kopo11_num4에 1000/3 대입
		System.out.printf("#3-1 : %d\n", kopo11_num4);	// # 3-1 :  kopo11_num4

		kopo11_num4 = 1000 % 3; // int형의 변수 kopo11_num4에 1000%3 대입
		System.out.printf("#3-2 : %d\n", kopo11_num4);	// # 3-2 :  kopo11_num4

		for (int i = 0; i < 20; i++) { // 0 ~ 20까지의 반복문 생성
			System.out.printf("#3-3 : %d\t", i);	// # 3-3 :  i

			if (((i + 1) % 5) == 0) { // 5개 출력마다 출바꿈
				System.out.printf("\n");	// 개행
			}
		}
		System.out.printf("\n");	// 개행
		
////////////////////////////////////////
// #4. 원하는 자릿수 반올림, 버림처리

		int kopo11_num5 = 12345; // int형의 변수 kopo11_num5에 12345 대입
		int j = (kopo11_num5 / 10) * 10; // 10원 단위 버림처리
		System.out.printf("#4-1 : %d\n", j);	// #4-1 : j

		kopo11_num5 = 12345; // int형의 변수 kopo11_num5에 12345 대입
		j = ((kopo11_num5 + 5) / 10) * 10; // 10원 단위 올림처리

		System.out.printf("#4-2 : %d\n", j);	// #4-2 : j

		kopo11_num5 = 12344; // int형의 변수 kopo11_num5에 12344 대입
		j = ((kopo11_num5 + 5) / 10) * 10; // 10원 단위 올림처리

		System.out.printf("#4-3 : %d\n", j);	// #4-3 : j

		kopo11_num5 = 12345; // int형의 변수 kopo11_num5에 12345 대입
		j = ((kopo11_num5) / 100) * 100; // 100원 단위 버림처리

		System.out.printf("#4-4 : %d\n", j);	// #4-4 : j

		kopo11_num5 = 12345; // int형의 변수 kopo11_num5에 12345 대입
		j = ((kopo11_num5 + 55) / 100) * 100; // 100원 단위 올림처리

		System.out.printf("#4-5 : %d\n", j);	// #4-5 : j
		System.out.printf("\n");	// 개행
		
//////////////////////////////////////////
// #5. 소수점 이하에서는 어떻게 할까?

		int kopo11_num6 = 14 / 5; // int형의 변수 kopo11_num6에 14/5 대입,int형은 소숫점이하 자리수 버림

		System.out.printf("#5-1 : %d\n", kopo11_num6); // #5-1 : kopo11_num6 %d 정수 출력

		double kopo11_num7; // double형의 변수 kopo11_num7 선언

		kopo11_num7 = 14 / 5; // double형 이지만 소숫점을 입력하지않아 소숫점이하 자리 버림처리 됨
		System.out.printf("#5-2 : %f\n", kopo11_num7);	// #5-2 : kopo11_num7	%f 소수점 자리 출력

		kopo11_num7 = 14.0 / 5; // double형으로 소숫점 입력이 되어 소숫점 자리까지 출력OK
		System.out.printf("#5-2 : %f\n", kopo11_num7);	// #5-2 : kopo11_num7	%f 소수점 자리 출력

		kopo11_num7 = (14.0) / 5 + 0.5; // 사칙연산에 따라 14.0/5를 먼저 계산후 +0.5 해준다
		System.out.printf("#5-2 : %f\n", kopo11_num7);	// #5-2 : kopo11_num7	%f 소수점 자리 출력

		kopo11_num6 = (int) ((14.0) / 5 + 0.5); // 소숫점 자리는 버림처리되므로 값은 3만 출력
		System.out.printf("#5-2 : %d\n", kopo11_num6);	// #5-2 : kopo11_num6	%d 정수 출력
		System.out.printf("\n");	// 개행
	
	}
}