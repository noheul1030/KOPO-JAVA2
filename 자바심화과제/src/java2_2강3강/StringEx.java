package java2_2강3강;

public class StringEx {

	public static void main(String[] args) {
		String kopo11_name = "Ja" + "va"; // String 타입 배열에 "Ja" + "va" 값 입력 = "Java"
		String kopo11_str = kopo11_name + 8.0; // String 타입 배열에 "Java" + 8.0 값 입력 = "Java8.0"

		System.out.println(kopo11_name); // "Java" 출력
		System.out.println(kopo11_str); // "Java8.0" 출력
		System.out.println(7 + " ");	// 7 출력
		System.out.println(" " + 7);	// 한칸띄고 7출력
		System.out.println(7 + "");		// 7출력
		System.out.println("" + 7);		// 7출력
		System.out.println("" + "");	// 빈칸 출력
		System.out.println(7 + 7 + "");		// 7+7 = 14 출력 int 형으로 계산
		System.out.println("" + 7 + 7);		// ""빈칸을 String 타입으로 계산하고 7+7 = 77 출력

	}

}