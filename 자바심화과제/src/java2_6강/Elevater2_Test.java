package java2_6��;

public class Elevater2_Test {

    static Elevater2 kopo11_elev1; // Ŭ���� ���� 1 ����
    static Elevater2 kopo11_elev2; // Ŭ���� ���� 2 ����
    static Elevater2 kopo11_elev3; // Ŭ���� ���� 3 ����

    public static void main(String[] args) {
        kopo11_elev1 = new Elevater2(); // Ŭ���� ��ü 1 ����
        kopo11_elev2 = new Elevater2(20, 1, 8); // Ŭ���� ��ü 2 �� �� �ְ� ����
        kopo11_elev3 = new Elevater2(50, -3, 5); // Ŭ���� ��ü 3 �� �� �ְ� ����

        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 19���� ���� �ݺ���
            kopo11_elev1.up(); // up �޼��� ����
            kopo11_elev1.msg("1������ ���� ������");
//			kopo11_elev2.up();
//			kopo11_elev2.msg("2������ ���� ������");
//			kopo11_elev3.up();
//			kopo11_elev3.msg("3������ ���� ������");
        }
        System.out.println(); // ����
        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 19���� ���� �ݺ���
            kopo11_elev1.up(2); // up �޼��忡 �Ķ���� 2 ���� ����
            kopo11_elev1.msg("1������ 2���� ������"); // msg �޼��忡 String �� �ְ� ����
//			kopo11_elev2.up(2);
//			kopo11_elev2.msg("2������ 2���� ������");
//			kopo11_elev3.up(2);
//			kopo11_elev3.msg("3������ 2���� ������");
        }
        System.out.println(); // ����

        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 19���� ���� �ݺ���
            kopo11_elev1.down(3); // down �޼��忡 �Ķ���� 3 ���� ����
            kopo11_elev1.msg("1������ 3���� ������"); // msg �޼��忡 String �� �ְ� ����
//			kopo11_elev2.down(3);
//			kopo11_elev2.msg("2������ 3���� ������");
//			kopo11_elev3.down(3);
//			kopo11_elev3.msg("3������ 3���� ������");
        }

    }

}

class Elevater2 { // Ŭ����
    protected int kopo11_limit_up_floor; // int ���� ����
    private int kopo11_limit_down_floor; // int ���� ����
    protected int kopo11_floor; // int ���� ����
    protected String kopo11_help; // String ���� ����

    Elevater2() { // ������
        kopo11_limit_up_floor = 10; // �ʱⰪ 10 ����
        kopo11_limit_down_floor = 0; // �ʱⰪ 0 ����
        kopo11_floor = 1; // �ʱⰪ 1 ����
        kopo11_help = "���������� �⺻ �ذ��Ϸ�"; // �ʱⰪ ����
    }

    Elevater2(int up_floor, int d_floor, int in_floor) { // int �Ķ���� 3�� ���޹޴� ������
        kopo11_limit_up_floor = up_floor; // ���� ���� �Ķ���� �� ����
        kopo11_limit_down_floor = d_floor; // ���� ���� �Ķ���� �� ����
        kopo11_floor = in_floor; // ���� ���� �Ķ���� �� ����
        kopo11_help = "���������� ���� �ذ��Ϸ�"; // ���ο� ���ڿ� ����
    }

    void up() { // up �޼��� ����
        if (kopo11_floor == kopo11_limit_up_floor) { // �� ������ ������
            kopo11_help = "������ ���Դϴ�"; // ���
        } else { // �� ������ ���� ������
            kopo11_floor++; // kopo11_floor 1�߰�
            kopo11_help = String.format("[%d] ���Դϴ�", kopo11_floor); // ������ ��� ����
        }
    }

    void down() { // down �޼��� ����
        if (kopo11_floor == kopo11_limit_down_floor) { // �� ������ ������
            kopo11_help = "ó�� ���Դϴ�"; // ���
        } else { // �� ������ ���� ������
            kopo11_floor--; // kopo11_floor 1����
            kopo11_help = String.format("[%d] ���Դϴ�", kopo11_floor); // ������ ��� ����
        }
    }

    void up(int kopo11_u) { // int �Ķ���� 1�� ���޹޴� �޼���
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u��ŭ �ݺ�
            this.up(); // ���� Ŭ������ up�޼��� ����(��Ȯ�� ǥ�� this.)
    }

    void down(int kopo11_u) { // int �Ķ���� 1�� ���޹޴� �޼���
        for (int kopo11_i = 0; kopo11_i < kopo11_u; kopo11_i++) // 0 < kopo11_u��ŭ �ݺ�
            down(); // down �޼��� ����
    }

    void msg(String kopo11_id) { // String �Ķ���� 1�� ���޹޴� �޼���
        System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", kopo11_id, kopo11_help, kopo11_limit_up_floor,
                kopo11_limit_down_floor, kopo11_floor); // ���޹��� �� ��� ����
    }

}