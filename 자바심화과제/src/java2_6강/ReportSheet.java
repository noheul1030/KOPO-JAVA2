package java2_6강;

public class ReportSheet {

    public static void main(String[] args) { // 메인
        int kopo11_iPerson = 10; // int 변수에 10 초기값 대입

        InputData kopo11_inData = new InputData(kopo11_iPerson); // 클래스 객체생성

        for (int kopo11_i = 0; kopo11_i < kopo11_iPerson; kopo11_i++) { // 0 ~ kopo11_iPerson 까지 도는 반복문
            String kopo11_name = String.format("홍길%02d", kopo11_i); // 변수에 값 대입
            int kopo11_kor = (int) (Math.random() * 100); // 100까지 랜덤한 숫자 값 대입
            int kopo11_eng = (int) (Math.random() * 100); // 100까지 랜덤한 숫자 값 대입
            int kopo11_mat = (int) (Math.random() * 100); // 100까지 랜덤한 숫자 값 대입
            // 클래스 생성자에 파라미터 값 전달
            kopo11_inData.SetData(kopo11_i, kopo11_name, kopo11_kor, kopo11_eng, kopo11_mat);
        }

        for (int kopo11_i = 0; kopo11_i < kopo11_iPerson; kopo11_i++) { // 0 ~ kopo11_iPerson 까지 도는 반복문

            // 입력 받은 값 출력 개행
            System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", kopo11_i,
                    kopo11_inData.kopo11_name[kopo11_i], kopo11_inData.kopo11_kor[kopo11_i],
                    kopo11_inData.kopo11_eng[kopo11_i], kopo11_inData.kopo11_mat[kopo11_i],
                    kopo11_inData.kopo11_sum[kopo11_i], kopo11_inData.kopo11_ave[kopo11_i]);
        }
    }
}

class InputData { // 클래스

    String[] kopo11_name; // 이름 변수 선언
    int[] kopo11_kor; // 국어 변수 선언
    int[] kopo11_eng; // 영어 변수 선언
    int[] kopo11_mat; // 수학 변수 선언
    int[] kopo11_sum; // 총점 변수 선언
    double[] kopo11_ave; // 평균 변수 선언

    InputData(int kopo11_iP) { // 생성자에 파라미터 받기

        kopo11_name = new String[kopo11_iP]; // 이름 배열 크기 지정
        kopo11_kor = new int[kopo11_iP]; // 국어 배열 크기 지정
        kopo11_eng = new int[kopo11_iP]; // 영어 배열 크기 지정
        kopo11_mat = new int[kopo11_iP]; // 수학 배열 크기 지정
        kopo11_sum = new int[kopo11_iP]; // 총점 배열 크기 지정
        kopo11_ave = new double[kopo11_iP]; // 평균 배열 크기 지정

    }

    // 변수[kopo11_i1]번째에 파라미터값 대입하는 메서드
    public void SetData(int kopo11_i1, String kopo11_name1, int kopo11_kor1, int kopo11_eng1, int kopo11_mat1) {
        kopo11_name[kopo11_i1] = kopo11_name1; // 변수[kopo11_i1]번째에 파라미터값 대입
        kopo11_kor[kopo11_i1] = kopo11_kor1; // 변수[kopo11_i1]번째에 파라미터값 대입
        kopo11_eng[kopo11_i1] = kopo11_eng1; // 변수[kopo11_i1]번째에 파라미터값 대입
        kopo11_mat[kopo11_i1] = kopo11_mat1; // 변수[kopo11_i1]번째에 파라미터값 대입
        kopo11_sum[kopo11_i1] = kopo11_kor1 + kopo11_eng1 + kopo11_mat1; // 변수[kopo11_i1]번째에 파라미터값 대입
        // 변수[kopo11_i1]번째에 파라미터값 대입
        kopo11_ave[kopo11_i1] = (double) (kopo11_kor1 + kopo11_eng1 + kopo11_mat1) / 3;

    }
}
