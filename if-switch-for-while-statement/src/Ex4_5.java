import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.println("점수를 입력해주세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.println("당신의 점수는" + score + "점 입니다.");

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (80 <= score && score < 90) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        }  else {
            grade = 'C';
        }
        System.out.println("당신의 학점은 " + grade + opt + "점 입니다.");
    }
}
