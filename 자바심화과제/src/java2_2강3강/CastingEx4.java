package java2_2강3강;

public class CastingEx4 {

	public static void main(String[] args) {
		int kopo11_i = 91234567; // 8자리의 10 진수
		float kopo11_f = (float) kopo11_i; // int를 float로 형변환 -> 91234568.000000
		int kopo11_i2 = (int) kopo11_f; // float를 다시 int로 형변환 -> 91234568

		double kopo11_d = (double) kopo11_i; // int를 double로 형변환 -> 91234567.000000
		int kopo11_i3 = (int) kopo11_d; // double을 int로 다시 형변환	-> 91234567

		float kopo11_f2 = 1.666f; // float 형의 1.666f 초기값 선언
		int kopo11_i4 = (int) kopo11_f2; // int를 float로 형변환

		System.out.printf("kopo11_i = %d\n", kopo11_i);		// 정수 91234567 출력
		System.out.printf("kopo11_f = %f kopo11_i2 = %d\n", kopo11_f, kopo11_i2);	// float형의 91234568.000000, 정수 91234568 출력
		System.out.printf("kopo11_d = %f kopo11_i3 = %d\n", kopo11_d, kopo11_i3);	// double형의 91234567.000000, 정수 91234567 출력
		System.out.printf("(int)%f = %d\n", kopo11_f2, kopo11_i4);	// float형의 1.666000, (int)로 형변환후 소수점 버린 1 출력
	}

}