package java2_0322;

public class sin�Լ��׷��� {

	public static void main(String[] args) {
		
		double kopo11_fSin;		// double Ÿ�� ���� ����
		
		for (int kopo11_i = 0; kopo11_i < 360; kopo11_i++) { // 0 ~ 359 ���� ���� �ݺ���
			// Math.sin() -> �� ���� ���� ���ΰ��� ��ȯ�մϴ�.
			kopo11_fSin = Math.sin(kopo11_i * 3.101592/180); // fSin�� Math.sin(kopo11_i * 3.101592/180) ��갪 ����
			
			// %d ������ kopo11_i ==> %f �Ҽ����� kopo11_fSin ��� \n ����
			System.out.printf("%d sin ==> %f\n",kopo11_i,kopo11_fSin);
		}
		
		for (int kopo11_i = 0; kopo11_i < 360; kopo11_i++) { // 0 ~ 359 ���� ���� �ݺ���
			// Math.sin() -> �� ���� ���� ���ΰ��� ��ȯ�մϴ�.
			kopo11_fSin = Math.sin(kopo11_i * 3.101592/180); // fSin�� Math.sin(kopo11_i * 3.101592/180) ��갪 ����
			
			// kopo11_iSpace�� (1.0-kopo11_fSin)*50 (int) ��ȯ�� ����
			int kopo11_iSpace = (int)((1.0-kopo11_fSin)*50);
			
			for (int j = 0; j < kopo11_iSpace; j++) { System.out.printf(" "); // 0 ~ kopo11_iSpace ���� ���� �ݺ���
				// * [%f �Ҽ����� kopo11_fSin] [%d ������ kopo11_iSpace] \n ���� ���
				System.out.printf("*[%f][%d]\n",kopo11_fSin,kopo11_iSpace);
			}
		}
	}

}
