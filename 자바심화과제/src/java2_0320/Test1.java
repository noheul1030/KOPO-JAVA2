package java2_0320;

public class Test1 {

	public static void main(String[] args) {
		
		String kopo11_s = "12345";	// String 타입의 kopo11_s 변수에 "12345" 초기값 선언
		int kopo11_i = Integer.parseInt(kopo11_s);	// int 타입의 변수로 형변환
		
		System.out.printf("문자를 숫자로 %d	 (%d)\n", kopo11_i, kopo11_i+10); // 숫자로 변환한 12345 와 (12345+10)을 출력
		
		String kopo11_a;	// String 타입의 변수 kopo11_a 선언
		kopo11_a = String.format("%d", kopo11_i);	// int 12345를 String으로 형변환
		
		System.out.printf("숫자를 문자로 %s	 (%s)\n", kopo11_a, kopo11_a+"abcde");	// String "12345"와 ("12345"+"abcde") 출력

	}

	
}
