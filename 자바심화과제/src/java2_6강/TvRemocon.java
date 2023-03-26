package java2_6강;

public class TvRemocon {

	int kopo11_channel_up = 10; // int 지역변수에 10 대입
	int kopo11_channel_down = 0; // int 지역변수에 0 대입
	int kopo11_vol_up = 5; // int 지역변수에 5 대입
	int kopo11_vol_down = 0; // int 지역변수에 0 대입

	int kopo11_channel = 0; // int 지역변수에 0 대입
	int kopo11_vol = 0; // int 지역변수에 0 대입

	String kopo11_Voice; // String 전역변수 선언

	void VolUp() { // 볼륨 UP 메서드

		kopo11_vol++; // 1추가
		kopo11_Voice = kopo11_Voice.format("볼륨크기 : %d", kopo11_vol); // String 변수에 대입
		if (kopo11_vol == kopo11_vol_up) { // 두 조건이 같을 때
			kopo11_Voice = "볼륨이 최대 5 입니다."; // String 변수에 대입
		}

	}

	void VolDn() { // 볼륨 DOWN 메서드

		kopo11_vol--; // 1빼기
		kopo11_Voice = kopo11_Voice.format("볼륨크기 : %d", kopo11_vol); // String 변수에 대입
		if (kopo11_vol == kopo11_vol_down) {// 두 조건이 같을 때
			kopo11_Voice = "볼륨이 최소 0 입니다.";// String 변수에 대입
		}

	}

	void ChannelUp() { // 채널 UP 메서드
		kopo11_channel++; // 1추가
		kopo11_Voice = kopo11_Voice.format("채널번호 : %d", kopo11_channel); // String 변수에 대입
		if (kopo11_channel == kopo11_channel_up) { // 두 조건이 같을 때
			kopo11_Voice = "채널이 최대 10 입니다."; // String 변수에 대입
		}

	}

	void ChannelDn() { // 채널 DOWN 메서드
		kopo11_channel--; // 1빼기
		kopo11_Voice = kopo11_Voice.format("채널번호 : %d", kopo11_channel); // String 변수에 대입
		if (kopo11_channel == kopo11_channel_down) { // 두 조건이 같을 때
			kopo11_Voice = "채널이 최소 0 입니다."; // String 변수에 대입
		}

	}
}
