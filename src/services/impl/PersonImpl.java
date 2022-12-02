package services.impl;

import classes.Person;
import services.PersonInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonImpl implements PersonInterface {
    private  List<Person> person = new ArrayList<>();
    @Override
    public String createPerson(Person ... people) {
        person.addAll(Arrays.asList(people));
        return "Person Creted Successfull";
    }

    @Override
    public List<Person> getAllPeople() {
        return person;
    }
}
