package main;

import main.validator.AgeValidator;
import main.validator.IdValidator;
import main.validator.NameValidator;

public class Main {
    public static void main(String[] args) {

        Person correctPerson = new Person("John", "Doe", 13, "11222333X");
        PersonHandler.handlePersonInput(correctPerson, new NameValidator(), new AgeValidator(), new IdValidator());
        Person errPerson = new Person("John", "Doe", 14, "11222333");
        PersonHandler.handlePersonInput(errPerson, new NameValidator(), new AgeValidator());
        PersonHandler.handlePersonInput(errPerson, new NameValidator(), new AgeValidator(), new IdValidator());
    }
}
