import java.util.Arrays;

public class Ex5_1 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) ((Math.random() * 10) + 1);
        }

        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i]+ ",");
        }

        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}
/**
 * 타입[] 변수이름;
 * int[] score
 * String[] name
 *
 * 타입 변수이름[];
 * int score[]
 * String name[]
 *
 * 배열의 생성
 * 배열을 선언한 다음에는 배열을 생성해야한다.
 * 배열을 선언하는 것은 단지 생성된 배열을 다루기 위한 참조변수를 위한 공간이 만들어질 뿐이다.
 * 배열을 생겅해야만 비로소 값을 저장할 수 있는 공간이 만들어지는 것이다.
 * 배열을 생성하기 위해서는 연산자 'new'와 함께 배열의 타입과 길이를 지정해 주어야 한다.
 * 타입[] 변수이름;
 * 변수이름 = new 타입[길이];
 *
 * 타입[] 변수이름 = new 타입[길이] 배열의 선언과 생성을 동시에
 * int[] score = new int[5] 길이가 5인 int 배열
 *
 * 배열은 한번 생성하면 길이를 변경할 수 없기 때문에, 이미 생성된 배열의 길이는 변하지 않는다.
 * 따라서 '배열이름.length'는 상수다.
 *
 * int[] score = new int[]{1, 2, 3, 4, 5};
 * int[] score = {1, 2, 3, 4, 5}; new int[] 생략 가능
 *
 * int[] score;
 * score = new int[]{1, 2, 3, 4, 5};
 * score = { 1, 2, 3, 4, 5 } X new int[] 생략 불가능
 *
 */
