package java2_6��;

public class Elevater3_Test {
    public static void main(String[] args) {
        Elevater3 kopo11_elev3; // Ŭ���� ���� ����
        kopo11_elev3 = new Elevater3(); // new Ŭ���� ��ü ����

        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9���� ���� �ݺ���
            kopo11_elev3.up(); // up �޼��� ����
            System.out.printf("MSG elev3[%s]\n", kopo11_elev3.kopo11_help); // �޼��� ��� ����
        }
        for (int kopo11_i = 0; kopo11_i < 10; kopo11_i++) { // 0 ~ 9���� ���� �ݺ���
            kopo11_elev3.down(); // down �޼��� ����
            System.out.printf("MSG elev3[%s]\n", kopo11_elev3.kopo11_help); // �޼��� ��� ����
        }

        kopo11_elev3.Repair(); // Repair �޼��� ����
        System.out.printf("MSG elev3[%s]\n", kopo11_elev3.kopo11_help); // �޼��� ��� ����

    }
}

class Elevater3 extends Elevater2 { // Elevater3Ŭ������ Elevater2�� ��ӹ޴´�

    void Repair() { // �޼���
        kopo11_help = String.format("�������Դϴ�");
        // Elevater2 Ŭ������ kopo11_help ������ �� ����
    }

    void up() { // up �޼���
        if (kopo11_floor >= kopo11_limit_up_floor) { // kopo11_floor �� kopo11_limit_up_floor���� ũ�ų� ������
            kopo11_help = "���������Դϴ�"; // ������ " ���������Դϴ�"����
        } else { // ������ �ƴϸ�
            kopo11_floor = kopo11_floor + 2; // �� ����
            kopo11_help = String.format("%d���Դϴ�.", kopo11_floor); // String ���
        }
        this.down(); // ���� �ⷡ���� down �޼��� ����
    }

    void down() { // down �޼���
        super.down(); // �θ� Ŭ������ down �޼��� ����
        System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.kopo11_help); // String ��� ����
    }
}
