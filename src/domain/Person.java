package domain;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String surname;
    private boolean itUkraine;
    private Address adress;

    public Person() {

    }

    public Person(String name, int age, String surname, boolean itUkraine, Address adress) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.itUkraine = itUkraine;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(null)) {
            System.out.println("Incorrect name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("u must write your age!");
        }
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.equals(null)) {
            System.out.println("Incorrect Surmane");
        }
        this.surname = surname;
    }

    public boolean isItUkraine() {
        return itUkraine;
    }

    public void setItUkraine(boolean itUkraine) {
        this.itUkraine = itUkraine;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        if (adress.equals(null)) {
            System.out.println("incorrect adress");
        }
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && itUkraine == person.itUkraine && Objects.equals(name, person.name)
                && Objects.equals(surname, person.surname) && Objects.equals(adress, person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, surname, itUkraine, adress);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", itUkraine=" + itUkraine +
                ", adress=" + adress +
                '}';
    }
}
