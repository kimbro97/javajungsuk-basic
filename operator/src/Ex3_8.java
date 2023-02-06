public class Ex3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);
        System.out.println("c = " + c);
    }
}
/**
 * 큰 자료형에서 작은 자료형으로 뱐환하면 데이터의 손실이 발생하므로 값이 바뀔 수 있다.
 */