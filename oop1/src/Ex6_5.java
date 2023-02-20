public class Ex6_5 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
/**
 * 호출 스택
 *        println
 * _ main main    main _
 * 1  2    3        4   5
 *
 * 1 ~ 2 위의 예제를 실행키면 JVM에 의해서 main 메서드가 호출됨으로써 프로그램이 시작된다.
 * 이때, 호출스택에는 main메서드를 위한 메모리공간이 하당된고 main메서드는 코드가 수행되기 시작한다.
 * 3 main 메서드는 println()를 호출한 상태이다. 아직 main 메서드가 끝난 것은 아니므로 main 메서드는 호출스택에 대기상태로 남있고
 * println의 수행이 시작된다 println 메서드에 의해 "Hello"가 화면에 출력된다.
 * 4 println 메서드의 수행이 완료되어 호출스택에서 사라지고 자신을 호출한 main 메서드로 되돌아간다.
 * 대기중이던 main 메서드는 println을 호출한 이후부터 수행을 재개한다.
 * 5 main 메서드에도 더 이상 수행할 코드가 없으므로 종료되어, 호출스택은 완전히 비워지게 되고 프로그램이 종료된다.
 */
