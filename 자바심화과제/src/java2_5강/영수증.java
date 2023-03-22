package java2_5강;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 영수증 {

	public static void main(String[] args) {
		String kopo11_Time = "yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat kopo11_sd = new SimpleDateFormat(kopo11_Time);
		
		String kopo11_date = kopo11_sd.format(new Date());
		
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");
		int kopo11_price = 30000;
		double kopo11_tax = 0.1;
		
		System.out.printf("%s\n","신용승인");
		System.out.printf("단말기 : %s%3s전표번호 : %s\n","2N68665898","","041218");
		System.out.printf("가맹점 : %s\n","한양김치찌개");
		System.out.printf("주  소 : %s\n","경기 성남시 분당구 황새울로351번길 10 , 1층");
		System.out.printf("대표자 : %s\n","유창신");
		System.out.printf("사업자 : %s%5sTEL : %s\n","752-53-00558","","7055695");
		System.out.printf("- - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("금  액%30s 원\n",kopo11_df.format((int)kopo11_price));
		System.out.printf("부가세%30s 원\n",kopo11_df.format((int)(kopo11_price * kopo11_tax)));
		System.out.printf("합  계%30s 원\n",kopo11_df.format((int)kopo11_price+(kopo11_price * kopo11_tax)));
		System.out.printf("- - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("%s\n","우리카드");
		System.out.printf("카드번호 : %s%s\n","5387-20**-****-4613(s)","일시불");
		System.out.printf("거래일시 : %s\n",kopo11_date);
		System.out.printf("승인번호 : %s\n","70404427");
		System.out.printf("거래번호 : %s\n","357734873739");
		System.out.printf("매입 : %s%5s가맹 : %s\n","비씨카드사","","720068568");
		System.out.printf("알림 : %s\n","EDC매출표");
		System.out.printf("문의 : %s\n","TEL)1544-4700");
		System.out.printf("- - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("%21s\n","* 감사합니다 *");
		System.out.printf("%36s\n","표준v2.08_20200212");

	}

}
