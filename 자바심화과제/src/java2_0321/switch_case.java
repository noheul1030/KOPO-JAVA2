package java2_0321;

public class switch_case {

	public static void main(String[] args) {

		String kopo11_jumin = "123456-1234567"; // String 타입 "123456-1234567" 초기값 선언

		switch (kopo11_jumin.charAt(7)) { // kopo11_jumin 7번째 문자를 char타입으로 가져온다.
		case '1': // char타입 '1'일때
			System.out.printf("20세기전 태어난 남자 사람\n"); // break가 없어서 break가 나올때까지 흘러간다.20세기전 태어난 남자 사람  \n개행
		case '2': // char타입 '2'일때
			System.out.printf("20세기전 태어난 여자 사람\n"); // 20세기전 태어난 여자 사람 \n개행
			break; // switch문을 여기서 멈춘다.
		case '3': // char타입 '3'일때
			System.out.printf("20세기후 태어난 남자 사람\n");// 20세기후 태어난 남자 사람 \n개행
			break; // switch문을 여기서 멈춘다.
		case '4': // char타입 '4'일때
			System.out.printf("20세기후 태어난 여자 사람\n"); // 20세기후 태어난 여자 사람 \n개행
			break; // switch문을 여기서 멈춘다.
		default: // 그 외
			System.out.printf("사람\n"); // 사람 \n개행
			break; // switch문을 여기서 멈춘다.
		}
	}

}
