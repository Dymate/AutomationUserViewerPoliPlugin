package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.Main.BTN_USERS;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.*;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.*;

public class EditUniversity implements Task {

    private String university;

    public EditUniversity(String university) {
        this.university = university;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_PENCIL, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(BTN_PENCIL),
                WaitUntil.the(INPUT_UNIVERSITY, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Enter.theValue(university).into(INPUT_UNIVERSITY),
                Click.on(BTN_UPDATE),
                WaitUntil.the(BTN_DETAILS, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(BTN_DETAILS)
        );
        actor.remember("oldUniversity", university);
    }

    public static EditUniversity editUniversity(String university) {

        return Tasks.instrumented(EditUniversity.class, university);
    }


}
