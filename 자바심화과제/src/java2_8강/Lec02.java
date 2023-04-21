package java2_8강;

import java.io.*;

public class Lec02 {
	public static void main(String[] args) throws IOException {
		// File 변수 선언 (생성할 파일의 경로를 입력한다.)
		File kopo11_f = new File("C:\\Users\\노을\\Documents\\GitHub\\KOPO-JAVA2\\전국무료와이파이표준데이터.txt");
		// BufferedReader 변수 선언(kopo11_f)값 입력
		BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f));

		String kopo11_readtxt; // String 변수 선언
		
		// 입력 받은 값이 null이면
		if ((kopo11_readtxt = kopo11_br.readLine()) == null) {
			System.out.printf("빈 파일입니다\n"); // 출력 개행
			return; // 리턴
		}
		
		// \t 기준으로 나눠서 배열에 저장
		String[] kopo11_field_name = kopo11_readtxt.split("\t");

		// 분당융합 기술 교육원의 위도,경도의 값
		double kopo11_lat = 37.3860521;
		double kopo11_lng = 127.1214038;
		
		// int Line카운트,최단거리카운트, 최장거리카운트 초기값 0 선언
		int kopo11_LineCnt = 0;
		int kopo11_MINCnt = 0;
		int kopo11_MAXCnt = 0;
		
		// double 최단거리 결과값에 Double 최소값 선언, 최장거리 결과값에 Double  최대값 선언
		double kopo11_resultMIN = Double.MAX_VALUE;
		double kopo11_resultMAX = Double.MIN_VALUE;		
		
		// String 최단거리 주소,최장거리 주소 변수 
		String kopo11_MINadress = "";
		String kopo11_MAXadress = "";
		
		// 반복문
		// 조건 kopo11_readtxt의 입력값이 null이 아니면 실행
		while ((kopo11_readtxt = kopo11_br.readLine()) != null) {
			
			// \t 기준으로 나눠서 배열에 저장
			String[] kopo11_field = kopo11_readtxt.split("\t");
			// 위도와 경도의 값을 계산해서 두 지점의 거리 계산
			double kopo11_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo11_field[13]) - kopo11_lat, 2)
					+ Math.pow(Double.parseDouble(kopo11_field[14]) - kopo11_lng, 2));
			
			// 계산한 거리의 값이 최소값보다 작으면 거리계산, MINCnt번호, MINadress주소 값 저장
			if(kopo11_dist < kopo11_resultMIN) {
				kopo11_resultMIN = kopo11_dist;
				kopo11_MINCnt = kopo11_LineCnt;
				kopo11_MINadress = kopo11_field[9];
			}
			
			// 계산한 거리의 값이 최대값보다 크면 거리계산, MAXCnt번호, MAXadress주소 값 저장
			if(kopo11_dist > kopo11_resultMAX) {
				kopo11_resultMAX = kopo11_dist;
				kopo11_MAXCnt = kopo11_LineCnt;
				kopo11_MAXadress = kopo11_field[9];
			}
			
			kopo11_LineCnt++; // 1 추가
		}
		kopo11_br.close(); // BufferedReader 종료
		
		System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
		System.out.printf("<< 가장 가까운 곳 >>\n"); // 출력 개행
		System.out.printf("**[%d번째 항목]*************\n", kopo11_MINCnt); // 값 출력 개행
		System.out.printf(" %s : %s\n", kopo11_field_name[9], kopo11_MINadress); // 값 출력 개행
		System.out.printf(" 현재지점과 거리 : %f\n", kopo11_resultMIN); // 값 출력 개행
		System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
		System.out.println(); // 개행
		
		
		System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
		System.out.printf("<< 가장 먼 곳 >>\n"); // 출력 개행
		System.out.printf("**[%d번째 항목]*************\n", kopo11_MAXCnt); // 값 출력 개행
		System.out.printf(" %s : %s\n", kopo11_field_name[9], kopo11_MAXadress); // 값 출력 개행
		System.out.printf(" 현재지점과 거리 : %f\n", kopo11_resultMAX); // 값 출력 개행
		System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
	}
}



////반복문
//		// 조건 kopo11_readtxt의 입력값이 null이 아니면 실행
//		while ((kopo11_readtxt = kopo11_br.readLine()) != null) {
//			
//			// \t 기준으로 나눠서 배열에 저장
//			String[] kopo11_field = kopo11_readtxt.split("\t");
////			System.out.printf("**[%d번째 항목]*************\n", LineCnt);
////			System.out.printf(" %s : %s\n", field_name[9], field[9]);
////			System.out.printf(" %s : %s\n", field_name[13], field[13]);
////			System.out.printf(" %s : %s\n", field_name[14], field[14]);
//			double kopo11_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo11_field[13]) - kopo11_lat, 2)
//					+ Math.pow(Double.parseDouble(kopo11_field[14]) - kopo11_lng, 2));
////			resultMIN = Math.min(resultMIN, dist);
////			resultMAX = Math.max(resultMAX, dist);
//			if(kopo11_dist < kopo11_resultMIN) {
////			if(resultMIN == dist) {
//				kopo11_resultMIN = kopo11_dist;
//				kopo11_MINCnt = kopo11_LineCnt;
//				kopo11_MINadress = kopo11_field[9];
//			}
//			if(kopo11_dist > kopo11_resultMAX) {
////			if(resultMAX == dist) {
//				kopo11_resultMAX = kopo11_dist;
//				kopo11_MAXCnt = kopo11_LineCnt;
//				kopo11_MAXadress = kopo11_field[9];
//			}
////			System.out.printf(" 현재지점과 거리 : %f\n", dist);
////			System.out.printf("******************************\n");









