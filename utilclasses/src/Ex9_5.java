public class Ex9_5 {
    public static void main(String[] args) {
        Card2 card1 = new Card2();
        Card2 card2 = new Card2("HEART", 10);

        System.out.println(card1.toString());
        System.out.println(card2.toString());
    }
}
class Card2 {
    String kind;
    int number;

    public Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public Card2() {
        this("SPADE", 1);
    }

    @Override
    public String toString() {
        return "kind : " + kind + ", number :" + number;
    }
}
