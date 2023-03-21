package java2_0321;

public class For {

	public static void main(String[] args) {

		int kopo11_sum = 0;		// int 초기값 0 선언
		
		for (int i = 0; i < 10; i++) {	// 0 ~ 9까지 순서대로 도는 반복문 
			kopo11_sum = kopo11_sum + i;	// int 변수에 변수 저장값 + i값을 누적 더하기 한다.
		}
		System.out.printf("kopo11_sum = %d\n", kopo11_sum);	// 변수에 담긴 최종값 프린트

		for (int i = 1; i < 10; i++) {	// 1 ~ 9까지 순서대로 도는 반복문 
			System.out.printf("***************************\n", i);	// *출력
			System.out.printf("	구구단 %d 단\n", i);	// 구구단 i번 출력
			System.out.printf("***************************\n", i);	// *출력
			for (int j = 1; j < 10; j++) {	// 1 ~ 9까지 순서대로 도는 반복문
				
				System.out.printf(" %d * %d = %d \n", i, j, i * j);		// i , j , i * j 출력
			}
		}
	}

}