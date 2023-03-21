package java2_0320;

public class VarEx1 {

	public static void main(String[] args) {

		int kopo_year = 0; // int 변수 year 초기값 0 선언
		int kopo11_age = 14; // int 변수 age 초기값 14 선언

		System.out.println(kopo_year); // 0 출력
		System.out.println(kopo11_age);	// 14 출력

		kopo_year = kopo11_age + 2000;	// year 변수에 14 + 2000 값 대입
		kopo11_age = kopo11_age + 1;	// 14 + 1

		System.out.println(kopo_year);	// 2014 출력
		System.out.println(kopo11_age);	// 15 출력

	}

}
