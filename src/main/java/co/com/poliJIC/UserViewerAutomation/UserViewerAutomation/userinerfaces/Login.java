package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {


    public static final Target BTN_LOGIN =
            Target.the("Button Login")
                    .located(By.xpath("/html/body/div/header/div/nav/div[2]/ul/li[2]/a"));

    public static final Target INPUT_USER =
            Target.the("Input User")
                    .located(By.xpath("//*[@id=\"username\"]"));

    public static final Target INPUT_PASSWORD =
            Target.the("Input Password")
                    .located(By.xpath("//*[@id=\"password\"]"));

    public static final Target BTN_ENTER =
            Target.the("Input Password")
                    .located(By.xpath("//button[@class=\"submit\"]"));

    public static final Target HEADER_REVISTA =
            Target.the("Header clicks to Revista")
                    .located(By.xpath("//*[@id=\"app\"]/header/a"));
}
