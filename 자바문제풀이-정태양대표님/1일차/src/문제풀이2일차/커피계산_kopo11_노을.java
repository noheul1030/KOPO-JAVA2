package 문제풀이2일차;

import java.util.Scanner;

public class 커피계산_kopo11_노을 {

	public static void main(String[] args) {
		int coffePay = 2000;
		int albaPay = 10000;
		int coffeMakeTime = 3;
		double money = 0.66;
		
		// 10잔 -> 1잔 free
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주문할 커피 잔 수를 입력하세요 >>> ");
		
		int input = scanner.nextInt();
		System.out.println();
		
		System.out.println("*****10잔 주문시 1잔 공짜!*****");
		int 서비스 = input/10;
		System.out.println("서비스 커피는 "+서비스+" 잔 입니다.");
		System.out.println();
		
		if(input < 10) {
		System.out.printf("지불하실 금액은 : %d 원\n",input*coffePay);
		System.out.println();
		
		int 커피만드는시간 = input * coffeMakeTime;
		System.out.println("대기 시간은 "+커피만드는시간+" 분 입니다.");
		System.out.println();
		
		int 알바비 = albaPay+(커피만드는시간/60)*albaPay;
		System.out.println("알바비는 "+알바비+" 원 입니다.");
		System.out.println();
		
		int 순수익 = (int)((coffePay * input)*money)- 알바비;
		System.out.println("순수익은 "+순수익+" 원 입니다.");
		System.out.println();
		
		}
		else if(input >= 10) {
			System.out.printf("지불하실 금액은 : %d 원\n",(input*coffePay)-(서비스*coffePay));
			System.out.println();
			
			int 커피만드는시간 = input * coffeMakeTime;
			System.out.println("대기 시간은 "+커피만드는시간+" 분 입니다.");
			System.out.println();
			
			int 알바비 = albaPay+(커피만드는시간/60)*albaPay;
			System.out.println("알바비는 "+알바비+" 원 입니다.");
			System.out.println();
			
			int 순수익 = (int)((coffePay * input)*money)- 알바비 - (int)((서비스*coffePay)*money);
			System.out.println("순수익은 "+순수익+" 원 입니다.");
			System.out.println();
		}
	}

}
