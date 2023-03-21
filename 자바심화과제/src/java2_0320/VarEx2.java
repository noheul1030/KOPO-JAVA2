package java2_0320;

public class VarEx2 {

	public static void main(String[] args) {
		int kopo11_x = 10;	// int 10 초기값 선언
		int kopo11_y = 20;	// int 20 초기값 선언
		int kopo11_tmp = 0;	// int 0 초기값 선언

		System.out.println("x:" + kopo11_x + " y:" + kopo11_y);	// x : 10  y : 20 출력

		kopo11_tmp = kopo11_x;	// tmp 변수에 x값 10 대입
		kopo11_x = kopo11_y;	// x 변수에 y값 20 대입
		kopo11_y = kopo11_tmp;	// y 변수에 x값이 들어가서 바뀐 tmp값 10 대입

		System.out.println("x:" + kopo11_x + " y:" + kopo11_y);	// x : 20  y : 10 출력 
	}

}
