package java2_6��;

public class �����ڽǽ��ϱ� {
    public static void main(String[] args) { // ����
        TvRemocon2 kopo11_tv = new TvRemocon2(1, 0); // Ŭ���� ��ü ����, �� ����
    }

}

class TvRemocon2 { // Ŭ����
    int kopo11_channel_up = 10; // int ���������� �ʱⰪ 10 ����
    int kopo11_channel_down = 1; // int ���������� �ʱⰪ 1 ����
    int kopo11_vol_up = 5; // int ���������� �ʱⰪ 5 ����
    int kopo11_vol_down = 0; // int ���������� �ʱⰪ 0 ����

    int kopo11_channel; // int �������� ����
    int kopo11_vol; // int �������� ����

    String kopo11_Voice; // String �������� ����

    public TvRemocon2(int kopo11_ch, int kopo11_v) { // �Ķ���� 2�� ���޹޴� ������
        kopo11_channel = kopo11_ch; // ���޹��� ch�� kopo11_channel�� ����
        kopo11_vol = kopo11_v; // ���޹��� v�� kopo11_vol�� ����
        Test();
    }

    void VolUp() { // ���� UP �޼���
        if (kopo11_vol == kopo11_vol_up) { // �� ������ ���� ��
            kopo11_Voice = "������ �ִ�"; // String ������ ����
        } else {
            kopo11_vol++; // 1�߰�
            kopo11_Voice = kopo11_Voice.format("����ũ�� : %d", kopo11_vol); // String ������ ����
        }
    }

    void VolDn() { // ���� DOWN �޼���
        if (kopo11_vol == kopo11_vol_down) {// �� ������ ���� ��
            kopo11_Voice = "������ �ּ�";// String ������ ����
        } else {
            kopo11_vol--; // 1����
            kopo11_Voice = kopo11_Voice.format("����ũ�� : %d", kopo11_vol); // String ������ ����
        }
    }

    void ChannelUp() { // ä�� UP �޼���
        if (kopo11_channel == kopo11_channel_up) { // �� ������ ���� ��
            kopo11_Voice = "ä���� �ִ�"; // String ������ ����
        } else {
            kopo11_channel++; // 1�߰�
            kopo11_Voice = kopo11_Voice.format("ä�ι�ȣ : %d", kopo11_channel); // String ������ ����
        }
    }

    void ChannelDn() { // ä�� DOWN �޼���
        if (kopo11_channel == kopo11_channel_down) { // �� ������ ���� ��
            kopo11_Voice = "ä���� �ּ�"; // String ������ ����
        } else {
            kopo11_channel--; // 1����
            kopo11_Voice = kopo11_Voice.format("ä�ι�ȣ : %d", kopo11_channel); // String ������ ����
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    void ch_up(int kopo11_u) { // int �Ķ���� 1�� ���޹޴� �޼���
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u��ŭ �ݺ�
            this.ChannelUp(); // ���� Ŭ������ up�޼��� ����(��Ȯ�� ǥ�� this.)
    }

    void vol_up(int kopo11_u) { // int �Ķ���� 1�� ���޹޴� �޼���
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u��ŭ �ݺ�
            this.VolUp(); // ���� Ŭ������ up�޼��� ����(��Ȯ�� ǥ�� this.)
    }

    void ch_down(int kopo11_u) { // int �Ķ���� 1�� ���޹޴� �޼���
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u��ŭ �ݺ�
            ChannelDn(); // down �޼��� ����
    }

    void vol_down(int kopo11_u) { // int �Ķ���� 1�� ���޹޴� �޼���
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u��ŭ �ݺ�
            VolDn(); // down �޼��� ����
    }

    void ch_msg(String kopo11_msg) { // String �Ķ���� 1�� ���޹޴� �޼���
        if (kopo11_channel == kopo11_channel_up) { // ä���� 10 �� ��
            System.out.printf("[%s] ���� ä�� ��ȣ�� : %s �Դϴ�.", kopo11_msg, kopo11_channel); // ���� ���� �� ��� ����
            System.out.printf(" ä���� �ִ� �Դϴ�.\n", kopo11_msg); // ���� ���� �� ��� ����
        } else if (kopo11_channel == kopo11_channel_down) { // ä���� 1 �϶�
            System.out.printf("[%s] ���� ä�� ��ȣ�� : %s �Դϴ�.", kopo11_msg, kopo11_channel); // ���� ���� �� ��� ����
            System.out.printf(" ä���� �ּ� �Դϴ�.\n", kopo11_msg); // ���� ���� �� ��� ����
        } else {
            System.out.printf("[%s] ���� ä�� ��ȣ�� : %s �Դϴ�.\n", kopo11_msg, kopo11_channel); // ���� ���� �� ��� ����
        }
    }

    void vol_msg(String kopo11_msg) { // String �Ķ���� 1�� ���޹޴� �޼���
        if (kopo11_vol == kopo11_vol_up) { // ������ 5 �� ��
            System.out.printf("[%s] ���� ���� ũ��� : %s �Դϴ�.", kopo11_msg, kopo11_vol); // ���� ���� �� ��� ����
            System.out.printf(" ������ �ִ� �Դϴ�.\n", kopo11_msg); // ���� ���� �� ��� ����
        } else if (kopo11_vol == kopo11_vol_down) { // ������ 1 �϶�
            System.out.printf("[%s] ���� ���� ũ��� : %s �Դϴ�.", kopo11_msg, kopo11_vol); // ���� ���� �� ��� ����
            System.out.printf(" ������ �ּ� �Դϴ�.\n", kopo11_msg); // ���� ���� �� ��� ����
        } else {
            System.out.printf("[%s] ���� ���� ũ��� : %s �Դϴ�.\n", kopo11_msg, kopo11_vol); // ���� ���� �� ��� ����
        }
    }

    void Test() {
        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9���� ���� �ݺ���
            ch_msg("ä�� �ø���"); // msg �޼��� ���� ���� �� "ä�� �ø���"
            ch_up(1); // up �޼��� ���� ���ް� 1
        }
        System.out.printf("\n"); // ����

        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9���� ���� �ݺ���
            ch_msg("ä�� ������"); // msg �޼��� ���� ���� �� "ä�� ������"
            ch_down(1); // down �޼��� ���� ���ް� 1
        }
        System.out.printf("\n"); // ����

        for (int kopo11_i = 0; kopo11_i < 5; kopo11_i++) { // 0 ~ 4���� ���� �ݺ���
            vol_msg("���� �ø���"); // msg �޼��� ���� ���� �� "���� �ø���"
            vol_up(1); // up �޼��� ���� ���ް� 1
        }
        System.out.printf("\n"); // ����

        for (int kopo11_i = 0; kopo11_i < 5; kopo11_i++) {// 0 ~ 4���� ���� �ݺ���
            vol_msg("���� ������"); // msg �޼��� ���� ���� �� "���� ������"
            vol_down(1); // down �޼��� ���� ���ް� 1
        }

    }
}