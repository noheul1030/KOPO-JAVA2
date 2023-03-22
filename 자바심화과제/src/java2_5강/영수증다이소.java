package java2_5강;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 영수증다이소 {

	public static void main(String[] args) {
		Calendar kopo11_cal = Calendar.getInstance();
		kopo11_cal.add(kopo11_cal.DATE, 14);

		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		SimpleDateFormat kopo11_sd2 = new SimpleDateFormat("MM월 dd일");
		
		String kopo11_date = kopo11_sd.format(new Date());
		String kopo11_chageDate = kopo11_sd2.format(kopo11_cal.getTime());
	
		
		
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");
		
		String kopo11_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";
		String kopo11_itemcode1 = "1031615";
		int kopo11_price1 = 3000;
		int kopo11_amount1 = 1;
		
		String kopo11_itemname2 = "슬라이드식명찰(가로형)(100호)";
		String kopo11_itemcode2 = "11008152";
		int kopo11_price2 = 1000;
		int kopo11_amount2 = 1;
		
		String kopo11_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
		String kopo11_itemcode3 = "1020800";
		int kopo11_price3 = 1000;
		int kopo11_amount3 = 1;
		
		int kopo11_priceSum = (kopo11_price1*kopo11_amount1)+(kopo11_price2*kopo11_amount2)+(kopo11_price3*kopo11_amount3);
		double kopo11_tax = 0.909;

		System.out.printf("%22s\n","\"국민가게, 다이소\"");
		System.out.printf("%s\n","(주)아성다이소_분당서현점");
		System.out.printf("전화:%s\n","031-702-6016");
		System.out.printf("본사:%s\n","서울 강남구 남부순환로 2748 (도곡동)");
		System.out.printf("대표:%s\n","박정부,신호섭 213-81-52063");
		System.out.printf("매장:%s\n","경기도 성남시 분당구 분당로53번길 11 (서현동)");
		System.out.printf("========================================\n");
		System.out.printf("%23s\n","소비자중심경영(CCM) 인증기업");
		System.out.printf("%25s\n","ISO 9001 품질경영시스템 인증기업");
		System.out.printf("========================================\n");
		System.out.printf("%15s(%s)%s,\n","교환/환불 14일",kopo11_chageDate,"이내");	
		System.out.printf("%s\n","(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.printf("%24s\n","포장/가격 택 훼손시 교환/환불 불가");
		System.out.printf("%23s\n","체크카드 취소 시 최대 7일 소요");
		System.out.printf("========================================\n");
		System.out.printf("%s%26s\n","[POS 1058231]",kopo11_date);
		System.out.printf("========================================\n");
		System.out.printf("%.14s%1s%s%1s%d%1s%s\n",kopo11_itemname1,"",kopo11_df.format(kopo11_price1)," ",kopo11_amount1," ",
				kopo11_df.format(kopo11_price1*kopo11_amount1));
		System.out.printf("[%s]\n",kopo11_itemcode1);
		System.out.printf("%.14s%3s%s%1s%d%1s%s\n",kopo11_itemname2,"",kopo11_df.format(kopo11_price2)," ",kopo11_amount2," ",
				kopo11_df.format(kopo11_price2*kopo11_amount2));
		System.out.printf("[%s]\n",kopo11_itemcode2);
		System.out.printf("%.14s%1s%s%1s%d%1s%s\n",kopo11_itemname3,"",kopo11_df.format(kopo11_price3)," ",kopo11_amount3," ",
				kopo11_df.format(kopo11_price3*kopo11_amount3));
		System.out.printf("[%s]\n",kopo11_itemcode3);
		System.out.printf("%15s%21s\n","과세합계",kopo11_df.format((int)(kopo11_priceSum * kopo11_tax)));
		System.out.printf("%16s%21s\n","부가세",kopo11_df.format((int)(kopo11_priceSum-(kopo11_priceSum * kopo11_tax))));
		System.out.printf("----------------------------------------\n");
		System.out.printf("판매합계%32s\n",kopo11_df.format(kopo11_priceSum));
		System.out.printf("========================================\n");
		System.out.printf("신용카드%32s\n",kopo11_df.format(kopo11_priceSum));
		System.out.printf("----------------------------------------\n");
		System.out.printf("우리카드%32s\n","538720**********");
		System.out.printf("승인번호 %s%10s %5s\n","77982843(0)","승인금액",kopo11_df.format(kopo11_priceSum));
		System.out.printf("========================================\n");
		System.out.printf("%24s %s\n",kopo11_date,"분당서현점");
		System.out.printf("상품 및 기타 문의 : %s\n","1544-4400");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : %s\n","1599-2211");
		System.out.printf("%27s\n","2112820610158231");
		System.out.printf("----------------------------------------\n");
		System.out.printf("◈ %s\n","다이소 멤버십 앱 또는 홈페이지에 접속"
				+ "하셔서 회원가입 후 다양한 혜택을 누려보세요! ◈\n"); 
		
		
		
	}

}
