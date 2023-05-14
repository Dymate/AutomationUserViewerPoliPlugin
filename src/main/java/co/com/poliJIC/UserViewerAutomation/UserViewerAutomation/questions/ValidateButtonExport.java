package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.DIV_BIOGRAPHY;

public class ValidateButtonExport implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        boolean newBiography = DIV_BIOGRAPHY.resolveFor(actor).isEnabled();


       if(newBiography){
           return true;
       }
        return null;
    }


    public static ValidateButtonExport validateButtonExport() {
        return new ValidateButtonExport();
    }

}
