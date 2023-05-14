package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.LIST_COUNTRY;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.LIST_ROLE;

public class ValidateRole implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        String role = actor.recall("role");
        String roleSearched = null;

        List<String> opciones = LIST_ROLE.resolveFor(actor).getSelectOptions();
        System.out.println(opciones);

        for (String opcion : opciones) {
            if(opcion.equals(role)){
                roleSearched = opcion;
                break;
            }
        }

        if (StringUtils.stripAccents(roleSearched).equalsIgnoreCase(StringUtils.stripAccents(role))){
            return true;
        }

        return null;
    }


    public static ValidateRole validateRole() {

        return new ValidateRole();
    }

}
