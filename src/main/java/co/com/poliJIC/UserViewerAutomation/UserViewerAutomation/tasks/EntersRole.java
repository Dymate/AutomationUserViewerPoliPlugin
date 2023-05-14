package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.LIST_COUNTRY;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.LIST_ROLE;

public class EntersRole implements Task {

    private String roleSelected;

    public EntersRole(String roleSelected) {
        this.roleSelected = roleSelected;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LIST_ROLE, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds(),
                SelectFromOptions.byVisibleText(roleSelected).from(LIST_ROLE)
        );
        actor.remember("role", roleSelected);
    }
    public static EntersRole entersRole(String role) {

        return Tasks.instrumented(EntersRole.class, role);
    }
}
