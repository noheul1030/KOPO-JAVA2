package java2_6강;

public class Elevater2_Test {

    static Elevater2 kopo11_elev1; // 클래스 변수 1 생성
    static Elevater2 kopo11_elev2; // 클래스 변수 2 생성
    static Elevater2 kopo11_elev3; // 클래스 변수 3 생성

    public static void main(String[] args) {
        kopo11_elev1 = new Elevater2(); // 클래스 객체 1 생성
        kopo11_elev2 = new Elevater2(20, 1, 8); // 클래스 객체 2 에 값 넣고 생성
        kopo11_elev3 = new Elevater2(50, -3, 5); // 클래스 객체 3 에 값 넣고 생성

        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 19까지 도는 반복문
            kopo11_elev1.up(); // up 메서드 실행
            kopo11_elev1.msg("1번엘레 한층 오르기");
//			kopo11_elev2.up();
//			kopo11_elev2.msg("2번엘레 한층 오르기");
//			kopo11_elev3.up();
//			kopo11_elev3.msg("3번엘레 한층 오르기");
        }
        System.out.println(); // 개행
        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 19까지 도는 반복문
            kopo11_elev1.up(2); // up 메서드에 파라미터 2 전달 실행
            kopo11_elev1.msg("1번엘레 2층씩 오르기"); // msg 메서드에 String 값 넣고 실행
//			kopo11_elev2.up(2);
//			kopo11_elev2.msg("2번엘레 2층씩 오르기");
//			kopo11_elev3.up(2);
//			kopo11_elev3.msg("3번엘레 2층씩 오르기");
        }
        System.out.println(); // 개행

        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 19까지 도는 반복문
            kopo11_elev1.down(3); // down 메서드에 파라미터 3 전달 실행
            kopo11_elev1.msg("1번엘레 3층씩 내르기"); // msg 메서드에 String 값 넣고 실행
//			kopo11_elev2.down(3);
//			kopo11_elev2.msg("2번엘레 3층씩 오르기");
//			kopo11_elev3.down(3);
//			kopo11_elev3.msg("3번엘레 3층씩 오르기");
        }

    }

}

class Elevater2 { // 클래스
    protected int kopo11_limit_up_floor; // int 변수 선언
    private int kopo11_limit_down_floor; // int 변수 선언
    protected int kopo11_floor; // int 변수 선언
    protected String kopo11_help; // String 변수 선언

    Elevater2() { // 생성자
        kopo11_limit_up_floor = 10; // 초기값 10 대입
        kopo11_limit_down_floor = 0; // 초기값 0 대입
        kopo11_floor = 1; // 초기값 1 대입
        kopo11_help = "엘레베이터 기본 준공완료"; // 초기값 대입
    }

    Elevater2(int up_floor, int d_floor, int in_floor) { // int 파라미터 3개 전달받는 생성자
        kopo11_limit_up_floor = up_floor; // 전달 받은 파라미터 값 대입
        kopo11_limit_down_floor = d_floor; // 전달 받은 파라미터 값 대입
        kopo11_floor = in_floor; // 전달 받은 파라미터 값 대입
        kopo11_help = "엘레베이터 맞춤 준공완료"; // 새로운 문자열 대입
    }

    void up() { // up 메서드 생성
        if (kopo11_floor == kopo11_limit_up_floor) { // 두 조건이 같으면
            kopo11_help = "마지막 층입니다"; // 출력
        } else { // 두 조건이 같지 않으면
            kopo11_floor++; // kopo11_floor 1추가
            kopo11_help = String.format("[%d] 층입니다", kopo11_floor); // 정수형 출력 개행
        }
    }

    void down() { // down 메서드 생성
        if (kopo11_floor == kopo11_limit_down_floor) { // 두 조건이 같으면
            kopo11_help = "처음 층입니다"; // 출력
        } else { // 두 조건이 같지 않으면
            kopo11_floor--; // kopo11_floor 1빼기
            kopo11_help = String.format("[%d] 층입니다", kopo11_floor); // 정수형 출력 개행
        }
    }

    void up(int kopo11_u) { // int 파라미터 1개 전달받는 메서드
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u만큼 반복
            this.up(); // 같은 클래스의 up메서드 실행(명확한 표현 this.)
    }

    void down(int kopo11_u) { // int 파라미터 1개 전달받는 메서드
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u만큼 반복
            down(); // down 메서드 실행
    }

    void msg(String kopo11_id) { // String 파라미터 1개 전달받는 메서드
        System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", kopo11_id, kopo11_help, kopo11_limit_up_floor,
                kopo11_limit_down_floor, kopo11_floor); // 전달받은 값 출력 개행
    }

}