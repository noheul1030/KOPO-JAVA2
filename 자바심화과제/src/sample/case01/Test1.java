package sample.case01;

import sample.case01.dto.Car;

public class Test1 {

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.execute();
    }

    void execute() {
        // 1
        createCar("제네시스", "화이트", "중대형", 7000);
        System.out.println();
        // 2
        Car car = new Car();
        car.setBrand("제네시스");
        car.setColor("화이트");
        car.setSize("중대형");
        car.setPrice(7000);
        car.setTire("금호");
        createCar(car);

        System.out.println();
        // 3
        Car car2 = new Car("제네시스", "검은색", "중대형", 7000, "금호");
        createCar(car2);
    }

    void createCar(String brand, String color, String size, int price) {
        System.out.println("새로운차가 개발완료 되었습니다.");
        System.out.printf("자동차 브랜드 :%s 자동차 색상 :%s 자동차 크기 :%s 자동차 가격 : %d", brand, color, size, price);
    }

    void createCar(Car car) {
        System.out.println("새로운차가 개발완료 되었습니다.");
        System.out.printf("자동차 브랜드 :%s 자동차 색상 :%s 자동차 크기 :%s 자동차 가격 : %d, 타이어 종류 : %s", car.getBrand(), car.getColor(),
                car.getSize(), car.getPrice(), car.getTire());
    }
}
