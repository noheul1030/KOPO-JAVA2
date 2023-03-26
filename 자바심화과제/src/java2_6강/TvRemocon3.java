package java2_6��;

public class TvRemocon3 {
    public static void main(String[] args) { // ����
        TvRemocon3_Test kopo11_tv; // Ŭ���� ����
        kopo11_tv = new TvRemocon3_Test(1, 0); // Ŭ���� ������ new ��ü ����(1,0);
    }
}

class TvRemocon3_Test extends TvRemocon2 { // Ŭ���� TvRemocon3_Test�� TvRemocon2 ���
    public TvRemocon3_Test(int kopo11_ch, int kopo11_v) { // �Ķ���� 2�� ���޹޴� ������
        super(kopo11_ch, kopo11_v); // �θ� Ŭ���� super;
        System.out.printf("\n"); // ����
        BatteryTest(); // �޼��� ����
    }

    int kopo11_battery = 6; // int ���� �ʱⰪ 6 ����

    void Battery() { // �޼���
        if (kopo11_battery == 0) { // ���� 0 �� ��
            kopo11_Voice = String.format("�������� �ܷ��� �����ϴ�."); // ���
        } else { // 0 �� �ƴ� ��
            kopo11_battery--; // 1 ����
            kopo11_Voice = String.format("������ �ܷ� : %s", kopo11_battery); // String ������ ����
        }
    }

    void BatteryChange() { // �޼���
        kopo11_battery = 6; // 6 ����
        System.out.printf("<<�������� ��ü�߽��ϴ�.>>\n"); // ��� ����
    }

    void bt_msg(String kopo11_msg) { // String �Ķ���� 1�� ���޹޴� �޼���
        if (kopo11_battery != 0) { // ���� ������ �ܷ��� 0�� �ƴϸ�
            System.out.printf("[%s] ������ �ܷ� : %s\n", kopo11_msg, kopo11_battery); // ���� ���� �� ��� ����
        } else { // ������ �ܷ��� 0�̸�
            System.out.printf("[%s] ������ �ܷ� : %s %s\n", kopo11_msg, kopo11_battery, "�������� �ܷ��� �����ϴ�!!"); // ���� ���� �� ��� ����
        }
    }

    void bt_down(int kopo11_u) { // int �Ķ���� 1�� ���޹޴� �޼���
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u��ŭ �ݺ�
            Battery(); // Battery �޼��� ����
    }

    void BatteryTest() { // �޼���
        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9���� ���� �ݺ���
            bt_msg("������ üũ"); // msg �޼��� ���� ���� �� "������ üũ"
            bt_down(1); // �޼��� ����
            if (kopo11_battery == 0) { // ���� 0�� �Ǹ�
                bt_msg("������ üũ"); // msg �޼��� ���� ���� �� "������ üũ"
                BatteryChange(); // ���͸� ��ȯ �޼��� ����
            }
        }
    }
}
