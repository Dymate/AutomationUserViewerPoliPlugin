package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.*;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.INPUT_UNIVERSITY;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.BTN_DETAILS;

public class EditAcademicDegree implements Task {

    private String academicDegree;

    public EditAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_PENCIL_2, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(BTN_PENCIL_2),
                WaitUntil.the(INPUT_ACADEMIC_DEGREE, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Enter.theValue(academicDegree).into(INPUT_ACADEMIC_DEGREE),
                Click.on(BTN_UPDATE_2),
                WaitUntil.the(BTN_DETAILS, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                Click.on(BTN_DETAILS),
                WaitUntil.the(BTN_PENCIL_2, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds()
        );
        actor.remember("oldAcademicDegree", academicDegree);
    }

    public static EditAcademicDegree editAcademicDegree(String academicDegree) {

        return Tasks.instrumented(EditAcademicDegree.class, academicDegree);
    }
}
