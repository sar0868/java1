package lesson5.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    /*
     * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * Конструктор класса должен заполнять эти поля при создании объекта;
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     */

    public static class Person {
        // TODO: 28.01.2020
        private String fio;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        Person(String fio, String position, String email, String phone,
               int salary, int age) {
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public String getFio() {
            return fio;
        }

        public String getPosition() {
            return position;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public int getSalary() {
            return salary;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "fio= " + fio +
                    ", position= " + position +
                    ", email= " + email +
                    ", phone= " + phone +
                    ", salary= " + salary +
                    ", age=" + age;
        }
    }

    public static Person[] createFivePerson() throws FileNotFoundException {
        // TODO: 28.01.2020
        Person[] result = new Person[5];

        String[] data = new Scanner(new File("persons.txt")).nextLine().split("\n");
        for (int i = 0; i < 5; i++) {
            String[] data1 = data[i].split(", ");
            System.out.println(Arrays.toString(data1));
//            Person person = new Person(data1[0], data1[1], data1[2], data1[3],
//                    Integer.parseInt(data1[4]), Integer.parseInt(data1[5]));
//            result[i] = person;
        }
        return result;
    }

    public ArrayList<Person> filterBiggerThan40(Person[] people) {
        // TODO: 28.01.2020  
        return null;
    }

    public static void main(String[] args) {

//        Person pers = new Person("Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        System.out.println(pers);
    }
}
