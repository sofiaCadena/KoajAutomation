package co.com.senasoft.models;

import java.util.List;

public class RegistrationData {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final List<String> id;
    private final String identification;

    public RegistrationData(String firstName, String lastName, String email, String password, List<String> id, String identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.id = id;
        this.identification = identification;
    }

}
