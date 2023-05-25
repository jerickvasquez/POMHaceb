package com.haceb.steps.registroExitosoSteps;

import com.haceb.pages.registroExitosoPO.DatosExtraRegistroPageObject;
import com.haceb.utils.EsperaImplicita;
import com.haceb.utils.Excel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DatosExtraRegistroSteps {

    @Page
    DatosExtraRegistroPageObject datosExtraRegistroPageObject;


    @Step("Ingresar los datos obligatorios")
    public void ingresarDatosObligatorios() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Datos.xlsx", "DatosObligatorios");
        String cedula=data.get(0).get("Cedula");
        datosExtraRegistroPageObject.textoCedula.waitUntilVisible().sendKeys(cedula);
        List<WebElementFacade> options = datosExtraRegistroPageObject.selectGenero.thenFindAll("option");
        options.get(2).click();
        datosExtraRegistroPageObject.inputFecha.waitUntilVisible().sendKeys("04/05/1997");
        List<WebElementFacade> optionsDepartamento = datosExtraRegistroPageObject.selectDepartamento.thenFindAll("option");
        int indexDepartamento = new Random().nextInt(options.size() - 1)+1;
        optionsDepartamento.get(indexDepartamento).click();
        List<WebElementFacade> optionsCiudad = datosExtraRegistroPageObject.selectCiudad.thenFindAll("option");
        int indexCiudad = new Random().nextInt(options.size() - 1)+1;
        optionsCiudad.get(indexCiudad).click();
    }

    @Step("click en enviar")
    public void clickEnviar() {
        datosExtraRegistroPageObject.buttonEnviar.waitUntilPresent().waitUntilClickable().click();
        for (String windowHandle : datosExtraRegistroPageObject.getDriver().getWindowHandles()) {
            if (!windowHandle.equals(datosExtraRegistroPageObject.getDriver().getWindowHandle())) {
                datosExtraRegistroPageObject.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        EsperaImplicita.esperaImplicita(7);
    }
}
