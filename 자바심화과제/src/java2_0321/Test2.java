package java2_0321;

public class Test2 {

	public static void main(String[] args) {
//		
//		// String �迭�� {"��","��","��","��","��","��","��","ĥ","��","��"} �ʱⰪ ����
//		String [] kopo11_units = {"��","��","��","��","��","��","��","ĥ","��","��"};
//		for (int i = 0; i < 101; i++) {	 	// 0 ~ 100 ���� ���� �ݺ���
//			
//			if(i >= 0 && i < 10) {	// i�� 0���� ũ�ų� ���� '�׸���' i�� 10 ���� ������ ���
//				System.out.printf("�����ڸ� : %s\n",kopo11_units[i]);	// �����ڸ� : i 
//			}
//			else if(i >= 10 && i < 100) {	// i�� 10���� ũ�ų� ���� '�׸���' i�� 100 ���� ������ ���
//				
//				int kopo11_i10,kopo11_i0;	// int ���� �ΰ� ����
//				
//				kopo11_i10 = i/10;	// i ������ 10 �� �� ���� : �����ڸ�
//				kopo11_i0 = i%10;	// i�� 10���� ������ �� ������ ���� ���� : �����ڸ�
//				
//				if(kopo11_i0 ==0) {	// ���������� 0 �̸� ��� 
//					System.out.printf("�����ڸ� : %s��\n",kopo11_units[kopo11_i10]);	// �����ڸ� : kopo11_i10 ��
//				}else {	// ���������� 0�� �ƴ϶�� ���
//					// �����ڸ� : kopo11_i10 �� kopo11_i0
//					System.out.printf("�����ڸ� : %s��%s\n",kopo11_units[kopo11_i10],kopo11_units[kopo11_i0]);
//					
//				}
//			}
//			else System.out.printf("==> %d\n",i);	// �� �� i ==> 100 ���
//		}
//		
//		
//		
//		
		int kopo11_iNumVal = 1001034567; // int Ÿ���� ������ 1001034567 �ʱⰪ ����

		String kopo11_sNumVal = String.valueOf(kopo11_iNumVal); // int Ÿ���� ������ String.valueOf() �Լ��� ����ȯ �� String ������ ����

		String kopo11_sNumVoice = ""; // ����ִ� String Ÿ���� ���� ����

		// %s ��Ʈ��Ÿ�� ���, %d ���� ���
		// ==> kopo11_sNumVal [kopo11_sNumVal.length()] ��� ����
		System.out.printf("==> %s [%d�ڸ�]\n", kopo11_sNumVal, kopo11_sNumVal.length());
		System.out.printf("\n"); // ����

		int kopo11_i, kopo11_j; // int Ÿ���� ���� 2�� ����

		// String �迭�� {"��","��","��","��","��","��","��","ĥ","��","��"} �ʱⰪ ����
		String[] kopo11_units2 = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		// String �迭�� {"", "��", "��", "õ", "��", "��", "��", "õ", "��", "��"} �ʱⰪ ����
		String[] kopo11_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };

		kopo11_i = 0; // �ʱⰪ 0 ����
		kopo11_j = kopo11_sNumVal.length() - 1; // �ʱⰪ 10 - 1 = 9 ����

		while (true) { // while �ݺ��� true�϶� ��� �����Ѵ�
			if (kopo11_i >= kopo11_sNumVal.length()) // if( 0 >= 10) �̸� break;
				break;

			System.out.printf("%s[%s]", kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1),
					// kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1 -> kopo11_sNumVal ����
					// .substring(kopo11_i, kopo11_i + 1) ��ŭ �߶�ͼ� %s�� String Ÿ������ ����Ѵ�.
					kopo11_units2[Integer.parseInt(kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1))]);
			// (kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1))�� Integer.parseInt�� int
			// Ÿ������ ����ȯ�Ͽ�
			// kopo11_units2[ ]�� �迭���� []��°�� �ش�Ǵ� ���� ������ [%s] String Ÿ������ ����Ѵ�.

			// kopo11_sNumVal ������ .substring( , ) �Ͽ� �ϳ��� ������ ���� "0"�� ��ġ�ϴ��� Ȯ���Ѵ�.
			if (kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1).equals("0")) {

				// kopo11_unitX �迭�� [kopo11_j]��°�� "��"�� ��ġ�ϴ��� '�Ǵ�' "��"�� ��ġ�ϴ��� Ȯ���Ѵ�.
				if (kopo11_unitX[kopo11_j].equals("��") || kopo11_unitX[kopo11_j].equals("��")) {
					// ��ġ�� �� kopo11_sNumVoice ������ kopo11_sNumVoice + ""(stringŸ��)+ kopo11_unitX �迭��
					// [kopo11_j]��° ����
					kopo11_sNumVoice = kopo11_sNumVoice + "" + kopo11_unitX[kopo11_j];
				} else {
					// else�� �н�~
				}
			} else {// kopo11_sNumVal ������ .substring( , ) �Ͽ� �ϳ��� ������ ���� "0"�� ��ġ���� ���� ��
				// kopo11_sNumVoice = kopo11_sNumVoice +
				// (kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1))�� Integer.parseInt�� int
				// Ÿ������ ����ȯ�Ͽ�
				// kopo11_units2�� �迭���� []��°�� �ش�Ǵ� ���� ������ ���Ѵ�.
				// +kopo11_unitX�� [[kopo11_j] ��° ���� ���Ѵ�.
				kopo11_sNumVoice = kopo11_sNumVoice
						+ kopo11_units2[Integer.parseInt(kopo11_sNumVal.substring(kopo11_i, kopo11_i + 1))]
						+ kopo11_unitX[kopo11_j];
			}
			kopo11_i++; // kopo11_i�� 1�� ���Ѵ�.
			kopo11_j--; // kopo11_j�� 1�� ����.

		}
		System.out.printf("\n"); // ����
		// \n ���� �� kopo11_sNumVal�� String ������ [kopo11_sNumVoice]��° ��� �� ���� \n
		System.out.printf("\n%s[%s]\n", kopo11_sNumVal, kopo11_sNumVoice);
	}

}