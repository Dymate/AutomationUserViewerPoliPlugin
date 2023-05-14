package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Main {


    public static final Target BTN_USERS =
            Target.the("Button for section users")
                    .located(By.xpath("//*[@id=\"navigationPrimary\"]/li[6]/a"));

}
