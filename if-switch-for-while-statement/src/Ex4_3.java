import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력해주세요.>");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if(input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.println("입력하신 숫자는 "+ input +"입니다.");
        }
    }
}
/**
 * if (조건식) {
 *     조건식이 참(true)일 때 수행되는 문장들을 적는다
 * } else {
 *     조건식이 거짓(false)일 때 수행되는 문장들을 적는다
 * }
 */
