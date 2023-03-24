package java2_6강;

public class TestMain {

	private static int inVal; // int 전역변수 선언
	public static void up() { // up 메소드
		inVal++; // inVal 1 추가
		System.out.printf("난 그냥 메소드[%d]\n",inVal); // 출력
	}
	public static void main(String[] args) { // 메인
		
		inVal = 0; // 초기값 0 대입
		Elevater elev; // Elevater 클래스의 elev 변수 선언
		
		elev = new Elevater(); // 새로운 객체 생성
		
		up(); // up메소드 실행
		for (int i = 0; i < 10; i++) { // 0 ~ 9 까지 도는 반복문
			elev.up(); // elev 의 up메소드 실행
			
			System.out.printf("MSG[%s]\n",elev.kopo11_help); // elev 의 help 전역변수 프린트
		}
		for (int i = 0; i < 10; i++) { // 0 ~ 9 까지 도는 반복문
			elev.down(); // elev 의 down메소드 실행
			
			System.out.printf("MSG[%s]\n",elev.kopo11_help);  // elev 의 help 전역변수 프린트
		}
	}

}
