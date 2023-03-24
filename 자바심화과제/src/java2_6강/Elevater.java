package java2_6강;

public class Elevater {

	int kopo11_limit_uo_floor = 10;	// 최상위 층
	int kopo11_limit_down_floor = 0;	// 최하위 층
	int kopo11_floor = 1; // 현재 층
	String kopo11_help; // String 전역변수 선언
	
	void up()	// 엘리베이터가 올라갈 때 메서드
	{
		if(kopo11_floor == kopo11_limit_uo_floor) { // floor가 최상층일 때
			kopo11_help = "마지막층입니다."; // String 변수에 대입
		}else { // 최상층이 아닐 때
			kopo11_floor++; // floor 1 추가
			kopo11_help = String.format("%d층입니다.", kopo11_floor); // String 변수에 대입
		}
	}
	void down()	// 엘리베이터가 내려갈 때 메서드
	{
		if(kopo11_floor == kopo11_limit_down_floor) { // floor가 1층일 때
			kopo11_help = "처음층 입니다.";// String 변수에 대입
		}else { // 1층이 아닐 때
			kopo11_floor--; // floor 1 빼기
			kopo11_help = String.format("%d층입니다.", kopo11_floor); // String 변수에 대입
		}
	}

}

