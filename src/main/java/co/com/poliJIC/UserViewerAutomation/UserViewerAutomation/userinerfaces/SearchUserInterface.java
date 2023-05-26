package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchUserInterface {

    public static final Target INPUT_NAME =
            Target.the("Input to name")
                    .located(By.xpath("//*[@id=\"name\"]"));

    public static final Target INPUT_LASTNAME =
            Target.the("Input to lastname")
                    .located(By.xpath("//*[@id=\"lastnm\"]"));

    public static final Target TXT_NAME =
            Target.the("Text Name")
                    .located(By.xpath("/html/body/div/div[1]/div[1]/div/div[2]/div/table/tbody/tr[1]/td[2]"));

    public static final Target TXT_LASTNAME =
            Target.the("Text lastname")
                    .located(By.xpath("/html/body/div/div[1]/div[1]/div/div[2]/div/table/tbody/tr[1]/td[3]"));

    public static final Target LIST_COUNTRY =
            Target.the("List of countries")
                    .located(By.xpath("//select[@name=\"country\"]"));

    public static final Target SELECT_COLOMBIA =
            Target.the("List of countries")
                    .located(By.xpath("//*[@id=\"country\"]/option[20]"));

    public static final Target LIST_ROLE =
            Target.the("List of countries")
                    .located(By.xpath("//select[@name=\"roles\"]"));

    public static final Target BTN_DETAILS =
            Target.the("Button for deatils")
                    .located(By.xpath("(//button[@class=\"btn btn-warning\"])[2]"));

    public static final Target PAGINATION =
            Target.the("Pagination control")
                    .located(By.xpath("//ul[@class=\"pagination\"]"));

    public static final Target BTN_PAGE_SECOND =
            Target.the("Button to page 2")
                    .located(By.xpath("/html/body/div/div[1]/div[1]/div/div[2]/nav/ul/li[2]/a"));

    public static final Target USERS_PAGINATION =
            Target.the("Users from pagination")
                    .locatedBy("//table/tbody/tr");

    public static final Target CHBOX_USER =
            Target.the("Check box for user")
                    .locatedBy("(//input[@name=\"exportUser[]\"])[1]");

    public static final Target BTN_EXPORT_TOTAL =
            Target.the("Button for export all users in excel")
                    .located(By.xpath("//input[@class=\"btn btn-primary\"]"));

}
