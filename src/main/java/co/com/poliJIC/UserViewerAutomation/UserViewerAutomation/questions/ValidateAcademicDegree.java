package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.*;

public class ValidateAcademicDegree implements Question {


    @Override
    public Object answeredBy(Actor actor) {

        String oldAcademicDegree = actor.recall("oldAcademicDegree");

        String newAcademicDegree = DIV_ACADEMIC_DEGREE.resolveFor(actor).getText().replace("Grado universitario: ", "")
                .replaceAll("\\s+$", "").trim();

        if (oldAcademicDegree.equals(newAcademicDegree)) {
            return true;
        }

        return false;
    }


    public static ValidateAcademicDegree validateAcademicDegree() {

        return new ValidateAcademicDegree();
    }
}
