package java2_8강;

import java.io.*;

public class Lec02_Parking {
	public static void main(String[] args) {
		// 분당융합 기술 교육원의 위도,경도의 값
		double kopo11_lat = 37.3860521;
		double kopo11_lng = 127.1214038;

		// int Line카운트,최단거리카운트, 최장거리카운트 초기값 0 선언
		int kopo11_LineCnt = 0;
		int kopo11_MINCnt = 0;
		int kopo11_MAXCnt = 0;

		// double 최단거리 결과값에 Double 최소값 선언, 최장거리 결과값에 Double 최대값 선언
		double kopo11_resultMIN = Double.MAX_VALUE;
		double kopo11_resultMAX = Double.MIN_VALUE;

		// String 최단거리 주소,최장거리 주소 변수
		String kopo11_MINadress = "";
		String kopo11_MAXadress = "";

		// String 최단거리 위도, 경도 / 최장거리 위도, 경도 변수 초기값 지정
		String kopo11_MINlat = "", kopo11_MINlng = "", kopo11_MAXlat = "", kopo11_MAXlng = "";

		
		
		// File 변수 선언 (생성할 파일의 경로를 입력한다.)
		File kopo11_f = new File("C:\\Users\\노을\\Documents\\GitHub\\KOPO-JAVA2\\전국공영주차장정보.txt");

		// try ~ catch
		try {
			// BufferedReader 변수 선언(kopo11_f)값 입력
			BufferedReader kopo11_br = new BufferedReader(new FileReader(kopo11_f));

			String kopo11_readtxt; // String 변수 선언

			// 입력 받은 값이 null이면
			if ((kopo11_readtxt = kopo11_br.readLine()) == null) {
				System.out.printf("빈 파일입니다\n"); // 출력 개행
//			return; // 리턴
			}

			// \t 기준으로 나눠서 배열에 저장
			String[] kopo11_field_name = kopo11_readtxt.split("\t");

			// 반복문
			// 조건 kopo11_readtxt의 입력값이 null이 아니면 실행
			while ((kopo11_readtxt = kopo11_br.readLine()) != null) {

				// \t 기준으로 나눠서 배열에 저장
				String[] kopo11_field = kopo11_readtxt.split("\t");
				// 위도와 경도의 값을 계산해서 두 지점의 거리 계산
				double kopo11_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo11_field[3]) - kopo11_lat, 2)
						+ Math.pow(Double.parseDouble(kopo11_field[2]) - kopo11_lng, 2));

				// 계산한 거리의 값이 최소값보다 작으면 거리계산, MINCnt번호, MINadress주소, 위도, 경도 값 저장
				if (kopo11_dist < kopo11_resultMIN) {
					kopo11_resultMIN = kopo11_dist;
					kopo11_MINCnt = kopo11_LineCnt;
					kopo11_MINadress = kopo11_field[6];
					kopo11_MINlat = kopo11_field[3];
					kopo11_MINlng = kopo11_field[2];
				}

				// 계산한 거리의 값이 최대값보다 크면 거리계산, MAXCnt번호, MAXadress주소, 위도, 경도 값 저장
				if (kopo11_dist > kopo11_resultMAX) {
					kopo11_resultMAX = kopo11_dist;
					kopo11_MAXCnt = kopo11_LineCnt;
					kopo11_MAXadress = kopo11_field[6];
					kopo11_MAXlat = kopo11_field[3];
					kopo11_MAXlng = kopo11_field[2];
				}

				kopo11_LineCnt++; // 1 추가
			}

			kopo11_br.close(); // BufferedReader 종료

			System.out.printf("******************* 전국 공영주차장 *******************\n"); // ***** 라인 출력 개행
			System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
			System.out.printf("<< 최단거리 >>\n"); // 출력 개행
			System.out.printf("********************[%d번째 항목]********************\n", kopo11_MINCnt); // 값 출력 개행
			System.out.printf(" \n%s : %s\n", kopo11_field_name[6], kopo11_MINadress); // 값 출력 개행
			System.out.printf(" 위도 : %s\n", kopo11_MINlat); // MIN위도 값 출력 개행
			System.out.printf(" 경도 : %s\n", kopo11_MINlng); // MIN경도 값 출력 개행
			System.out.printf(" 현재지점과 거리 : %f\n", kopo11_resultMIN); // 값 출력 개행
			System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
			System.out.println(); // 개행

			System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
			System.out.printf("<< 최장거리 >>\n"); // 출력 개행
			System.out.printf("********************[%d번째 항목]********************\n", kopo11_MAXCnt); // 값 출력 개행
			System.out.printf(" \n%s : %s\n", kopo11_field_name[6], kopo11_MAXadress); // 값 출력 개행
			System.out.printf(" 위도 : %s\n", kopo11_MAXlat); // MAX위도 값 출력 개행
			System.out.printf(" 경도 : %s\n", kopo11_MAXlng); // MAX경도 값 출력 개행
			System.out.printf(" 현재지점과 거리 : %f\n", kopo11_resultMAX); // 값 출력 개행
			System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행

		} catch (NullPointerException e) { // NullPointerException 이 발생할 시 catch
			System.out.printf("입력된 값이 NULL 입니다. 확인해 주세요.\n"); // 출력 개행
		} catch (Exception e) { // Exception 오류 발생 시 catch
			System.out.printf("오류 발생!\n"); // 출력 개행
		}
	}
}
