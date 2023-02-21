public class Ex7_4 {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println("x = " + point3D.x + " Y = " + point3D.y + " Z = " +point3D.z );
    }
}
class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Point3D extends Point {
    int z;
    Point3D(int x, int y, int z) {
        super(x, y); // 조상의 생성자 초기화
        this.z = z;
    }
}
/**
 * this() 처럼 super()도 생성자이다.
 * this()는 같은 클래스의 다른 생성자를 호출하는대데 사용되지만, super()는 조상의 생성자를 호출하는데 사용된다.
 */
