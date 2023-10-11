public class Px6_5 {
}

class PlayingCard {
    int kind; // 인스턴스 변수
    int num;  // 인스턴스 변수

    static int width; // 클래스 변수
    static int height; // 클래스 변수

    PlayingCard(int kind, int num) {
        this.kind = kind; // 지역 변수
        this.num = num;  // 지역 변수
    }

    public static void main(String[] args) {
        PlayingCard playingCard = new PlayingCard(1, 1);
    }
}
