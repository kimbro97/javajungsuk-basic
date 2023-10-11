public class Px6_2 {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = student.info();
        System.out.println("str = " + str);
    }
}