
package lesson5.homework;

import lesson5.classwork.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    /*
     * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * Конструктор класса должен заполнять эти поля при создании объекта;
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     */

    class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public Person [] createFivePerson() {
        Person [] people = new Person[50];
        for (int i = 0; i < 50; i++) {
            people[i] = new Person("Ivan", i + 20);
        }
        return people;
    }
    
    public ArrayList<Person> filterBiggerThan40(Person [] people) {
        ArrayList<Person> list = new ArrayList<>();
        for(Person person : people) {
            if (person.age >= 40) {
                list.add(person);
            }
        }
        return list;
    }

//    public static void main(String[] args) {
//
//
////        Person pers = new Person("Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
////        System.out.println(pers);
//    }
}
