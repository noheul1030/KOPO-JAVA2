package java2_6��;

public class ��������ǥ2 {

    public static void main(String[] args) { // ����
        Test2 test = new Test2(200); // Ŭ���� ������ ���� �� ����
    }

}

class Test2 extends Test { // �θ� ��� Ŭ����
//    int korSum, engSum, matSum, Sum, aveSum;
    int korSum2, engSum2, matSum2, Sum2, aveSum2; // int ���� ����
    int page; // int ���� ����
    int sumCount = 0; // int ���� ����

    Test2(int kopo11_iPerson) { // �����ڿ� �Ķ���� ����
        super(kopo11_iPerson); // �θ� ���(�Ķ���� �� ����)
    }

    @Override
    public void print() { // �θ��� ����Ʈ �޼��� ������
        page++; // ������ 1�߰�
        System.out.printf("%28s\n", "��������ǥ"); // ���� �� ���
        System.out.printf("\n"); // ����
        System.out.printf("PAGE: %d%50s\n", page, "������� : " + time); // ���� �� ���
        System.out.printf("==============================================================\n"); // ======= ���� ���
        System.out.printf("%s%6s%8s%7s%7s%7s%7s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���"); // ���� �� ���
        System.out.printf("==============================================================\n"); // ======= ���� ���
    }

    @Override
    public void print2(int kopo11_iPerson) { // �θ��� ����Ʈ2 �޼��� ������
        System.out.printf("����������\n"); // ���� ������ ���
        System.out.printf("�հ�%18d%7d%9d%9d%9d\n", korSum2, engSum2, matSum2, Sum2, aveSum2); // ���� �� ���
        System.out.printf("���%18d%7d%9d%9d%9d\n", korSum2 / sumCount, engSum2 / sumCount, matSum2 / sumCount,
                Sum2 / sumCount, aveSum2 / sumCount); // ���� �� ���
    }

    @Override
    public void score2(int kopo11_iPerson) { // �θ��� ���ھ� �޼��� ������
        int count = 0; // int ���� ����
        for (int kopo11_i = 1; kopo11_i <= kopo11_iPerson; kopo11_i++) { // 1 ~ kopo11_iPerson ���� ���� �ݺ���
            count++; // 1�߰�
            sumCount++; // 1�߰�
            korSum += kopo11_kor[kopo11_i - 1]; // ������ �� ����
            korSum2 += kopo11_kor[kopo11_i - 1]; // ������ �� ����
            engSum += kopo11_eng[kopo11_i - 1]; // ������ �� ����
            engSum2 += kopo11_eng[kopo11_i - 1]; // ������ �� ����
            matSum += kopo11_mat[kopo11_i - 1]; // ������ �� ����
            matSum2 += kopo11_mat[kopo11_i - 1]; // ������ �� ����
            Sum += kopo11_sum[kopo11_i - 1]; // ������ �� ���� 
            Sum2 += kopo11_sum[kopo11_i - 1]; // ������ �� ����
            aveSum += (int) kopo11_ave[kopo11_i - 1]; // ������ �� ����
            aveSum2 += (int) kopo11_ave[kopo11_i - 1]; // ������ �� ����

            // �Է� ���� �� ��� ����
            System.out.printf("%03d%4s%-6s%6d%8d%9d%9d%9d\n", kopo11_i, "", kopo11_name[kopo11_i - 1],
                    kopo11_kor[kopo11_i - 1], kopo11_eng[kopo11_i - 1], kopo11_mat[kopo11_i - 1],
                    kopo11_sum[kopo11_i - 1], (int) kopo11_ave[kopo11_i - 1]);
            if (count == 30) { // ī��Ʈ�� 30 �� ��
                System.out.printf("==============================================================\n"); // ======= ���� ���
                System.out.printf("����������\n");  // ���� ������ ��� ����
                System.out.printf("�հ�%17d%8d%9d%9d%9d\n", korSum, engSum, matSum, Sum, aveSum);  // ���� �� ���
                System.out.printf("���%17d%8d%9d%9d%9d\n", korSum / count, engSum / count, matSum / count, Sum / count,
                        aveSum / count);  // ���� �� ���
                System.out.printf("==============================================================\n"); // ======= ���� ���
                print2(kopo11_iPerson);  // ���� �� ���
                System.out.printf("\n\n\n"); // ���� 3��
                print(); // �޼��� ����

                count = 0;  // int ���� ����
                korSum = 0;  // int ���� ����
                engSum = 0;  // int ���� ����
                matSum = 0;  // int ���� ����
                Sum = 0;  // int ���� ����
                aveSum = 0;  // int ���� ����

            } else if (kopo11_i == kopo11_iPerson) { // kopo11_i == kopo11_iPerson �� ��
                System.out.printf("==============================================================\n"); // ====== ���� ���
                System.out.printf("����������\n"); // ���� ������ ��� ����
                System.out.printf("�հ�%17d%8d%9d%9d%9d\n", korSum, engSum, matSum, Sum, aveSum); // ���� �� ���
                System.out.printf("���%17d%8d%9d%9d%9d\n", korSum / count, engSum / count, matSum / count, Sum / count,
                        aveSum / count); // ���� �� ���
            }
        }
        System.out.printf("==============================================================\n"); // ���� ���
    }

}
