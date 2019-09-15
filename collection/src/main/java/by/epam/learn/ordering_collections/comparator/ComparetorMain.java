package by.epam.learn.ordering_collections.comparator;

import by.epam.learn.ordering_collections.comparble.Person;

import java.util.ArrayList;
import java.util.Collections;
// https://learn.by/courses/course-v1:EPAM+JColl+ext1/courseware/ad77b0fad7934d658ea92a7d675da25b/57edf21dccb3402f96579b7db8ab8f83/1
public class ComparetorMain {
    public static void main(String[] args) {
        ArrayList <Person> list = new ArrayList<Person>();
        list.add(new Person(5,"Gareth"));
        list.add(new Person(9,"John"));
        list.add(new Person(5,"Mike"));
        list.add(new Person(4,"Horkhe"));
        list.add(new Person(5,"Ashley"));
        System.out.println(list);

        // first way of sorting
        list.sort(new PersonNameComparator());
        System.out.println(list);

        // second way of sorting
        Collections.sort(list, new PersonNameComparator());
        System.out.println(list);

        // Sorting with nested class NameComparator();
        list.sort(new Person.NameComparator());
        System.out.println(list);

    }
}
