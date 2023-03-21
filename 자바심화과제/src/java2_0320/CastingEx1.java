package java2_0320;

public class CastingEx1 {

	public static void main(String[] args) {
		double kopo11_d = 85.4;		// double 타입의 85.4 선언
		int kopo11_score = (int)kopo11_d;	// int로 형 변환하여 소수점 제외한 85 대입
		
		System.out.println("kopo11_score = "+ kopo11_score);	// 85 출력
		System.out.println("kopo11_d = "+ kopo11_d);	// 85.4	출력

	}

}