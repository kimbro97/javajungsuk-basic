public class Ex2_9 {
    public static void main(String[] args) {
        String url = "www.naver.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;


        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f1=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f1=%f, %e, %g%n", f3, f3, f3);
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d);
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url);

    }
}
/**
 * 기본형과 참조형
 * 기본형 변수는 실제 값을 저장하는 반면, 참조형 변수는 어떤 값이 저장되어 있는 주소(memory address)를 값으로 갖는다.
 *
 * 기본형
 * 논리형(boolean), 문자형(char), 정수형(byte, short, int, long), 실수형(float, double) 계산을 위한 실제 값을 저장한다.
 *
 * 참조형
 * 객체의 주소를 저장한다. 8개의 기본형을 제외한 나머지 타입.
 */
