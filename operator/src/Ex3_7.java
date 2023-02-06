public class Ex3_7 {
    public static void main(String[] args) {
        System.out.println(5 / 2);
        System.out.println(5 / (float) 2);
    }
}
/**
 * 산술 변환
 *
 * 1. 두 피연산자의 타입을 같게 일치시킨다(보다 큰 타입으로 일치)
 * long + int => long + long = long
 * float + int => float + float = float
 * double + float => double + double = double
 *
 * 2. 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.
 * byte + short = int + int = int
 * char + short => int + int = int
 */
