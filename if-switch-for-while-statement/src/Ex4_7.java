public class Ex4_7 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i <= 5; i++) {
            double random = Math.random();
            System.out.println(random);
            num = (int) (random * 6) + 1;
            System.out.println(num);
        }
    }
}
