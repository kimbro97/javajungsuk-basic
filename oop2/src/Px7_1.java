import java.lang.reflect.Array;
import java.util.Arrays;

public class Px7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        return cards[index];
    }

    public SutdaCard pick() {
        int randomNumber = (int) Math.random() * cards.length;
        return cards[randomNumber];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;


    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return this.num + (isKwang ? "K" : "");
    }
}