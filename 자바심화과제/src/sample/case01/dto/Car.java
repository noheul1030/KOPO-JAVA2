package sample.case01.dto;

public class Car {

    String brand;
    String color;
    String size;
    int price;
    String tire;

    public Car() {

    }

    public Car(String brand, String color, String size, int price) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public Car(String brand, String color, String size, int price, String tire) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.tire = tire;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public String getSize() {
        return this.size;
    }

    public int getPrice() {
        return this.price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

}
