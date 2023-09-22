package co.com.senasoft.tasks;

import co.com.senasoft.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;

public class AddToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Robot robot = new Robot();
            for(int i = 0; i <= 5; i++){
                // Presiona la tecla Control (Ctrl)
                robot.keyPress(KeyEvent.VK_CONTROL);

                // Presiona la tecla "-" (tecla de menos)
                robot.keyPress(KeyEvent.VK_MINUS);

                // Suelta la tecla "-"
                robot.keyRelease(KeyEvent.VK_MINUS);

                // Suelta la tecla Control (Ctrl)
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }


        actor.attemptsTo(
                MoveMouse.to(HomePage.FIRST),
                Click.on(HomePage.BTN_MAN_CATEGORY),
                MoveMouse.to(HomePage.BTN_SIZE),
                Click.on(HomePage.BTN_SIZE),
                Click.on(HomePage.BTN_SIZE_OPTION),
                Click.on(HomePage.BTN_ADD)
        );
    }

    public static AddToCart prueba(){
        return Tasks.instrumented(AddToCart.class);
    }
}
