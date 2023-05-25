package com.haceb.steps.registroExitosoSteps;


import com.haceb.pages.registroExitosoPO.PaginaInicioPageObject;
import com.haceb.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaInicioSteps{

    @Page
    static
    PaginaInicioPageObject paginaInicioPageObject;


    @Step("Abrir navegador")
    public void abrirUrl() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Datos.xlsx", "Url");
        String url=data.get(0).get("Sitio Web");
        paginaInicioPageObject.openUrl(url);
    }

    @Step("Click en el perfil")
    public void clickPerfil() {
        paginaInicioPageObject.buttonPerfil.waitUntilClickable().click();
    }

    @Step("Click en registrar")
    public void clickRegistrar() {

        paginaInicioPageObject.buttonRegistrar.waitUntilClickable().click();

    }

    @Step("Click en ingresar")
    public void clickIngresar() {
        paginaInicioPageObject.buttonIngresar.waitUntilClickable().click();
        for (String windowHandle : paginaInicioPageObject.getDriver().getWindowHandles()) {
            if (!windowHandle.equals(paginaInicioPageObject.getDriver().getWindowHandle())) {
                paginaInicioPageObject.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }
}
