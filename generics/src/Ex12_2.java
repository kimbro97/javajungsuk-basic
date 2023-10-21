import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<Student>();
//        list.add(new Student("자바왕", 1, 1));
//        list.add(new Student("기맹재", 1, 2));
//        list.add(new Student("가녜진", 2, 1));
//
//        Iterator<Student> it = list.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next().name);
//        }

        HashMap<String, Student> map = new HashMap<>();
        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));
        String s = map.get("자바왕").toString();
        System.out.println(s);
    }
}

class Student {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
