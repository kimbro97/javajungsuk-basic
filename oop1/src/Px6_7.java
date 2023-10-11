public class Px6_7 {

}

class Marine {
    int x = 0;
    int y = 0;
    int hp = 60;
    static int weapon = 6;
    static int armor = 0;

    static void weaponUp() {
        weapon++;
    }

    static void armorUp() {
        armor++;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
