public class Ex6_13 {
    public static void main(String[] args) {
        Car2 car2 = new Car2("green", "dd", 2);
        System.out.println(car2.color + car2.gearType + car2.door);
    }
}
class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
/**
 * 생성자에서 다른 생성자 호출하기 - this()
 *  - 생성자의 이름은 클래스이름 대시 this를 사용한다.
 *  - 한 생성자에서 다른 생성자 를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
 *  this 인스턴스 자신을 가리키는 참조변수, 인스,턴스의 주소가 저장되어 있다.
 *       모든 인스턴스메서드에 지역변로 숨겨진 채로 존재한다.
 *  this() 생성자 같은 클래스의 다른 생성자를 호출할 때 사용한다.
 */
