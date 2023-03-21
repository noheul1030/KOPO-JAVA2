package java2_0320;

public class PrintfEx1 {

	public static void main(String[] args) {

		byte kopo11_b = 1;	// byte 타입 변수 1 초기값 선언
		short kopo11_s = 2;	// short 타입 변수 2 초기값 선언
		char kopo11_c = 'A';	// char 타입 변수 'A' 초기값 선언

		int finger = 10;	// int 타입 변수 10 초기값 선언
		long big = 1000000000000L;	// long 타입 변수 1000000000000L 초기값 선언
		long hex = 0xFFFFFFFFFFFFFFFFL; // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010; // 8진수 10, 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10 진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2

		System.out.printf("b = %d%n", kopo11_b);	// b = 1
		System.out.printf("s = %d%n", kopo11_s);	// s = 2
		System.out.printf("c = %c, %d %n", kopo11_c, (int) kopo11_c);	// c = A, (int)형변환 65 출력
		System.out.printf("finget = [%5d]%n", finger);	// 5만큼 출력할 최대 자릿수 지정하고 오른쪽 정렬, 남은자리는 공백
		System.out.printf("finget = [%-5d]%n", finger);	// 5만큼 출력할 최대 자릿수 지정하고 왼쪽 정렬, 남은자리는 공백
		System.out.printf("finget = [%05d]%n", finger);	// 지정된 자릿수 출력하고 남는 자리는 공백대신 0 출력
		System.out.printf("big = %d%n", big);	// big = 1000000000000
		System.out.printf("hex = %#x%n", hex);	// hex = 0xFFFFFFFFFFFFFFFF (%x - 16진 형태로 출력)
		System.out.printf("octNum = %o, %d%n", octNum, octNum);	// 8진수 10, 10진수로는 8 (%o - 8진형태로 출력)
		System.out.printf("hexNum = %o, %d%n", hexNum, hexNum);	// 16진수 10, 10 진수로는 16
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);	// 2진수 10, 10진수로는 2
	
	}

}
