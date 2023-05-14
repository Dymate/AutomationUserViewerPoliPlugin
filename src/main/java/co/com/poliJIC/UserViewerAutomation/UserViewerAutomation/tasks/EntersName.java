package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.INPUT_NAME;

public class EntersName implements Task {

    private String name;

    public EntersName(String name) {
        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_NAME, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Enter.theValue(name).into(INPUT_NAME)
        );

        actor.remember("name", name);
    }
    public static EntersName entersName(String name) {
        return Tasks.instrumented(EntersName.class, name);
    }
}
