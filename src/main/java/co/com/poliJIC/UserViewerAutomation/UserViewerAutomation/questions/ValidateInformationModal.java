package co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

import static co.com.poliJIC.UserViewerAutomation.UserViewerAutomation.userinerfaces.ModalDetails.*;

public class ValidateInformationModal implements Question {

    private List<String> values;

    public ValidateInformationModal(List<String> values) {
        this.values = values;
    }

    @Override
    public Object answeredBy(Actor actor) {

        List<String> detailsKeys = Text.of(LIST_DETAILS).viewedBy(actor).asList();
//
        System.out.println("LISTA: " + detailsKeys);
//
//        String keyPoint = key+":";
//        System.out.println(keyPoint);
//
        // String valueEsperado = LIST_DETAILS.resolveFor(actor).getText().replace(keyPoint, "").trim();

        ArrayList<String> valueNew = new ArrayList<>();



        for (int i = 0; i < detailsKeys.size(); i++) {

            switch (i+1) {
                case 1:
                    valueNew.add(DIV_DETAILS.of(String.valueOf(i+1)).resolveFor(actor).getText().replace("Usuario: ", "").replace(" ", ""));
                    break;

                case 2:
                    valueNew.add(DIV_DETAILS.of(String.valueOf(i+1)).resolveFor(actor).getText().replace("Email: ", "").replace(" ", ""));
                    break;

                case 3:
                    valueNew.add(DIV_DETAILS.of(String.valueOf(i+1)).resolveFor(actor).getText().replace("Nacionalidad: ", "").replace(" ", ""));
                    break;

                case 4:
                    valueNew.add(DIV_DETAILS.of(String.valueOf(i+1)).resolveFor(actor).getText().replace("Universidad: ", "").replace(" ", ""));
                    break;

                case 5:
                    valueNew.add(DIV_DETAILS.of(String.valueOf(i+1)).resolveFor(actor).getText().replace("Grado universitario: ", "").replace(" ", ""));
                    break;

                case 6:
                    valueNew.add(DIV_DETAILS.of(String.valueOf(i+1)).resolveFor(actor).getText().replace("Roles: ", ""));
                    break;
            }
        }
        System.out.println("TAMAÑO: " + valueNew.size());
        System.out.println("LISTA NUEVA: " + valueNew);
        int cont = 0;

        for (int i = 0; i < detailsKeys.size(); i++) {
            System.out.println("ORIGINAL :" + values.get(i));
            System.out.println("NUEVO: " + valueNew.get(i));
            if(values.get(i).equals(valueNew.get(i))){
                cont++;
            }
        }

        if(cont == 6){
            return true;
        }

        return false;
    }

    public static ValidateInformationModal validateInformationModal(List<String> values) {

        return new ValidateInformationModal(values);
    }
}
