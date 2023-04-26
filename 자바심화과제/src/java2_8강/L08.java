package java2_8강;

import java.io.*;

public class L08 {

	public static void main(String[] args) throws IOException {

		File kopo11_f = new File("C:\\Users\\노을\\Documents\\GitHub\\day_data\\THTSKS010H00.dat"); // File 객체 생성
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f)); // BufferedReader 객체 생성에 File 값 입력

		File kopo11_f1 = new File("C:\\Users\\노을\\Documents\\GitHub\\day_data\\StockDailyPrice.csv"); // File 객체 생성
		BufferedWriter kopo11_bw1 = new BufferedWriter(new FileWriter(kopo11_f1)); // BufferedReader 객체 생성에 File 값 입력

		String kopo11_readtxt; // String 변수 선언

		int kopo11_cnt = 0; // int 변수 선언 후 0 초기값 대입
		int kopo11_wcnt = 0; // int 변수 선언 후 0 초기값 대입

		while ((kopo11_readtxt = kopo11_br.readLine()) != null) { // readtxt의 값이 null이 아니면 도는 반복문
			StringBuffer kopo11_s = new StringBuffer(); // StringBuffer 객체 생성 객체 생성
			String[] kopo11_field = kopo11_readtxt.split(","); // String 배열에 %_%을 기준으로 구분하여 저장

			// field의 길이가 2보다 크고 '그리고' field[2]번째 값의 ^을 ""로 replace,trim 공백제거 후 substring(0, 1) 값이 "A"와 일치하면
			if (kopo11_field.length > 2 && kopo11_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				kopo11_s.append(kopo11_field[0].replace("^", "").trim()); // s에 field[0]번째 값의 ^을 ""로 replace,trim 공백제거한 데이터를 추가해준다.
				for (int kopo11_i = 1; kopo11_i < kopo11_field.length; kopo11_i++) { // field[i]번째의 길이 만큼 도는 반복문
					kopo11_s.append("," + kopo11_field[kopo11_i].replace("^", "").trim()); // s에 , +  s에 field[i]번째 값의 ^을 ""로 replace,trim 공백제거한 데이터를 추가해준다.
				}
				kopo11_bw1.write(kopo11_s.toString()); // BufferedWriter에 s값 쓰기 입력
				kopo11_bw1.newLine(); // BufferedWriter 개행
				kopo11_wcnt++; // 1추가 
			}
			kopo11_cnt++; // 1추가
		}
		kopo11_br.close(); // BufferedReader 종료
		kopo11_bw1.close(); // BufferedWriter 종료

		System.out.printf("Program End[%d][%d]records\n", kopo11_cnt, kopo11_wcnt); // 출력 개행
	}
}
