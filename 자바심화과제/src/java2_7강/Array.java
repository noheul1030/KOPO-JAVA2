package java2_7강;

public class Array {

	public static void main(String[] args) { // 메인
		// int 배열에 초기값 대입
		int [] kopo11_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		
		for (int kopo11_i = 0; kopo11_i < kopo11_iArray.length; kopo11_i++) { // 0 ~ iArray.length 만큼 도는 반복문
			System.out.printf("iArray[%d]=%d\n",kopo11_i,kopo11_iArray[kopo11_i]); // 출력 개행
		}
		
		int kopo11_iMax = kopo11_iArray[0]; // 배열 선언 1칸
		int kopo11_iMaxPt = 0; // 초기값 0 변수 선언
		for (int kopo11_i = 0; kopo11_i < kopo11_iArray.length; kopo11_i++) { // 0 ~ iArray.length 만큼 도는 반복문
			if(kopo11_iMax < kopo11_iArray[kopo11_i]) { // 조건문 iArray[i]가 iMax보다 크면
				kopo11_iMax = kopo11_iArray[kopo11_i]; // iMax 변수에 값 대입
				kopo11_iMaxPt = kopo11_i; // iMaxPt 변수에 값 대입
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n",kopo11_iMaxPt,kopo11_iMax); // 출력 개행
	}

}
