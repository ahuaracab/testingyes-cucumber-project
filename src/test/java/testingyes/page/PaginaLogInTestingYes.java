package testingyes.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PaginaLogInTestingYes extends PageObject {

    @FindBy(id = "firstname")
    WebElementFacade cajaDeNombre;

    @FindBy(id = "lastname")
    WebElementFacade cajaDeApellido;

    @FindBy(id = "country")
    WebElementFacade selectorDePais;

    @FindBy(id = "street-address")
    WebElementFacade cajaDeDireccion;

    @FindBy(id = "city")
    WebElementFacade cajaDeCiudad;

    @FindBy(id = "state")
    WebElementFacade cajaDeProvincia;

    @FindBy(id = "postcode")
    WebElementFacade cajaDeCodigoPostal;

    @FindBy(id = "telephone")
    WebElementFacade cajaDeTelefono;

    @FindBy(id = "email-address")
    WebElementFacade cajaDeCorreo;

    @FindBy(id = "password-new")
    WebElementFacade cajaDeContrasena;

    @FindBy(id = "password-confirm")
    WebElementFacade cajaDeConfirmacionDeContrasena;

    @FindBy(xpath = "//*[@value='Submit the Information']")
    WebElementFacade botonSubmitTheInformation;

    public void ingresarNombre(String nombre) {
        cajaDeNombre.type(nombre);
    }

    public void ingresarApellido(String apellido) {
        cajaDeApellido.type(apellido);
    }

    public void seleccionarPais(String pais) {
        selectorDePais.selectByVisibleText(pais);
    }

    public void ingresarDireccion(String direccion) {

       /* Actions actions = new Actions(getDriver());
        actions.moveToElement(cajaDeDireccion);
        actions.perform();*/
        cajaDeDireccion.type(direccion);

    }

    public void ingresarCiudad(String ciudad) {
        cajaDeCiudad.type(ciudad);
    }

    public void ingresarProvincia(String provincia) {
        cajaDeProvincia.type(provincia);
    }

    public void ingresarCodigoPostal(String codigoPostal) {
        cajaDeCodigoPostal.type(codigoPostal);
    }

    public void ingresarTelefono(String telefono) {
        cajaDeTelefono.type(telefono);
    }

    public void ingresarCorreo(String correo) {
        cajaDeCorreo.type(correo);
    }

    public void ingresarContrasena(String contrasena) {
        cajaDeContrasena.type(contrasena);
    }

    public void ingresarConfirmacionDeContrasena(String confirmacionDeContrasena) {
        cajaDeConfirmacionDeContrasena.type(confirmacionDeContrasena);
    }

    public void enviarInformacion() {
        botonSubmitTheInformation.click();
    }

    public void ingresarDatos(String nombre, String apellido, String pais, String direccion, String ciudad, String provincia, String codigoPostal, String telefono, String correo, String contrasena, String confirmacionDeContrasena) {
        ingresarNombre(nombre);
        ingresarApellido(apellido);
        seleccionarPais(pais);
        ingresarDireccion(direccion);
        ingresarCiudad(ciudad);
        ingresarProvincia(provincia);
        ingresarCodigoPostal(codigoPostal);
        ingresarTelefono(telefono);
        ingresarCorreo(correo);
        ingresarContrasena(contrasena);
        ingresarConfirmacionDeContrasena(confirmacionDeContrasena);
        enviarInformacion();
    }
}
