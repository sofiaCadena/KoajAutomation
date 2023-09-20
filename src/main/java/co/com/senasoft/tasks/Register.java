package co.com.senasoft.tasks;

import co.com.senasoft.models.RegistrationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
    private final RegistrationData registrationData;

    public Register(RegistrationData registrationData){
        this.registrationData = registrationData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
