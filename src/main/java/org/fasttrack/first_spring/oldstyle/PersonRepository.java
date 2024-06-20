package org.fasttrack.first_spring.oldstyle;

public class PersonRepository {
    private final String dbConnection;
    private final String dbUser;
    private final String dbPassword;

    public PersonRepository(String dbConnection, String dbUser, String dbPassword) {
        this.dbConnection = dbConnection;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }
}
