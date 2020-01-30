package lesson5.homework;


import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        HomeWork.Person pers = new HomeWork.Person("Ivan Ivanov", "Engineer",
//                "ivivan@mailbox.com", "892312312", 30001, 30);
        HomeWork.Person[] pers = new HomeWork.Person[5];
        pers = HomeWork.createFivePerson();
        System.out.println(pers);
    }
}
