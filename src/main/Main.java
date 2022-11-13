package main;

import domain.Address;
import domain.Person;
import mycomparator.PersonComparator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Address vasyaadress = new Address("Canada", "Washington", 23, 31500);
        Address johnAdress = new Address("USA", "Wictory", 14, 31509);
        Address uaAddress = new Address("Ukraine", "Bandery", 14, 65200);

        Person p1 = new Person("Nazar", 23, "Dzh", false, uaAddress);
        Person p2 = new Person("Gleb", 26, "Melnyk", true, vasyaadress);
        Person p3 = new Person("Nika", 19, "Sa", false, johnAdress);
        Person p4 = new Person("Maciej", 24, "Dąbrowski", false, vasyaadress);
        Person p5 = new Person("Wiktor", 30, "Ryż", false, johnAdress);
        Person p6 = new Person("Petro", 43, "Gr", true, uaAddress);
        Person p7 = new Person("Yurko", 26, "KuyA", true, uaAddress);
        Person p8 = new Person("Iwan", 20, "Trko", false, johnAdress);
        Person p9 = new Person("Maciej jr", 16, "Dąbrowski", false, vasyaadress);
        Person p10 = new Person("Szymon", 12, "Pieprz", false, uaAddress);

        comparePersonAddress(p1, p2);

        PersonComparator personComparator = new PersonComparator();
        Person[] persons = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        Person[] newPerses = new Person[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String line = scanner.nextLine();
        personComparator.compare(persons, newPerses, line);
        System.out.println("Second name: ");
        String nextLine = scanner.nextLine();
        personComparator.compare(persons, newPerses, nextLine);

        System.out.println(newPerses[0].getName());
        System.out.println(newPerses[1].getName());

        System.out.println("HZ");
    }

    public static void comparePersonAddress(Person person1, Person person2) {
        String notification = "Address of " + person1.getName() + " " + person2.getName() + ": ";
        boolean addressEquals = person1.getAdress().getCountry().equals(person2.getAdress().getCountry());
        System.out.println(notification + addressEquals);
    }
}
