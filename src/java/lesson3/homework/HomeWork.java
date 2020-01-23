package lesson3.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    public static Scanner sc = new Scanner(System.in);


    /* example:
     * input: Mama mila ramu, Ramu mila mama!!!, [mama, ramu]
     * output: 4
     * use regex, split, lowerCase, replace methods
     * */
    public int countOfWordsFromDictionaryInString(String input, String[] dictionary) {
        //посчитать все слова из словаря в input
        //если одно слово встречается 5 раз его нужно посчитать 5 раз
        // TODO: 1/21/2020

        int result = 0;
        String[] arrInp = input.split("/s+");
        for (String dict: dictionary) {
            for (String arrInp1: arrInp) {
                if(arrInp1.equals(dict)){
                    result++;
                }
            }

        }
        return result;
    }

    /* example:
     * input: [1,0,3,17,2,7,14,1,1,7], K = 6
     * output: 3
     * use sort
     * */
    public int kOrderValue(int[] array, int k) {
        //метод должен вернуть К по порядку элемент массива
        return 0;
    }

    /*
    *  Это реальная задача, которую я сегодня делал на работе
    *  Кому интересно, можете проверить свои силы))))
    *  Если слово из values есть в словаре from, его необходимо заменить
    *  с from[i] на to[i] [a, b, c], [a, b], [x, y] -> [x, y, c]
    *  Если словарь to длиннее from, то строка to[from.length] - дефолтное
    *  значение для всех values, которых нет в словаре from
    *  [a, b, c, d], [a, b], [x, y, lol] -> [x, y, lol, lol]
    *  Если словарь from длиннее to, то необходимо удалить из values все значения
    *  имющиеся в куске from на индексах от to.length до rom.length
    *  [a, b, c, d], [a, b, e, d], [x, y] -> [x, y, c] d удалем, так как он есть во
    *  from
     */
    public String[] translate(String[] values, String[] from, String[] to) {
        // TODO: 1/22/2020
        return null;
    }

    /* example:
     * input: m.levin.main@mailg.spb.com
     * output: true
     *
     * use matches
     * */
    public boolean isEmail(String input) {
        // TODO: 1/21/2020
        return false;
    }

    public static void binarySearchGame() {
        int secretValue = new Random().nextInt(100); // компьютер загадывает число
        // TODO: 20.01.2020
        //мы печатаем в консоль наши предположения (в цикле), компютер отвечает > , < или =
        //на каждый наш вопрос
        //если задано более 7 вопросов и не угадано значение, мы проиграли
        //если компютер вывел =, мы выиграли
        System.out.println("Угадайте число от 0 до 100.");
        for (int i = 0; i < 7; i++) {
//            System.out.println("Введите число:");
            int inp = sc.nextInt();
            if (inp == secretValue){
                System.out.println("=");
                break;
            } else if (inp < secretValue){
                System.out.println("<");
            } else {
                System.out.println(">");
            }
        }

    }

    public void wordsGame() {
        // TODO: 20.01.2020  
    }

    public static void main(String[] args) {
        binarySearchGame();
        String str = "Mama mila ramu, Ramu mila mama!!!";


    }
}
