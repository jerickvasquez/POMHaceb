package com.haceb.steps.agregarProductoSteps;

import com.haceb.pages.agregarProductoPO.DetalleProductoPageObject;
import com.haceb.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class DetalleProductoSteps {

    @Page
    DetalleProductoPageObject detalleProductoPageObject;

    @Step("Click en comprar")
    public void clickComprarProducto() {
        detalleProductoPageObject.buttonComprar.waitUntilVisible().click();
    }

    @Step("Se verifica que el que producto se agregara correctamente al carro de compras")
    public void VisualizarProductoEnCarrito() {
        EsperaImplicita.esperaImplicita(1);
        Assert.assertEquals(detalleProductoPageObject.labelProducto.getText(),detalleProductoPageObject.labelProductoCarrito.getText());
        EsperaImplicita.esperaImplicita(3);

    }
}
