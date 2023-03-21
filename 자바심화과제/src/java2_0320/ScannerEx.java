package java2_0320;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);	// Scanner 객체 생성-> import
		
		System.out.println("두자리 정수를 하나 입력해주세요. >> ");	// 스캐너 입력 안내문구 출력
		
		String input = scanner.nextLine();	// String 타입을 입력받는 변수와 문자열을 입력받는 nextLine() 함수 사용
		int kopo11_num = Integer.parseInt(input);	// Scanner로 받은 Strign 타입 Input 변수를 int로 형변환 
		
		System.out.println("입력내용 : " + input);	// String 타입의 input 값 출력
		System.out.printf("kopo11_num = %d%n",kopo11_num);	// int 타입의 kopo11_num 값 출력 

	}

}