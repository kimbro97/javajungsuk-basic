public class Px6_3 {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println("student.name = " + student.name);
        System.out.println("student.name = " + student.getTotal());
        System.out.println("student.name = " + student.getAverage());
    }
}
