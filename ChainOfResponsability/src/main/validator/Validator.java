package main.validator;

import main.Person;

public interface Validator {

    void validate(Person person) throws RuntimeException;
}
