package java2_2강3강;

public class Taxcalc {

	public static void main(String[] args) {
		int kopo11_val = 271; // int형 변수 val에 271 초기값 설정
		int kopo11_rate = 3; // int형 변수 rate에 3 초기값 설정

		int tax = taxcal(kopo11_val, kopo11_rate); // int형 변수 tax에 taxcal메서드에
													// 파라미터로 (kopo11_val,kopo11_rate) 전달하고 결과값 ret 받기

		System.out.printf("********************************************\n");	// **라인 출력 개행
		System.out.printf("****************단순 세금 계산**************\n");	// **라인 출력 개행
		// 실제 세금계산 :  kopo11_val * kopo11_rate / 100.0
		System.out.printf("실제 세금계산: %f\n", kopo11_val * kopo11_rate / 100.0);	// %f 소숫점으로 출력
		
		// 세전가격: kopo11_val,세금: tax,세금포함가격: kopo11_val + tax
		System.out.printf("세전가격: %d 세금: %d 세금포함가격: %d\n", kopo11_val, tax, kopo11_val + tax);	// %d 정수로 출력
		System.out.printf("********************************************\n");	// **라인 출력 개행
	}

	public static int taxcal(int kopo11_val, int kopo11_rate) { // 파라미터로 (kopo11_val,kopo11_rate)값 받음
		int ret; // int형 ret 선언

		// kopo11_val의 더블 값과 kopo11_rate의 더블값을 곱한 후 /100.0 한 값이
		// kopo11_val * kopo11_rate / 100와 같은지 ----> 조건문 확인

		if (((double) kopo11_val * (double) kopo11_rate / 100.0) == kopo11_val * kopo11_rate / 100)

			ret = kopo11_val * kopo11_rate / 100; // true --> ret에 kopo11_val * kopo11_rate / 100 값 저장

		else

			ret = kopo11_val * kopo11_rate / 100 + 1; // else --> ret에 kopo11_val * kopo11_rate / 100 +1 값 저장

		return ret; // ret에 저장된 값 return
	}
}