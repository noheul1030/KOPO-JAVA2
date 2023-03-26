package java2_6강;

public class 생성자실습하기 {
    public static void main(String[] args) { // 메인
        TvRemocon2 kopo11_tv = new TvRemocon2(1, 0); // 클래스 객체 생성, 값 전달
    }

}

class TvRemocon2 { // 클래스
    int kopo11_channel_up = 10; // int 지역변수에 초기값 10 대입
    int kopo11_channel_down = 1; // int 지역변수에 초기값 1 대입
    int kopo11_vol_up = 5; // int 지역변수에 초기값 5 대입
    int kopo11_vol_down = 0; // int 지역변수에 초기값 0 대입

    int kopo11_channel; // int 지역변수 선언
    int kopo11_vol; // int 지역변수 선언

    String kopo11_Voice; // String 전역변수 선언

    public TvRemocon2(int kopo11_ch, int kopo11_v) { // 파라미터 2개 전달받는 생성자
        kopo11_channel = kopo11_ch; // 전달받은 ch값 kopo11_channel에 대입
        kopo11_vol = kopo11_v; // 전달받은 v값 kopo11_vol에 대입
        Test();
    }

    void VolUp() { // 볼륨 UP 메서드
        if (kopo11_vol == kopo11_vol_up) { // 두 조건이 같을 때
            kopo11_Voice = "볼륨이 최대"; // String 변수에 대입
        } else {
            kopo11_vol++; // 1추가
            kopo11_Voice = kopo11_Voice.format("볼륨크기 : %d", kopo11_vol); // String 변수에 대입
        }
    }

    void VolDn() { // 볼륨 DOWN 메서드
        if (kopo11_vol == kopo11_vol_down) {// 두 조건이 같을 때
            kopo11_Voice = "볼륨이 최소";// String 변수에 대입
        } else {
            kopo11_vol--; // 1빼기
            kopo11_Voice = kopo11_Voice.format("볼륨크기 : %d", kopo11_vol); // String 변수에 대입
        }
    }

    void ChannelUp() { // 채널 UP 메서드
        if (kopo11_channel == kopo11_channel_up) { // 두 조건이 같을 때
            kopo11_Voice = "채널이 최대"; // String 변수에 대입
        } else {
            kopo11_channel++; // 1추가
            kopo11_Voice = kopo11_Voice.format("채널번호 : %d", kopo11_channel); // String 변수에 대입
        }
    }

    void ChannelDn() { // 채널 DOWN 메서드
        if (kopo11_channel == kopo11_channel_down) { // 두 조건이 같을 때
            kopo11_Voice = "채널이 최소"; // String 변수에 대입
        } else {
            kopo11_channel--; // 1빼기
            kopo11_Voice = kopo11_Voice.format("채널번호 : %d", kopo11_channel); // String 변수에 대입
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    void ch_up(int kopo11_u) { // int 파라미터 1개 전달받는 메서드
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u만큼 반복
            this.ChannelUp(); // 같은 클래스의 up메서드 실행(명확한 표현 this.)
    }

    void vol_up(int kopo11_u) { // int 파라미터 1개 전달받는 메서드
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u만큼 반복
            this.VolUp(); // 같은 클래스의 up메서드 실행(명확한 표현 this.)
    }

    void ch_down(int kopo11_u) { // int 파라미터 1개 전달받는 메서드
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u만큼 반복
            ChannelDn(); // down 메서드 실행
    }

    void vol_down(int kopo11_u) { // int 파라미터 1개 전달받는 메서드
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u만큼 반복
            VolDn(); // down 메서드 실행
    }

    void ch_msg(String kopo11_msg) { // String 파라미터 1개 전달받는 메서드
        if (kopo11_channel == kopo11_channel_up) { // 채널이 10 일 떄
            System.out.printf("[%s] 현재 채널 번호는 : %s 입니다.", kopo11_msg, kopo11_channel); // 전달 받은 값 출력 개행
            System.out.printf(" 채널의 최대 입니다.\n", kopo11_msg); // 전달 받은 값 출력 개행
        } else if (kopo11_channel == kopo11_channel_down) { // 채널이 1 일때
            System.out.printf("[%s] 현재 채널 번호는 : %s 입니다.", kopo11_msg, kopo11_channel); // 전달 받은 값 출력 개행
            System.out.printf(" 채널의 최소 입니다.\n", kopo11_msg); // 전달 받은 값 출력 개행
        } else {
            System.out.printf("[%s] 현재 채널 번호는 : %s 입니다.\n", kopo11_msg, kopo11_channel); // 전달 받은 값 출력 개행
        }
    }

    void vol_msg(String kopo11_msg) { // String 파라미터 1개 전달받는 메서드
        if (kopo11_vol == kopo11_vol_up) { // 볼륨이 5 일 떄
            System.out.printf("[%s] 현재 볼륨 크기는 : %s 입니다.", kopo11_msg, kopo11_vol); // 전달 받은 값 출력 개행
            System.out.printf(" 볼륨의 최대 입니다.\n", kopo11_msg); // 전달 받은 값 출력 개행
        } else if (kopo11_vol == kopo11_vol_down) { // 볼륨이 1 일때
            System.out.printf("[%s] 현재 볼륨 크기는 : %s 입니다.", kopo11_msg, kopo11_vol); // 전달 받은 값 출력 개행
            System.out.printf(" 볼륨의 최소 입니다.\n", kopo11_msg); // 전달 받은 값 출력 개행
        } else {
            System.out.printf("[%s] 현재 볼륨 크기는 : %s 입니다.\n", kopo11_msg, kopo11_vol); // 전달 받은 값 출력 개행
        }
    }

    void Test() {
        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9까지 도는 반복문
            ch_msg("채널 올리기"); // msg 메서드 실행 전달 값 "채널 올리기"
            ch_up(1); // up 메서드 실행 전달값 1
        }
        System.out.printf("\n"); // 개행

        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9까지 도는 반복문
            ch_msg("채널 내리기"); // msg 메서드 실행 전달 값 "채널 내리기"
            ch_down(1); // down 메서드 실행 전달값 1
        }
        System.out.printf("\n"); // 개행

        for (int kopo11_i = 0; kopo11_i < 5; kopo11_i++) { // 0 ~ 4까지 도는 반복문
            vol_msg("볼륨 올리기"); // msg 메서드 실행 전달 값 "볼륨 올리기"
            vol_up(1); // up 메서드 실행 전달값 1
        }
        System.out.printf("\n"); // 개행

        for (int kopo11_i = 0; kopo11_i < 5; kopo11_i++) {// 0 ~ 4까지 도는 반복문
            vol_msg("볼륨 내리기"); // msg 메서드 실행 전달 값 "볼륨 내리기"
            vol_down(1); // down 메서드 실행 전달값 1
        }

    }
}