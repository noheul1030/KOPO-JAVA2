package java2_6강;

public class 리모컨_Practice {

	public static void main(String[] args) {
		TvRemocon kopo11_tv; // 클래스 변수 선언
		
		kopo11_tv = new TvRemocon(); // 변수에 새 클래스 객체 생성
		
		for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9 까지 도는 반복문
			kopo11_tv.ChannelUp(); // tv 객체의 ChannelUp 실행
			System.out.printf("[%s]\n",kopo11_tv.kopo11_Voice); // String 출력 개행
		}
		System.out.printf("\n"); // 개행
		for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9 까지 도는 반복문
			kopo11_tv.ChannelDn(); // tv 객체의 ChannelDn 실행
			System.out.printf("[%s]\n",kopo11_tv.kopo11_Voice); // String 출력 개행
		}
		System.out.printf("\n"); // 개행
		for (int kopo11_i = 0; kopo11_i < 5; kopo11_i++) { // 0 ~ 5 까지 도는 반복문
			kopo11_tv.VolUp();  // tv 객체의 VolUp 실행
			System.out.printf("[%s]\n",kopo11_tv.kopo11_Voice); // String 출력 개행
		}
		System.out.printf("\n"); // 개행
		for (int kopo11_i = 0; kopo11_i < 5; kopo11_i++) { // 0 ~ 5 까지 도는 반복문
			kopo11_tv.VolDn(); // tv 객체의 VolDn 실행
			System.out.printf("[%s]\n",kopo11_tv.kopo11_Voice); // String 출력 개행
		}
		System.out.printf("\n"); // 개행

	}

}
