package java2_0320;

public class Taxcalc3 {

	public static void main(String[] args) {

		String[] kopo11_item = { "맛동산", "웨하스", "롯데샌드", "오땅", "사브레" }; // String 타입 과자이름 배열 선언
		int[] kopo11_price = { 1000, 2000, 3000, 2500, 1450 }; // 상품가격 선언
		int[] kopo11_amount = { 10, 2, 1, 3, 5 }; // 과자 갯수 선언
		double tax_rate = 0.1; // 세금
		int total_sum = 0; // int형 초기값 0 선언

		System.out.printf("*******************************************************\n");	// **라인 출력 개행
		System.out.printf("                내가 산 과자들              \n");	// 내가 산 과자들 출력 개행
		System.out.printf(" 항목		단가		수량		합계 	\n");	// 항목 단가 수량 합계 출력 개행

		for (int i = 0; i < kopo11_item.length; i++) { // 과자종류 만큼 반복문 실행
			int sum = kopo11_price[i] * kopo11_amount[i]; // 과자 가격[i] * 과자 갯수[i]
			total_sum = total_sum + sum; // 누적 (과자 가격[i] * 과자 갯수[i]) 더하기

			if (i == 2) { // i == 2이면 탭 한번만 찍기
				System.out.printf("%s	%d		%d		%d\n", kopo11_item[i], kopo11_price[i], kopo11_amount[i], sum);
			} else { // 아니면 탭 두번 찍기
				System.out.printf("%s		%d		%d		%d\n", kopo11_item[i], kopo11_price[i], kopo11_amount[i],
						sum);

			}
		}

		System.out.printf("*******************************************************\n");	// **라인 출력 개행
		System.out.printf(" 지불 금액 : 	%20d\n", total_sum); // %20d ->최대 20까지,누적된 total_sum 출력

		int total_net_price = (int) (total_sum / (1 + tax_rate)); // 누적된 과자값 / 1.1
		System.out.printf(" 과세 금액 :	%20d\n", total_net_price);	// %20d ->최대 20까지, 과세금액 : total_net_price
		int tax = total_sum - total_net_price; // 세금 = 누적된 과자값- 과세금액
		System.out.printf(" 세	금 : 	%20d\n", tax);	// %20d ->최대 20까지,세 금 : tax
	}

}
