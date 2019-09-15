package by.epam.learn.ordering_collections.comparator;

import by.epam.learn.ordering_collections.comparble.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    //Realize comparator like external class
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }




}
