package by.epam.learn.ordering_collections.comparator;

import by.epam.learn.ordering_collections.comparble.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunkComparatorMain {
    public static void main(String[] args) {
        ArrayList <Person> list = new ArrayList<Person>();
        list.add(new Person(5,"Bobik"));
        list.add(new Person(8,"Sharic"));
        list.add(new Person(4,"Tusik"));
        list.add(new Person(7,"Barbos"));
        list.add(new Person(9,"Tusik"));
        list.add(new Person(3,"Barsik"));
        list.add(new Person(10,"Tusik"));
        System.out.println(list);

        list.sort((o1, o2) -> o1.getPersonalId() - o2.getPersonalId());
        System.out.println(list);

        list.sort(Comparator.comparing(Person::getName).thenComparing(Person::getPersonalId));
        System.out.println(list);

    }
}
