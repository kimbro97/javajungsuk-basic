import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Px11_1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);

        HashSet hashSet = new HashSet(list);
        TreeSet treeSet = new TreeSet(list);
        Stack stack = new Stack();
        stack.addAll(treeSet);
        System.out.println("hashSet = " + hashSet);
        System.out.println("treeSet = " + treeSet);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

