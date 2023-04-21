package java2_8강;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec01 {
	public static void main(String[] args) throws IOException {
		// File 변수 선언 (생성할 파일의 경로를 입력한다.)
		File kopo11_f = new File("C:\\Users\\노을\\Documents\\GitHub\\KOPO-JAVA2\\전국무료와이파이표준데이터.csv");
		// BufferedReader 변수 선언(kopo11_f)값 입력
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f));

		String kopo11_readtxt; // String 변수 선언
		
		// 입력 받은 값이 null이면 
		if ((kopo11_readtxt = kopo11_br.readLine()) == null) {
			System.out.printf("빈 파일입니다\n"); // 출력 개행
			return; // 리턴
		}
		
		// , 기준으로 나눠서 배열에 저장
		String[] kopo11_field_name = kopo11_readtxt.split(",");

		int kopo11_LineCnt = 0; // int 변수 초기값 0선언
		// 반복문
		// 조건 kopo11_readtxt의 입력값이 null이 아니면 실행
		while ((kopo11_readtxt = kopo11_br.readLine()) != null) {
			
			// , 기준으로 나눠서 배열에 저장
			String[] kopo11_field = kopo11_readtxt.split(",");
			
			System.out.printf("**[%d번째 항목]*************\n", kopo11_LineCnt); // 출력 개행
			// kopo11_field_name의 길이만큼 도는 반복문
			for (int kopo11_i = 0; kopo11_i < kopo11_field_name.length; kopo11_i++) {
				// kopo11_field_name[kopo11_i]값 : kopo11_field[kopo11_i]값 출력 개행
				System.out.printf(" %s : %s\n", kopo11_field_name[kopo11_i], kopo11_field[kopo11_i]); 
			}
			System.out.printf("******************************\n"); // ***** 라인 출력 개행
			if (kopo11_LineCnt == 100) // LineCnt가 100이 되면 
				break;	// break;
			kopo11_LineCnt++; // 1씩 추가
		}
		kopo11_br.close(); // BufferedReader 종료
	}
}
