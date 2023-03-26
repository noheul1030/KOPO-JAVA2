package java2_6강;

public class TvRemocon3 {
    public static void main(String[] args) { // 메인
        TvRemocon3_Test kopo11_tv; // 클래스 변수
        kopo11_tv = new TvRemocon3_Test(1, 0); // 클래스 변수에 new 객체 생성(1,0);
    }
}

class TvRemocon3_Test extends TvRemocon2 { // 클래스 TvRemocon3_Test에 TvRemocon2 상속
    public TvRemocon3_Test(int kopo11_ch, int kopo11_v) { // 파라미터 2개 전달받는 생성자
        super(kopo11_ch, kopo11_v); // 부모 클래스 super;
        System.out.printf("\n"); // 개행
        BatteryTest(); // 메서드 실행
    }

    int kopo11_battery = 6; // int 변수 초기값 6 대입

    void Battery() { // 메서드
        if (kopo11_battery == 0) { // 값이 0 일 때
            kopo11_Voice = String.format("건전지의 잔량이 없습니다."); // 출력
        } else { // 0 이 아닐 떄
            kopo11_battery--; // 1 빼기
            kopo11_Voice = String.format("건전지 잔량 : %s", kopo11_battery); // String 변수에 대입
        }
    }

    void BatteryChange() { // 메서드
        kopo11_battery = 6; // 6 대입
        System.out.printf("<<건전지를 교체했습니다.>>\n"); // 출력 개행
    }

    void bt_msg(String kopo11_msg) { // String 파라미터 1개 전달받는 메서드
        if (kopo11_battery != 0) { // 현재 건전지 잔량이 0이 아니면
            System.out.printf("[%s] 건전지 잔량 : %s\n", kopo11_msg, kopo11_battery); // 전달 받은 값 출력 개행
        } else { // 건전지 잔량이 0이면
            System.out.printf("[%s] 건전지 잔량 : %s %s\n", kopo11_msg, kopo11_battery, "건전지의 잔량이 없습니다!!"); // 전달 받은 값 출력 개행
        }
    }

    void bt_down(int kopo11_u) { // int 파라미터 1개 전달받는 메서드
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u만큼 반복
            Battery(); // Battery 메서드 실행
    }

    void BatteryTest() { // 메서드
        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9까지 도는 반복문
            bt_msg("건전지 체크"); // msg 메서드 실행 전달 값 "건전지 체크"
            bt_down(1); // 메서드 실행
            if (kopo11_battery == 0) { // 값이 0이 되면
                bt_msg("건전지 체크"); // msg 메서드 실행 전달 값 "건전지 체크"
                BatteryChange(); // 베터리 교환 메서드 실행
            }
        }
    }
}
