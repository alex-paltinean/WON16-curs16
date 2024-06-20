package org.fasttrack.first_spring.oldstyle;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
}
