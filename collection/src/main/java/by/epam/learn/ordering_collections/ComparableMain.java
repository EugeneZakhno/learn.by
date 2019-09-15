package by.epam.learn.ordering_collections;

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<Person>();
        set.add(new Person(701,"Bob"));
        set.add(new Person(702, "Mark"));
        set.add(new Person(708, "Bush"));
        set.add(new Person(709, "Oldre"));
        set.add(new Person(705, "Vasia"));
        set.add(new Person(707, "Bush"));
        System.out.print(set + ", ");
    }
}
