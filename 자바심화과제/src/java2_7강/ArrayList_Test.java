package java2_7강;

import java.util.ArrayList;

public class ArrayList_Test {

	public static void main(String[] args) {
//		List1();
		List2();
	}

	public static void List1() {
		ArrayList kopo11_iAL = new ArrayList(); // 리스트 new 객체 생성

		kopo11_iAL.add("abc"); // 리스트에 추가
		kopo11_iAL.add("abcd"); // 리스트에 추가
		kopo11_iAL.add("efga"); // 리스트에 추가
		kopo11_iAL.add("가나다0"); // 리스트에 추가
		kopo11_iAL.add("1234"); // 리스트에 추가
		kopo11_iAL.add("12rk34"); // 리스트에 추가

		System.out.printf("******************************\n"); // ****** 라인 출력 개행
		System.out.printf(" 시작 ArraySize %d \n", kopo11_iAL.size()); // 전달값 출력 개행
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ 리스트 사이즈 만큼 도는 반복문
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // 전달값 출력 개행
		}

		kopo11_iAL.set(3, "가라라라"); // 리스트 3번에 내용 변경
		System.out.printf("******************************\n"); // ****** 라인 출력 개행
		System.out.printf(" 내용변경 ArraySize %d \n", kopo11_iAL.size()); // 전달값 출력 개행
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ 리스트 사이즈 만큼 도는 반복문
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // 전달값 출력 개행
		}

		kopo11_iAL.remove(4); // 리스트 4번에 삭제
		System.out.printf("******************************\n"); // ****** 라인 출력 개행
		System.out.printf(" 내용변경 ArraySize %d \n", kopo11_iAL.size()); // 전달값 출력 개행
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ 리스트 사이즈 만큼 도는 반복문
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // 전달값 출력 개행
		}

		kopo11_iAL.sort(null); // null값인 리스트방 정리
		System.out.printf("******************************\n"); // ****** 라인 출력 개행
		System.out.printf(" 리스트Sort ArraySize %d \n", kopo11_iAL.size()); // 전달값 출력 개행
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ 리스트 사이즈 만큼 도는 반복문
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // 전달값 출력 개행
		}

		kopo11_iAL.clear(); // 리스트 초기화
		System.out.printf("******************************\n"); // ****** 라인 출력 개행
		System.out.printf(" 전부 삭제 ArraySize %d \n", kopo11_iAL.size()); // 전달값 출력 개행
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 0 ~ 리스트 사이즈 만큼 도는 반복문
			System.out.printf(" ArrayList %d = %s\n", kopo11_i, kopo11_iAL.get(kopo11_i)); // 전달값 출력 개행
		}
	}
	
	public static void List2() {
		int kopo11_iTestMAX = 1000000; // int 변수 초기값 1000000 eodlq
		ArrayList kopo11_iAL = new ArrayList(); // 리스트 new 객체 생성
		
		for (int kopo11_i = 0; kopo11_i < kopo11_iTestMAX; kopo11_i++) { // 0 ~ 1000000까지 도는 반복문
			kopo11_iAL.add((int)(Math.random()*1000000)); // 리스트에 랜덤 값 추가
		}
		
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 리스트의 사이즈 만큼 도는 반복문
			System.out.printf(" ArrayList %d = %d\n",kopo11_i,kopo11_iAL.get(kopo11_i)); // 전달 값 출력 개행
		}
		
		System.out.printf("******************************\n"); // ****** 라인 출력 개행
		kopo11_iAL.sort(null); // 빈 방은 정리
		
		for (int kopo11_i = 0; kopo11_i < kopo11_iAL.size(); kopo11_i++) { // 리스트의 사이즈 만큼 도는 반복문
			System.out.printf(" ArrayList %d = %d\n",kopo11_i,kopo11_iAL.get(kopo11_i)); // 전달 값 출력 개행
		}
	}

}
