package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.LIST_COUNTRY;

public class ValidateCountry implements Question {



    @Override
    public Object answeredBy(Actor actor) {

        String country = actor.recall("country");
        String countrySearched = null;

        List<String> opciones = LIST_COUNTRY.resolveFor(actor).getSelectOptions();
        System.out.println(opciones);

        for (String opcion : opciones) {
            if(opcion.equals(country)){
                countrySearched = opcion;
                break;
            }
        }

        if (StringUtils.stripAccents(countrySearched).equalsIgnoreCase(StringUtils.stripAccents(country))){
            return true;
        }

        return null;
    }


    public static ValidateCountry validateCountry(){
        return new ValidateCountry();
    }
}
