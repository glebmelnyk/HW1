package mycomparator;

import domain.Person;


public class PersonComparator {
    public void compare(Person[] personArray, Person[] sorted, String input) {


        for (int i = 0; i < personArray.length; i++) {
            Person person = personArray[i];
            if (person.getName().equals(input)) {
                addToArray(sorted, person);
                return;
            }

        }
    }

    public void addToArray(Person[] sorted, Person person1) {
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] == null) {
                sorted[i] = person1;
                return;
            }
        }

    }
}
