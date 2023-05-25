package com.haceb.pages.agregarProductoPO;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DetalleProductoPageObject extends PageObject {

    @FindBy(how = How.XPATH, using = "//div[@class='product__buy flex']/a[@class='btn btn-default buy-in-page-button']")
    public WebElementFacade buttonComprar;

    @FindBy(how = How.XPATH, using = "//h1[@class='product__name visible-only-desktop']")
    public WebElementFacade labelProducto;

    @FindBy(how = How.XPATH, using = "//a[@class='cart-prod-item__prod-name']")
    public WebElementFacade labelProductoCarrito;

}
