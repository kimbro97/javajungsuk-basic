public class Ex6_10 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();

        System.out.println("mm.add(3, 3) 결과:" + mm.add(3, 3));
        System.out.println("mm.add(3, 3L) 결과:" + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3) 결과:" + mm.add(3L, 3));
        System.out.println("mm.add(3L, 3L) 결과:" + mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));

    }
}
class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) -");
        return a + b;
    }
    long add(int a, long b) {
        System.out.print("long add(int a, long b) -");
        return a + b;
    }
    long add(long a, int b) {
        System.out.print("long add(long a, long b) -");
        return a + b;
    }
    long add(long a, long b) {
        System.out.print("long add(long a, long b) -");
        return a + b;
    }
    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
/**
 * 오버로딩
 * 성립 조건
 * 1. 메서드 이름이 같아야 한다.
 * 2. 매개변수의 개수 또는 타입이 달라야 한다.
 * 3. 반환 타입은 관계없다
 *
 * 비록 메서드의 이름이 같다 하더라도 매개변수가 다르면 서로 구별될 수 있기 때문에 오버로딩이 가능한것이다.
 * 오버로딩된 메서드들은 매개변수에 의해서만 구별될 수 있으므로 반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다는것에 주의하자.
 *
 */

