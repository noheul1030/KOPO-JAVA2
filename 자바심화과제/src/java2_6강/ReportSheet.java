package java2_6��;

public class ReportSheet {

    public static void main(String[] args) {
        int iPerson = 10;

        InputData inData = new InputData(iPerson);

        for (int i = 0; i < iPerson; i++) {
            String name = String.format("ȫ��%02d", i);
            int kor = (int) (Math.random() * 100);
            int eng = (int) (Math.random() * 100);
            int mat = (int) (Math.random() * 100);
            inData.SetData(i, name, kor, eng, mat);
        }

        for (int i = 0; i < iPerson; i++) {
            System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", i, inData.name[i], inData.kor[i],
                    inData.eng[i], inData.mat[i], inData.sum[i], inData.ave[i]);
        }
    }

}

class InputData {
    String name = "�̸�:";

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
            number[i] = "��ȣ:" + i;
            iPerson[i] = "" + i;
        }

    }

    public void SetData(int i, String name, int kor, int eng, int mat) {

    }

}
