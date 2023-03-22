package java2_5강;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 영수증이마트 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat kopo11_sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String kopo11_date = kopo11_sd.format(new Date());

		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");

		String[] itemname = { "해피홈 SAFE365 핸드", "(G)LH원형유리화병 10", "상투과자E", "더블링 나일론 깡 롤", "해피홈 SAFE 핸드워시",
				"농심 신라면120gx5", "* (대)국내산삼겹살찌개", "오뚜기 진비빔면 156g", "* GAP 죽장사과 4-6입", "* 순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살",
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥", "피코크 들깨미역국500", "* 남양 맛있는우유GT 저지방",
				"녹차원흑당시럽10입", "진라면소컵(매)65gx6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G",
				"피코크 들깨미역국500", "흑원당 말차 밀크티", "1+ 등급란 10개입 특", "동원양반볶음김치기획" };

		int[] price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130, 3980,
				4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };

		int[] num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 };

		System.out.printf("%40s\n", "이마트 죽전점(031)888-1234");
		System.out.printf("%36s\n", "206-86-50913 강희석");
		System.out.printf("%35s\n", "용인 수지구 포은대로 552");
		System.out.printf("\n");
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("\n");
		System.out.printf("[구매]%s%22s\n", kopo11_date, "POS:0011-9861");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%6s%20s%6s%6s\n", "상품명", "단가", "수량", "금액");
		System.out.printf("-----------------------------------------------\n");

		for (int i = 0; i < itemname.length; i++) {
			if ((i + 1) % 5 == 0)
				System.out.printf("-----------------------------------------------\n");
			if(itemname[i].contains("*")) {
				System.out.printf("%.13s", itemname[i]);
			}else
				System.out.printf("  %.14s", itemname[i]);
				

			if (itemname[i].length() < 15) {
				if(itemname[i].contains("SAFE")) {
					for (int j = 0; j < 22 - itemname[i].length(); j++) {
						System.out.printf("%s", " ");
					}
				}
				else if(itemname[i].contains("g")) {
					for (int j = 0; j < 22 - itemname[i].length(); j++) {
						System.out.printf("%s", " ");
					}
				}
				else if(itemname[i].contains("120")) {
					for (int j = 0; j < 22 - itemname[i].length(); j++) {
						System.out.printf(" %s", " ");
					}
				}
			}
			System.out.printf("%5s%5d%10s\n",kopo11_df.format(price[i]), num[i],
					kopo11_df.format(price[i] * num[i]));
		}

	}

}
