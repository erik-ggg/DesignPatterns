package main.validator;

import main.Person;

public class NameValidator implements Validator {
    @Override
    public void validate(Person person) throws RuntimeException {
        if (person.getName().isEmpty() || person.getSurname().isEmpty())
            throw new RuntimeException("Name and surname cannot be null");
    }
}
