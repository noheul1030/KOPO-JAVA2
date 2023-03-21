package java2_0320;

public class CastingEx2 {

	public static void main(String[] args) {
		int kopo11_i = 10;	// int 타입 10 초기값 선언
		byte kopo11_b = (byte) kopo11_i;	//(byte)로 형변환하여10 대입

		System.out.printf("[int -> byte] i = %d -> b = %d%n", kopo11_i, kopo11_b); // i = 10, b = 10 출력
		
		kopo11_i = 300;	// 300 대입
		kopo11_b = (byte)kopo11_i; // (byte)로 형변환하여 300 대입
		System.out.printf("[int -> byte] i = %d -> b = %d%n", kopo11_i, kopo11_b);	 // i = 300, b = byte 크기 초과해서 값 소실!
		
		kopo11_b = 10;	// 10 대입
		kopo11_i = (int)kopo11_b;	// (int)로 형변환하여 10 대입
		System.out.printf("[int -> byte] b = %d -> i = %d%n", kopo11_b, kopo11_i);	 // b = 10, i = 10 출력
		
		kopo11_b = -2;	// -2 대입
		kopo11_i = (int)kopo11_b;	// (int)로 형변환하여 -2 대입
		System.out.printf("[int -> byte] b = %d -> i = %d%n", kopo11_b, kopo11_i);	// b = -2, i = -2 출력
		
		// toBinaryString() -> 10진수를 2진수String 으로 변환
		System.out.println("i = "+ Integer.toBinaryString(kopo11_i));
	}

}
