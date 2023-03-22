package java2_2강3강;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ChangeMoney {

	public static void main(String[] args) {

		int kopo11_MyWon = 1000000; // int형 MyWon변수 초기값 1000000 선언
		double kopo11_MoneyEx = 1238.21; // 달러 환전율
		double kopo11_commission = 0.003; // 수수료

		int kopo11_usd = (int) (kopo11_MyWon / kopo11_MoneyEx); // 달러 : 내돈 / 환전율
		int kopo11_remain = (int) (kopo11_MyWon - kopo11_usd * kopo11_MoneyEx); // 잔돈 : 내돈 - (달러*환전율)

		System.out.printf("************************************************************************\n");	// **라인 출력 개행
		System.out.printf("			  수수료 없이 계산		\n");	// 수수료 없이 계산 출력 개행
		// 총 한화환전금액: kopo11_MyWon원 => 미화: usd달러, 잔돈: remain원 출력
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원\n", kopo11_MyWon, kopo11_usd, kopo11_remain);

		System.out.printf("************************************************************************\n");	// **라인 출력 개행
		System.out.printf("\n");	// 개행
//		
//		
//		
//
		double kopo11_ComPerOne = kopo11_MoneyEx * kopo11_commission; // 1 달러당 달러 환율 * 수수료

		double totalcom = kopo11_usd * kopo11_ComPerOne; // 총 환전한 달러 * 환전 수수료
		System.out.printf("************************************************************************\n");	// **라인 출력 개행
		System.out.printf("			  수수료 계산		\n");	// 수수료 계산 출력 개행
		// 총 수수료: totalcom원 => 미화: usd달러, 달러당 수수료: ComPerOne원 출력
		System.out.printf("총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", totalcom, kopo11_usd, kopo11_ComPerOne);

		System.out.printf("************************************************************************\n");	// **라인 출력 개행
		System.out.printf("\n");	// 개행
//		
//		
//		
//
		int i_totalcom; // int형 총수수료 변수 선언

		if (totalcom != (double) ((int) totalcom)) { // totalcom의 더블형과 int 변환 후 소숫점 버림 수가 같지 않다면!
			i_totalcom = (int) totalcom + 1; // i_totalcom = totalcom + 1한 값을 더한다.
		} else {
			i_totalcom = (int) totalcom; // 같으면 걍 int로 소숫점 버린수를 i_totalcom에 저장
		}
		System.out.printf("************************************************************************\n");	// **라인 출력 개행
		System.out.printf("			  수수료 적용환전		\n");	// 수수료 적용 환전 출력 개행
		// 총 수수료: i_totalcom원 => 미화: usd달러, 달러당 수수료: ComPerOne원 출력
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", i_totalcom, kopo11_usd, kopo11_ComPerOne);

		// 잔돈 : int형으로 소숫점 이하 버린 (내돈 - (달러환전금 * 환전율) - 총 수수료)
		kopo11_remain = (int) (kopo11_MyWon - kopo11_usd * kopo11_MoneyEx - i_totalcom);
		// 총 한화환전금액: kopo11_MyWon원 => 미화: usd달러, 수수료징수: i_totalcom원 잔돈: remain 출력
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징수: %d원 잔돈: %d\n", kopo11_MyWon, kopo11_usd, i_totalcom, kopo11_remain);
		System.out.printf("************************************************************************\n");	// **라인 출력 개행
		System.out.printf("\n");	// 개행
//
//		
//		
//		
		kopo11_usd = (int) (kopo11_MyWon / (kopo11_MoneyEx + kopo11_ComPerOne)); // 총 환전 달러 = 내돈 / 환전율 + 1달러당 환전 수수료
		totalcom = kopo11_usd * kopo11_ComPerOne; // 총 수수료 = 총 환전 달러 * 1달러당 환전 수수료
		///////////////////
		// 수수료 올림처리
		if (totalcom != (double) ((int) totalcom)) // totalcom의 더블형과 int 변환 후 소숫점 버림 수가 같지 않다면!
			i_totalcom = (int) totalcom + 1; // i_totalcom = totalcom + 1한 값을 더한다.
		else
			i_totalcom = (int) totalcom; // 같으면 int로 소숫점 버린수를 i_totalcom에 저장
		///////////////////
		System.out.printf("************************************************************************\n");	// **라인 출력 개행
		System.out.printf("			 (정확한)수수료 적용환전		\n");	// (정확한)수수료 적용환전 출력 개행

		// 총 수수료: i_totalcom원 => 미화: usd달러, 달러당 수수료: ComPerOne원 출력
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", i_totalcom, kopo11_usd, kopo11_ComPerOne);

		// 잔돈 : int형으로 소숫점 이하 버린(내돈 - (달러환전금 * 환전율) - 총 수수료
		kopo11_remain = (int) (kopo11_MyWon - kopo11_usd * kopo11_MoneyEx - i_totalcom);
		// 총 한화환전금액: kopo11_MyWon원 => 미화: usd달러, 수수료징수: i_totalcom원 잔돈: remain 출력
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징수: %d원 잔돈: %d\n", kopo11_MyWon, kopo11_usd, i_totalcom, kopo11_remain);

		System.out.printf("************************************************************************\n");	// **라인 출력 개행
		System.out.printf("\n");	// 개행
//
//		
//		
//		

		DecimalFormat kopo11_decimal = new DecimalFormat("###,###,###,###,###");	// 숫자 1,000단위로 ,컴마 찍기 포맷 설정

		System.out.printf("************************************************************************\n");	// **라인 출력 개행
		System.out.printf("			콤마찍기, 날짜 적용			\n");	// 콤마찍기, 날짜 적용 출력 개행
		
		// 1000 단위로 , 찍어서 출력
		// 총 수수료: kopo11_decimal.format(i_totalcom)원 => 미화: kopo11_decimal.format(usd) 달러, 달러당 수수료: ComPerOne원
		System.out.printf("총 수수료: %s원 => 미화: %s 달러, 달러당 수수료: %f원\n", 
				kopo11_decimal.format(i_totalcom),kopo11_decimal.format(kopo11_usd),kopo11_ComPerOne);

		// 잔돈 : int형으로 소숫점 이하 버린(내돈 - (달러환전금 * 환전율) - 총 수수료
		kopo11_remain = (int)(kopo11_MyWon - kopo11_usd * kopo11_MoneyEx - i_totalcom);	
		
		// 1000 단위로 , 찍어서 출력
		// 총 한화환전금액: kopo11_decimal.format(kopo11_MyWon)원 => 미화: kopo11_decimal.format(usd)달러, 
		// 수수료 징수: kopo11_decimal.format(i_totalcom)원 잔돈: kopo11_decimal.format(remain)원
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료 징수: %s원 잔돈: %s원\n",
				kopo11_decimal.format(kopo11_MyWon),kopo11_decimal.format(kopo11_usd), 
				kopo11_decimal.format(i_totalcom),kopo11_decimal.format(kopo11_remain));
		
		System.out.printf("\n");	// 개행
//
//
//		
//		
		Calendar kopo11_cal = Calendar.getInstance();	// 시간 설정 함수 불러오기
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");	// SimpleDataFormat 객체 생성("YYYY/MM/dd HH:mm:ss")형태로 
		System.out.printf("최종 실행 시간: %s\n", sdt.format(kopo11_cal.getTime()));	// sdt 객체에 getTime입력
		
		System.out.printf("************************************************************************\n");	// **라인 출력 개행
	}

}