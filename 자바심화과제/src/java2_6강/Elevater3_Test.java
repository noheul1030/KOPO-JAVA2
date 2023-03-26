package java2_6강;

public class Elevater3_Test {
    public static void main(String[] args) {
        Elevater3 kopo11_elev3; // 클래스 변수 선언
        kopo11_elev3 = new Elevater3(); // new 클래스 객체 생성

        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9까지 도는 반복문
            kopo11_elev3.up(); // up 메서드 실행
            System.out.printf("MSG elev3[%s]\n", kopo11_elev3.kopo11_help); // 메세지 출력 개행
        }
        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9까지 도는 반복문
            kopo11_elev3.down(); // down 메서드 실행
            System.out.printf("MSG elev3[%s]\n", kopo11_elev3.kopo11_help); // 메세지 출력 개행
        }

        kopo11_elev3.Repair(); // Repair 메서드 실행
        System.out.printf("MSG elev3[%s]\n", kopo11_elev3.kopo11_help); // 메세지 출력 개행

    }
}

class Elevater3 extends Elevater2 { // Elevater3클래스에 Elevater2를 상속받는다

    void Repair() { // 메서드
        kopo11_help = String.format("수리중입니다");
        // Elevater2 클래스의 kopo11_help 변수에 값 대입
    }

    void up() { // up 메서드
        if (kopo11_floor >= kopo11_limit_up_floor) { // kopo11_floor 가 kopo11_limit_up_floor보다 크거나 같으면
            kopo11_help = "마지막층입니다"; // 변수에 " 마지막층입니다"대입
        } else { // 조건이 아니면
            kopo11_floor = kopo11_floor + 2; // 값 대입
            kopo11_help = String.format("%d층입니다.", kopo11_floor); // String 출력
        }
        this.down(); // 현재 출래스의 down 메서드 실행
    }

    void down() { // down 메서드
        super.down(); // 부모 클래스의 down 메서드 실행
        System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.kopo11_help); // String 출력 개행
    }
}
