public class Ex8_6 {
    public static void main(String[] args) {
        try {
            throw new Exception("고의로 발생시켰음");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램이 정상 종료되었음");
    }
}
