package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.CHBOX_USER;

public class FillCheckBox implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CHBOX_USER, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(CHBOX_USER)
        );

    }


    public static FillCheckBox fillCheckBox() {

        return Tasks.instrumented(FillCheckBox.class);
    }
}
