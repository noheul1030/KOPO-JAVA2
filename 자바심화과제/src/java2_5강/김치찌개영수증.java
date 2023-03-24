package java2_5강;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 김치찌개영수증 {

	public static void main(String[] args) {
		// 시간을 내가 지정한 틀로 format해서 뽑아주는 객체 생성
		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String kopo11_date = kopo11_sd.format(new Date()); // 원하는 형식으로 나온 시간데이터를 받는 변수
		
		// 값을 지정한 형식으로 format해주는 객체 생성
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");
		
		int kopo11_price = 30000;	// int 형태의 변수에 30000 초기값 대입
		
		double kopo11_tax = 0.1;	// double 형태의 변수에 0.1 초기값 대입
		
		System.out.printf("%s\n","신용승인");	// String 출력 개행
		System.out.printf("단말기 : %s%5s전표번호 : %s\n","2N68665898","","041218"); // String 출력 개행
		System.out.printf("가맹점 : %s\n","한양김치찌개"); // String 출력 개행
		System.out.printf("주  소 : %s\n","경기 성남시 분당구 황새울로351번길 10 , 1층"); // String 출력 개행
		System.out.printf("대표자 : %s\n","유창신"); // String 출력 개행
		System.out.printf("사업자 : %s%7sTEL : %s\n","752-53-00558","","7055695"); // String 출력 개행
		System.out.printf("-----------------------------------------\n"); // ----- 라인 출력 개행
		System.out.printf("금  액%32s 원\n",kopo11_df.format((int)kopo11_price)); // 원하는 형태로 format한 kopo11_price 출력 개행
		System.out.printf("부가세%32s 원\n",kopo11_df.format((int)(kopo11_price * kopo11_tax))); // 원하는 형태로 format한 (kopo11_price * kopo11_tax) 출력 개행
		// 원하는 형태로 format한 kopo11_price+(kopo11_price * kopo11_tax) 출력 개행
		System.out.printf("합  계%32s 원\n",kopo11_df.format((int)kopo11_price+(kopo11_price * kopo11_tax))); 
		System.out.printf("-----------------------------------------\n"); // ----- 라인 출력 개행
		System.out.printf("%s\n","우리카드"); // String 출력 개행
		System.out.printf("카드번호 : %s%5s\n","5387-20**-****-4613(s)","일시불"); // String 출력 개행
		System.out.printf("거래일시 : %s\n",kopo11_date); 	// 원하는 형태로 format 한 kopo11_date 출력 개행
		System.out.printf("승인번호 : %s\n","70404427"); // String 출력 개행
		System.out.printf("거래번호 : %s\n","357734873739"); // String 출력 개행
		System.out.printf("매입 : %s%5s가맹 : %s\n","비씨카드사","","720068568"); // String 출력 개행
		System.out.printf("알림 : %s\n","EDC매출표"); // String 출력 개행
		System.out.printf("문의 : %s\n","TEL)1544-4700"); // String 출력 개행
		System.out.printf("-----------------------------------------\n"); // ----- 라인 출력 개행
		System.out.printf("%22s\n","* 감사합니다 *"); // String 출력 개행
		System.out.printf("%39s\n","표준v2.08_20200212"); // String 출력 개행

	}

}
