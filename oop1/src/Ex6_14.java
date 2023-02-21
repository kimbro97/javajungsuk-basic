public class Ex6_14 {
    static {
        System.out.println("static {  }"); // 클래스 초기화 블럭
    }
    {
        System.out.println("{  }"); // 인스턴스 초기화 블럭
    }

    public Ex6_14() {
        System.out.println("생성자");
    }
    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14(); ");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
        Ex6_14 bt2 = new Ex6_14();
    }
}

/**
 * 멤버변수와 배열의 초기화는 선택이지만, 지역변수의 초기화는 필수이다.
 *
 * 클래스 변수 초기화 -> 인스턴스 변수 초기화
 * 자동 초기화 -> 명시적 초기화(간단) -> 초기화 블럭, 생성자(복잡)
 * 명시적 초기화
 * class Car {
 *     int door = 4;            기본형 변수의 초기화
 *     Engine e = new Engine(); 참조형 변수의 초기화
 * }
 *
 * 클래스 초기화 -> 인스턴스 초기화 -> 생성자
 *
 */