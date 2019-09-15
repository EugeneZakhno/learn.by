package by.epam.learn.ordering_collections;

public class Person implements Comparable<Person> {

    private int personalId;
    private String name = "";

    public Person(int personalId, String name) {
        this.personalId = personalId;
        this.name = name;
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
