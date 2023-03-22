package java2_4강;

public class 별찍기 {

	public static void main(String[] args) {
		
		int kopo11_n, kopo11_m;	// int타입의 n,m변수 선언

		kopo11_m = 20;	// m변수에 20 초기값 대입
		kopo11_n = 1;	// n변수에 1 초기값 대입

		while(true) {	// true일때 반복으로 도는 while문
			
			for (int kopo11_i = 0; kopo11_i < kopo11_m; kopo11_i++) System.out.printf(" ");	// 0 ~ m 만큼 반복으로 돌며 " "공백을 출력
			for (int kopo11_i = 0; kopo11_i < kopo11_n; kopo11_i++) System.out.printf("*");	// 0 ~ n 만큼 반복으로 돌며 "*"을 출력
			System.out.printf("\n");	// 개행
			
			kopo11_m = kopo11_m-1;	// m 변수에 m-1값 대입
			kopo11_n = kopo11_n+2;	// n 변수에 n+2값 대입
			
			if (kopo11_m < 0) break;	// m변수의 값이 0이되면 break;
		}
	}

}
