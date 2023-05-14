package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.SearchUserInterface.USERS_PAGINATION;

public class NumbersFromUsers implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int countUsers = USERS_PAGINATION.resolveAllFor(actor).size();
        actor.remember("countUsers", countUsers);
    }
    public static NumbersFromUsers numberFromUsers() {
        return Tasks.instrumented(NumbersFromUsers.class);
    }
}
