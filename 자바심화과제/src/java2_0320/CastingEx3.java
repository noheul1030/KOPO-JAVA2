package java2_0320;

public class CastingEx3 {

	public static void main(String[] args) {
		float kopo11_f = 9.1234567f;	// float 타입 9.1234567f 초기값 선언
		double kopo11_d = 9.1234567;	// double 타입 9.1234567f 초기값 선언
		double kopo11_d2 = (double)kopo11_f;	// float를 double 타입으로 형 변환 대입
		
		// %20.18f = 소숫점 이하 최대 18자리의 float 형태로 출력
		// float는 정밀도가 7이여서 7자리까지 정확 뒤의 숫자는 의미없는 숫자
		// double은 정밀도가 15 따라서 15자리까지 정확! 
		System.out.printf("kopo11_f = %20.18f\n", kopo11_f);	
		System.out.printf("kopo11_d = %20.18f\n", kopo11_d);
		System.out.printf("kopo11_d2 = %20.18f\n", kopo11_d2);

	}

}
