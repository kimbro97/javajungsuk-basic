import java.util.ArrayList;

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
        productList.add(new Tv ());
        productList.add(new Audio());

        tvList.add(new Tv ());
        tvList.add(new Tv ());

        printAll(productList);
//        printAll(tvList);
    }

    private static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }

}

class Tv implements Product {}

class Audio implements Product{}

interface Product {

}