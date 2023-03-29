package sample.case01;

import sample.case01.dto.Car;

public class Test1 {

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.execute();
    }

    void execute() {
        // 1
        createCar("���׽ý�", "ȭ��Ʈ", "�ߴ���", 7000);
        System.out.println();
        // 2
        Car car = new Car();
        car.setBrand("���׽ý�");
        car.setColor("ȭ��Ʈ");
        car.setSize("�ߴ���");
        car.setPrice(7000);
        car.setTire("��ȣ");
        createCar(car);

        System.out.println();
        // 3
        Car car2 = new Car("���׽ý�", "������", "�ߴ���", 7000, "��ȣ");
        createCar(car2);
    }

    void createCar(String brand, String color, String size, int price) {
        System.out.println("���ο����� ���߿Ϸ� �Ǿ����ϴ�.");
        System.out.printf("�ڵ��� �귣�� :%s �ڵ��� ���� :%s �ڵ��� ũ�� :%s �ڵ��� ���� : %d", brand, color, size, price);
    }

    void createCar(Car car) {
        System.out.println("���ο����� ���߿Ϸ� �Ǿ����ϴ�.");
        System.out.printf("�ڵ��� �귣�� :%s �ڵ��� ���� :%s �ڵ��� ũ�� :%s �ڵ��� ���� : %d, Ÿ�̾� ���� : %s", car.getBrand(), car.getColor(),
                car.getSize(), car.getPrice(), car.getTire());
    }
}
