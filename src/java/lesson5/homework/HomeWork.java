package lesson5.homework;

import java.util.ArrayList;

public class HomeWork {
    /*
     * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * Конструктор класса должен заполнять эти поля при создании объекта;
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     */

    class Person {
        // TODO: 28.01.2020
        private String fio;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        Person(String fio, String position, String email, String phone,
               int salary, int age){
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
            return "Person{" +
                    "fio='" + fio + '\'' +
                    ", position='" + position + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", salary='" + salary + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static Person [] createFivePerson() {
        // TODO: 28.01.2020
        for (int i = 0; i < 5; i++) {

        }


        return null;
    }
    
    public ArrayList<Person> filterBiggerThan40(Person [] people) {
        // TODO: 28.01.2020  
        return null;
    }

    public static void main(String[] args) {

    }

}
