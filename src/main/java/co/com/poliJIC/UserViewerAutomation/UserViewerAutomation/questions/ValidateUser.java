package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.commons.lang3.StringUtils;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.TXT_LASTNAME;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.TXT_NAME;

public class ValidateUser implements Question {
    @Override
    public Object answeredBy(Actor actor) {

        String name = actor.recall("name");
        String lastname = actor.recall("lastname");

        String nameTable = TXT_NAME.resolveFor(actor).getText();
        String lastnameTable = TXT_LASTNAME.resolveFor(actor).getText();



        if (StringUtils.stripAccents(nameTable).equalsIgnoreCase(StringUtils.stripAccents(name))
                    || StringUtils.stripAccents(lastnameTable).equalsIgnoreCase(StringUtils.stripAccents(lastname))  ){
                return true;
            }

        return false;
    }



    public static ValidateUser validateUser(){
        return new ValidateUser();
    }

}
