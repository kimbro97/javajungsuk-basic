import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        // iterator는 일회용
        iterator = list.iterator();

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }
}
