package java2_0320;

public class PrintfEx2 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";

		float kopo11_f1 = .10f; // 0.10 == 0.10, 1.0e-1 
		float kopo11_f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1		// e랑 뒤에 숫자가 붙으면 숫자만큼 0을 붙여주나보다
		float kopo11_f3 = 3.14e3f;	// 3.14e3f == 3140.0f
		double d = 1.23456789; // double 타입 변수에 1.23456789 초기값 선언

		// %f - 고정 소수점 실수 출력 (float)
		// %e - 부동 소수점 실수 출력 (double)
		// %g - 소수점 이하 자리수가 고정 또는 부동 소수점으로 출력 (double)
		System.out.printf("kopo11_f1 = %f, %e, %g%n", kopo11_f1, kopo11_f1, kopo11_f1);
		System.out.printf("kopo11_f2 = %f, %e, %g%n", kopo11_f2, kopo11_f2, kopo11_f2);
		System.out.printf("kopo11_f3 = %f, %e, %g%n", kopo11_f3, kopo11_f3, kopo11_f3);
		
		System.out.printf("d = %f%n", d);	// float 형태로 소수점 6자리 까지만 출력 
		System.out.printf("d = %14.10f%n", d);		// 전체 14자리 중 소수점 10자리
		
		System.out.printf("[12345678901234567890]%n");	// [12345678901234567890] 출력 후 개행
		System.out.printf("[%s]%n",url);	// [www.codechobo.com] 출력 후 개행
		System.out.printf("[%20s]%n",url);	// 최대 20자리 지정 후 오른쪽 정렬 출력 후 개행
		System.out.printf("[%-20s]%n",url);	// 최대 20자리 지정 후 왼쪽 정렬 출력 후 개행
		System.out.printf("[%.8s]%n",url);	// 왼쪽에서 8글자만 출력
	}

}
