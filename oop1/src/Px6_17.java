import java.util.Arrays;

public class Px6_17 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));
        int[] results = shuffle(original);
        System.out.println(Arrays.toString(results));
    }

    private static int[] shuffle(int[] arr) {

        if (arr == null || arr.length == 0) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        return arr;
    }
}
