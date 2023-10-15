public class Ex9_8 {
    public static void main(String[] args) {
        char[] chars = new char[0];
        String s = new String(chars);

        System.out.println("chars.length = " + chars.length);
        System.out.println("@@@@" + s + "@@@@");
    }
}
