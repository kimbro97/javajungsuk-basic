public class Px6_6 {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(1, 1);
        System.out.println("myPoint = " + myPoint.getDistance(2, 2));
    }
}

class MyPoint {
    public int x;
    public int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
}
