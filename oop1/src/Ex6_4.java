public class Ex6_4 {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        long a = 5L;
        long b = 3L;
        long result1 = myMath.add(a, b);
        long result2 = myMath.subtract(a, b);
        long result3 = myMath.multiply(a, b);
        double result4 = myMath.divide(a, b);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);

    }
}
class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a, long b) {
        long result = a - b;
        return result;
    }
    long multiply(long a, long b) {
        long result = a * b;
        return result;
    }
    double divide(double a, double b) {
        double result = a / b;
        return result;
    }
}
