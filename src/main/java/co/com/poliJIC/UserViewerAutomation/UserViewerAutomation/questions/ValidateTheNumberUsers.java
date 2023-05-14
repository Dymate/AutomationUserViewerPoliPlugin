package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTheNumberUsers implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        int cantUsers = actor.recall("countUsers");

        if (cantUsers == 10) {
            return true;
        }

        return false;


    }


    public static ValidateTheNumberUsers validateTheNumberUsers() {

        return new ValidateTheNumberUsers();
    }


}

