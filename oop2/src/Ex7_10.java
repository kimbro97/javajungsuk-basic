public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = {new Marin(), new Tank(), new Dropship()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}

abstract class Unit {
    int x;
    int y;

    abstract void move(int x, int y);
    void stop() {

    };
}

class Marin extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[X=" + x + " ,y=" + y + "]");
    }

    void stimPack() {

    }
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[X=" + x + " ,y=" + y + "]");
    }

    void changeMode() {

    }
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[X=" + x + " ,y=" + y + "]");
    }

    void load() {

    }

    void unLoad() {

    }
}
