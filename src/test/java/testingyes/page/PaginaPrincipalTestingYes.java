package testingyes.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PaginaPrincipalTestingYes extends PageObject {

    @FindBy(xpath = "//a[.='Log In']")
    WebElementFacade botonLogIn;

    public void clickALogin() {
        botonLogIn.click();
    }
}
