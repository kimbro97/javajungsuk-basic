public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println("shortPi = " + shortPi);
    }
}
/**
 * 반올림을 하려면 Math.round()를 사용하면 된다.
 * 이 메서드는 소수점 첫째 자리에서 반올림한 결과를 정수로 반환한다.
 */
