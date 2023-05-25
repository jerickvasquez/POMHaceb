package com.haceb.steps.agregarProductoSteps;

import com.haceb.pages.agregarProductoPO.AgregarProductoPageObject;
import com.haceb.utils.EsperaImplicita;
import com.haceb.utils.IndiceAleatorio;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class AgregarProductoSteps {

    @Page
    AgregarProductoPageObject agregarProductoPageObject;

    @Step("Click en el producto")
    public void clickProducto() {
        EsperaImplicita.esperaImplicita(2);
        int indiceDeLaCategoria = IndiceAleatorio.generarIndiceAleatorio(agregarProductoPageObject.buttonProducto.size());
        agregarProductoPageObject.buttonProducto.get(indiceDeLaCategoria).waitUntilClickable().click();
    }

}
