package main.validator;

import main.Person;

public class IdValidator implements Validator {

    @Override
    public void validate(Person person) throws RuntimeException {

        String regexp = "^[0-9]{8}[A-Z]$";
        if (!person.getId().matches(regexp)) {
            throw new RuntimeException("Invalid id");
        }
    }
}
