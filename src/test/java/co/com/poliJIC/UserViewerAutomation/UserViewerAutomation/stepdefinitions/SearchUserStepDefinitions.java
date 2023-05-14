package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.stepdefinitions;

import co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.exceptions.ExceptionErrors;
import co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions.*;
import co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SearchUserStepDefinitions {

    @Managed(driver = "chrome")
    static WebDriver driver;

    @Before
    public void configuration() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Dylan");
    }


    @Given("^the user enters to the page$")
    public void theUserEntersToThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://localhost/index.php/pol/login"));
    }


    @And("^the user log in$")
    public void theUserLogIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogIn.logIn()
        );
    }

    @Given("^the user enters the section usuarios$")
    public void theUserEntersTheSectionUsuarios() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterSection.enterSection()
        );
    }


    @When("^the user enters the name (.*)")
    public void theUserEntersTheNameRevista(String name) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EntersName.entersName(name)
        );
    }

    @When("^the user enters the lastname (.*)")
    public void theUserEntersTheLastnamePolitecnica(String lastname) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EntersLastname.entersLastname(lastname)
        );
    }

    @Then("^the user validates the name searched$")
    public void theUserValidatesTheNameSearched() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateUser.validateUser(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Nombre no encontrado")
        );
    }


    @Then("^the user validates the lastname searched$")
    public void theUserValidatesTheLastnameSearched() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateUser.validateUser(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Apellido no encontrado")
        );
    }


    @When("^the user enters the country (.*)$")
    public void theUserEntersTheCountryCountry(String country) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EntersCountry.entersCountry(country)
        );

    }

    @Then("^the user validates the country searched$")
    public void theUserValidatesTheCountrySearched() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateCountry.validateCountry(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Pais no encontrado")
        );
    }

    @When("^the user enters the role (.*)$")
    public void theUserEntersTheRoleRole(String role) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EntersRole.entersRole(role)
        );
    }

    @Then("^the user validates the role searched$")
    public void theUserValidatesTheRoleSearched() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateRole.validateRole(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Rol no encontrado")
        );
    }

    @When("^the user clicks on the button to view more details$")
    public void theUserClicksOnTheButtonToViewMoreDetails() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewModal.viewModal()
        );
    }


    @Then("^the user sees a modal$")
    public void theUserSeesAModal() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateViewDetail.validateViewDetail(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Modal no disponible")
        );
    }

    @Then("^the user sees the information$")
    public void theUserSeesTheInformationWithKeyAndValue(List<String> values) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateInformationModal.validateInformationModal(values), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Informacion no disponible")
        );
    }

    @When("^the user click on the edit university (.*)$")
    public void theUserClickOnTheEditUniversityUniversity(String message) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EditUniversity.editUniversity(message)
        );
    }


    @Then("^the user validates the university$")
    public void theUserValidatesTheUniversityUniversity() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateUniversity.validateUniversity(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Universidad no fue creada")
        );
    }


    @When("^the user click on the edit Academic Degree (.*)$")
    public void theUserClickOnTheEditAcademicDegreeAcademicDegree(String academicDegree) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EditAcademicDegree.editAcademicDegree(academicDegree)
        );
    }

    @Then("^the user validates the Academic Degree$")
    public void theUserValidatesTheAcademicDegree() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateAcademicDegree.validateAcademicDegree(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Grado Academico no fue creado")
        );
    }

    @When("^the user click on the edit Biography (.*)$")
    public void theUserClickOnTheEditBiographyBiography(String biography) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EditBiography.editBiography(biography)
        );
    }

    @Then("^the user validates the Biography$")
    public void theUserValidatesTheBiography() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateBiography.validateBiography(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Biografia no fue creada")
        );
    }

    @Then("^the user validate the action of viewer$")
    public void theUserValidateTheActionOfViewer() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateActionUserViewer.validateActionUserViewer(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Data no disponible")
        );
    }

    @And("^the user goes to the next page$")
    public void theUserGoesToTheNextPage() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                NextPage.nextPage()
        );

    }


    @Then("^the user validates that the users are from the country$")
    public void theUserValidatesThatTheUsersAreFromTheCountry() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateDataNextPage.validateDataNextPage(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "No hay match con el pais")
        );
    }

    @When("^the user counts the users from pagination$")
    public void theUserCountsTheUsersFromPagination() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NumbersFromUsers.numberFromUsers()
        );
    }

    @Then("^user validates the number of users$")
    public void userValidatesTheNumberOfUsers() {

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateTheNumberUsers.validateTheNumberUsers(),Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "No hay 10 usuarios por apgina")
        );

    }

    @When("^the user clicks on the checkbox$")
    public void theUserClicksOnTheCheckbox() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                FillCheckBox.fillCheckBox()
        );

    }

    @Then("^the user validates the export button export$")
    public void theUserValidatesTheExportButtonExport() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateButtonExport.validateButtonExport(), Matchers.is(true))
                        .orComplainWith(ExceptionErrors.class, "Button deshabilitado")
        );
    }

    @When("^the user clicks on the Export$")
    public void theUserClicksOnTheExport() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickButtonExport.clickButtonExport()
        );
    }
}
