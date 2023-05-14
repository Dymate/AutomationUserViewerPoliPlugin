package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModalDetails {


    public static final Target MODAL_DETAILS =
            Target.the("Modal for details")
                    .located(By.xpath("(//div[@class=\"modal-dialog modal-lg\"])[1]"));

    public static final Target LIST_DETAILS =
            Target.the("Key details for modal")
                    .located(By.xpath("(//div[@class=\"col-sm-6\"])[2]/div"));

    public static final Target DIV_DETAILS =
            Target.the("Key details for modal")
                    .locatedBy("(//div[@class=\"col-sm-6\"])[2]/div[{0}]");

    public static final Target BTN_PENCIL =
            Target.the("Button for edit")
                    .located(By.xpath("(//button[@class=\"text-success\"])[1]"));

    public static final Target INPUT_UNIVERSITY =
            Target.the("Input for university")
                    .located(By.xpath("(//input[@name=\"university\"])[1]"));

    public static final Target BTN_UPDATE =
            Target.the("Key details for modal")
                    .locatedBy("(//button[@class=\"btn btn-success\"])[1]");

    public static final Target DIV_UNIVERSITY =
            Target.the("Key details for modal")
                    .locatedBy("(//div[@class=\"col-sm-6\"])[2]/div[4]");

    public static final Target BTN_PENCIL_2 =
            Target.the("Button for edit")
                    .located(By.xpath("(//button[@class=\"text-success\"])[2]"));

    public static final Target INPUT_ACADEMIC_DEGREE =
            Target.the("Input for academic degree")
                    .located(By.xpath("(//input[@name=\"newAcademicDegree\"])[1]"));

    public static final Target BTN_UPDATE_2 =
            Target.the("Key details for modal")
                    .locatedBy("(//button[@class=\"btn btn-success\"])[2]");

    public static final Target DIV_ACADEMIC_DEGREE =
            Target.the("Key details for modal")
                    .locatedBy("(//div[@class=\"col-sm-6\"])[2]/div[5]");

    public static final Target BTN_PENCIL_3 =
            Target.the("Button for edit")
                    .located(By.xpath("(//button[@class=\"text-success\"])[3]"));

    public static final Target INPUT_BIOGRAPHY =
            Target.the("Input for biography")
                    .located(By.xpath("(//textarea[@name=\"biography\"])[1]"));

    public static final Target BTN_UPDATE_3 =
            Target.the("Key details for modal")
                    .locatedBy("(//button[@class=\"btn btn-success\"])[3]");

    public static final Target DIV_BIOGRAPHY =
            Target.the("Key details for modal")
                    .locatedBy("//*[@id=\"myModal1\"]/div[1]/div/div[2]/div[2]/div[2]");

    public static final Target BTN_VIEWER_ACTIONS =
            Target.the("Key details for modal")
                    .locatedBy("(//button[contains(text(),  'Actividad Como evaluador')])[1]");

}
