package org.fasttrack.first_spring.oldstyle;

public class Main {
    public static void main(String[] args) {
        new PersonController(new PersonService(new PersonRepository("mysql", "admin", "pass")));
    }
}
