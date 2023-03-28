package java2_6강;

public class 성적집계표2 {

    public static void main(String[] args) {
        Test2 test = new Test2(200);
    }

}

class Test2 extends Test {
//    int korSum, engSum, matSum, Sum, aveSum;
    int korSum2, engSum2, matSum2, Sum2, aveSum2;
    int page;
    int sumCount = 0;

    Test2(int kopo11_iPerson) {
        super(kopo11_iPerson);
    }

    @Override
    public void print() {
        page++;
        System.out.printf("%28s\n", "성적집계표");
        System.out.printf("\n");
        System.out.printf("PAGE: %d%50s\n", page, "출력일자 : " + time);
        System.out.printf("==============================================================\n");
        System.out.printf("%s%6s%8s%7s%7s%7s%7s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
        System.out.printf("==============================================================\n");
    }

    @Override
    public void print2(int kopo11_iPerson) {
        System.out.printf("누적페이지\n");
        System.out.printf("합계%18d%7d%9d%9d%9d\n", korSum2, engSum2, matSum2, Sum2, aveSum2);
        System.out.printf("평균%18d%7d%9d%9d%9d\n", korSum2 / sumCount, engSum2 / sumCount, matSum2 / sumCount,
                Sum2 / sumCount, aveSum2 / sumCount);
    }

    @Override
    public void score2(int kopo11_iPerson) {
        int count = 0;
        for (int kopo11_i = 1; kopo11_i <= kopo11_iPerson; kopo11_i++) { // 1 ~ kopo11_iPerson 까지 도는 반복문
            count++;
            sumCount++;
            korSum += kopo11_kor[kopo11_i - 1];
            korSum2 += kopo11_kor[kopo11_i - 1];
            engSum += kopo11_eng[kopo11_i - 1];
            engSum2 += kopo11_eng[kopo11_i - 1];
            matSum += kopo11_mat[kopo11_i - 1];
            matSum2 += kopo11_mat[kopo11_i - 1];
            Sum += kopo11_sum[kopo11_i - 1];
            Sum2 += kopo11_sum[kopo11_i - 1];
            aveSum += (int) kopo11_ave[kopo11_i - 1];
            aveSum2 += (int) kopo11_ave[kopo11_i - 1];

            // 입력 받은 값 출력 개행
            System.out.printf("%03d%4s%-6s%6d%8d%9d%9d%9d\n", kopo11_i, "", kopo11_name[kopo11_i - 1],
                    kopo11_kor[kopo11_i - 1], kopo11_eng[kopo11_i - 1], kopo11_mat[kopo11_i - 1],
                    kopo11_sum[kopo11_i - 1], (int) kopo11_ave[kopo11_i - 1]);
            if (count == 30) {
                System.out.printf("==============================================================\n");
                System.out.printf("현재 페이지\n");
                System.out.printf("합계%17d%8d%9d%9d%9d\n", korSum, engSum, matSum, Sum, aveSum);
                System.out.printf("평균%17d%8d%9d%9d%9d\n", korSum / count, engSum / count, matSum / count, Sum / count,
                        aveSum / count);
                System.out.printf("==============================================================\n");
                print2(kopo11_iPerson);
                System.out.printf("\n\n\n");
                print();

                count = 0;
                korSum = 0;
                engSum = 0;
                matSum = 0;
                Sum = 0;
                aveSum = 0;

            } else if (kopo11_i == kopo11_iPerson) {
                System.out.printf("==============================================================\n");
                System.out.printf("현재페이지\n");
                System.out.printf("합계%17d%8d%9d%9d%9d\n", korSum, engSum, matSum, Sum, aveSum);
                System.out.printf("평균%17d%8d%9d%9d%9d\n", korSum / count, engSum / count, matSum / count, Sum / count,
                        aveSum / count);
            }

        }
        System.out.printf("==============================================================\n");
    }

}
