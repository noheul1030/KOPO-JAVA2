package java2_4강;

public class If_else {
	public static void main(String[] args) {

		int kopo11_iI; // int 타입 변수 선언
		double kopo11_iD; // double 타입 변수 선언

		kopo11_iI = 10 / 3; // int 값으로 소숫점 버리고 3 저장
		kopo11_iD = 10 / 3.0; // double 값으로 3.33333... 저장

		if (kopo11_iI == kopo11_iD)
			System.out.printf("equal\n"); // iI 와 iD가 같으면 "equal" 출력
		
		// 그 외 "Not equal" double 형변환한 값 3.00000...과 3.333333....출력
		else
			System.out.printf("Not equal[%f][%f]\n", (double) kopo11_iI, kopo11_iD);

		if (kopo11_iI == 3.333333)
			System.out.printf("equal\n"); // iI가 3.333333과 같으면 "equal" 출력
		else
			System.out.printf("Not equal[3.333333][%f]\n", kopo11_iD); // 아니면 "Not equal" 출력

		kopo11_iD = (int) kopo11_iD; // iD 변수에 (int) 형변환하여 소숫점 버린 3.000000 저장
		
		if (kopo11_iI == kopo11_iD)
			System.out.printf("equal\n"); // iI 와 iD가 같으면 "equal" 출력
		else
			System.out.printf("Not equal[%f][%f]\n", (double) kopo11_iI, kopo11_iD); // 그 외 "Not equal" 출력

		System.out.printf("int로 인쇄[%d][%f]\n", kopo11_iI, kopo11_iD);	// iI는 정수형으로, iD는 소숫점으로 출력
		System.out.printf("double로 인쇄[%f][%f]\n", (double) kopo11_iI, kopo11_iD);	// 둘다 소숫점으로 출력

		char kopo11_a = 'c';	// char 타입 변수 'c' 초기값 선언

		if (kopo11_a == 'b')	// 'b'랑 같을때	출력
			System.out.printf("kopo11_a는 b이다\n");
		if (kopo11_a == 'c')	// 'c'랑 같을때 출력
			System.out.printf("kopo11_a는 c이다\n");
		if (kopo11_a == 'd')	// 'd'랑 같을때 출력
			System.out.printf("kopo11_a는 d이다\n");

		String kopo11_aa = "abcd";	// String 타입 문자열 "abcd" 초기값 선언

		if (kopo11_aa.equals("abcd"))	// "abcd"'랑 같을때	출력
			System.out.printf("kopo11_aa는 abcd이다\n");
		else	// "abcd"'랑 같지 않을때	출력
			System.out.printf("kopo11_aa는 abcd이 아니다\n");

		boolean kopo11_bb = true;	// boolean 타입 true 초기값 선언

		if (!!kopo11_bb)	// true를 두번 부정 -> 참
			System.out.printf("kopo11_bb가 아니고 아니면 참이다\n");
		else	// 그 외 
			System.out.printf("kopo11_bb가 아니고 아니면 거짓이다\n");

	}
}