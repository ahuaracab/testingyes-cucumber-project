package testingyes.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import testingyes.step.UsuarioParaRegistro;

public class DefinicionDePasosParaRegistro {

    @Steps(shared = true)
    UsuarioParaRegistro usuario;

    @Dado("^que (.*) ingresa a TestingYes$")
    public void ingresa_a_testingyes(String nombreDeUsuario) {
        usuario.isCalled(nombreDeUsuario);
        usuario.ingresaATestingYes();
    }

    @Cuando("^(.*) ingresa a la pagina de log in$")
    public void ingresa_a_log_in(String nombreDeUsuario) {
        usuario.isCalled(nombreDeUsuario);
        usuario.ingresaALogIn();
    }

    @Y("^(.*) se registra con los datos obligatorios: nombre: (.*) , apellido: (.*) , pais: (.*) , direccion: (.*) , ciudad: (.*) , provincia: (.*) , codigo postal: (.*) , telefono: (.*) , email: (.*) , contrasena: (.*) y confirmacion de contrasena: (.*)")
    public void se_registra_con(String nombreDeUsuario, String nombre, String apellido, String pais, String direccion, String ciudad, String provincia, String zipcode, String phone, String email, String contrasena, String confirmaciondecontrasena) {
        usuario.isCalled(nombreDeUsuario);
        usuario.seRegistraCon(nombre, apellido, pais, direccion, ciudad, provincia, zipcode, phone, email, contrasena, confirmaciondecontrasena);
    }

    @Entonces("^(.*) deberia ver la confirmacion de registro: (.*)$")
    public void deberia_ver_la_confirmacion_de_registro(String nombreDeUsuario, String mensajeDeRegistroSatisfactorioEsperado) {
        usuario.isCalled(nombreDeUsuario);
        usuario.deberiaVerLaConfirmacionDeRegistro(mensajeDeRegistroSatisfactorioEsperado);
    }
}
