public class Ex7_2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}
class Parent {
    int x = 10;
}
class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
/**
 * 상속관계 "~ 은 ~이다"
 * 포함관계 "~은 ~을 가지고 있다."\
 *
 * object클래스 - 모든 클래스의 조상
 * Object클래스는 모든 클래스 상속계층도의 최상위에 있는 조상 클래스이다.
 * 다른 클래스로부터 상속받지 않는 모든 클래스들은 자동적으로 object 클래스로부터 상속박데 함으로써 이것을 가능하게 한다.
 *
 * 오버라이딩
 * 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다.
 * 상속받은 메서드를 그대로 사용하기도 하지만, 자손 클래스 자신에 맞게 변경해야하는 경우가 많다.
 * 이럴 때 조상의 메서드를 오버라이딩한다.
 *
 * 오버라이딩의 조건
 * 오버라이딩은 메서드의 내용만을 새로 작성하는 것이므로 선언부는 제한된 조건하에서만 다르게 변경할 수 있다.
 *
 * 1. 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경 할 수 없다.
 *  - 만일 조상 클래스에 정의된 메서드의 접근 제어자가 protected라면, 이를 오버라이딩하는 자손
 *  - 클랫의 메서드는 접근 제어자가 protected나 public이어야 한다. 대부분의 경우 범위의 접근 제어자를 사용한다.
 *  - 접근 제어자의 접근범위를 넙ㄹ은 것에서 좁은 것 순으로 나열하면 public protected default, private 이다
 * 2. 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
 *
 */
