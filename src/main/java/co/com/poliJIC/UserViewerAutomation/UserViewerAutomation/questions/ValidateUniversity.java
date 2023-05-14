package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Objects;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.DIV_DETAILS;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.DIV_UNIVERSITY;

public class ValidateUniversity implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        String oldUniversity = actor.recall("oldUniversity");

        String newUniversity = DIV_UNIVERSITY.resolveFor(actor).getText().replace("Universidad: ", "").replace(" ", "");

        if(oldUniversity.equals(newUniversity)){
            return true;
        }

        return false;
    }

    public static ValidateUniversity validateUniversity(){

        return new ValidateUniversity();
    }
}
