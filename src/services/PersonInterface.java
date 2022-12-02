package services;

import classes.Person;

import java.util.List;

public interface PersonInterface {
    String createPerson(Person ...person);
    List<Person> getAllPeople();
}
