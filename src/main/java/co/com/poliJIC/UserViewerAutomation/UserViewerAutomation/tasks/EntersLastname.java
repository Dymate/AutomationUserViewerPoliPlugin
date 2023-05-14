package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.INPUT_LASTNAME;

public class EntersLastname implements Task {

    private String lastname;

    public EntersLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_LASTNAME, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Enter.theValue(lastname).into(INPUT_LASTNAME)
        );
        actor.remember("lastname", lastname);
    }
    public static EntersLastname entersLastname(String lastname) {
        return Tasks.instrumented(EntersLastname.class, lastname);
    }

}
