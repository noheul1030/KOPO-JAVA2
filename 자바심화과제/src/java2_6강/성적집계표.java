package java2_6강;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 성적집계표 {

    public static void main(String[] args) {
        Test test = new Test(30); // 클래스 변수에 30값 전달

    }
}

class Test extends InputData { // 메서드 상속 클래스
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.M.dd HH:mm:ss"); // 시간 포멧 변수
    String time = sdf.format(new Date()); // 시간 값 전달 변수
    int korSum, engSum, matSum, Sum, aveSum; // int 변수 선언

    Test(int kopo11_iPerson) { // 생성자
        super(kopo11_iPerson); // 부모 상속

        print(); // 메서드 출력
        score(kopo11_iPerson); // 메서드 출력
        score2(kopo11_iPerson); // 메서드 출력
        print2(kopo11_iPerson); // 메서드 출력

    }

    public void print() { // 메서드
        System.out.printf("%28s\n", "성적집계표"); // 전달 값 출력
        System.out.printf("\n");// 개행
        System.out.printf("%55s\n", "출력일자 : " + time); // 전달 값 출력
        System.out.printf("==============================================================\n"); // ====== 라인 출력
        System.out.printf("%s%6s%7s%7s%7s%7s%7s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균"); // 전달 값 출력
        System.out.printf("==============================================================\n"); // ==== 라인 출력
    }

    public void print2(int kopo11_iPerson) {  // 메서드
        System.out.printf("합계%17d%8d%9d%9d%9d\n", korSum, engSum, matSum, Sum, aveSum); // 합계 전달 값 출력
        System.out.printf("평균%17d%8d%9d%9d%9d\n", korSum / kopo11_iPerson, engSum / kopo11_iPerson,
                matSum / kopo11_iPerson, Sum / kopo11_iPerson, aveSum / kopo11_iPerson); // 평균 전달 값 출력

    }

    public void score(int kopo11_iPerson) {  // 메서드
        for (int kopo11_i = 0; kopo11_i < kopo11_iPerson; kopo11_i++) { // 0 ~ kopo11_iPerson 까지 도는 반복문
            String kopo11_name = String.format("홍길%02d", kopo11_i+1); // 변수에 포멧 값 대입
            int kopo11_kor = (int) (Math.random() * 101); // 100까지 랜덤한 숫자 값 대입
            int kopo11_eng = (int) (Math.random() * 101); // 100까지 랜덤한 숫자 값 대입
            int kopo11_mat = (int) (Math.random() * 101); // 100까지 랜덤한 숫자 값 대입
            // 클래스 생성자에 파라미터 값 전달
            SetData(kopo11_i, kopo11_name, kopo11_kor, kopo11_eng, kopo11_mat);
        }
    }

    public void score2(int kopo11_iPerson) {  // 메서드
        for (int kopo11_i = 0; kopo11_i < kopo11_iPerson; kopo11_i++) { // 0 ~ kopo11_iPerson 까지 도는 반복문
            korSum += kopo11_kor[kopo11_i]; // 변수에 값 전달
            engSum += kopo11_eng[kopo11_i]; // 변수에 값 전달
            matSum += kopo11_mat[kopo11_i]; // 변수에 값 전달
            Sum += kopo11_sum[kopo11_i]; // 변수에 값 전달
            aveSum += (int) kopo11_ave[kopo11_i]; // 변수에 값 전달

            // 입력 받은 값 출력 개행
            System.out.printf("%03d%4s%-6s%6d%8d%9d%9d%9d\n", kopo11_i+1, "", kopo11_name[kopo11_i], // 전달 값 출력
                    kopo11_kor[kopo11_i], kopo11_eng[kopo11_i], kopo11_mat[kopo11_i],
                    kopo11_sum[kopo11_i], (int) kopo11_ave[kopo11_i]);
        }
        System.out.printf("==============================================================\n"); // 라인 출력
    }
}
