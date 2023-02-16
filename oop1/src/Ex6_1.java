public class Ex6_1 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다");
    }
}
class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
/**
 * 객체지향언어는 기존의 프로그래밍언어와 다른 전혀 새로운 것이 아니라, 기존의 프로그래밍언어에 몇가지 새로운 규칙을 추가한것이다
 *
 * 객체지향언어의 주요 특징
 * 1. 코드의 재사용성이 높다
 * 새로운 코드를 작성할 때 기존의 코드를 변경할 수 있다.
 * 2. 코드의 관리가 용이하다.
 * 코드간의 관계를 이용해서 적으 ㄴ노력으로 쉽게 코드를 변경할 수 있다.
 * 3. 신뢰상이 높은 프로그래밍을 가능하게 한다.
 * 제어자와 메서드를 이용햐소 데이터를 보호하고 올바른 값을 유지하도록 하며
 * 코드의 중복을 제거하여 코드의 불일치로 인한 오동작을 방지할 수 있다\
 *
 * 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화라고 한다
 * 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 한다.
 * 인스턴스와 객체는 같은 말이지만 객체는 모든 인스턴스를 대표하는 포괄적인 의미를 갖고 있다.
 */