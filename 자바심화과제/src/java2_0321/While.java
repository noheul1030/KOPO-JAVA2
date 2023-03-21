package java2_0321;

public class While {

	public static void main(String[] args) {
		
		int kopo11_iA,kopo11_iB;	// int타입 변수 두개 선언
		
		kopo11_iA = 0;	// iA 변수에 초기값 0 대입
		
		while(true) {	// true 일때 반복으로 도는 while문
			
			kopo11_iB = 0;	// iB 변수에 초기값 0 대입
			
			while(true) {	// true 일때 반복으로 도는 while문
				
				System.out.printf("*");		// 별하나씩찍기
				
				if(kopo11_iA == kopo11_iB) break;	// iA 와 iB가 같으면 break;
				
				kopo11_iB++;	// iB에 1을 하나 더해준다
			}
			
			System.out.println("\n"); 	// 개행
			
			kopo11_iA++;	// iA에 1을 하나 더해준다.
			
			if(kopo11_iA == 30) break;	// iA가 30이면 break;
		}
	}

}
