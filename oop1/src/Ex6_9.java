public class Ex6_9 {
    public static void main(String[] args) {
        long a = 200L;
        long b = 100L;

        System.out.println(MyMath2.add(a, b));
        System.out.println(MyMath2.subtract(a, b));
        System.out.println(MyMath2.multiply(a, b));
        System.out.println(MyMath2.divide(a, b));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;

        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}

class MyMath2 {
    long a;
    long b;

    long add() {
        return a + b;
    }
    long subtract() {
        return a - b;
    }
    long multiply() {
        return a * b;
    }
    double divide() {
        return a / b;
    }

    static long add(long a, long b) {
        return a + b;
    }
    static long subtract(long a, long b) {
        return a - b;
    }
    static long multiply(long a, long b) {
        return a * b;
    }
    static double divide(long a, long b) {
        return a / (double)b;
    }
}
/**
 * 변수에서 그랬던 덧과 같이, 메서드 앞에 static에 붙어 있으면 클래스메서드이고 붙어 있지 않으면 인스턴스 메서드이다.
 * 클래스는 데이터와 데이터에 관련된 메서드의 집합이므로, 같은 클래스 내에 있는 메서드와 멤버변수는 아주 밀접한 관계가 있다.
 * 인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드이다.
 * 그런데 인스턴스 변수는 인스턴스를 생성해야만 만들어지므로 인스턴스, 메서드 역시 인스턴스를 생성해야만 호출할 수 있느것이다
 * 반면에 메서드 중에서 인스턴스와 관계없는 메서드를 클래스 메서드로 정의한다.
 */

/**
 * static은 언제 붙여야 할까?
 * 1. 클래스를 설계할 때, 멤버뱐수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.
 *  - 생성된 각 인스터스는 서로 독립적이기 때문에 각 인스터스의 변수(iv)는 서로 다른 값을 유지한다.
 *  - 그러나 모든 인스턴스에서 같은 값이 유지되어야 하는 변수는 static을 붙여서 클래스변수로 정의해야한다.
 * 2. 클래스 변수는 인스턴스를 생성하지 않아도 사용할 수 있다.
 *  - static이 붙은 변수는 클래스가 메모리에 올라갈 때 이미 자동적으로 생성되기 때문이다
 * 3. 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
 *  - 인스턴스변수는 인스턴스가 반드시 존재해야만 사용할 수 있는데, 클래스메서드는 인스턴스 생성 없이 호출가능하므로
 *  - 클래스메서드가 호출도었을 때 인스턴스가 존재하지 않을 수도 있다. 그래서 클래스 메서드에서 인스턴스변수의 사용을 금지한다.
 *  - 반면에 인스턴스변수나 인스턴스메서드에서는 static이 붙은 멤버들을 사용ㅎ라는것이 언제나 가능하다.
 *  - 인스턴스 변수가 존재한다는 것은 static변수가 이미 메모리에 존재한다는 것을 의미하기 때문이다.
 * 4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.
 *  - 메서드의 작업내용 중에서 인스턴스변수를 필요로 한다면, static을 붙일 수 없다.
 *  - 반대로 인스턴스변수를 필요로 하지 않는다면 static을 붙이자.
 *  - 메서드 호출시간이 짧아지므로 성능이 향상된다.
 *  - static을 안 붙인 메서드는 실행 시 호출되어야할 메서드를 찾는 과정이 추가적으로 필요하기 떄문에 시간이 더 걸린다.
 *
 *  정리
 *  - 클래스의 멤버변수 중 모든 인스턴스에 공통된 값을 유지해야하는 것이 있는지 살펴보고 있으면, static을 붙여준다.
 *  - 작성한 메서드 중에서 인스턴스 변수나 인스턴스 메서드를 사용하지 않는 메서드가 있다면 static을 붙일 것을 고려한다.
 *
 * 같은 클래스에 속한 멤버들 간에는 별도의 인스턴스를 생성하지 않고도 서로 참조 또는 호출이 가능하다.
 * 단, 클래스멤버가 인스턴스 멤버를 참조 또는 호출하고자 하는 경우에는 인스턴스를 생성해야한다.
 * 그 이유는 인스턴스 멤버가 존재하는 시점에 클래스 맴버는 항상 존재하지만, 클래스멤버가 존재하지 않을 수도 있기 때문이다.
 */
