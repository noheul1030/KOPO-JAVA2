package java2_8강;

import java.io.*;

public class PracticeL8_1 {

	public static void main(String[] args) throws IOException {

		File kopo11_f = new File("C:\\Users\\노을\\Documents\\GitHub\\day_data\\StockDailyPrice.csv"); // File 객체 생성
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f)); // BufferedReader 객체 생성에 File 값 입력

		String kopo11_readtxt; // String 변수 선언

		int kopo11_MAXValue = Integer.MIN_VALUE; // int 변수 선언 후 Integer 최소값 초기값 대입
		int kopo11_MINValue = Integer.MAX_VALUE; // int 변수 선언 후 Integer 최대값 초기값 대입

		while ((kopo11_readtxt = kopo11_br.readLine()) != null) { // readtxt의 값이 null이 아니면 도는 반복문
			StringBuffer kopo11_s = new StringBuffer(); // StringBuffer 객체 생성 객체 생성
			String[] kopo11_field = kopo11_readtxt.split(","); // String 배열에 ,을 기준으로 구분하여 저장

			// field[1]번째 값의 ^을 ""로 replace,trim 공백제거 후 substring(0, 4) 값이 "2015"와 일치하면
			if (kopo11_field[1].replace("^", "").trim().substring(0, 4).equals("2015")) {

				if (Integer.parseInt(kopo11_field[3]) > kopo11_MAXValue) { // 종가의 값이 kopo11_MAXValue보다 크면
					kopo11_MAXValue = Integer.parseInt(kopo11_field[3]); // kopo11_MAXValue에 값 저장
				}
				if (Integer.parseInt(kopo11_field[3]) < kopo11_MINValue) { // 종가의 값이 kopo11_MAXValue보다 작으면
					kopo11_MINValue = Integer.parseInt(kopo11_field[3]); // kopo11_MAXValue에 값 저장
				}
			}
		}
		kopo11_br.close(); // BufferedReader 종료

		System.out.println("2015년 삼성전자 종가 기준 최고가 : " + kopo11_MAXValue); // 출력 개행
		System.out.println("2015년 삼성전자 종가 기준 최저가 : " + kopo11_MINValue); // 출력 개행
	}
}
