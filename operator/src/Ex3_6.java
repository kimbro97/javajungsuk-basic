public class Ex3_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d + %f = %f%n", a, (float) b, (float)a / b);
    }
}
/**
 * 10 / 4 = 2 소수점 이하는 버려진다.
 * 나누기 연산자의 두 피연산자가 모두 int 타입인 경우, 연산결과 역시 int 타입이다.
 * int 타입은 소수점을 저장하지 못하므로 정수만 남고 소수점 이하는 버려지기 때문이다.
 *
 * 그래서 올바른 연산결과를 얻기 위해서는 두 피연산자 중 어느 한 쪽을 실수형으로 형변환해야한다.
 *
 * 10 / 4.0f => 10.0f / 4.0f = 2.5f
 */
