package java2_5강;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 영수증다이소 {

	public static void main(String[] args) {
		
		Calendar kopo11_cal = Calendar.getInstance(); // 시간 설정 변수 선언
		kopo11_cal.add(kopo11_cal.DATE, 14);	// 시간 변수의 일수에서 14일 더한다

		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // 시간을 내가 지정한 틀로 format해서 뽑아주는 객체 생성
		SimpleDateFormat kopo11_sd2 = new SimpleDateFormat("MM월 dd일"); // 시간을 내가 지정한 틀로 format해서 뽑아주는 객체 생성
		
		String kopo11_date = kopo11_sd.format(new Date()); // 원하는 형식으로 나온 시간데이터를 받는 변수
		String kopo11_chageDate = kopo11_sd2.format(kopo11_cal.getTime()); // 14일 더해서 나온 시간데이터를 받는 변수
	
		
		// 값을 지정한 형식으로 format해주는 객체 생성
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");
		
		String kopo11_itemname1 = "해피홈 SAFE365 핸드";	// String 변수에 "퓨어에어 비말차단용마스크(최고급형)" 대입
//		String kopo11_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";	// String 변수에 "퓨어에어 비말차단용마스크(최고급형)" 대입
		String kopo11_itemcode1 = "1031615"; // String 변수에 "1031615" 대입
		int kopo11_price1 = 3000;	// int 변수에 3000 대입
		int kopo11_amount1 = 1; // int 변수에 1 대입
		
		String kopo11_itemname2 = "(대)국내산삼겹살찌개"; // String 변수에 "슬라이드식명찰(가로형)(100호)" 대입
//		String kopo11_itemname2 = "슬라이드식명찰(가로형)(100호)"; // String 변수에 "슬라이드식명찰(가로형)(100호)" 대입
		String kopo11_itemcode2 = "11008152"; // String 변수에 "11008152" 대입
		int kopo11_price2 = 1000; // int 변수에 1000 대입
		int kopo11_amount2 = 1; // int 변수에 1 대입
		
		String kopo11_itemname3 = "DZ주니어양말3족C_WH"; // String 변수에 "매직흡착 인테리어후크(알루미늄타입)" 대입
//		String kopo11_itemname3 = "매직흡착 인테리어후크(알루미늄타입)"; // String 변수에 "매직흡착 인테리어후크(알루미늄타입)" 대입
		String kopo11_itemcode3 = "1020800"; // String 변수에 "1020800" 대입
		int kopo11_price3 = 1000; // int 변수에 1000 대입
		int kopo11_amount3 = 1; // int 변수에 1 대입
		
		// int 변수에 물건 가격 * 수량 값 대입
		int kopo11_priceSum = (kopo11_price1*kopo11_amount1)+(kopo11_price2*kopo11_amount2)+(kopo11_price3*kopo11_amount3);
		
		double kopo11_tax = (double)Math.round((double)kopo11_priceSum / 11); // double 변수에 부가세 계산 대입(세금)
		
		if(kopo11_tax == (double)((int)kopo11_tax)) 	// double tax값과 int로 소숫점 버리고 double 형변환한 tax가 같으면
			kopo11_tax = kopo11_tax;	 //  tax = tax
		else // double tax값과 int로 소숫점 버리고 double 형변환한 tax가 같지 않으면
			kopo11_tax = (double)Math.round(((double)kopo11_priceSum / 11)+0.5); // 부과세 +0.5 반올림값 대입

		System.out.printf("%22s\n","\"국민가게, 다이소\"");	// String 출력 개행
		System.out.printf("%s\n","(주)아성다이소_분당서현점"); // String 출력 개행
		System.out.printf("전화:%s\n","031-702-6016"); // String 출력 개행
		System.out.printf("본사:%s\n","서울 강남구 남부순환로 2748 (도곡동)"); // String 출력 개행
		System.out.printf("대표:%s\n","박정부,신호섭 213-81-52063"); // String 출력 개행
		System.out.printf("매장:%s\n","경기도 성남시 분당구 분당로53번길 11 (서현동)"); // String 출력 개행
		System.out.printf("========================================\n"); // ============ 라인 출력 개행
		System.out.printf("%23s\n","소비자중심경영(CCM) 인증기업"); // String 출력 개행
		System.out.printf("%25s\n","ISO 9001 품질경영시스템 인증기업"); // String 출력 개행
		System.out.printf("========================================\n"); // ============ 라인 출력 개행
		System.out.printf("%15s(%s)%s,\n","교환/환불 14일",kopo11_chageDate,"이내"); // 현재 시간에서 14일 더한 교환환불일 출력 개행
		System.out.printf("%s\n","(전자)영수증, 결제카드 지참 후 구입매장에서 가능"); // String 출력 개행
		System.out.printf("%24s\n","포장/가격 택 훼손시 교환/환불 불가"); // String 출력 개행
		System.out.printf("%23s\n","체크카드 취소 시 최대 7일 소요"); // String 출력 개행
		System.out.printf("========================================\n"); // ============ 라인 출력 개행
		System.out.printf("%s%26s\n","[POS 1058231]",kopo11_date); // 현재 날짜 출력 개행
		System.out.printf("========================================\n"); // ============ 라인 출력 개행
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		String kopo11_str1 = subStrByte(kopo11_itemname1, 21); // kopo11_itemname1의 Byte 21까지만 출력
		if (kopo11_itemname1.getBytes().length < 21) {	// itemname1의 byte 크기가 21보다 작으면
            System.out.printf("%s", kopo11_itemname1);	// itemname1 출력 개행
            for (int j = 0; j < 21 - kopo11_itemname1.getBytes().length; j++) {	 // 21 - itemname1의 byte 크기만큼
               System.out.printf("%s", " ");	// 공백찍기
            }
         } else System.out.printf("%s", kopo11_itemname1);	// itemname1의 byte 크기가 21보다 크면 그냥 출력
			
		
		System.out.printf("%8s%3s%8s\n",kopo11_df.format(kopo11_price1),kopo11_amount1,
				kopo11_df.format(kopo11_price1*kopo11_amount1)); // 1. 상품명. 가격 , 수량 , 가격 * 수량 출력 개행

		System.out.printf("[%s]\n",kopo11_itemcode1); // String kopo11_itemcode1 출력 개행 

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String kopo11_str2 = subStrByte(kopo11_itemname2, 21); // kopo11_itemname2의 Byte 21까지만 출력
		if (kopo11_itemname2.getBytes().length < 21) { // itemname2의 byte 크기가 21보다 작으면
            System.out.printf("%s", kopo11_itemname2); // itemname2 출력 개행
            for (int j = 0; j < 21 - kopo11_itemname2.getBytes().length; j++) { // 21 - itemname2의 byte 크기만큼
               System.out.printf("%s", " "); // 공백찍기
            }
         } else System.out.printf("%s", kopo11_itemname2); // itemname2의 byte 크기가 21보다 크면 그냥 출력
			
		
		System.out.printf("%8s%3s%8s\n",kopo11_df.format(kopo11_price1),kopo11_amount1,
				kopo11_df.format(kopo11_price1*kopo11_amount1)); // 1. 상품명. 가격 , 수량 , 가격 * 수량 출력 개행
		System.out.printf("[%s]\n",kopo11_itemcode2); // String kopo11_itemcode2 출력 개행 

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String kopo11_str3 = subStrByte(kopo11_itemname3, 21); // kopo11_itemname3의 Byte 21까지만 출력
		if (kopo11_itemname3.getBytes().length < 21) { // itemname3의 byte 크기가 21보다 작으면
            System.out.printf("%s", kopo11_itemname3); // itemname3 출력 개행
            for (int j = 0; j < 21 - kopo11_itemname3.getBytes().length; j++) { // 21 - itemname3의 byte 크기만큼
               System.out.printf("%s", " "); // 공백찍기
            }
         } else System.out.printf("%s", kopo11_itemname3); // itemname3의 byte 크기가 21보다 크면 그냥 출력
			
		
		System.out.printf("%8s%3s%8s\n",kopo11_df.format(kopo11_price1),kopo11_amount1,
				kopo11_df.format(kopo11_price1*kopo11_amount1)); // 1. 상품명. 가격 , 수량 , 가격 * 수량 출력 개행
		System.out.printf("[%s]\n",kopo11_itemcode3); // String kopo11_itemcode3 출력 개행 
		
		
		
		
		
		System.out.printf("%15s%21s\n","과세합계",kopo11_df.format((int)(kopo11_priceSum - kopo11_tax)));	// 세금 가격을 뺀 금액 출력 개행
		System.out.printf("%16s%21s\n","부가세",kopo11_df.format((int)(kopo11_priceSum-(kopo11_priceSum - kopo11_tax))));	// 부가세 출력 개행
		System.out.printf("----------------------------------------\n"); // ------------ 라인 출력 개행
		System.out.printf("판매합계%32s\n",kopo11_df.format(kopo11_priceSum));	// 판매 합계 kopo11_priceSum 출력 개행
		System.out.printf("========================================\n"); // ============ 라인 출력 개행
		System.out.printf("신용카드%32s\n",kopo11_df.format(kopo11_priceSum)); // kopo11_priceSum 출력 개행
		System.out.printf("----------------------------------------\n"); // ------------ 라인 출력 개행
		System.out.printf("우리카드%32s\n","538720**********"); // String 출력 개행
		System.out.printf("승인번호 %s%10s %5s\n","77982843(0)","승인금액",kopo11_df.format(kopo11_priceSum));
		System.out.printf("========================================\n"); // ============ 라인 출력 개행
		System.out.printf("%24s %s\n",kopo11_date,"분당서현점");	// 현재 날짜 출력 개행
		System.out.printf("상품 및 기타 문의 : %s\n","1544-4400"); // String 출력 개행
		System.out.printf("멤버십 및 샵다이소 관련 문의 : %s\n","1599-2211"); // String 출력 개행
		System.out.printf("%27s\n","2112820610158231"); // String 출력 개행
		System.out.printf("----------------------------------------\n"); // ------------ 라인 출력 개행
		System.out.printf("◈ %s\n","다이소 멤버십 앱 또는 홈페이지에 접속" // String 출력 개행
				+ "하셔서 회원가입 후 다양한 혜택을 누려보세요! ◈\n"); 
	}
	
	public static String subStrByte(String kopo11_str, int kopo11_num) {	// String str, int cutlen를 파라미터로 전달받는 메서드 생성
		if (!kopo11_str.isEmpty()) {	// str이 비어있지 않을 때 = false 
			kopo11_str = kopo11_str.trim();	// 공백 제거
			if (kopo11_str.getBytes().length <= kopo11_num) { // str의 byte길이가 cutlen 이하일때
				return kopo11_str;	// str 리턴
			} else {	// // str의 byte길이가 cutlen 초과일때
				StringBuffer kopo11_sbStr = new StringBuffer(kopo11_num);	// StringBuffer 객체 생성
				int kopo11_nCnt = 0;	// int타입 초기값 0 대입
				for (char kopo11_ch : kopo11_str.toCharArray()) {	// str.toCharArray()만큼 도는 반복문
					kopo11_nCnt += String.valueOf(kopo11_ch).getBytes().length;	// nCnt에 String.valueOf(ch).getBytes().length 누적 더하기
					if (kopo11_nCnt > kopo11_num)	// nCnt가 cutlen 보다 크면 break;
						break;
					kopo11_sbStr.append(kopo11_ch);	// kopo11_sbStr에 kopo11_ch을 더한다.
				}
				return kopo11_sbStr.toString() + "";	// kopo11_sbStr.toString() + "" 을 리턴
			}
		} else { // str이 비어있을 때 = true
			return ""; // ""리턴
		}
	}

}
