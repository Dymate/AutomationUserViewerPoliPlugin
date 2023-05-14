package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.LIST_COUNTRY;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.SELECT_COLOMBIA;

public class ValidateDataNextPage implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        String country = actor.recall("country");

        String secondPageCountry = SELECT_COLOMBIA.resolveFor(actor).getText();

        if (country.equals(secondPageCountry)) {
            return true;
        }

        return false;
    }


    public static ValidateDataNextPage validateDataNextPage() {

        return new ValidateDataNextPage();
    }
}


