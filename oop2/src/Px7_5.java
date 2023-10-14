public class Px7_5 {
    public static void main(String[] args) {
        MyTv myTv = new MyTv();

        myTv.setChannel(10);
        System.out.println(myTv.getChannel());
        myTv.setChannel(20);
        System.out.println(myTv.getChannel());
        myTv.gotoPrevChannel();
        System.out.println(myTv.getChannel());
        myTv.gotoPrevChannel();
        System.out.println(myTv.getChannel());
    }
}
