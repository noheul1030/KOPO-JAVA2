package java2_0321;

public class While {

	public static void main(String[] args) {
		
		int kopo11_iA,kopo11_iB;	// intŸ�� ���� �ΰ� ����
		
		kopo11_iA = 0;	// iA ������ �ʱⰪ 0 ����
		
		while(true) {	// true �϶� �ݺ����� ���� while��
			
			kopo11_iB = 0;	// iB ������ �ʱⰪ 0 ����
			
			while(true) {	// true �϶� �ݺ����� ���� while��
				
				System.out.printf("*");		// ���ϳ������
				
				if(kopo11_iA == kopo11_iB) break;	// iA �� iB�� ������ break;
				
				kopo11_iB++;	// iB�� 1�� �ϳ� �����ش�
			}
			
			System.out.println("\n"); 	// ����
			
			kopo11_iA++;	// iA�� 1�� �ϳ� �����ش�.
			
			if(kopo11_iA == 30) break;	// iA�� 30�̸� break;
		}
	}

}
