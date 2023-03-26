package java2_6강;

public class ReportSheet {

    public static void main(String[] args) {
        int iPerson = 10;

        InputData inData = new InputData(iPerson);

        for (int i = 0; i < iPerson; i++) {
            String name = String.format("홍길%02d", i);
            int kor = (int) (Math.random() * 100);
            int eng = (int) (Math.random() * 100);
            int mat = (int) (Math.random() * 100);
            inData.SetData(i, name, kor, eng, mat);
        }

        for (int i = 0; i < iPerson; i++) {
            System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", i, inData.name[i], inData.kor[i],
                    inData.eng[i], inData.mat[i], inData.sum[i], inData.ave[i]);
        }
    }

}

class InputData {
    String name = "이름:";

    InputData(int iP) {

        String[] number = new String[iP];
        String[] iPerson = new String[iP];
        int[] name = new int[iP];
        int[] kor = new int[iP];
        int[] eng = new int[iP];
        int[] mat = new int[iP];
        int[] sum = new int[iP];
        double[] ave = new double[iP];
        for (int i = 0; i < iP; i++) {
            number[i] = "번호:" + i;
            iPerson[i] = "" + i;
        }

    }

    public void SetData(int i, String name, int kor, int eng, int mat) {

    }

}
