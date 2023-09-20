package co.com.senasoft.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target TXT_USERNAMEREGISTER = Target.the("It is used to enter the username")
            .locatedBy("//input[@id='customer_firstname']");

    public static final Target TXT_LASTNAMEREGISTER = Target.the("It is used to enter the lastname")
            .locatedBy("//input[@id='customer_lastname']");

    public static final Target TXT_EMAILREGISTER = Target.the("It is used to enter the email")
            .locatedBy("//input[@id='email-register']");

    public static final Target TXT_PASSWORDREGISTER = Target.the("It is used to enter the password")
            .locatedBy("//input[@id='passwd']");


}
