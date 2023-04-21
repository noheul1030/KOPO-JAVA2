package java2_8강;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
	
	// FileWrite 메서드 throws IOException으로 예외처리 시스템 메세지 전달 받음
	public static void FileWrite() throws IOException{
		// File 변수 선언 (생성할 파일의 경로를 입력한다.)
		File kopo11_f = new File("C:\\Users\\노을\\Documents\\GitHub\\KOPO-JAVA2\\Mytest.txt");
		// BufferedWriter 변수 선언(kopo11_f)값 입력
		BufferedWriter kopo11_bw = new BufferedWriter(new FileWriter(kopo11_f));
		
		kopo11_bw.write("안녕 File"); // 입력 
		kopo11_bw.newLine(); // 개행
		kopo11_bw.write("hello 헬로"); // 입력
		kopo11_bw.newLine(); // 개행
		
		kopo11_bw.close(); // BufferedWriter 종료
	}
	// FileRead 메서드 throws IOException으로 예외처리 시스템 메세지 전달 받음
	public static void FileRead() throws IOException{
		// File 변수 선언 (생성할 파일의 경로를 입력한다.)
		File kopo11_f = new File("C:\\Users\\노을\\Documents\\GitHub\\KOPO-JAVA2\\Mytest.txt");
		// BufferedReader 변수 선언(kopo11_f)값 입력
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f));
		
		String kopo11_readtxt; // String 변수 선언
		
		// 반복문
		// 조건 kopo11_readtxt의 입력값이 null이 아니면 실행
		while((kopo11_readtxt = kopo11_br.readLine())!=null) {
			System.out.printf("%s\n",kopo11_readtxt); // 출력 개행
		}
		kopo11_br.close(); // BufferedReader 종료
	}
	
	// main 
		public static void main(String[] args) throws IOException{
			FileWrite(); // FileWrite 메서드 실행
			FileRead(); // FileRead 메서드 실행
		}
}
