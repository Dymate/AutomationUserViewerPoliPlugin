package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.springframework.context.annotation.Primary;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.Login.HEADER_REVISTA;
import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.*;

public class NextPage implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(PAGINATION),
                Click.on(BTN_PAGE_SECOND),
                WaitUntil.the(LIST_COUNTRY, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(70).seconds()
        );
    }
    public static NextPage nextPage(){

        return Tasks.instrumented(NextPage.class);
    }
}
