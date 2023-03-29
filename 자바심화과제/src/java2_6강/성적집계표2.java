package java2_6강;

public class 성적집계표2 {

    public static void main(String[] args) { // 메인
        Test2 test = new Test2(200); // 클래스 변수에 전달 값 대입
    }

}

class Test2 extends Test { // 부모 상속 클래스
//    int korSum, engSum, matSum, Sum, aveSum;
    int korSum2, engSum2, matSum2, Sum2, aveSum2; // int 변수 선언
    int page; // int 변수 선언
    int sumCount = 0; // int 변수 선언

    Test2(int kopo11_iPerson) { // 생성자에 파라미터 대입
        super(kopo11_iPerson); // 부모 상속(파라미터 값 전달)
    }

    @Override
    public void print() { // 부모의 프린트 메서드 재정의
        page++; // 페이지 1추가
        System.out.printf("%28s\n", "성적집계표"); // 전달 값 출력
        System.out.printf("\n"); // 개행
        System.out.printf("PAGE: %d%50s\n", page, "출력일자 : " + time); // 전달 값 출력
        System.out.printf("==============================================================\n"); // ======= 라인 출력
        System.out.printf("%s%6s%8s%7s%7s%7s%7s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균"); // 전달 값 출력
        System.out.printf("==============================================================\n"); // ======= 라인 출력
    }

    @Override
    public void print2(int kopo11_iPerson) { // 부모의 프린트2 메서드 재정의
        System.out.printf("누적페이지\n"); // 누적 페이지 출력
        System.out.printf("합계%18d%7d%9d%9d%9d\n", korSum2, engSum2, matSum2, Sum2, aveSum2); // 전달 값 출력
        System.out.printf("평균%18d%7d%9d%9d%9d\n", korSum2 / sumCount, engSum2 / sumCount, matSum2 / sumCount,
                Sum2 / sumCount, aveSum2 / sumCount); // 전달 값 출력
    }

    @Override
    public void score2(int kopo11_iPerson) { // 부모의 스코어 메서드 재정의
        int count = 0; // int 변수 선언
        for (int kopo11_i = 1; kopo11_i <= kopo11_iPerson; kopo11_i++) { // 1 ~ kopo11_iPerson 까지 도는 반복문
            count++; // 1추가
            sumCount++; // 1추가
            korSum += kopo11_kor[kopo11_i - 1]; // 변수에 값 전달
            korSum2 += kopo11_kor[kopo11_i - 1]; // 변수에 값 전달
            engSum += kopo11_eng[kopo11_i - 1]; // 변수에 값 전달
            engSum2 += kopo11_eng[kopo11_i - 1]; // 변수에 값 전달
            matSum += kopo11_mat[kopo11_i - 1]; // 변수에 값 전달
            matSum2 += kopo11_mat[kopo11_i - 1]; // 변수에 값 전달
            Sum += kopo11_sum[kopo11_i - 1]; // 변수에 값 전달 
            Sum2 += kopo11_sum[kopo11_i - 1]; // 변수에 값 전달
            aveSum += (int) kopo11_ave[kopo11_i - 1]; // 변수에 값 전달
            aveSum2 += (int) kopo11_ave[kopo11_i - 1]; // 변수에 값 전달

            // 입력 받은 값 출력 개행
            System.out.printf("%03d%4s%-6s%6d%8d%9d%9d%9d\n", kopo11_i, "", kopo11_name[kopo11_i - 1],
                    kopo11_kor[kopo11_i - 1], kopo11_eng[kopo11_i - 1], kopo11_mat[kopo11_i - 1],
                    kopo11_sum[kopo11_i - 1], (int) kopo11_ave[kopo11_i - 1]);
            if (count == 30) { // 카운트가 30 일 때
                System.out.printf("==============================================================\n"); // ======= 라인 출력
                System.out.printf("현재페이지\n");  // 현재 페이지 출력 개행
                System.out.printf("합계%17d%8d%9d%9d%9d\n", korSum, engSum, matSum, Sum, aveSum);  // 전달 값 출력
                System.out.printf("평균%17d%8d%9d%9d%9d\n", korSum / count, engSum / count, matSum / count, Sum / count,
                        aveSum / count);  // 전달 값 출력
                System.out.printf("==============================================================\n"); // ======= 라인 출력
                print2(kopo11_iPerson);  // 전달 값 출력
                System.out.printf("\n\n\n"); // 개행 3번
                print(); // 메서드 실행

                count = 0;  // int 변수 선언
                korSum = 0;  // int 변수 선언
                engSum = 0;  // int 변수 선언
                matSum = 0;  // int 변수 선언
                Sum = 0;  // int 변수 선언
                aveSum = 0;  // int 변수 선언

            } else if (kopo11_i == kopo11_iPerson) { // kopo11_i == kopo11_iPerson 일 때
                System.out.printf("==============================================================\n"); // ====== 라인 출력
                System.out.printf("현재페이지\n"); // 현재 페이지 출력 개행
                System.out.printf("합계%17d%8d%9d%9d%9d\n", korSum, engSum, matSum, Sum, aveSum); // 전달 값 출력
                System.out.printf("평균%17d%8d%9d%9d%9d\n", korSum / count, engSum / count, matSum / count, Sum / count,
                        aveSum / count); // 전달 값 출력
            }
        }
        System.out.printf("==============================================================\n"); // 라인 출력
    }

}
