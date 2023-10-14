public class Px7_3 {
    public static void main(String[] args) {
        Tv4 t = new Tv4(100);
    }
}

class Product3 {
    int price;
    int bonusPoint;

    Product3(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}

class Tv4 extends Product3 {
    Tv4(int price) {
        super(price);
    }
    public String toString() {
        return "Tv";
    }
}