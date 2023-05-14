package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.INPUT_LASTNAME;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.LIST_COUNTRY;

public class EntersCountry implements Task {

    private String countrySelected;

    public EntersCountry(String countrySelected) {
        this.countrySelected = countrySelected;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LIST_COUNTRY, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                SelectFromOptions.byVisibleText(countrySelected).from(LIST_COUNTRY)
        );
        actor.remember("country", countrySelected);
    }

    public static EntersCountry entersCountry(String country) {

        return Tasks.instrumented(EntersCountry.class, country);
    }

}
