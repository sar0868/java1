package lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Cycles {

    static void printNA(int n) {
        //print n 'A'
        int i = 0;
        while (i++ < n) {
            System.out.print('A');
        }
        while (n-- > 0) {
            System.out.print('A');
        }
    }

    static void printAllPow2(int limit) {
        int first = 1, counter = 0;
        while (counter++ <= limit) {
            System.out.print(first + " ");
            first *= 2;
        }
        System.out.println();
        for (int i = 0, f = 1; i <= limit; i++, f *= 2) {
            System.out.print(f + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    //()(())((())) = f(3), f(2) = ()(()), f(1) = ()
    //f1(7) = ()(())(
    static void f(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('(');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(')');
            }
        }
    }

    static void f1(int limit) {
        int counter = 0;
        boolean isRunning = true;
        for (int i = 1; isRunning; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('(');
                counter++;
                if (counter == limit) {
                    isRunning = false;
                    break;
                }
            }
            for (int j = 0; isRunning && j < i; j++) {
                System.out.print(')');
                counter++;
                if (counter == limit) {
                    isRunning = false;
                    break;
                }
            }
        }
    }

    static void multiplyTable(int x, int y) {
        for (int i = 1; i <= x; i++) { //1 2 3
            for (int j = 1; j <= y; j++) {//1 2 3 .. y
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }

    static void calc(double sum, double percent, double pay) {
        double startSum = sum, startPay = 0;
        int mounth = 1;
        while (true) {
            sum = sum * (1 + percent / 100) - pay;
            startPay += pay;
            if (sum <= 0) {
                startPay += sum;
                System.out.println("Вы выплатили за " + mounth + " месяцев или "
                        + mounth / 12 + " лет и " + mounth % 12 + " месяцев");
                System.out.println("Вы переплатили: " + (startPay - startSum) + " рублей!");
                return;
            }
            if (mounth > 600) {
                System.out.println("Вы погибли");
                return;
            }
            mounth++;
        }
    }

    //Arrays
    static void positiveSum(int[] array) {
//        int pos = -1;
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
        int sum = 0;
        for (int element : array) {
            if (element > 0) sum += element;
        }
        System.out.println(sum);
//        Arrays.stream(array)
//                .map(arg -> arg + 2)
//                .filter(x -> x >= 0)
//                .sorted()
//                .forEach(consumer -> System.out.print(consumer + " "));
    }

    static int[] createArray(int len, int fillValue) {
        int [] a = new int[len];
        Arrays.fill(a, fillValue);
        return a;
    }

    static int [][] deepArray(int len) {
        Random rnd = new Random();
        int [][] a = new int[len][];
        for (int i = 0; i < len; i++) {
            a[i] = new int[1 + rnd.nextInt(10)];
        }
        return a;
    }

    //000    101
    //000 -> 010
    //000    101
    static void fillDiag(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length-i-1] = 1;
        }
    }

    //0 0 1 0 0
    //0 1 1 1 0
    //1 1 1 1 1
    //0 1 1 1 0
    //0 0 1 0 0

    public static void main(String[] args) {
        positiveSum(new int[]{1, 2, 3, -40, 5, -60, 7, 8});
        System.out.println(Arrays.toString(createArray(5, 7)));
        System.out.println(Arrays.deepToString(deepArray(5)));
        System.out.println(deepArray(7));
        int [][] m = new int[3][3];
        fillDiag(m);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
