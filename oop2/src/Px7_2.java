public class Px7_2 {
    public static void main(String[] args) {
        SutdaDeck sutdaDeck = new SutdaDeck();
        System.out.println(sutdaDeck.pick(0));
        System.out.println(sutdaDeck.pick());
        sutdaDeck.shuffle();

        for (int i = 0; i < sutdaDeck.cards.length; i++) {
            System.out.print(sutdaDeck.cards[i] + ", ");
        }

        System.out.println();
        System.out.println(sutdaDeck.pick(0));
    }
}
