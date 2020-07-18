package testingyes.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PaginaDashboardTestingYes extends PageObject {

    @FindBy(id = "createAcctSuccessHeading")
    WebElementFacade mensajeDeRegistroSatisfactorio;

    public String obtenerMensajeDeRegistroSatisfactorio() {
        return mensajeDeRegistroSatisfactorio.getText();
    }
}
