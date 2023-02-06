public class Ex3_14 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";

        System.out.println("'abc' == 'abc' ? " + ("abc" == "abc"));
        System.out.println("'str1' == 'abc' ? " + (str1 == "abc"));
        System.out.println("'str2' == 'abc' ? " + (str2 == "abc"));

        System.out.println("'str1.equals('abc')'" + str1.equals("abc"));
        System.out.println("'str2.equals('abc')'" + str2.equals("abc"));
        System.out.println("'str2.equals('ABC')'" + str2.equals("ABC"));
        System.out.println("'str2.equalsIgnoreCase('ABC')'" + str2.equalsIgnoreCase("ABC"));
    }
}
/**
 * 문자열의 비교
 *
 * 두 문자열을 비교할 때는, 비교 연산자 "=="대신 equals()라는 메서드를 사용한다.
 *
 * str2와 "abc"의 내용이 같은데도 "=="로 비교하면, false 를 결과로 얻는다. 내용은 같지만 서로 다른 객체라서 그렇다.
 * 그러나 equals()는 객체가 달라고 내용이 같으면 true 를 반환한다.
 * 문자열을 비교할때는 항상 equals 를 사용해야 한다는 것을 기억하자
 * equalsIgnoreCase는 대소문자응 구별하지 않고 비교한다.
 */
