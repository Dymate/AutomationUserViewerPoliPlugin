package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateViewDetail implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        boolean modal = actor.recall("modalPresent");

        if (modal) {
            return true;
        }
        return false;
    }


    public static ValidateViewDetail validateViewDetail() {
        return new ValidateViewDetail();
    }

}
