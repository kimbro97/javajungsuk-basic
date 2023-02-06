public class Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'c';

        System.out.println("b = " + b);
        System.out.println("!b = " + !b);
        System.out.println("!!b = " + !!b);
        System.out.println("!!!b = " + !!!b);
        System.out.println();

        System.out.println("ch = " + ch);
        System.out.println("ch < 'a' || ch > 'z' = " + (ch < 'a' || ch > 'z'));
        System.out.println("!('a' <= ch && ch <= 'z') = " + !('a' <= ch && ch <= 'z'));
        System.out.println("('a' <=ch && ch <= 'z') = " + ('a' <=ch && ch <= 'z'));
        
        
    }
}
/**
 * boolean b = true;
 * !!b => !!true => !false => true
 */