public class Ex9_4 {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println(card1.toString());
        System.out.println(card2.toString());
    }
}
class Card {
    String kind;
    int number;

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public Card() {
        this("SPADE", 1);
    }
}
