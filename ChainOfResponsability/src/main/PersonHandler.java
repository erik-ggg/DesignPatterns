package main;

import main.validator.Validator;

public class PersonHandler {

    public static void handlePersonInput(final Person person, final Validator... validators) {
        try {
            for (final Validator validator : validators) {
                validator.validate(person);
            }
            System.out.println("Person is valid");
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}
