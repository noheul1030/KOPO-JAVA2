package java2_2��3��;

public class OverflowEx {

	public static void main(String[] args) {
		short kopo11_sMin = -32768;	 // short -32768 �ʱⰪ ����
		short kopo11_sMax = 32767;	// short 32767 �ʱⰪ ����
		char kopo11_cMin = 0;	// char �ʱⰪ 0 ����
		char kopo11_cMax = 65535;	// char �ʱⰪ 65535 ����
		
		System.out.println("kopo11_sMin = " + kopo11_sMin);	// -32768
		System.out.println("kopo11_sMin - 1 = " + (short)(kopo11_sMin-1));	// short�� �ִ밪 32767 ���
		System.out.println("kopo11_sMax = " + kopo11_sMax);	// 32767
		System.out.println("kopo11_sMax + 1 = " + (short)(kopo11_sMax+1)); // short�� �ּҰ� -32768 ���
		System.out.println("kopo11_cMin = " + (int)kopo11_cMin);		// 0
		System.out.println("kopo11_cMin - 1 = " + (int)--kopo11_cMin);		// 65535
		System.out.println("kopo11_cMax = " + (int)kopo11_cMax);	// 65535
		System.out.println("kopo11_cMax + 1 = " + (int)++kopo11_cMax);	// 0
		

	}

}