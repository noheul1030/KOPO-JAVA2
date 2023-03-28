package java2_6��;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ��������ǥ {

    public static void main(String[] args) {
        Test test = new Test(30);

    }

}

class Test extends InputData {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.M.dd HH:mm:ss");
    String time = sdf.format(new Date());
    int korSum, engSum, matSum, Sum, aveSum;

    Test(int kopo11_iPerson) {
        super(kopo11_iPerson);

        print();
        score(kopo11_iPerson);
        score2(kopo11_iPerson);
        print2(kopo11_iPerson);

    }

    public void print() {
        System.out.printf("%28s\n", "��������ǥ");
        System.out.printf("\n");
        System.out.printf("%55s\n", "������� : " + time);
        System.out.printf("==============================================================\n");
        System.out.printf("%s%6s%7s%7s%7s%7s%7s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
        System.out.printf("==============================================================\n");
    }

    public void print2(int kopo11_iPerson) {
        System.out.printf("�հ�%17d%8d%9d%9d%9d\n", korSum, engSum, matSum, Sum, aveSum);
        System.out.printf("���%17d%8d%9d%9d%9d\n", korSum / kopo11_iPerson, engSum / kopo11_iPerson,
                matSum / kopo11_iPerson, Sum / kopo11_iPerson, aveSum / kopo11_iPerson);

    }

    public void score(int kopo11_iPerson) {
        for (int kopo11_i = 1; kopo11_i <= kopo11_iPerson; kopo11_i++) { // 1 ~ kopo11_iPerson ���� ���� �ݺ���
            String kopo11_name = String.format("ȫ��%02d", kopo11_i); // ������ �� ����
            int kopo11_kor = (int) (Math.random() * 101); // 100���� ������ ���� �� ����
            int kopo11_eng = (int) (Math.random() * 101); // 100���� ������ ���� �� ����
            int kopo11_mat = (int) (Math.random() * 101); // 100���� ������ ���� �� ����
            // Ŭ���� �����ڿ� �Ķ���� �� ����
            SetData(kopo11_i - 1, kopo11_name, kopo11_kor, kopo11_eng, kopo11_mat);
        }

    }

    public void score2(int kopo11_iPerson) {
        for (int kopo11_i = 1; kopo11_i <= kopo11_iPerson; kopo11_i++) { // 1 ~ kopo11_iPerson ���� ���� �ݺ���
            korSum += kopo11_kor[kopo11_i - 1];
            engSum += kopo11_eng[kopo11_i - 1];
            matSum += kopo11_mat[kopo11_i - 1];
            Sum += kopo11_sum[kopo11_i - 1];
            aveSum += (int) kopo11_ave[kopo11_i - 1];

            // �Է� ���� �� ��� ����
            System.out.printf("%03d%4s%-6s%6d%8d%9d%9d%9d\n", kopo11_i, "", kopo11_name[kopo11_i - 1],
                    kopo11_kor[kopo11_i - 1], kopo11_eng[kopo11_i - 1], kopo11_mat[kopo11_i - 1],
                    kopo11_sum[kopo11_i - 1], (int) kopo11_ave[kopo11_i - 1]);
        }
        System.out.printf("==============================================================\n");
    }
}
