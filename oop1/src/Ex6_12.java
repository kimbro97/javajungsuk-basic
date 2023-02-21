public class Ex6_12 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "white";
        car1.gearType = "auto";
        car1.door = 4;

        Car car2 = new Car("white", "auto", 4);
        System.out.println("car1.color = " + car1.color + "car1.gearType = " + car1.gearType + "car1.door = " + car1.door);
        System.out.println("car2.color = " + car2.color + "car2.gearType = " + car2.gearType + "car2.door = " + car2.door);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
/**
 * 인스턴스를 생성할 때는 다음의 2가지 사항을 결정해야 한다.
 * 1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
 * 2. 생성자 - 선택한 클래스의 어떤 생성자로 인스턴스로 생성할 것인가?
 */