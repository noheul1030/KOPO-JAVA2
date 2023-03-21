package java2_0321;

public class For {

	public static void main(String[] args) {

		int kopo11_sum = 0;		// int 초기값 0 선언
		
		for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) {	// 0 ~ 9까지 순서대로 도는 반복문 
			kopo11_sum = kopo11_sum + kopo11_i;	// int 변수에 변수 저장값 + i값을 누적 더하기 한다.
		}
		System.out.printf("kopo11_sum = %d\n", kopo11_sum);	// 변수에 담긴 최종값 프린트

		for (int kopo11_i = 1; kopo11_i < 10; kopo11_i++) {	// 1 ~ 9까지 순서대로 도는 반복문 
			System.out.printf("***************************\n", kopo11_i);	// *출력
			System.out.printf("	구구단 %d 단\n", kopo11_i);	// 구구단 i번 출력
			System.out.printf("***************************\n", kopo11_i);	// *출력
			for (int kopo11_j = 1; kopo11_j < 10; kopo11_j++) {	// 1 ~ 9까지 순서대로 도는 반복문
				
				System.out.printf(" %d * %d = %d \n", kopo11_i, kopo11_j, kopo11_i * kopo11_j);		// i , j , i * j 출력
			}
		}
	}

}
