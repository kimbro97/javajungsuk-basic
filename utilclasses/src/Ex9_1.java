public class Ex9_1 {
    public static void main(String[] args) {
        Value value1 = new Value(10);
        Value value2 = new Value(10);

        if (value1.equals(value2)) {
            System.out.println(value1);
            System.out.println(value2);
            System.out.println("v1과 v2는 같다");
        } else {
            System.out.println(value1);
            System.out.println(value2);
            System.out.println("v1과 v2는 다릅니다");
        }
    }
}
class Value {
    int value;
    Value(int value) {
        this.value = value;
    }
}