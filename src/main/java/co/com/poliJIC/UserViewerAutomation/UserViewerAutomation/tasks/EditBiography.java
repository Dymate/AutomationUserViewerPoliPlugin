package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.*;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.INPUT_ACADEMIC_DEGREE;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.BTN_DETAILS;

public class EditBiography implements Task {

    private String biography;

    public EditBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_PENCIL_3, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(BTN_PENCIL_3),
                WaitUntil.the(INPUT_BIOGRAPHY, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Enter.theValue(biography).into(INPUT_BIOGRAPHY),
                Click.on(BTN_UPDATE_3),
                WaitUntil.the(BTN_DETAILS, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(BTN_DETAILS)
        );
        actor.remember("oldBiography", biography);
    }

    public static EditBiography editBiography(String biography) {

        return Tasks.instrumented(EditBiography.class, biography);
    }
}
