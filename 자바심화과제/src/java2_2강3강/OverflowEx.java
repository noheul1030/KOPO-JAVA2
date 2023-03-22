package java2_2강3강;

public class OverflowEx {

	public static void main(String[] args) {
		short kopo11_sMin = -32768;	 // short -32768 초기값 선언
		short kopo11_sMax = 32767;	// short 32767 초기값 선언
		char kopo11_cMin = 0;	// char 초기값 0 선언
		char kopo11_cMax = 65535;	// char 초기값 65535 선언
		
		System.out.println("kopo11_sMin = " + kopo11_sMin);	// -32768
		System.out.println("kopo11_sMin - 1 = " + (short)(kopo11_sMin-1));	// short의 최대값 32767 출력
		System.out.println("kopo11_sMax = " + kopo11_sMax);	// 32767
		System.out.println("kopo11_sMax + 1 = " + (short)(kopo11_sMax+1)); // short의 최소값 -32768 출력
		System.out.println("kopo11_cMin = " + (int)kopo11_cMin);		// 0
		System.out.println("kopo11_cMin - 1 = " + (int)--kopo11_cMin);		// 65535
		System.out.println("kopo11_cMax = " + (int)kopo11_cMax);	// 65535
		System.out.println("kopo11_cMax + 1 = " + (int)++kopo11_cMax);	// 0
		

	}

}