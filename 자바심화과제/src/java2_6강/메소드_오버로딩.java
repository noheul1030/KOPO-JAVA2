package java2_6강;

public class 메소드_오버로딩 {

	public static void main(String[] args) {
		methodOverloading kopo11_method = new methodOverloading(); // 클래스 객체 생성
		for (int kopo11_i = 3; kopo11_i <= 5; kopo11_i++) { // 3번 도는 반복문
			System.out.printf("%s월 성적표\n", kopo11_i); // String 출력 개행
			kopo11_method.kopo11_print(); // print 메소드 실행

			int kopo11_국어 = 100; // int 변수에 100 초기값 대입
			int kopo11_영어 = 100; // int 변수에 100 초기값 대입
			int kopo11_수학 = 100; // int 변수에 100 초기값 대입
			int kopo11_과학 = 100; // int 변수에 100 초기값 대입
			int kopo11_사회 = 100; // int 변수에 100 초기값 대입

			if (kopo11_i == 3) { // i가 3일때
				System.out.printf("%s%5s%5s%5s%5s%5s\n", "이름", "국어", "영어", "수학", "총점", "평균"); // String 출력 개행
				kopo11_method.kopo11_print(); // print 메소드 실행
				
				// 변수 값 출력 개행
				System.out.printf("%s%5d%6d%7d%7d%7d\n", kopo11_method.kopo11_name(), kopo11_국어, kopo11_영어, kopo11_수학,
						(int) kopo11_method.kopo11_sum(kopo11_국어, kopo11_영어, kopo11_수학), (int) kopo11_method
								.kopo11_ave(kopo11_method.kopo11_sum(kopo11_국어, kopo11_영어, kopo11_수학), kopo11_i)); 
				System.out.printf("\n"); // 개행
			}
			if (kopo11_i == 4) { // i가 4일때
				System.out.printf("%s%5s%5s%5s%5s%5s%5s\n", "이름", "국어", "영어", "수학", "과학", "총점", "평균"); // String 출력 개행
				kopo11_method.kopo11_print(); // print 메소드 실행
				
				// 변수 값 출력 개행
				System.out.printf("%s%5d%6d%7d%7d%7d%4s%.1f\n", kopo11_method.kopo11_name(), kopo11_국어, kopo11_영어,
						kopo11_수학, kopo11_과학,
						(int) kopo11_method.kopo11_sum(kopo11_국어, kopo11_영어, kopo11_수학, kopo11_과학), "",
						(double) kopo11_method.kopo11_sum(kopo11_국어, kopo11_영어, kopo11_수학, kopo11_과학) / kopo11_i); 
				System.out.printf("\n"); // 개행

			}
			if (kopo11_i == 5) { // i가 5일때
				// String 출력 개행
				System.out.printf("%s%5s%5s%5s%5s%5s%5s%5s\n", "이름", "국어", "영어", "수학", "과학", "사회", "총점", "평균"); 
				
				kopo11_method.kopo11_print(); // print 메소드 실행

				// 변수 값 출력 개행
				System.out.printf("%s%5d%6d%7d%7d%7d%7d%4s%.1f\n", kopo11_method.kopo11_name(), kopo11_국어, kopo11_영어,
						kopo11_수학, kopo11_과학, kopo11_사회,
						(int) kopo11_method.kopo11_sum(kopo11_국어, kopo11_영어, kopo11_수학, kopo11_과학, kopo11_사회), "",
						(double) kopo11_method.kopo11_sum(kopo11_국어, kopo11_영어, kopo11_수학, kopo11_과학, kopo11_사회)
								/ kopo11_i); 
				System.out.printf("\n"); // 개행

			}
		}

	}

}

class methodOverloading { // 클래스
	public String kopo11_name() { // String return 메서드
		return "폴리융";
	}

	public int kopo11_sum(int kopo11_a, int kopo11_b, int kopo11_c) { // int return 파라미터 3개받는 메서드

		return kopo11_a + kopo11_b + kopo11_c; // a + b + c 리턴
	}

	public int kopo11_sum(int kopo11_a, int kopo11_b, int kopo11_c, int kopo11_d) { // int return 파라미터 4개받는 메서드
		return kopo11_a + kopo11_b + kopo11_c + kopo11_d; // a + b + c + d 값 리턴
	}

	public int kopo11_sum(int kopo11_a, int kopo11_b, int kopo11_c, int kopo11_d, int kopo11_e) { // int return 파라미터
																									// 5개받는 메서드
		return kopo11_a + kopo11_b + kopo11_c + kopo11_d + kopo11_e; // a + b + c + d + e값 리턴
	}

	public double kopo11_ave(double kopo11_a, double kopo11_b) { // double return파라미터 2개받는 메서드
		return kopo11_a / kopo11_b; // a / b 값 리턴
	}

	public void kopo11_print() { // print 메서드
		System.out.printf("==========================================================\n");
	}
}