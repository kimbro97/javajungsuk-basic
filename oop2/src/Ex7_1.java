public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.channel = 10;
        smartTv.channelUp();
        System.out.println(smartTv.channel);
        smartTv.displayCation("Hello, world");
        smartTv.caption = true;
        smartTv.displayCation("Hello, world");
    }
}
class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}
class SmartTv extends Tv {
    boolean caption;
    void displayCation(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}
/**
 * 상속
 * 상속이란, 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
 * 상속을 통해서 클래스를 작성하면 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있다.
 * 자손 클래스는 조상 클래스의 모든 멤버를 상속 받는다.(단, 생성자와 초기화 블럭은 상속되지 않는다)
 * 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
 */
