package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.DIV_BIOGRAPHY;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.DIV_UNIVERSITY;

public class ValidateBiography implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        String oldBiography = actor.recall("oldBiography");

        String newBiography = DIV_BIOGRAPHY.resolveFor(actor).getText();

        if(oldBiography.equals(newBiography)){
            return true;
        }

        return false;
    }



    public static ValidateBiography validateBiography(){

        return new ValidateBiography();
    }

}
