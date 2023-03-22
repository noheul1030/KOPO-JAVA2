package java2_4강;

import java.text.DecimalFormat;

public class 칸맞추기연습 {

	public static void main(String[] args) {
		
		String kopo11_item = "사과";	// String 변수에 "사과" 초기값 대입
		int kopo11_unit_price = 5000;	// int 변수에 5000 초기값 대입
		int kopo11_num = 500;	// int 변수에 500 초기값 대입
		int kopo11_total = 0;	// int 변수에 0 초기값 대입
		
		DecimalFormat kopo11_df = new DecimalFormat("###,###,###,###,###");	// DecimalFormat으로 객체 생성(###,###,###,###,###)형태로 포멧 되게끔
		
		// 해더 찍기
		System.out.printf("==============================================================\n");	// ===== 출력 개행
		// 20칸최대 string 타입 "품목" 출력. 8칸최대 string 타입 "단가" 출력,8칸최대 string 타입 "수량" 출력,8칸최대 string 타입 "합계" 출력 개행
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","품목","단가","수량","합계");	
		System.out.printf("==============================================================\n");	// ===== 출력 개행
		
		// 값 찍기
		// 20칸최대 string 타입 item 출력. 10칸최대 string 타입 kopo11_df.format(kopo11_unit_price) 출력,
		// 10칸최대 string 타입 kopo11_df.format(kopo11_num) 출력,10칸최대 string 타입 kopo11_df.format(kopo11_unit_price*kopo11_num) 출력 개행
		System.out.printf("%20.20s%10.10s%10.10s   %10.10s\n",
				kopo11_item,kopo11_df.format(kopo11_unit_price),kopo11_df.format(kopo11_num),kopo11_df.format(kopo11_unit_price*kopo11_num));
		System.out.printf("==============================================================\n");	// ===== 출력 개행

	}

}
