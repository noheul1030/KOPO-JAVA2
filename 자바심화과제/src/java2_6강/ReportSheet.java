package java2_6��;

public class ReportSheet {

    public static void main(String[] args) { // ����
        int kopo11_iPerson = 10; // int ������ 10 �ʱⰪ ����

        InputData kopo11_inData = new InputData(kopo11_iPerson); // Ŭ���� ��ü����

        for (int kopo11_i = 0; kopo11_i < kopo11_iPerson; kopo11_i++) { // 0 ~ kopo11_iPerson ���� ���� �ݺ���
            String kopo11_name = String.format("ȫ��%02d", kopo11_i); // ������ �� ����
            int kopo11_kor = (int) (Math.random() * 100); // 100���� ������ ���� �� ����
            int kopo11_eng = (int) (Math.random() * 100); // 100���� ������ ���� �� ����
            int kopo11_mat = (int) (Math.random() * 100); // 100���� ������ ���� �� ����
            // Ŭ���� �����ڿ� �Ķ���� �� ����
            kopo11_inData.SetData(kopo11_i, kopo11_name, kopo11_kor, kopo11_eng, kopo11_mat);
        }

        for (int kopo11_i = 0; kopo11_i < kopo11_iPerson; kopo11_i++) { // 0 ~ kopo11_iPerson ���� ���� �ݺ���

            // �Է� ���� �� ��� ����
            System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", kopo11_i,
                    kopo11_inData.kopo11_name[kopo11_i], kopo11_inData.kopo11_kor[kopo11_i],
                    kopo11_inData.kopo11_eng[kopo11_i], kopo11_inData.kopo11_mat[kopo11_i],
                    kopo11_inData.kopo11_sum[kopo11_i], kopo11_inData.kopo11_ave[kopo11_i]);
        }
    }
}

class InputData { // Ŭ����

    String[] kopo11_name; // �̸� ���� ����
    int[] kopo11_kor; // ���� ���� ����
    int[] kopo11_eng; // ���� ���� ����
    int[] kopo11_mat; // ���� ���� ����
    int[] kopo11_sum; // ���� ���� ����
    double[] kopo11_ave; // ��� ���� ����

    InputData(int kopo11_iP) { // �����ڿ� �Ķ���� �ޱ�

        kopo11_name = new String[kopo11_iP]; // �̸� �迭 ũ�� ����
        kopo11_kor = new int[kopo11_iP]; // ���� �迭 ũ�� ����
        kopo11_eng = new int[kopo11_iP]; // ���� �迭 ũ�� ����
        kopo11_mat = new int[kopo11_iP]; // ���� �迭 ũ�� ����
        kopo11_sum = new int[kopo11_iP]; // ���� �迭 ũ�� ����
        kopo11_ave = new double[kopo11_iP]; // ��� �迭 ũ�� ����

    }

    // ����[kopo11_i1]��°�� �Ķ���Ͱ� �����ϴ� �޼���
    public void SetData(int kopo11_i1, String kopo11_name1, int kopo11_kor1, int kopo11_eng1, int kopo11_mat1) {
        kopo11_name[kopo11_i1] = kopo11_name1; // ����[kopo11_i1]��°�� �Ķ���Ͱ� ����
        kopo11_kor[kopo11_i1] = kopo11_kor1; // ����[kopo11_i1]��°�� �Ķ���Ͱ� ����
        kopo11_eng[kopo11_i1] = kopo11_eng1; // ����[kopo11_i1]��°�� �Ķ���Ͱ� ����
        kopo11_mat[kopo11_i1] = kopo11_mat1; // ����[kopo11_i1]��°�� �Ķ���Ͱ� ����
        kopo11_sum[kopo11_i1] = kopo11_kor1 + kopo11_eng1 + kopo11_mat1; // ����[kopo11_i1]��°�� �Ķ���Ͱ� ����
        // ����[kopo11_i1]��°�� �Ķ���Ͱ� ����
        kopo11_ave[kopo11_i1] = (double) (kopo11_kor1 + kopo11_eng1 + kopo11_mat1) / 3;

    }
}
