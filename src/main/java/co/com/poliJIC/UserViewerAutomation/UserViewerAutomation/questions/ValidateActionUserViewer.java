package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.BTN_VIEWER_ACTIONS;

public class ValidateActionUserViewer implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        boolean buttonViewer = BTN_VIEWER_ACTIONS.resolveFor(actor).isPresent();

        if (buttonViewer){
            return true;
        }

        return false;
    }


    public static ValidateActionUserViewer validateActionUserViewer(){

        return new ValidateActionUserViewer();
    }

}
