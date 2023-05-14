package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.MODAL_DETAILS;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.*;

public class ViewModal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_DETAILS, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(BTN_DETAILS)
        );
        boolean modalPresent = MODAL_DETAILS.resolveFor(actor).isVisible();
        actor.remember("modalPresent", modalPresent);
    }

    public static ViewModal viewModal(){
        return Tasks.instrumented(ViewModal.class);
    }
}
