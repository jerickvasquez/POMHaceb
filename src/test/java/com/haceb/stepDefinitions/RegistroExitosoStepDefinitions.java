package com.haceb.stepDefinitions;

import com.haceb.steps.registroExitosoSteps.DatosExtraRegistroSteps;
import com.haceb.steps.registroExitosoSteps.PerfilRegistroSteps;
import com.haceb.steps.registroExitosoSteps.PaginaInicioSteps;
import com.haceb.steps.registroExitosoSteps.RegistroExitosoSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegistroExitosoStepDefinitions {

    @Steps
    RegistroExitosoSteps registroExitosoSteps;

    @Steps
    PaginaInicioSteps paginaInicioSteps;

    @Steps
    PerfilRegistroSteps perfilRegistroSteps;

    @Steps
    DatosExtraRegistroSteps datosExtraRegistroSteps;

    @Dado("que el usuario abra el navegador en la url")
    public void queElUsuarioAbraElNavegadorEnLaUrl() throws IOException {

        paginaInicioSteps.abrirUrl();

    }

    @Cuando("el usuario de click en el icono de usuario")
    public void elUsuarioDeClickEnElIconoDeUsuario() {

        paginaInicioSteps.clickPerfil();

    }

    @Cuando("de click en registrarte")
    public void deClickEnRegistrarte() {
        paginaInicioSteps.clickRegistrar();
    }

    @Cuando("de click en Ingresar a Haceb")
    public void deClickEnIngresarAHaceb() {
        paginaInicioSteps.clickIngresar();
    }

    @Cuando("ingrese los datos correspondientes")
    public void ingreseLosDatosCorrespondientes() throws IOException {
        registroExitosoSteps.ingresoDatos();
    }

    @Cuando("de click en He leido y acepto los terminos y condiciones")
    public void deClickEnHeLeidoYAceptoLosTerminosYCondiciones() {
        registroExitosoSteps.clickTerminoYCondiciones();
    }

    @Cuando("de click en Si autorizo")
    public void deClickEnSiAutorizo() {
        registroExitosoSteps.clickAutorizo();
    }

    @Cuando("de click en Registrarme")
    public void deClickEnRegistrarme() {
        registroExitosoSteps.clickRegistrarme();
    }

    @Cuando("ingrese los datos obligatorios")
    public void ingreseLosDatosObligatorios() throws IOException {
        datosExtraRegistroSteps.ingresarDatosObligatorios();
    }

    @Cuando("de click en Enviar")
    public void deClickEnEnviar() {
        datosExtraRegistroSteps.clickEnviar();
    }


    @Entonces("puede visualizar el correo con el que se registro")
    public void puedeVisualizarUnMensajeConElNombreEnPantalla(){
        perfilRegistroSteps.verificarCorreo();
    }


}
