package java2_8강;

import java.io.*;

public class L07 {

	public static void main(String[] args) throws IOException {

		File kopo11_f = new File("C:\\Users\\노을\\Documents\\GitHub\\day_data\\THTSKS010H00.dat"); // File 객체 생성
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f)); // BufferedReader 객체 생성에 File 값 입력

		String kopo11_readtxt; // String 변수 선언
		int kopo11_LineCnt = 0; // int 변수 선언 후 0 초기값 대입
		int kopo11_n = -1; // int 선언 후 -1 초기값 대입

		StringBuffer kopo11_s = new StringBuffer(); // StringBuffer 객체 생성 객체 생성
		while (true) { // true 일 때 도는 반복문
			char[] kopo11_ch = new char[1000]; // 배열 크기 1000 지정 생성
			kopo11_n = kopo11_br.read(kopo11_ch); // int 변수에 br.read(ch) 값 대입
			if (kopo11_n == -1) // n값이 -1이면
				break; // break;

			for (char kopo11_c : kopo11_ch) { // ch배열에서 값을 하나씩 꺼내와서 c에 담는 반복문
				if (kopo11_c == '\n') { // c값이 개행이면
					System.out.printf("[%s]***\n", kopo11_s.toString()); // 출력 개행
					kopo11_s.delete(0, kopo11_s.length()); // s의 0부터 s의 길이 만큼 삭제
				} else { // c값이 개행이 아니면
					kopo11_s.append(kopo11_c); // s에 c 추가
				}
			}
			kopo11_LineCnt++; // 1추가
		}
		System.out.printf("[%s]***\n", kopo11_s.toString()); // 출력 개행
		kopo11_br.close(); // BufferedReader 종료
	}
}
