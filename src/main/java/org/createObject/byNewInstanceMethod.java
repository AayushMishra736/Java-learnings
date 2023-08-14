package org.createObject;

public class byNewInstanceMethod {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
      Class<Person> personClass = Person.class;
      Person person = personClass.newInstance();

      person.id = 101;
      person.name = "Alice";

      System.out.println(person.id + " " + person.name);

    }
}
