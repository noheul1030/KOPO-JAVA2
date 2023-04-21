package java2_8강;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// 클래스 CharArray
public class CharArray {
	// main 
	public static void main(String[] args) {
		// try ~ catch
		try {
			// File 변수 선언 (생성할 파일의 경로를 입력한다.)
			File kopo11_f = new File("C:\\Users\\노을\\Documents\\GitHub\\KOPO-JAVA2\\Mytest.txt");
			// FileWriter 변수 선언(kopo11_f)값 입력
			FileWriter kopo11_fw = new FileWriter(kopo11_f);
			
			kopo11_fw.write("안녕 자바\n"); // 입력 개행
			kopo11_fw.write("내 이름은 노을이야\n"); // 입력 개행
			
			kopo11_fw.close(); // Write 종료
			
			// FileReader 변수 선언 (kopo11_f)값 입력
			FileReader kopo11_fr = new FileReader(kopo11_f);
			
			int kopo11_n = -1;	// int 변수 선언 초기값 -1
			char [] kopo11_ch; // char 배열 선언
			int kopo11_HanCount = 0; // 한글수를 Return 받는 int 변수
			
			while(true) { // 값이 true 일 때 반복
				kopo11_ch = new char[100]; // 배열의 크기 100으로 지정
				kopo11_n = kopo11_fr.read(kopo11_ch); // kopo11_ch의 크기 저장
				
				if(kopo11_n == -1) break; // -1이면 break;
				
				for (int kopo11_i = 0; kopo11_i < kopo11_n; kopo11_i++) { // 반복문
					// for(char c :ch)
					System.out.printf("%c",kopo11_ch[kopo11_i]); // 배열의 값을 하나씩 프린트		
				}
				for(char c : kopo11_ch) { // 반복문
					// 배열에서 꺼내오는 byte길이가 2이면 kopo11_HanCount++;
					if(Character.toString(c).getBytes().length == 2) 
						kopo11_HanCount++; // 1추가
				}
			}
			kopo11_fr.close(); // Read 종료
			System.out.printf("\n FILE READ END \n"); // 출력 개행
			System.out.printf("\n한글의 갯수는 : %d개",kopo11_HanCount); // 한글 갯수 출력 개행
		}catch(Exception kopo11_e) { // 에러 catch
			System.out.printf("에러!!!![%s]\n", kopo11_e); // 에러 출력 개행
		}
	}
}
