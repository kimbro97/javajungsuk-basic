public class Ex3_5 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int) d;
        System.out.println("score = " + score);
        System.out.println("d = " + d); // 형변환 후에도 피연산자는 아무런 변화가 없다.
    }
}
/**
 * 형변환 연산자
 *
 * 형변환이란, 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
 * 형변환 연산자의 값을 읽어서 지정된 타입으로 형변환하고 그 결과를 반환할 뿐이다.
 * 그래서 피연산자인 변수 d의 값은 형변환 후에도 아무런 변화가 없다.
 */
