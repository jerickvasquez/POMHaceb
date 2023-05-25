package com.haceb.steps.registroExitosoSteps;

import com.haceb.pages.registroExitosoPO.RegistroExitosoPageObject;
import com.haceb.utils.EsperaImplicita;
import com.haceb.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;



import java.io.IOException;
import java.util.ArrayList;

import java.util.Map;


public class RegistroExitosoSteps {

    @Page
    RegistroExitosoPageObject registroExitosoPageObject;

    @Step("Ingresar datos por excel")
    public void ingresoDatos() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Datos.xlsx", "DatosCuenta");
        String Correo=data.get(0).get("Correo");
        String Nombre=data.get(0).get("Nombre");
        String Apellido=data.get(0).get("Apellido");
        String Clave = data.get(0).get("Clave");
        String Confirmacion = data.get(0).get("Confirmacion Clave");
        registroExitosoPageObject.textoCorreo.waitUntilVisible().sendKeys(Correo);
        registroExitosoPageObject.textoNombre.waitUntilVisible().sendKeys(Nombre);
        registroExitosoPageObject.textoApellido.waitUntilVisible().sendKeys(Apellido);
        registroExitosoPageObject.textoClave.waitUntilVisible().sendKeys(Clave);
        registroExitosoPageObject.textoClaveConfirmacion.waitUntilVisible().sendKeys(Confirmacion);

    }

    @Step("Click en termino y condiciones")
    public void clickTerminoYCondiciones() {

        if(!registroExitosoPageObject.checkboxTerminos.isSelected())
            registroExitosoPageObject.checkboxTerminos.waitUntilPresent().waitUntilClickable().click();
        EsperaImplicita.esperaImplicita(5);
    }

    @Step("Click en si autorizo")
    public void clickAutorizo() {
        registroExitosoPageObject.radioButtonAutorizo.waitUntilPresent().waitUntilClickable().click();
    }

    @Step("Click en registrarme")
    public void clickRegistrarme() {
        registroExitosoPageObject.buttonRegistrarme.waitUntilPresent().waitUntilClickable().click();
        EsperaImplicita.esperaImplicita(5);
    }



}
