public class Ex9_2 {
    public static void main(String[] args) {
        Person person1 = new Person(8011081111222L);
        Person person2 = new Person(8011081111222L);

        if (person1.equals(person2)) {
            System.out.println("p1관 p2는 같은 사람입니디");
        } else {
            System.out.println("p1관 p2는 다른 사람입니디");
        }
    }
}

class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person) obj).id;
        } else {
            return false;
        }
    }

    public Person(long id) {
        this.id = id;
    }
}
