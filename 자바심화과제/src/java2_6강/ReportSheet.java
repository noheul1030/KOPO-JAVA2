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
    
	String[] name = new String[iP]; // 이름
    int[] kor = new int[iP]; // 국어
    int[] eng = new int[iP]; // 영어
    int[] mat = new int[iP]; // 수학
    int[] sum = new int[iP]; // 총점
    double[] ave = new double[iP]; // 평균
    
//    String name = "이름:";
//    int kor;
//    int eng;
//    int mat;
//    int sum;
//    double ave;

    InputData(int iP) {
    	
        String[] name = new String[iP]; // 이름
        int[] kor = new int[iP]; // 국어
        int[] eng = new int[iP]; // 영어
        int[] mat = new int[iP]; // 수학
        int[] sum = new int[iP]; // 총점
        double[] ave = new double[iP]; // 평균
        
       

    }

    public void SetData(int i, String name, int kor, int eng, int mat) {

    }

}
