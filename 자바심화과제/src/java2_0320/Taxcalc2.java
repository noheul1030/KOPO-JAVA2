package java2_0320;

public class Taxcalc2 {

	public static void main(String[] args) {
		int kopo11_price = 1234; // int형 price 변수에 1234 초기값 선언
		double kopo11_tax_rate = 0.1; // double형 tax_rate 변수에 0.1 초기값 선언

		// int형 변수에 netprice메서드에 파라미터로 (int kopo11_price, double kopo11_tax_rate) 전달하고 
		// 결과값 return 받기
		int kopo11_netprice = netprice(kopo11_price, kopo11_tax_rate); 
		
		// kopo11_tax = 1234-1121
		int kopo11_tax = kopo11_price - kopo11_netprice;

		System.out.printf("***********************************************\n");	// **라인 출력 개행
		System.out.printf("*       소비자가격, 세전가격, 세금 계산      *\n");	// 소비자가격, 세전가격, 세금 계산 개행
		// 소비자가격: kopo11_price, 세전가격:  kopo11_netprice, 세금 계산: kopo11_tax 출력
		System.out.printf("소비자가격: %d, 세전가격: %d, 세금 계산:%d\n", kopo11_price, kopo11_netprice, kopo11_tax);
		System.out.printf("***********************************************\n");	// **라인 출력 개행

	}
	
	// 파라미터로 (int kopo11_price, double kopo11_tax_rate)값 받음
	public static int netprice(int kopo11_price, double kopo11_tax_rate) {	
		return (int) (kopo11_price / (1 + kopo11_tax_rate));	// 1121 값 리턴 (int)형 주의!
	}

}