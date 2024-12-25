import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSum(32, 64));
        positiveNum(52);
        System.out.println(negativeNum(-5));
        cloneNumb(4, "ой");
        System.out.println(years(1992));

        int[] a1 = {0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(changeArray01(a1)));
        System.out.println(Arrays.toString(fillArray100()));
        //System.out.println();

        int[] a = {1, 2, 3, 4, 7}; //12
        System.out.println(Arrays.toString(multiplyTo2Array(a)));

        System.out.println();

        for (int[] i : fillDiagonalArray(5)) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();

        System.out.println(Arrays.toString(createArray(5, 777)));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a, b, c;
        a = 228;
        b = 322;
        c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }
    }

    public static void printColor() {
        int value = 64;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a, b;
        a = 4;
        b = 130;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }


    }

    public static boolean checkSum(int num1, int num2) {
//        int sum = num1+num2;
//        if (sum >=10 && sum <=20) {
//            return true;
//        } else {
//            return false;
//        }
        return num1 + num2 >= 10 && num1 + num2 <= 20;

    }

    public static void positiveNum(int num1) {
        if (num1 >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }

    public static boolean negativeNum(int num2) {
        return num2 <= 0;


    }

    public static void cloneNumb(int num1, String a1) {
        for (int i = 0; i < num1; i++) {
            System.out.println(a1);
        }
    }

    public static boolean years(int year1) {
        return year1 % 100 != 0 && (year1 % 4 == 0 || year1 % 400 == 0);

    }

    public static int[] changeArray01(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }
        return array;
    }

    public static int[] fillArray100() {
        int[] a = IntStream.rangeClosed(1, 100).toArray();
        return a;
    }

    public static int[] multiplyTo2Array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] < 6 ? array[i] * 2 : array[i];
        }
        return array;
    }

    public static int[][] fillDiagonalArray(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            a[i][i] = 1;
            a[i][n - i - 1] = 1;
        }
        return a;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] a = new int[len];
        Arrays.fill(a, initialValue);
        return a;
    }


}



