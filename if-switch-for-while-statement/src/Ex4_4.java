import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력해주세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (80 <= score && score < 90) {
            grade = 'B';
        } else if (70 <= score && score < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "점 입니다.");
    }
}
