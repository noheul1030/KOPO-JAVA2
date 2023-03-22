package java2_4강;

public class SpaceEx {

	public static void main(String[] args) {
		//////////////////
		// 띄어쓰기 연습
		// 
		
		for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) {		// 0 ~ 9번 까지 도는 반복문 
			for (int kopo11_j = 0; kopo11_j < kopo11_i; kopo11_j++) { // 0 ~ kopo11_i번 까지 도는 반복문 
				System.out.printf(" ");	// kopo11_i 번 만큼 공백을 찍는다.
			}
			System.out.printf("%d\n",kopo11_i);	// kopo11_i 값 출력 후 개행
		}

	}

}
