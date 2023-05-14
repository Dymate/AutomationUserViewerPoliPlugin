package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.Login.*;

public class LogIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_LOGIN, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Enter.theValue("admin").into(INPUT_USER),
                Enter.theValue("revista").into(INPUT_PASSWORD),
                Click.on(BTN_ENTER),
                WaitUntil.the(HEADER_REVISTA, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(HEADER_REVISTA)
        );
    }
    public static LogIn logIn(){
        return Tasks.instrumented(LogIn.class);
    }

}
