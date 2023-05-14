package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.Main.BTN_USERS;

public class EnterSection implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_USERS, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(BTN_USERS)
        );
    }

    public static EnterSection enterSection() {
        return Tasks.instrumented(EnterSection.class);
    }
}
