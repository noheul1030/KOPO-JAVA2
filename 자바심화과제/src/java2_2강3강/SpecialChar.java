package java2_2강3강;

public class SpecialChar {

	public static void main(String[] args) {
		System.out.println('\'');	// ''' 처럼 할 수 없다.
		System.out.println("abc\t123\b456");	// abc \t탭만큼 띄고 123 \b (백스페이스로 3을 지워야 하나 오류가 있음) 456
		System.out.println('\n');	// 개행
		System.out.println("\"Hello\"");	// 큰 따옴표 출력 은 \"
		System.out.println("c:\\");		
	}

}