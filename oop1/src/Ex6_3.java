public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = "+ Card.width);
        System.out.println("Card.height = "+ Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }
}
class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}
/**
 * 변수는 클래스 변수, 인스턴스 변수, 지역변수 모두 세 종류가 있다.
 * 변수의 종류를 결정짓는 중요한 요소는 변수의 선언 위치 이므로 변수의 종류를 차악하기 위햐ㅐ서는 변슈ㅜ가 어느 영역에 선언되었는지 확인하는것이 중요하다.
 * 멤버 변수를 제외한 모든 변수는 지역변수 이다
 * 멤버변수 중 static이 붙은 것은 클래스 변수, 붙지 않은 것은 인스턴스 변수이다
 * class Tv {
 *     int iv; // 인스턴스 변수
 *     static int cv; // 클래스 변수(static변수, 공유변수)
 *
 *     void method() {
 *         int lv = 0; // 지역변수
 *     }
 * }
 */