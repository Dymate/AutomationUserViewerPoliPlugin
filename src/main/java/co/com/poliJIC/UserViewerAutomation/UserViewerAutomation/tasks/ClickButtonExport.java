package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.BTN_PENCIL_2;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.BTN_EXPORT_TOTAL;

public class ClickButtonExport implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BTN_EXPORT_TOTAL, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(BTN_EXPORT_TOTAL)

        );
    }


    public static ClickButtonExport clickButtonExport() {

        return Tasks.instrumented(ClickButtonExport.class);
    }
}
