public class Ex7_8 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new Tv3());
        buyer.buy(new Computer());
        System.out.println("현재 남은 돈은 " + buyer.money);
        System.out.println("현재 보너스 점수는  " + buyer.bonusPoint);
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}
class Tv3 extends Product {
    Tv3() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computer extends Product {
    Computer() {
        super(100);
    }
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money = money - p.price;
        bonusPoint = bonusPoint + p.bonusPoint;
        System.out.println(p + "을 구입했습니다.");
    }
}
/**
 * instanceof 연산자
 *
 * 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 사용한다.
 * 주로 조건무에 사용되며, instanceof의 왼쪽에는 참조변수를 오른쪽에는 타입이 피연산자로 위치한다.
 * 그리고 연산의 결과로 boolean값인 true와 false 중의 하나를 반환한다.
 * instanceof를 이용한 연산결과로 true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
 *
 * 정리
 *
 * 어떤 타입에 대한 instanceof 연산의 결과가 true라는 것은
 * 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
 *
 * 매개변수의 다형성
 *
 * 참조변수의 다형적인 특징은 메서드의 매개변수에도 적용된다
 */
