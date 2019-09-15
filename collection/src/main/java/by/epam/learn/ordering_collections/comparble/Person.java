package by.epam.learn.ordering_collections.comparble;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    private int personalId;
    private String name = "";

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int personalId, String name) {
        this.personalId = personalId;
        this.name = name;
    }

    public static class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }


    public int compareTo(Person o) {
     /*   //ascending order
        int result = this.personalId - o.personalId;
        //descending order
        int result2 = -(this.personalId - o.personalId);
        int value = 0;
        if (result > 0)
            value = 1;
        else if (result < 0)
            value = -1;
        return value;
        */
     //sorting by name ascending
     // return this.name.compareTo(o.name);
        //descending sorting by name
      return -this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person: {");
        sb.append("personId= ").append(personalId);
        sb.append(", name= ").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
