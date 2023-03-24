package java2_6강;

public class TestMain2 {
	public static void main(String[] args) {
		Calc1 cc = new Calc1(); // 클래스 객체 생성
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", cc.sum(1, 2)); // 정수형 출력 개행
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", cc.sum(1, 2, 3));// 정수형 출력 개행
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", cc.sum(1, 2, 3, 4));// 정수형 출력 개행
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", cc.sum(1.3, 2.4)); // 실수형 출력 개행

	}

}

class Calc1 {

	public int sum(int a, int b) { // int return 파라미터 2개받는 메서드
		return a + b; // a + b 값 리턴
	}

	public int sum(int a, int b, int c) { // int return 파라미터 3개받는 메서드
		return a + b + c; // a + b + c 리턴
	}

	public int sum(int a, int b, int c, int d) { // int return 파라미터 4개받는 메서드
		return a + b + c + d; // a + b + c + d 값 리턴
	}

	public double sum(double a, double b) { // double return파라미터 2개받는 메서드
		return a + b; // a + b 값 리턴
	}

}
