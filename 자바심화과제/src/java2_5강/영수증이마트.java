package java2_5강;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 영수증이마트 {

	public static void main(String[] args) {
		Calendar kopo11_cal = Calendar.getInstance();
		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat kopo11_sd2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat kopo11_sd3 = new SimpleDateFormat("yyyyMMdd");

		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");

		String[] kopo11_itemname = { "해피홈 SAFE365 핸드", "(G)LH원형유리화병 10", "상투과자E", "더블링 나일론 깡 롤", "해피홈 SAFE 핸드워시",
				"농심 신라면120gx5", "(대)국내산삼겹살찌개", "오뚜기 진비빔면 156g", "GAP 죽장사과 4-6입", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살",
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥", "피코크 들깨미역국500", "남양 맛있는우유GT 저지방",
				"녹차원흑당시럽10입", "진라면소컵(매)65gx6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G",
				"피코크 들깨미역국500", "흑원당 말차 밀크티", "1+ 등급란 10개입 특", "동원양반볶음김치기획", "테일러 푸룬주스", "울샴푸 퍼플라일락", "앤더슨프레첼708g" };

		int[] kopo11_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980,
				7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 14980, 11780, 8980 };

		int[] kopo11_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2 };

		boolean[] kopo11_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				true, false, false };

		int kopo11_taxpass = 0; // int 변수에 초기값 0 대입 (* 면세 물품 금액)
		int kopo11_sum = 0; // int 변수에 초기값 0 대입 (합계)
		int kopo11_point = 5473;

//		
//		System.out.println(subStrByte(itemname[0], 2));

		System.out.printf("%35s\n", "이마트 죽전점(031)888-1234");
		System.out.printf("%7s%21s\n", "이마트", "206-86-50913 강희석");
		System.out.printf("%30s\n", "용인 수지구 포은대로 552");
		System.out.printf("\n");
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("\n");
		System.out.printf("[구매]%s%19s\n", kopo11_sd.format(new Date()), "POS:0011-9861");
		System.out.printf("------------------------------------------\n");
		System.out.printf("%6s%11s%5s%8s\n", "상품명", "단가", "수량", "금액");
		System.out.printf("------------------------------------------\n");

		for (int kopo11_i = 0; kopo11_i < kopo11_itemname.length; kopo11_i++) {
			int kopo11_pricenum = kopo11_price[kopo11_i] * kopo11_num[kopo11_i];
			kopo11_sum += kopo11_price[kopo11_i] * kopo11_num[kopo11_i]; // 모든 품목 합계

			if (kopo11_i != 0)
				if (kopo11_i % 5 == 0)
					System.out.printf("------------------------------------------\n");
			if (kopo11_taxfree[kopo11_i] == true) {
				kopo11_taxpass += kopo11_price[kopo11_i] * kopo11_num[kopo11_i];
				System.out.printf("* ");
			} else
				System.out.printf("  ");

			String kopo11_str = subStrByte(kopo11_itemname[kopo11_i], 13);

			if (kopo11_str.getBytes().length < 13) {
				System.out.printf("%s", kopo11_str);
				for (int j = 0; j < 13 - kopo11_str.getBytes().length; j++) {
					System.out.printf("%s", " ");
				}
				System.out.printf("%s", "");
			} else
				System.out.printf("%s", kopo11_str);

			if (String.valueOf(kopo11_price[kopo11_i]).length() > 4) {
				System.out.printf(" %9s%3d %12s\n", kopo11_df.format(kopo11_price[kopo11_i]), kopo11_num[kopo11_i],
						kopo11_df.format(kopo11_pricenum));

			} else
				System.out.printf(" %9s%3d %12s\n", kopo11_df.format(kopo11_price[kopo11_i]), kopo11_num[kopo11_i],
						kopo11_df.format(kopo11_pricenum));
		}
		System.out.printf("\n");

		double kopo11_tax = (double) Math.round(((double) kopo11_sum - kopo11_taxpass) / 11); // double 변수에 부가세 계산값 대입
																								// (부가세)

		if (kopo11_tax == (double) ((int) kopo11_tax))
			kopo11_tax = kopo11_tax;
		else
			kopo11_tax = (double) Math.round(((double) kopo11_sum - kopo11_taxpass) / 11 + 0.5);

		System.out.printf("%22s%14d\n", "총 품목 수량", kopo11_itemname.length);
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", kopo11_df.format(kopo11_taxpass));
		System.out.printf("%23s%14s\n", "과 세  물 품", kopo11_df.format((kopo11_sum - kopo11_taxpass) - kopo11_tax));
		System.out.printf("%24s%14s\n", "부   가   세", kopo11_df.format(kopo11_tax));
		System.out.printf("%25s%14s\n", "합        계", kopo11_df.format(kopo11_sum));
		System.out.printf("결 제 대 상 금 액%24s\n", kopo11_df.format(kopo11_sum));
		System.out.printf("------------------------------------------\n");
		System.out.printf("0012 KEB 하나 %27s\n", "541707**0484/35860658");
		System.out.printf("카드결제(IC)%12s / %11s\n", "일시불", kopo11_df.format(kopo11_sum));
		System.out.printf("------------------------------------------\n");
		System.out.printf("%23s\n", "[신세계포인트 적립]");
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		System.out.printf("금회발생포인트%16s%11s\n", "9350**9995", kopo11_df.format(kopo11_sum / 1000));
		System.out.printf("누계(가용)포인트%12s(%11s)\n", kopo11_df.format((kopo11_sum / 1000)+kopo11_point),
				kopo11_df.format(kopo11_point));
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("------------------------------------------\n");
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("차량번호 :%30s\n", "34저****");
		System.out.printf("입차시간 :%31s\n", kopo11_sd2.format(new Date()));
		System.out.printf("------------------------------------------\n");
		System.out.printf("캐셔:084599 %s%25s\n", "양00", "1150");
		System.out.printf("%15s/%s/%s/%s\n", kopo11_sd3.format(new Date()), "00119861", "00164980", "31");

	}

	public static String subStrByte(String kopo11_str, int kopo11_cutlen) {
		if (!kopo11_str.isEmpty()) {
			kopo11_str = kopo11_str.trim();
			if (kopo11_str.getBytes().length <= kopo11_cutlen) {
				return kopo11_str;
			} else {
				StringBuffer kopo11_sbStr = new StringBuffer(kopo11_cutlen);
				int kopo11_nCnt = 0;
				for (char kopo11_ch : kopo11_str.toCharArray()) {
					kopo11_nCnt += String.valueOf(kopo11_ch).getBytes().length;
					if (kopo11_nCnt > kopo11_cutlen)
						break;
					kopo11_sbStr.append(kopo11_ch);
				}
				return kopo11_sbStr.toString() + "";
			}
		} else {
			return "";
		}
	}

}
