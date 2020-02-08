package lesson2.homework;

import java.util.Arrays;

public class HomeWork {
    // TODO: 17.01.2020

    public static int[] inverse(int[] array) {
        //
        return array;
    }

    public static int[] fillArray(int len) {
        int[] arr = new int[len];
        //
        return arr;
    }

    //O(len) -> O(len * len)
    public static int[][] fillMatrix(int len) {
        int[][] matrix = new int[len][len];
        //
        return matrix;
    }

    public static int min(int[] array) {
        //
        return 0;
    }

    //{1 2 3 4 5}, 2 -> 4 5 1 2 3
    //1 2 3 4 5 -2 -> 3 4 5 1 2
    public static void shiftRight(int[] array, int shift) {

    }

    public static boolean checkBalance(int [] array) {
        //
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inverse(new int[]{0, 0, 1, 1, 0, 1})));
        System.out.println(Integer.toBinaryString(121));
        System.out.println(inverse(121));
        System.out.println(Arrays.toString(fillArray(8)));
        int[][] m = fillMatrix(5);
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(m[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int[] row : m) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(min(new int[]{5, 7, -1, 4, 3, -2, 1}));
        int[] array = new int[]{1, 2, 3, 4, 5};
        shiftRight(array, -1);
        System.out.println(Arrays.toString(array));
    }

    private static String inverse(int value) {
        return Integer.toBinaryString(~value);
    }
}
