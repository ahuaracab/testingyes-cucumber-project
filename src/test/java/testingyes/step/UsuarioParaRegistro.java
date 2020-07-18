package testingyes.step;

import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import testingyes.page.PaginaDashboardTestingYes;
import testingyes.page.PaginaLogInTestingYes;
import testingyes.page.PaginaPrincipalTestingYes;

import static org.hamcrest.MatcherAssert.assertThat;

public class UsuarioParaRegistro extends ScenarioActor {

    String actor;

    @Steps(shared = true)
    PaginaPrincipalTestingYes paginaPrincipal;

    @Steps(shared = true)
    PaginaLogInTestingYes paginaLogIn;

    @Steps(shared = true)
    PaginaDashboardTestingYes paginaDashboard;

    @Step("#actor ingresa a TestingYes")
    public void ingresaATestingYes() {
        paginaPrincipal.setDefaultBaseUrl("http://www.testingyes.com/demo/");
        paginaPrincipal.open();
    }

    @Step("#actor ingresa a la pagina de log in")
    public void ingresaALogIn() {
        paginaPrincipal.clickALogin();
    }

    @Step("#actor se registra con los datos obligatorios: nombre: {0} , apellido: {1} , pais: {2} , direccion: {3} , ciudad: {4} , provincia: {5} , codigo postal: {6} , telefono: {7}, email: {8} , contrasena: {9} y confirmacion de con contrasena {10}$")
    public void seRegistraCon(String nombre, String apellido, String pais, String direccion, String ciudad, String provincia, String zipcode, String phone, String email, String contrasena, String confirmaciondecontrasena) {
        paginaLogIn.ingresarDatos(nombre, apellido, pais, direccion, ciudad, provincia, zipcode, phone, email, contrasena, confirmaciondecontrasena);
    }

    @Step("#actor deberia ver la confirmacion de registro: {0}")
    public void deberiaVerLaConfirmacionDeRegistro(String mensajeDeRegistroSatisfactorioEsperado) {
        String texto = paginaDashboard.obtenerMensajeDeRegistroSatisfactorio();
        assertThat(texto, equals(mensajeDeRegistroSatisfactorioEsperado));
    }

}
