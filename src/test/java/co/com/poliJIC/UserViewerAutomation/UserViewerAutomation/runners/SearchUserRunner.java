package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/searchUser.feature",
        glue = "co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@ValidateExcelReport"
)

public class SearchUserRunner {
}
