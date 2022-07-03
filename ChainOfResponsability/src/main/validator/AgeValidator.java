package main.validator;

import main.Person;

public class AgeValidator implements Validator {
    @Override
    public void validate(Person person) throws RuntimeException {
        if (person.getAge() < 0) {
            throw new RuntimeException("Age cannot be negative");
        }
    }
}
