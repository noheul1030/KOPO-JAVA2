package java2_7��;

public class Array {

	public static void main(String[] args) { // ����
		// int �迭�� �ʱⰪ ����
		int [] kopo11_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		
		for (int kopo11_i = 0; kopo11_i < kopo11_iArray.length; kopo11_i++) { // 0 ~ iArray.length ��ŭ ���� �ݺ���
			System.out.printf("iArray[%d]=%d\n",kopo11_i,kopo11_iArray[kopo11_i]); // ��� ����
		}
		
		int kopo11_iMax = kopo11_iArray[0]; // �迭 ���� 1ĭ
		int kopo11_iMaxPt = 0; // �ʱⰪ 0 ���� ����
		for (int kopo11_i = 0; kopo11_i < kopo11_iArray.length; kopo11_i++) { // 0 ~ iArray.length ��ŭ ���� �ݺ���
			if(kopo11_iMax < kopo11_iArray[kopo11_i]) { // ���ǹ� iArray[i]�� iMax���� ũ��
				kopo11_iMax = kopo11_iArray[kopo11_i]; // iMax ������ �� ����
				kopo11_iMaxPt = kopo11_i; // iMaxPt ������ �� ����
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n",kopo11_iMaxPt,kopo11_iMax); // ��� ����
	}

}
