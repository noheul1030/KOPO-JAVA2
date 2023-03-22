package java2_4강;

public class sin함수그래프 {

	public static void main(String[] args) {
		
		double kopo11_fSin;		// double 타입 변수 선언
		
		for (int kopo11_i = 0; kopo11_i < 361; kopo11_i++) { // 0 ~ 360 까지 도는 반복문
			// Math.sin() -> 한 각에 대한 사인값을 반환합니다.
			kopo11_fSin = Math.sin(kopo11_i * Math.PI/180); // fSin에 Math.sin(kopo11_i * 3.101592/180) 계산값 대입
			
			// %d 정수형 kopo11_i ==> %f 소숫점형 kopo11_fSin 출력 \n 개행
			System.out.printf("%d sin ==> %f\n",kopo11_i,kopo11_fSin);
		}
		
		for (int kopo11_i = 0; kopo11_i < 361; kopo11_i++) { // 0 ~ 360 까지 도는 반복문
			// Math.sin() -> 한 각에 대한 사인값을 반환합니다.
			kopo11_fSin = Math.sin(kopo11_i * Math.PI/180); // fSin에 Math.sin(kopo11_i * 3.101592/180) 계산값 대입
			
			// kopo11_iSpace에 (1.0-kopo11_fSin)*50 (int) 변환값 대입
			int kopo11_iSpace = (int)((1.0-kopo11_fSin)*50);
			
			for (int kopo11_j = 0; kopo11_j < kopo11_iSpace; kopo11_j++)  System.out.printf(" "); // 0 ~ kopo11_iSpace 까지 도는 반복문
				// * [%f 소숫점형 kopo11_fSin] [%d 정수형 kopo11_iSpace] \n 개행 출력
				System.out.printf("*[%f][%d]\n",kopo11_fSin,kopo11_iSpace);
			
		}
	}

}
