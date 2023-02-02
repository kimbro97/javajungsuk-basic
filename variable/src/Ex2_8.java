public class Ex2_8 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("y = " + y);
        System.out.println("x = " + x);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
