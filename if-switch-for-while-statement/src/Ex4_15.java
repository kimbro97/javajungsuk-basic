import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {
        int input = 0;
        int answer = 0;

        answer = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력해주세요.>");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시 시도하세요.");
            } else if(input < answer) {
                System.out.println("더 큰 수로 다시 시도하세요");
            }
        } while (input != answer);
        System.out.println("정답입니다");
    }
}
/**
 * do-while문은 while문의 변형으로 기본적인 구조는 while문과 같으나
 * 조건식과 블럭 {}의 순서를 바꿔놓은 것이다. 그래서 while문과 반대로
 * 블럭 {}을 먼저 수행한 후에 조건식을 평가한다.
 * while문은 조건식의 결과에 따라 블럭이 한 번도 수행되지 않으 수 있지만
 * do-while문은 최소한 한번은 수행될 것을 보장한다.
 */
